/**
 * 
 */
package org.historyresearchenvironment.usergui.providers;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.eclipse.core.internal.runtime.InternalPlatform;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Shell;
import org.historyresearchenvironment.usergui.models.FamilySearchModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.osgi.framework.BundleContext;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * @author Michael Erichsen, &copy; History Research Environment Ltd.
 * @version 0.0.4
 *
 */
public class FamilySearchProvider extends AbstractHreProvider {
	private final ScopedPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE,
			"org.historyresearchenvironment.usergui");
	private final BundleContext context;
	private List<FamilySearchModel> itemList;

	private final String SOCKETS_URL = "identint.familysearch.org";
	private final String USER_AGENT = "Mozilla/5.0";
	private final String AUTH_URL = "https://identint.familysearch.org/cis-web/oauth2/v3/token";
	private final String ACCEPT = "application/json";
	private final String CONTENT_TYPE = "application/x-www-form-urlencoded";
	// TODO Remove before pushing to Github
	private final String CLIENT_ID = "a02f100000RNRXSAA5";
	private final String SEARCH_URL = "https://integration.familysearch.org/platform/tree/search";
	// private String fsPassword;
	// private String fsUserid;

	/**
	 * 
	 */
	public FamilySearchProvider(Shell shell) {
		super();

		LOGGER.fine("Constructor");
		context = InternalPlatform.getDefault().getBundleContext();
		EclipseContextFactory.getServiceContext(context);

		try {
			final String localIpAddress = getLocalIpAddress();

			final ProgressMonitorDialog dialog = new ProgressMonitorDialog(shell);
			dialog.run(true, true, new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) {
					final SubMonitor subMonitor = SubMonitor.convert(monitor, 100);

					try {
						final String accessToken = doAuth(localIpAddress,
								subMonitor.split(50, SubMonitor.SUPPRESS_NONE));

						final String name = store.getString("PERNAME");
						LOGGER.fine("Name: " + name);

						doSearch(accessToken, subMonitor.split(50, SubMonitor.SUPPRESS_NONE));
						LOGGER.fine("Search done");
					} catch (final OperationCanceledException e) {
						LOGGER.info("Operation cancelled, " + e.getClass() + " " + e.getMessage());
					} catch (final Exception e) {
						e.printStackTrace();
						final String message = e.getClass() + " " + e.getMessage();
						LOGGER.severe(message);
						if ((message != null) && (eventBroker != null)) {
							eventBroker.post("MESSAGE", message);
						}
					}
				}
			});

		} catch (final Exception e) {
			e.printStackTrace();
			final String message = e.getClass() + " " + e.getMessage();
			LOGGER.severe(message);
			if (message != null) {
				eventBroker.post("MESSAGE", message);
			}
		}
	}

	/**
	 * @param localIpAddress
	 * @param monitor
	 * @return
	 * @throws Exception
	 */
	private synchronized String doAuth(String localIpAddress, IProgressMonitor monitor) throws Exception {
		final SubMonitor subMonitor = SubMonitor.convert(monitor, 50);
		subMonitor.beginTask("Authorizing access to Family Search", 50);
		subMonitor.subTask("Connecting");

		try {
			wait(100);
		} catch (final Exception e) {
			LOGGER.info(e.getClass() + " " + e.getMessage());
			e.printStackTrace();
		}

		final URL url = new URL(AUTH_URL);
		final HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setRequestProperty("User-Agent", USER_AGENT);
		conn.setRequestProperty("Content_Type", CONTENT_TYPE);
		conn.setRequestProperty("Accept", ACCEPT);

		final String postData = "grant_type=unauthenticated_session&ip_address=" + localIpAddress + "&client_id="
				+ CLIENT_ID;
		// TODO Insert popup to get FS userid and password of end user
		// "grant_type=password&ip_address=" + localIpAddress + "&client_id=" +
		// CLIENT_ID
		// + "&username=" + fsUserid + "&password=" + fsPassword;

		conn.setDoOutput(true);
		final DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
		wr.writeBytes(postData);
		wr.flush();
		wr.close();
		subMonitor.subTask("Posting authorization request");
		subMonitor.worked(25);

		try {
			wait(100);
		} catch (final Exception e) {
			LOGGER.info(e.getClass() + " " + e.getMessage());
			e.printStackTrace();
		}

		final int responseCode = conn.getResponseCode();
		LOGGER.fine(
				"Sending 'POST' request to URL: " + url + "\nData: " + postData + "\nResponse code: " + responseCode);

		final BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String output;
		final StringBuffer response = new StringBuffer();

		while ((output = in.readLine()) != null) {
			response.append(output);
		}

		in.close();

		final JSONObject jsonObject = new JSONObject(response.toString());

		LOGGER.fine("JSON response: " + jsonObject.toString(2));

		return jsonObject.getString("access_token");
	}

	/**
	 * @param name
	 * @param name2
	 * @param monitor
	 */
	protected synchronized void doSearch(String accessToken, IProgressMonitor monitor) {
		int counter = 0;
		String message = "";
		final String name = store.getString("PERNAME").toLowerCase().trim();
		LOGGER.fine("Name: " + name);

		final SubMonitor subMonitor = SubMonitor.convert(monitor, 50);
		subMonitor.beginTask("Fetching Family Search results for " + name, 50);

		itemList = new ArrayList<FamilySearchModel>();

		final String getData = "?access_token=" + accessToken + "&q=name:" + name;

		try {
			final URL url = new URL(SEARCH_URL + getData);
			final HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("User-Agent", USER_AGENT);
			conn.setRequestProperty("Content-Type", CONTENT_TYPE);
			conn.setRequestProperty("Accept", ACCEPT);
			conn.setRequestProperty("Authorization", "Bearer " + accessToken);

			final int responseCode = conn.getResponseCode();
			LOGGER.fine("Sending 'GET' request to URL: " + url);
			LOGGER.fine("Response code: " + responseCode);

			final BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			final StringBuilder sb = new StringBuilder();
			String s = "";

			while (null != (s = br.readLine())) {
				sb.append(s);
			}

			final JSONObject jsonObject = new JSONObject(sb.toString());
			final int results = jsonObject.getInt("results");
			LOGGER.fine("Results: " + results);

			final JSONArray entries = (JSONArray) jsonObject.get("entries");

			final int lim = entries.length();
			LOGGER.fine("Entries: " + lim);

			for (int i = 0; i < lim; i++) {
				final JSONObject content = (JSONObject) entries.get(i);
				final JSONObject content2 = (JSONObject) content.get("content");
				final JSONObject gedcomx = (JSONObject) content2.get("gedcomx");
				final JSONArray persons = (JSONArray) gedcomx.get("persons");

				final int arrayLength = persons.length();
				LOGGER.fine("Persons: " + arrayLength);

				for (int j = 0; j < arrayLength; j++) {
					final JSONObject person = (JSONObject) persons.get(j);

					final FamilySearchModel item = new FamilySearchModel();

					try {
						item.setAfn(person.getString("id"));
						LOGGER.fine(item.getAfn());
					} catch (final Exception e) {
					}

					final JSONObject display = (JSONObject) person.get("display");

					LOGGER.fine("Item " + j + ": " + display.toString(2));

					try {
						item.setName(display.getString("name"));
					} catch (final Exception e) {
					}
					try {
						item.setGender(display.getString("gender"));
					} catch (final Exception e) {
					}
					try {
						item.setBirthDate(display.getString("birthDate"));
					} catch (final Exception e) {
					}
					try {
						item.setBirthPlace(display.getString("birthPlace"));
					} catch (final Exception e) {
					}
					try {
						item.setDeathDate(display.getString("deathDate"));
					} catch (final Exception e) {
					}
					try {
						item.setDeathPlace(display.getString("deathPlace"));
					} catch (final Exception e) {
					}
					try {
						item.setAfn(display.getString("id"));
					} catch (final Exception e) {
					}

					// TODO Remove for production
					try {
						wait(100);
					} catch (final InterruptedException e) {
						LOGGER.info(e.getClass() + " " + e.getMessage());
					}

					itemList.add(item);
					subMonitor.worked(1);
					subMonitor.subTask("Fetching Family Search result " + counter++ + " of " + results);

					if (itemList.size() > 50) {
						message = "Items added: " + (itemList.size() - 1) + " (" + results + " was found)";
						LOGGER.info(message);
						if ((message != null) && (eventBroker != null)) {
							eventBroker.post("MESSAGE", message);
						}
						return;
					}
				}
			}
			message = "Items added: " + (itemList.size() - 1);
			LOGGER.info(message);
			if (message != null) {
				eventBroker.post("MESSAGE", message);
			}
		} catch (IOException | JSONException e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
			e.printStackTrace();
		}
	}

	/**
	 * @return the itemList
	 */
	public List<FamilySearchModel> getItemList() {
		return itemList;
	}

	/**
	 * @return
	 * @throws Exception
	 */
	private String getLocalIpAddress() throws Exception {
		String localIpAddress = "";

		final Socket socket = new Socket();
		socket.connect(new InetSocketAddress(SOCKETS_URL, 80));
		localIpAddress = socket.getLocalAddress().getHostAddress();
		socket.close();

		return localIpAddress;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.usergui.models.AbstractHreProvider#readFromH2(
	 * int)
	 */
	@Override
	public void readFromH2(int i) {
	}

	/**
	 * @param itemList
	 *            the itemList to set
	 */
	public void setItemList(List<FamilySearchModel> itemList) {
		this.itemList = itemList;
	}
}

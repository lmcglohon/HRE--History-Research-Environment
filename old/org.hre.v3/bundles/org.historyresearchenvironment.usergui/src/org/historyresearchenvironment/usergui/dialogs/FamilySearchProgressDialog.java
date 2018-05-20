package org.historyresearchenvironment.usergui.dialogs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.net.ssl.HttpsURLConnection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.historyresearchenvironment.usergui.models.FamilySearchModel;
import org.historyresearchenvironment.usergui.providers.FamilySearchProvider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Obtain authorization from Family Search. Then get a list of search results
 * for a name.
 * 
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class FamilySearchProgressDialog implements IRunnableWithProgress {
	@Inject
	protected static IEventBroker eventBroker;

	protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	private final String USER_AGENT = "Mozilla/5.0";
	private final String ACCEPT = "application/json";
	private final String CONTENT_TYPE = "application/x-www-form-urlencoded";
	private final String SEARCH_URL = "https://integration.familysearch.org/platform/tree/search";

	private List<FamilySearchModel> itemList;
	private final String accessToken;
	private final String name;
	private final FamilySearchProvider familySearchProvider;

	/**
	 * @param accessToken
	 *            Family Search Application Access Token
	 * @param name
	 *            Search parameter
	 * @param familySearchProvider
	 *            Model class
	 */
	public FamilySearchProgressDialog(String accessToken, String name, FamilySearchProvider familySearchProvider) {
		super();
		this.accessToken = accessToken;
		this.name = name;
		this.familySearchProvider = familySearchProvider;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.operation.IRunnableWithProgress#run(org.eclipse.core.
	 * runtime.IProgressMonitor)
	 */
	@Override
	public synchronized void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		int counter = 0;
		String message = "";

		monitor.beginTask("Fetching Family Search results", IProgressMonitor.UNKNOWN);

		itemList = new ArrayList<FamilySearchModel>();

		final String getData = "?access_token=" + accessToken + "&q=name:" + name.toLowerCase().trim();

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
			LOGGER.info("Results: " + results);

			final JSONArray entries = (JSONArray) jsonObject.get("entries");

			int lim = entries.length();
			LOGGER.info("Entries: " + lim);
			if (lim > 10) {
				lim = 10;
			}

			for (int i = 0; i < lim; i++) {
				final JSONObject content = (JSONObject) entries.get(i);
				final JSONObject content2 = (JSONObject) content.get("content");
				final JSONObject gedcomx = (JSONObject) content2.get("gedcomx");
				final JSONArray persons = (JSONArray) gedcomx.get("persons");

				int arrayLength = persons.length();
				LOGGER.info("Persons: " + arrayLength);
				if (arrayLength > 10) {
					arrayLength = 10;
				}

				for (int j = 0; j < arrayLength; j++) {
					final JSONObject person = (JSONObject) persons.get(j);
					final JSONObject display = (JSONObject) person.get("display");

					LOGGER.fine("Item " + j + ": " + display.toString(2));

					final FamilySearchModel item = new FamilySearchModel();

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

					// Check if the user pressed "cancel"
					if (monitor.isCanceled()) {
						monitor.done();
						return;
					}

					wait(100);
					monitor.subTask("Getting person " + counter++ + " of " + results);
					itemList.add(item);
					monitor.worked(1);

					if (itemList.size() > 50) {
						message = "Items added: " + (itemList.size() - 1) + " (" + results + " was found)";
						LOGGER.info(message);

						eventBroker.post("MESSAGE", message);
						monitor.done();
						return;
					}
				}
			}
			message = "Items added: " + (itemList.size() - 1);
			LOGGER.info(message);
			familySearchProvider.setItemList(itemList);
			monitor.done();
		} catch (IOException | JSONException e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
		}
	}
}
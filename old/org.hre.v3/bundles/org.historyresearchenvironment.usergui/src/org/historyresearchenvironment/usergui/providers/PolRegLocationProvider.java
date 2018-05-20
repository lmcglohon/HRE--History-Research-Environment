/**
 * 
 */
package org.historyresearchenvironment.usergui.providers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.historyresearchenvironment.usergui.models.PolRegLocationModel;
import org.json.JSONArray;
import org.json.JSONObject;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * @author Michael Erichsen, &copy; HRE Ltd.
 *
 */
public class PolRegLocationProvider extends AbstractHreProvider {
	ScopedPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE,
			"org.historyresearchenvironment.usergui");
	private List<PolRegLocationModel> modelList;

	private final String POLREG_URI = "http://www.politietsregisterblade.dk/api/1/?type=address&registerblad_id=";
	private final String USER_AGENT = "Mozilla/5.0";
	private final String ACCEPT = "application/json";
	private final String CONTENT_TYPE = "application/x-www-form-urlencoded";

	/**
	 * 
	 */
	public PolRegLocationProvider() {
		super();
		LOGGER.info("Constructor");

		try {
			final String registerBlad = store.getString("POLREGID");
			final URL url = new URL(POLREG_URI + registerBlad);
			final HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("User-Agent", USER_AGENT);
			conn.setRequestProperty("Content-Type", CONTENT_TYPE);
			conn.setRequestProperty("Accept", ACCEPT);

			final int responseCode = conn.getResponseCode();
			System.out.println("Response code: " + responseCode);

			final BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			StringBuilder sb = new StringBuilder();
			String s = "";

			while (null != (s = br.readLine())) {
				sb.append(s);
			}

			final JSONArray resultArray = new JSONArray(sb.toString());

			modelList = new ArrayList<PolRegLocationModel>();
			JSONObject jsonAddress;
			PolRegLocationModel model;
			final int l = resultArray.length() - 1;

			for (int i = 0; i < l; i++) {
				jsonAddress = (JSONObject) resultArray.get(i);
				model = new PolRegLocationModel();

				LOGGER.fine(jsonAddress.toString(2));

				try {
					sb = new StringBuilder();
					s = jsonAddress.getString("roadname");
					if (!s.equals("")) {
						sb.append(s);
					}
					s = jsonAddress.getString("number");
					if (!s.equals("")) {
						sb.append(" " + s);
					}
					s = jsonAddress.getString("letter");
					if (!s.equals("")) {
						sb.append(" " + s);
					}
					s = jsonAddress.getString("floor");
					if (!s.equals("")) {
						sb.append(" " + s);
					}
					s = jsonAddress.getString("side");
					if (!s.equals("")) {
						sb.append(" " + s);
					}
					s = jsonAddress.getString("place");
					if (!s.equals("")) {
						sb.append(" " + s);
					}
					model.setAddress(sb.toString());
				} catch (final Exception e) {
				}
				try {
					model.setDate(jsonAddress.getString("date"));
				} catch (final Exception e) {
				}
				try {
					model.setLatitude(jsonAddress.getString("latitude"));
				} catch (final Exception e) {
				}
				try {
					model.setLongitude(jsonAddress.getString("longitude"));
				} catch (final Exception e) {
				}

				modelList.add(model);
			}
		} catch (final Exception e) {
			LOGGER.severe(e.getMessage());
		}
	}

	/**
	 * @return the modelList
	 */
	public List<PolRegLocationModel> getModelList() {
		LOGGER.info("Get Model List");
		return modelList;
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
	 * @param modelList
	 *            the modelList to set
	 */
	public void setModelList(List<PolRegLocationModel> modelList) {
		this.modelList = modelList;
	}
}
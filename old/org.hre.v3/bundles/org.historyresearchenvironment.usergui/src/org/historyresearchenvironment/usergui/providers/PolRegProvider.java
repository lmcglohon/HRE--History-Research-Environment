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
import org.historyresearchenvironment.usergui.models.PolRegModel;
import org.json.JSONArray;
import org.json.JSONObject;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * @version 0.0.4
 * @author Michael Erichsen, &copy; History Research Environment Ltd.
 *
 */
public class PolRegProvider extends AbstractHreProvider {
	ScopedPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE,
			"org.historyresearchenvironment.usergui");
	private List<PolRegModel> modelList;

	private final String POLREG_URI = "http://www.politietsregisterblade.dk/api/1?type=person";
	private final String USER_AGENT = "Mozilla/5.0";
	private final String ACCEPT = "application/json";
	private final String CONTENT_TYPE = "application/x-www-form-urlencoded";

	/**
	 * 
	 */
	public PolRegProvider() {
		super();
		LOGGER.info("Constructor");

		try {
			final String name = store.getString("PERNAME");
			final String[] nameParts = name.split("\\+");
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < (nameParts.length - 1); i++) {
				sb.append(nameParts[i] + "+");
			}
			final String mid = sb.toString();
			final String firstNames = mid.substring(0, mid.length() - 1);
			final String lastName = nameParts[nameParts.length - 1];
			final URL url = new URL(POLREG_URI + "&firstnames=" + firstNames + "&lastname=" + lastName);
			final HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("User-Agent", USER_AGENT);
			conn.setRequestProperty("Content-Type", CONTENT_TYPE);
			conn.setRequestProperty("Accept", ACCEPT);

			final int responseCode = conn.getResponseCode();
			System.out.println("Response code: " + responseCode);

			final BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			sb = new StringBuilder();
			String s = "";

			while (null != (s = br.readLine())) {
				sb.append(s);
			}

			final JSONArray resultArray = new JSONArray(sb.toString());

			modelList = new ArrayList<PolRegModel>();
			JSONObject jsonPerson;
			PolRegModel model;
			int l = resultArray.length();
			l = (l > 50 ? 50 : l);

			for (int i = 0; i < l; i++) {
				jsonPerson = (JSONObject) resultArray.get(i);
				model = new PolRegModel();

				try {
					model.setDateofbirth(jsonPerson.getString("dateofbirth"));
				} catch (final Exception e) {
				}

				try {
					model.setBirthplace(jsonPerson.getString("birthplace"));
				} catch (final Exception e) {
				}
				try {
					model.setPerson_type(jsonPerson.getString("person_type"));
				} catch (final Exception e) {
				}
				try {
					model.setDateofdeath(jsonPerson.getString("dateofdeath"));
				} catch (final Exception e) {
				}
				try {
					model.setId(jsonPerson.getString("id"));
				} catch (final Exception e) {
				}
				try {
					model.setRegisterblad_id(jsonPerson.getString("registerblad_id"));
				} catch (final Exception e) {
				}
				try {
					model.setFirstnames(jsonPerson.getString("firstnames"));
				} catch (final Exception e) {
				}
				try {
					model.setLastname(jsonPerson.getString("lastname"));
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
	public List<PolRegModel> getModelList() {
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
	public void setModelList(List<PolRegModel> modelList) {
		this.modelList = modelList;
	}
}
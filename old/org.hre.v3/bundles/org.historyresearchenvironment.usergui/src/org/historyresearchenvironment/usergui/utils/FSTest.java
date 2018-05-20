package org.historyresearchenvironment.usergui.utils;
/**
 * 
 */

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONArray;
import org.json.JSONObject;

public class FSTest {
	public static void main(String[] args) {
		final FSTest fsTest = new FSTest();
		try {
			final String localIpAddress = fsTest.getLocalIpAddress();
			final String accessToken = fsTest.doAuth(localIpAddress);
			fsTest.doSearch(accessToken, "Jens A", "Hansen");
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @author Michael Erichsen, &copy; HRE Ltd.
	 *
	 *         name: The full name of the person being searched.
	 * 
	 *         givenName: The given name of the person being searched.
	 * 
	 *         surname: The family name of the person being searched.
	 * 
	 *         gender: The gender of the person being searched. Valid values are
	 *         "male" and "female".
	 * 
	 *         birthDate: The birth date of the person being searched. Date ranges
	 *         are supported by placing a "-" between two dates.
	 * 
	 *         birthPlace: The birth place of the person being searched.
	 * 
	 *         christeningDate: The christening date of the person being searched.
	 *         Date ranges are supported by placing a "-" between two dates.
	 * 
	 *         ChristeningPlace: The christening place of the person being searched.
	 * 
	 *         birthLikeDate: The date of the birth-like event of the person being
	 *         searched. Date ranges are supported by placing a "-" between two
	 *         dates.
	 * 
	 *         birthLikePlace: The place of the birth-like event of the person being
	 *         searched.
	 * 
	 *         deathDate: The death date of the person being searched. Date ranges
	 *         are supported by placing a "-" between two dates.
	 * 
	 *         deathPlace: The death place of the person being searched.
	 * 
	 *         burialDate: The burial date of the person being searched. Date ranges
	 *         are supported by placing a "-" between two dates.
	 * 
	 *         burialPlace: The burial place of the person being searched.
	 * 
	 *         deathLikeDate: The date of the death-like event of the person being
	 *         searched. Date ranges are supported by placing a "-" between two
	 *         dates.
	 * 
	 *         deathLikePlace: The place of the death-like event of the person being
	 *         searched.
	 * 
	 *         marriageDate: The marriage date of the person being searched. Date
	 *         ranges are supported by placing a "-" between two dates.
	 * 
	 *         marriagePlace: The marriage place of the person being searched.
	 */
	private final String SOCKETS_URL = "identint.familysearch.org";
	private final String USER_AGENT = "Mozilla/5.0";
	private final String AUTH_URL = "https://identint.familysearch.org/cis-web/oauth2/v3/token";
	private final String ACCEPT = "application/json";
	private final String CONTENT_TYPE = "application/x-www-form-urlencoded";
	private final String SEARCH_URL = "https://integration.familysearch.org/platform/tree/search";

	private final String CLIENT_ID = "a02f100000RNRXSAA5";

	public FSTest() {
	}

	private String doAuth(String localIpAddress) throws Exception {
		final URL url = new URL(AUTH_URL);
		final HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setRequestProperty("User-Agent", USER_AGENT);
		conn.setRequestProperty("Content_Type", CONTENT_TYPE);
		conn.setRequestProperty("Accept", ACCEPT);

		final String postData = "grant_type=unauthenticated_session&ip_address=" + localIpAddress + "&client_id="
				+ CLIENT_ID;

		conn.setDoOutput(true);
		final DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
		wr.writeBytes(postData);
		wr.flush();
		wr.close();

		// int responseCode = conn.getResponseCode();
		// System.out.println("\nSending 'POST' request to URL: " + url);
		// System.out.println("Post data: " + postData);
		// System.out.println("Response code: " + responseCode);

		final BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String output;
		final StringBuffer response = new StringBuffer();

		while ((output = in.readLine()) != null) {
			response.append(output);
		}

		in.close();

		final JSONObject jsonObject = new JSONObject(response.toString());

		System.out.println("JSON response: " + jsonObject.toString(2));

		return jsonObject.getString("access_token");
	}

	/**
	 * @param placeName
	 * @return
	 */
	public void doSearch(String accessToken, String name1, String name2) throws Exception {
		final String getData = "?access_token=" + accessToken + "&q=givenName:" + name1 + "+surName:" + name2;
		final URL url = new URL(SEARCH_URL + getData);
		final HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("User-Agent", USER_AGENT);
		conn.setRequestProperty("Content-Type", CONTENT_TYPE);
		conn.setRequestProperty("Accept", ACCEPT);
		conn.setRequestProperty("Authorization", "Bearer " + accessToken);

		final int responseCode = conn.getResponseCode();
		System.out.println("\nSending 'GET' request to URL: " + url);
		System.out.println("Get data: " + getData);
		System.out.println("Response code: " + responseCode);

		final BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

		final StringBuilder sb = new StringBuilder();
		String s = "";

		while (null != (s = br.readLine())) {
			sb.append(s);
		}

		System.out.println("Response: " + sb.toString());

		final JSONObject jsonObject = new JSONObject(sb.toString());
		// int results = jsonObject.getInt("results");
		// System.out.println("Results: " + results);

		final JSONArray entries = (JSONArray) jsonObject.get("entries");

		for (int i = 0; i < entries.length(); i++) {
			final JSONObject content = (JSONObject) entries.get(i);
			final JSONObject content2 = (JSONObject) content.get("content");
			final JSONObject gedcomx = (JSONObject) content2.get("gedcomx");
			final JSONArray persons = (JSONArray) gedcomx.get("persons");

			for (int j = 0; j < persons.length(); j++) {
				final JSONObject person = (JSONObject) persons.get(j);
				final JSONObject display = (JSONObject) person.get("display");

				System.out.println("\n" + display.toString(2));
				// String name = display.getString("name");
				/**
				 * "birthPlace": "Grand View, Washington, Ohio, United States", "gender":
				 * "Male", "deathPlace": "Grand View, Washington, Ohio, United States",
				 * 
				 * "name": "Andreas M. Harvard",
				 * 
				 * * "deathDate": "15 May 1889",
				 * 
				 * "birthDate": "15 May 1814"
				 */
			}
		}
	}

	private String getLocalIpAddress() throws Exception {
		String localIpAddress = "";

		final Socket socket = new Socket();
		socket.connect(new InetSocketAddress(SOCKETS_URL, 80));
		localIpAddress = socket.getLocalAddress().getHostAddress();
		socket.close();

		return localIpAddress;
	}
}

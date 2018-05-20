package org.historyresearchenvironment.usergui.providers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.logging.Logger;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class GoogleGeocodingProvider {
	protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/**
	 * Constructor
	 *
	 */
	public GoogleGeocodingProvider() {
	}

	/**
	 * @param placeName
	 * @return
	 */
	public String geocode(String placeName) {
		String returnValue = "";

		try {
			final String address = "https://maps.googleapis.com/maps/api/geocode/json?address="
					+ placeName.replace(' ', '+');
			final URL url = new URL(address);

			LOGGER.info(url.toString());
			final BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

			final StringBuilder sb = new StringBuilder();
			String s = "";

			while (null != (s = br.readLine())) {

				sb.append(s);
			}

			final JSONObject jsonObject = new JSONObject(sb.toString());
			final JSONArray results = (JSONArray) jsonObject.get("results");

			LOGGER.fine(results.toString(2));

			final JSONObject result = (JSONObject) results.get(0);
			final JSONObject geometry = (JSONObject) result.get("geometry");
			final JSONObject location = (JSONObject) geometry.get("location");
			final Double lng = location.getDouble("lng");
			final Double lat = location.getDouble("lat");
			returnValue = lng + ", " + lat;
			LOGGER.info("Lat " + lat + ", lng " + lng);
		} catch (final Exception e) {
			LOGGER.severe(e.getClass() + " " + e.getMessage());
			returnValue = "Error: " + e.getClass() + " " + e.getMessage();
		}

		return returnValue;
	}
}

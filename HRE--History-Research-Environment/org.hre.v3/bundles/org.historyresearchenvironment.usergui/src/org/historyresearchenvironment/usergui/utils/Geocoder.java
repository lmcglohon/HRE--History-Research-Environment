/**
 * 
 */
package org.historyresearchenvironment.usergui.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author michael
 *
 */
public class Geocoder {

	/**
	 * Download and include java-json.jar
	 */
	public Geocoder() {
	}

	public String geocode(String placeName) {
		String returnValue = "";

		try {
			String address = "https://maps.googleapis.com/maps/api/geocode/json?address=" + placeName;
			URL url = new URL(address);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

			StringBuilder sb = new StringBuilder();
			String s = "";

			while (null != (s = br.readLine())) {

				sb.append(s);
			}

			JSONObject jsonObject = new JSONObject(sb.toString());
			JSONArray results = (JSONArray) jsonObject.get("results");

			JSONObject result = (JSONObject) results.get(0);
			JSONObject geometry = (JSONObject) result.get("geometry");
			JSONObject location = (JSONObject) geometry.get("location");
			Double lng = location.getDouble("lng");
			Double lat = location.getDouble("lat");
			returnValue = lng + ", " + lat;
			// LOGGER.info("Lat " + lat + ", lng " + lng);

		} catch (Exception e) {
			returnValue = "Error: " + e.getMessage();
		}

		return returnValue;
	}
}

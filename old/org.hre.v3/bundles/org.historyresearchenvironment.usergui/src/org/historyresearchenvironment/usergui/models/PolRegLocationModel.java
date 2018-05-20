/**
 * 
 */
package org.historyresearchenvironment.usergui.models;

/**
 * @author Michael Erichsen, &copy; HRE Ltd.
 *
 */
public class PolRegLocationModel {
	private String address;
	private String date;
	private String latitude;
	private String longitude;

	/**
	 * 
	 */
	public PolRegLocationModel() {
		address = "";
		date = "";
		latitude = "";
		longitude = "";
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @param latitude
	 *            the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * @param longitude
	 *            the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return address + ", " + date + ", " + latitude + ", " + longitude;
	}

}

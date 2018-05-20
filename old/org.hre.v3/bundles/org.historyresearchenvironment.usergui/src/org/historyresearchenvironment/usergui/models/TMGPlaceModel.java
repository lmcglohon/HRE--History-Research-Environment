/**
 * 
 */
package org.historyresearchenvironment.usergui.models;

/**
 * @author Michael Erichsen, &copy; HRE Ltd.
 *
 */
public class TMGPlaceModel extends AbstractHreModel {
	private int recNo;
	private int uid;
	private int type;
	private String xValue;
	private String[] placeParts = { "", "", "", "", "", "", "", "", "", "", "", "" };

	/**
	 * @param recNo
	 */
	public TMGPlaceModel(int recNo) {
		super();
		this.recNo = recNo;
	}

	/**
	 * @param recNo
	 * @param uid
	 * @param type
	 * @param xValue
	 */
	public TMGPlaceModel(int recNo, String[] placeParts) {
		super();
		this.recNo = recNo;
		this.placeParts = placeParts;
	}

	/**
	 * @param i
	 * @return
	 */
	public String getPlacePart(int i) {
		return placeParts[i];
	}

	/**
	 * @return the placeParts
	 */
	public String[] getPlaceParts() {
		return placeParts;
	}

	/**
	 * @return the recNo
	 */
	public int getRecNo() {
		return recNo;
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @return the uid
	 */
	public int getUid() {
		return uid;
	}

	/**
	 * @return the xValue
	 */
	public String getxValue() {
		return xValue;
	}

	/**
	 * @param i
	 * @param s
	 */
	public void setPlacePart(int i, String s) {
		placeParts[i] = s;
	}

	/**
	 * @param placeParts
	 *            the placeParts to set
	 */
	public void setPlaceParts(String[] placeParts) {
		this.placeParts = placeParts;
	}

	/**
	 * @param recNo
	 *            the recNo to set
	 */
	public void setRecNo(int recNo) {
		this.recNo = recNo;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @param uid
	 *            the uid to set
	 */
	public void setUid(int uid) {
		this.uid = uid;
	}

	/**
	 * @param xValue
	 *            the xValue to set
	 */
	public void setxValue(String xValue) {
		this.xValue = xValue;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		boolean first = true;

		for (final String placePart : placeParts) {
			if (placePart.length() > 0) {
				if (first) {
					first = false;
				} else {
					sb.append(", ");
				}
				sb.append(placePart);
			}
		}
		return sb.toString();

	}
}

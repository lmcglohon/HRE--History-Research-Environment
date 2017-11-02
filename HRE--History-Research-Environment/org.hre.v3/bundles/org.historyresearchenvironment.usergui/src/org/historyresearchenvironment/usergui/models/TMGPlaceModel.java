/**
 * 
 */
package org.historyresearchenvironment.usergui.models;

import java.sql.ResultSet;

/**
 * @author Michael Erichsen
 *
 */
/**
 * @author Michael Erichsen
 *
 */
public class TMGPlaceModel extends AbstractHreModel {
	private final String SELECT1 = "SELECT TYPE, XVALUE FROM PLACEPARTTYPE ORDER BY TYPE";
	private final String SELECT2 = "SELECT RECNO FROM PLACE ORDER BY RECNO";
	private String[] labels = { "Record Number", "", "", "", "", "", "", "", "", "", "", "" };
	private TMGPlaceVector vector = new TMGPlaceVector();

	/**
	 * 
	 */
	public TMGPlaceModel() {
		super();
		ResultSet rs;
		int type;

		try {
			pst = conn.prepareStatement(SELECT1);
			rs = pst.executeQuery();

			while (rs.next()) {
				type = rs.getInt("TYPE");
				labels[type] = rs.getString("XVALUE");
			}
			pst.close();
		} catch (final Exception e) {
			LOGGER.severe(e.getMessage());
		}
	}

	/**
	 * @param i
	 * @return a label
	 */
	public String getLabel(int i) {
		return labels[i];
	}

	/**
	 * @return the labels
	 */
	public String[] getLabels() {
		return labels;
	}

	/**
	 * @return the vector
	 */
	public TMGPlaceVector getVector() {
		return vector;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.usergui.models.AbstractHreModel#readFromH2(
	 * int)
	 */
	@Override
	public void readFromH2(int i) {
		// Ignore input
		ResultSet rs;
		int recNo;

		try {
			pst = conn.prepareStatement(SELECT2);
			rs = pst.executeQuery();

			while (rs.next()) {
				recNo = rs.getInt("RECNO");
				vector.add(recNo);
			}
			pst.close();
		} catch (final Exception e) {
			LOGGER.severe(e.getMessage());
		}

	}

	/**
	 * @param labels
	 *            the labels to set
	 */
	public void setLabels(String[] labels) {
		this.labels = labels;
	}

	/**
	 * @param vector
	 *            the vector to set
	 */
	public void setVector(TMGPlaceVector vector) {
		this.vector = vector;
	}

}

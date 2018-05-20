package org.historyresearchenvironment.usergui.providers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.historyresearchenvironment.usergui.models.TMGPlaceVector;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class TMGPlaceProvider extends AbstractHreProvider {
	private final String SELECT1 = "SELECT TYPE, XVALUE FROM PLACEPARTTYPE ORDER BY TYPE";
	private final String SELECT2 = "SELECT RECNO FROM PLACE ORDER BY RECNO";
	private String[] labels = { "Record Number", "", "", "", "", "", "", "", "", "", "", "" };
	private TMGPlaceVector vector = new TMGPlaceVector();

	/**
	 * Constructor. Provides labels.
	 *
	 */
	public TMGPlaceProvider() {
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
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
		}
	}

	/**
	 * Close connection to H2.
	 */
	public void dispose() {
		try {
			conn.close();
		} catch (final SQLException e) {
			e.printStackTrace();
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
	 * org.historyresearchenvironment.usergui.models.AbstractHreProvider#readFromH2(
	 * int)
	 */
	@Override
	public void readFromH2(int i) {
		// Ignore input
		ResultSet rs;
		int recNo;

		try {
			// conn = HreH2ConnectionPool.getConnection();
			pst = conn.prepareStatement(SELECT2);
			rs = pst.executeQuery();

			while (rs.next()) {
				recNo = rs.getInt("RECNO");
				vector.add(conn, recNo);
			}
			pst.close();
			// conn.close();
		} catch (final Exception e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
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

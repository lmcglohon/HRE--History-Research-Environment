package org.historyresearchenvironment.usergui.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Logger;

/**
 * @author Michael Erichsen, &copy; History Research Environment Ltd.
 * @version 0.0.4
 *
 */
public class TMGPlaceVector {
	private Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private static Vector<TMGPlaceModel> vector;
	private TMGPlaceModel item;
	private final String SELECT1 = "SELECT UID, TYPE FROM PLACEPARTVALUE WHERE RECNO = ? ORDER BY TYPE";
	private final String SELECT2 = "SELECT XVALUE FROM PLACEDICTIONARY WHERE UID = ?";

	/**
	 * No arg c:tor
	 */
	public TMGPlaceVector() {
		vector = new Vector<TMGPlaceModel>();
	}

	/**
	 * @param conn
	 * @param recNo
	 */
	public void add(Connection conn, int recNo) {
		ResultSet rs = null;
		int uid = 0;
		int type = 0;
		PreparedStatement pst = null;
		PreparedStatement pst1 = null;
		ResultSet rs1 = null;
		String xValue = "";

		try {
			item = new TMGPlaceModel(recNo);

			pst = conn.prepareStatement(SELECT1);
			pst.setInt(1, recNo);

			rs = pst.executeQuery();

			while (rs.next()) {
				uid = rs.getInt("UID");
				type = rs.getInt("TYPE");

				pst1 = conn.prepareStatement(SELECT2);
				pst1.setInt(1, uid);

				rs1 = pst1.executeQuery();

				if (rs1.next()) {
					xValue = rs1.getString("XVALUE");
					if (xValue.startsWith("-")) {
						xValue = xValue.substring(1, xValue.length());
					}
					item.setPlacePart(type, xValue);
				}
				pst1.close();
			}
			vector.add(item);
			pst.close();
		} catch (final Exception e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage());
		}
	}

	/**
	 * @param recNo
	 * @return
	 */
	public TMGPlaceModel getItem(int recNo) {
		final Iterator<TMGPlaceModel> i = iterator();

		while (i.hasNext()) {
			final TMGPlaceModel tmgPlaceItem = i.next();

			if (tmgPlaceItem.getRecNo() == recNo) {
				return tmgPlaceItem;
			}
		}
		return null;
	}

	/**
	 * @return iterator to vector
	 */
	public Iterator<TMGPlaceModel> iterator() {
		return vector.iterator();
	}
}

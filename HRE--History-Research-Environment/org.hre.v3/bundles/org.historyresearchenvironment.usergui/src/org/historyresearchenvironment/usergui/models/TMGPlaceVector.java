/**
 * 
 */
package org.historyresearchenvironment.usergui.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author Michael Erichsen
 *
 */
public class TMGPlaceVector extends AbstractHreVector {
	private static Vector<TMGPlaceItem> vector;
	private TMGPlaceItem item;
	private final String SELECT1 = "SELECT UID, TYPE FROM PLACEPARTVALUE WHERE RECNO = ? ORDER BY TYPE";
	private final String SELECT2 = "SELECT XVALUE FROM PLACEDICTIONARY WHERE UID = ?";

	/**
	 * No arg c:tor
	 */
	public TMGPlaceVector() {
		super();
		vector = new Vector<TMGPlaceItem>();
	}

	/**
	 * @param recNo
	 */
	public void add(int recNo) {
		ResultSet rs = null;
		int uid = 0;
		int type = 0;
		PreparedStatement pst1 = null;
		ResultSet rs1 = null;
		String xValue = "";

		try {
			item = new TMGPlaceItem(recNo);

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
					item.setPlacePart(type, xValue);
				}
			}
			vector.add(item);
			pst.close();
		} catch (final Exception e) {
			LOGGER.severe(e.getMessage());
		}
	}

	/**
	 * @param recNo
	 * @return
	 */
	public TMGPlaceItem getItem(int recNo) {
		final Iterator<TMGPlaceItem> i = iterator();

		while (i.hasNext()) {
			final TMGPlaceItem tmgPlaceItem = i.next();

			if (tmgPlaceItem.getRecNo() == recNo) {
				return tmgPlaceItem;
			}
		}
		return null;
	}

	/**
	 * @return iterator to vector
	 */
	public Iterator<TMGPlaceItem> iterator() {
		return vector.iterator();
	}

}

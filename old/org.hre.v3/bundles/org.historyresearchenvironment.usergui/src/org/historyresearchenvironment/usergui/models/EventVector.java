/**
 * 
 */
package org.historyresearchenvironment.usergui.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import org.historyresearchenvironment.tmg.h2.models.Placedictionary;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class EventVector extends AbstractHreVector {
	private Vector<EventModel> vector;
	private EventModel item;

	private final String SELECT = "SELECT ETYPENAME, EFOOT, EDATE, XVALUE, UID, TYPE, RECNO FROM EVENTVIEW WHERE PER1 = ? OR PER2 = ? "
			+ "ORDER BY EDATE, RECNO, TYPE";

	/**
	 * Constructor
	 *
	 * @param conn
	 * @param perNo
	 */
	public EventVector(Connection conn, int perNo) {
		vector = new Vector<EventModel>();
		String eventTag = "";
		final String role = "Role";
		String date = "";
		String date1 = "";
		StringBuilder summary = new StringBuilder("");
		int lastRecNo = 0;
		int recNo;
		int uid;
		Placedictionary pd;
		String placePart;

		try {
			pst = conn.prepareStatement(SELECT);
			pst.setInt(1, perNo);
			pst.setInt(2, perNo);

			final ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				eventTag = rs.getString("ETYPENAME");
				date1 = rs.getString("EDATE").substring(1, 9);
				date = date1.substring(0, 4) + "-" + date1.substring(4, 6) + "-" + date1.substring(6, 8);

				recNo = rs.getInt("RECNO");
				uid = rs.getInt("UID");
				pd = new Placedictionary(conn, uid);
				placePart = pd.getXvalue();

				if (placePart.startsWith("-")) {
					placePart = placePart.substring(1, placePart.length());
				}
				LOGGER.fine(recNo + " " + eventTag + " " + role + " " + date + " " + summary.toString());

				if (recNo == lastRecNo) {
					summary.append(", " + placePart);
					LOGGER.fine(recNo + " " + eventTag + " " + role + " " + date + " " + summary.toString());
				} else {
					item = new EventModel(eventTag, role, date, summary.toString());
					vector.add(item);
					lastRecNo = recNo;
					summary = new StringBuilder(
							rs.getString("XVALUE") + ", " + rs.getString("EFOOT") + ", " + placePart);
				}
			}
			pst.close();
		} catch (final Exception e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage());
		}
	}

	public void add(EventModel item) {
		vector.addElement(item);
	}

	/**
	 * @return the vector
	 */
	public Vector<EventModel> getVector() {
		return vector;
	}

	/**
	 * @param vector
	 *            the vector to set
	 */
	public void setVector(Vector<EventModel> vector) {
		this.vector = vector;
	}
}

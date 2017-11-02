/**
 * 
 */
package org.historyresearchenvironment.usergui.models;

import java.sql.ResultSet;
import java.util.Vector;

/**
 * @author michael
 *
 */
public class EventVector extends AbstractHreVector {
	private Vector<EventItem> vector;
	private EventItem item;

	private final String SELECT = "SELECT ETYPENAME, EFOOT, EDATE, XVALUE FROM EVENTVIEW WHERE PER1 = ? OR PER2 = ?";

	/**
	 * Constructor
	 */
	public EventVector(int perNo) {
		vector = new Vector<EventItem>();
		String eventTag = "";
		String role = "Role";
		String date = "";
		String date1 = "";
		String summary = "";

		try {
			pst = conn.prepareStatement(SELECT);
			pst.setInt(1, perNo);
			pst.setInt(2, perNo);

			final ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				eventTag = rs.getString("ETYPENAME");
				date1 = rs.getString("EDATE").substring(1, 9);
				date = date1.substring(0, 4) + "-" + date1.substring(4, 6) + "-" + date1.substring(6, 8);
				summary = rs.getString("XVALUE") + " " + rs.getString("EFOOT");
				item = new EventItem(eventTag, role, date, summary);
				vector.add(item);
			}
			pst.close();
		} catch (Exception e) {
			LOGGER.severe(e.getMessage());
		}
	}

	public void add(EventItem item) {
		vector.addElement(item);
	}

	/**
	 * @return the vector
	 */
	public Vector<EventItem> getVector() {
		return vector;
	}

	/**
	 * @param vector
	 *            the vector to set
	 */
	public void setVector(Vector<EventItem> vector) {
		this.vector = vector;
	}
}

package org.historyresearchenvironment.usergui.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class DescendantVector extends AbstractHreVector {
	private final String SELECT = "SELECT NAME.SRNAMEDISP, PERSON.PER_NO "
			+ "FROM PERSON, NAME WHERE NAME.NPER = PERSON.PER_NO AND PERSON.PER_NO = ? ORDER BY PERSON.PER_NO";
	private final String SELECTCHILDREN = "SELECT CHILD FROM PARENTCHILDRELATIONSHIP WHERE PARENT = ?";

	private Vector<DescendantModel> vector;
	private DescendantModel item;
	private Vector<Integer> children;

	private PreparedStatement pstc = null;

	/**
	 * No arg c:tor
	 */
	public DescendantVector() {
		super();
	}

	/**
	 * C:tor
	 */
	public DescendantVector(Connection conn, int perNo) {
		vector = new Vector<DescendantModel>();

		try {
			pst = conn.prepareStatement(SELECT);
			pst.setInt(1, perNo);

			final ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				item = new DescendantModel();
				item.setCurrent(perNo);
				item.setName(perNo + ", " + rs.getString("SRNAMEDISP"));
			}

			children = new Vector<Integer>();

			pstc = conn.prepareStatement(SELECTCHILDREN);
			pstc.setInt(1, perNo);

			final ResultSet rsc = pstc.executeQuery();

			while (rsc.next()) {
				children.add(rsc.getInt("CHILD"));
			}

			item.setChildren(children);
			vector.addElement(item);

			try {
				pst.close();
				pstc.close();
			} catch (final Exception e) {
				LOGGER.severe(
						e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
			}
		} catch (

		final Exception e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
		}
	}

	public void add(DescendantModel di) {
		vector.addElement(di);
	}

	/**
	 * @return the vectorPersonItem
	 */
	public Vector<DescendantModel> getVector() {
		return vector;
	}

	/**
	 * @param vectorPersonItem
	 *            the vectorPersonItem to set
	 */
	public void setVector(Vector<DescendantModel> vector) {
		this.vector = vector;
	}
}

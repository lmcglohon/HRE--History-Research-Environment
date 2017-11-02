package org.historyresearchenvironment.usergui.models;

import java.sql.ResultSet;
import java.util.Vector;

/**
 * @author michael
 *
 */
public class AncestorVector extends AbstractHreVector {

	private final String SELECT = "SELECT NAME.SRNAMEDISP, PERSON.PER_NO, PERSON.FATHER, PERSON.MOTHER, PERSON.SEX "
			+ "FROM PERSON, NAME WHERE NAME.NPER = PERSON.PER_NO AND PERSON.PER_NO = ? ORDER BY PERSON.PER_NO";

	private Vector<AncestorItem> vector;
	private AncestorItem item;

	/**
	 * NO arg c:tor
	 */
	public AncestorVector() {
		super();
	}

	/**
	 * C:tor
	 */
	public AncestorVector(int perNo) {
		vector = new Vector<AncestorItem>();

		try {
			pst = conn.prepareStatement(SELECT);
			pst.setInt(1, perNo);

			final ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				item = new AncestorItem();
				item.setPerNo(perNo);
				item.setName(rs.getString("SRNAMEDISP"));
				item.setFather(rs.getInt("FATHER"));
				item.setMother(rs.getInt("MOTHER"));
				item.setSex(rs.getString("SEX"));
			}

			vector.addElement(item);

			try {
				pst.close();
			} catch (final Exception e) {
				// e.printStackTrace();
				LOGGER.severe(e.getMessage());
			}
		} catch (

		final Exception e) {
			e.printStackTrace();
			LOGGER.severe(e.getMessage());
		}
	}

	/**
	 * @param di
	 */
	public void add(AncestorItem item) {
		vector.addElement(item);
	}

	/**
	 * @return the vectorPersonItem
	 */
	public Vector<AncestorItem> getVector() {
		return vector;
	}

	/**
	 * @param vectorPersonItem
	 *            the vectorPersonItem to set
	 */
	public void setVector(Vector<AncestorItem> vector) {
		this.vector = vector;
	}
}

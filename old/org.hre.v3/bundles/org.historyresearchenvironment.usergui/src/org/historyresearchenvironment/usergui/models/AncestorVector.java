package org.historyresearchenvironment.usergui.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class AncestorVector extends AbstractHreVector {

	private final String SELECT = "SELECT NAME.SRNAMEDISP, PERSON.PER_NO, PERSON.FATHER, PERSON.MOTHER, PERSON.SEX "
			+ "FROM PERSON, NAME WHERE NAME.NPER = PERSON.PER_NO AND PERSON.PER_NO = ? ORDER BY PERSON.PER_NO";

	private Vector<AncestorModel> vector;
	private AncestorModel item;

	/**
	 * C:tor
	 */
	public AncestorVector(Connection conn, int perNo) {
		vector = new Vector<AncestorModel>();

		try {
			pst = conn.prepareStatement(SELECT);
			pst.setInt(1, perNo);

			final ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				item = new AncestorModel();
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
				LOGGER.severe(
						e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
			}
		} catch (

		final Exception e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
		}
	}

	/**
	 * @param di
	 */
	public void add(AncestorModel item) {
		vector.addElement(item);
	}

	/**
	 * @return the vectorPersonItem
	 */
	public Vector<AncestorModel> getVector() {
		return vector;
	}

	/**
	 * @param vectorPersonItem
	 *            the vectorPersonItem to set
	 */
	public void setVector(Vector<AncestorModel> vector) {
		this.vector = vector;
	}
}
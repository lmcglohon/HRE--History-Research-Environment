package org.historyresearchenvironment.usergui.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class PersonVector extends AbstractHreVector {
	private Vector<PersonNavigatorModel> vector;
	private PersonNavigatorModel item;

	private final String SELECT = "SELECT NAME.SRNAMEDISP, PERSON.PER_NO, PERSON.PBIRTH, PERSON.PDEATH, "
			+ "PERSON.FATHER, PERSON.MOTHER FROM PERSON, NAME WHERE NAME.NPER = PERSON.PER_NO "
			+ "ORDER BY NAME.SRNAMEDISP";

	/**
	 * C:tor
	 * 
	 * @param conn
	 */
	public PersonVector(Connection conn) {
		vector = new Vector<PersonNavigatorModel>();
		String date;

		try {
			pst = conn.prepareStatement(SELECT);

			final ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				item = new PersonNavigatorModel();
				item.setName(rs.getString("SRNAMEDISP"));
				item.setPerNo(rs.getInt("PER_NO"));
				date = rs.getString("PBIRTH");

				try {
					item.setPbirth(date.substring(1, 5) + "-" + date.substring(5, 7) + "-" + date.substring(7, 9));
				} catch (final Exception e) {
					item.setPbirth("");
				}

				date = rs.getString("PDEATH");

				try {
					item.setPdeath(date.substring(1, 5) + "-" + date.substring(5, 7) + "-" + date.substring(7, 9));
				} catch (final Exception e) {
					item.setPdeath("");
				}

				item.setFather(rs.getInt("FATHER"));
				item.setMother(rs.getInt("MOTHER"));

				vector.addElement(item);
			}
			try {
				pst.close();
			} catch (final Exception e) {
				e.printStackTrace();
				LOGGER.severe(
						e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
			}
		} catch (final Exception e) {
			e.printStackTrace();
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
		}

	}

	/**
	 * @param item
	 */
	public void add(PersonNavigatorModel item) {
		vector.addElement(item);
	}

	/**
	 * @return the vectorPersonItem
	 */
	public Vector<PersonNavigatorModel> getVector() {
		return vector;
	}

	/**
	 * @param vectorPersonItem
	 *            the vectorPersonItem to set
	 */
	public void setVector(Vector<PersonNavigatorModel> vector) {
		this.vector = vector;
	}
}
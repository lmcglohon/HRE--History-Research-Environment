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
public class PersonVector extends AbstractHreVector {
	private Vector<PersonItem> vector;
	private PersonItem item;

	private final String SELECT = "SELECT NAME.SRNAMEDISP, PERSON.PER_NO, PERSON.PBIRTH, PERSON.PDEATH, "
			+ "PERSON.FATHER, PERSON.MOTHER FROM PERSON, NAME WHERE NAME.NPER = PERSON.PER_NO "
			+ "ORDER BY NAME.SRNAMEDISP";

	/**
	 * C:tor
	 */
	public PersonVector() {
		vector = new Vector<PersonItem>();
		String date;

		try {
			pst = conn.prepareStatement(SELECT);

			final ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				item = new PersonItem();
				item.setName(rs.getString("SRNAMEDISP"));
				item.setPerNo(rs.getInt("PER_NO"));
				date = rs.getString("PBIRTH");

				try {
					item.setPbirth(date.substring(1, 5) + "-" + date.substring(5, 7) + "-" + date.substring(7, 9));
				} catch (Exception e) {
					item.setPbirth("");
				}

				date = rs.getString("PDEATH");

				try {
					item.setPdeath(date.substring(1, 5) + "-" + date.substring(5, 7) + "-" + date.substring(7, 9));
				} catch (Exception e) {
					item.setPdeath("");
				}

				item.setFather(rs.getInt("FATHER"));
				item.setMother(rs.getInt("MOTHER"));

				vector.addElement(item);
			}
			try {
				pst.close();
			} catch (final Exception e) {
				e.printStackTrace();LOGGER.severe(e.getMessage());
			}
		} catch (final Exception e) {
			e.printStackTrace();
			LOGGER.severe(e.getMessage());
		}

	}

	/**
	 * @param item
	 */
	public void add(PersonItem item) {
		vector.addElement(item);
	}

	/**
	 * @return the vectorPersonItem
	 */
	public Vector<PersonItem> getVector() {
		return vector;
	}

	/**
	 * @param vectorPersonItem
	 *            the vectorPersonItem to set
	 */
	public void setVector(Vector<PersonItem> vector) {
		this.vector = vector;
	}
}
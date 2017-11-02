package org.historyresearchenvironment.usergui.models;

import java.util.Vector;

/**
 * @author michael
 *
 */
public class PersonNavigatorModel extends AbstractHreModel {
	protected Vector<PersonItem> persons;

	/**
	 * No arg c:tor
	 */
	public PersonNavigatorModel() {
		super();
		persons = new Vector<PersonItem>();
	}

	/**
	 * @param name
	 * @param perNo
	 * @param pBirth
	 * @param pDeath
	 * @param father
	 * @param mother
	 */
	public void addPerson(String name, int perNo, String pBirth, String pDeath, int father, int mother) {
		PersonItem pi = new PersonItem(name, perNo, pBirth, pDeath, father, mother);

		if (persons == null) {
			persons = new Vector<PersonItem>();
		}
		persons.add(pi);
	}

	/**
	 * @return
	 */
	public Vector<PersonItem> getPersons() {
		return persons;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.usergui.models.AbstractHreModel#readFromH2(
	 * int)
	 */
	@Override
	public void readFromH2(int i) {
		// Ignore i
		persons = new PersonVector().getVector();
	}
}
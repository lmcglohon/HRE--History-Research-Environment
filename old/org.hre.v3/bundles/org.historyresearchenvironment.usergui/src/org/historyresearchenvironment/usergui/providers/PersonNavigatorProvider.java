package org.historyresearchenvironment.usergui.providers;

import java.util.Vector;

import org.historyresearchenvironment.usergui.models.PersonNavigatorModel;
import org.historyresearchenvironment.usergui.models.PersonVector;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class PersonNavigatorProvider extends AbstractHreProvider {
	protected Vector<PersonNavigatorModel> persons;

	/**
	 * No arg c:tor
	 */
	public PersonNavigatorProvider() {
		super();
		persons = new Vector<PersonNavigatorModel>();
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
		final PersonNavigatorModel pi = new PersonNavigatorModel(name, perNo, pBirth, pDeath, father, mother);

		if (persons == null) {
			persons = new Vector<PersonNavigatorModel>();
		}
		persons.add(pi);
	}

	/**
	 * @return
	 */
	public Vector<PersonNavigatorModel> getPersons() {
		return persons;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.usergui.models.AbstractHreProvider#readFromH2(
	 * int)
	 */
	@Override
	public void readFromH2(int i) {
		// Ignore i
		persons = new PersonVector(conn).getVector();
	}
}
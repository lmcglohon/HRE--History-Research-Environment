package org.historyresearchenvironment.usergui.models;

import org.historyresearchenvironment.usergui.providers.AbstractHreProvider;

/**
 * @author Michael Erichsen, &copy; HRE Ltd. Erichsen
 *
 */
public class PersonTableModel extends AbstractHreProvider {
	public int counter;

	public PersonTableModel(int counter) {
		this.counter = counter;
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

	}

	@Override
	public String toString() {
		return "Item " + this.counter;
	}
}

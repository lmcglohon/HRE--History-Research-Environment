/**
 * 
 */
package org.historyresearchenvironment.usergui.models;

/**
 * @author Michael Erichsen
 *
 */
public class PersonTableModel extends AbstractHreModel {
	public int counter;

	public PersonTableModel(int counter) {
		this.counter = counter;
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
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Item " + this.counter;
	}
}

/**
 * 
 */
package org.historyresearchenvironment.usergui.providers;

import java.util.Vector;

import org.historyresearchenvironment.usergui.models.EventAssociatesModel;

/**
 * @author Michael Erichsen, &copy; HRE Ltd.
 *
 */
public class EventAssociatesProvider extends AbstractHreProvider {
	private int Id;
	private String identity;
	private String location;
	private String date;
	private Vector<EventAssociatesModel> eaiv = new Vector<EventAssociatesModel>();

	/**
	 * @param cei
	 */
	public void addAssociate(EventAssociatesModel eai) {
		eaiv.addElement(eai);
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @return the eaiv
	 */
	public Vector<EventAssociatesModel> getEaiv() {
		return eaiv;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}

	/**
	 * @return the identity
	 */
	public String getIdentity() {
		return identity;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
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

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @param eaiv
	 *            the eaiv to set
	 */
	public void setEaiv(Vector<EventAssociatesModel> eaiv) {
		this.eaiv = eaiv;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		Id = id;
	}

	/**
	 * @param identity
	 *            the identity to set
	 */
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
}

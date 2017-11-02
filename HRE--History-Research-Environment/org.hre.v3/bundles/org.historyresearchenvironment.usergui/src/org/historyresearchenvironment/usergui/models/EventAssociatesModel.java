/**
 * 
 */
package org.historyresearchenvironment.usergui.models;

import java.util.Vector;

/**
 * @author michael
 *
 */
public class EventAssociatesModel extends AbstractHreModel {
	private int Id;
	private String identity;
	private String location;
	private String date;
	private Vector<EventAssociatesItem> eaiv = new Vector<EventAssociatesItem>();

	/**
	 * @param cei
	 */
	public void addAssociate(EventAssociatesItem eai) {
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
	public Vector<EventAssociatesItem> getEaiv() {
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
	 * org.historyresearchenvironment.usergui.models.AbstractHreModel#readFromH2(
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
	public void setEaiv(Vector<EventAssociatesItem> eaiv) {
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

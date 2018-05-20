package org.historyresearchenvironment.usergui.models;

import java.util.Vector;

import org.historyresearchenvironment.usergui.providers.AbstractHreProvider;

/**
 * @author Michael Erichsen, &copy; HRE Ltd.
 *
 */
public class PersonalConnectionsModel extends AbstractHreProvider {
	private int Id;
	private String identity;
	private String father;
	private String mother;
	private int noChildren;
	private Vector<ConnectionEventsItem> ceiv = new Vector<ConnectionEventsItem>();

	/**
	 * @param cei
	 */
	public void addEvent(ConnectionEventsItem cei) {
		ceiv.addElement(cei);
	}

	/**
	 * @return the ceiv
	 */
	public Vector<ConnectionEventsItem> getCaiv() {
		return ceiv;
	}

	/**
	 * @return the father
	 */
	public String getFather() {
		return father;
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
	 * @return the mother
	 */
	public String getMother() {
		return mother;
	}

	/**
	 * @return the noChildren
	 */
	public int getNoChildren() {
		return noChildren;
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
	 * @param ceiv
	 *            the ceiv to set
	 */
	public void setCeiv(Vector<ConnectionEventsItem> ceiv) {
		this.ceiv = ceiv;
	}

	/**
	 * @param father
	 *            the father to set
	 */
	public void setFather(String father) {
		this.father = father;
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
	 * @param mother
	 *            the mother to set
	 */
	public void setMother(String mother) {
		this.mother = mother;
	}

	/**
	 * @param noChildren
	 *            the noChildren to set
	 */
	public void setNoChildren(int noChildren) {
		this.noChildren = noChildren;
	}
}

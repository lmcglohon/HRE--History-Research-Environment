/**
 * 
 */
package org.historyresearchenvironment.usergui.models;

/**
 * @author michael
 *
 */
public class ConnectionEventsItem {
	private String person;
	private String role;
	private String event;
	private String date;

	public ConnectionEventsItem(String person, String role, String event, String date) {
		super();
		this.person = person;
		this.role = role;
		this.event = event;
		this.date = date;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @return the event
	 */
	public String getEvent() {
		return event;
	}

	/**
	 * @return the person
	 */
	public String getPerson() {
		return person;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	public String[] getStrings() {
		String[] sa = { person, role, event, date };
		return sa;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @param event
	 *            the event to set
	 */
	public void setEvent(String event) {
		this.event = event;
	}

	/**
	 * @param person
	 *            the person to set
	 */
	public void setPerson(String person) {
		this.person = person;
	}

	/**
	 * @param role
	 *            the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
}

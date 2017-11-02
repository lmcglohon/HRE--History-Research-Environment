/**
 * 
 */
package org.historyresearchenvironment.usergui.models;

/**
 * @author michael
 *
 */
public class EventItem extends AbstractHreItem {
	protected String eventTag;
	protected String role;
	protected String date;
	protected String summary;

	/**
	 * 
	 */
	public EventItem() {
		super();
	}

	/**
	 * @param eventTag
	 * @param role
	 * @param date
	 * @param summary
	 */
	public EventItem(String eventTag, String role, String date, String summary) {
		this.eventTag = eventTag;
		this.role = role;
		this.date = date;
		this.summary = summary;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @return the eventTag
	 */
	public String getEventTag() {
		return eventTag;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	public String[] getStrings() {

		String[] sa = new String[4];
		sa[0] = eventTag;
		sa[1] = role;
		sa[2] = date;
		sa[3] = summary;

		return sa;
	}

	/**
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @param eventTag
	 *            the eventTag to set
	 */
	public void setEventTag(String eventTag) {
		this.eventTag = eventTag;
	}

	/**
	 * @param role
	 *            the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @param summary
	 *            the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}
}

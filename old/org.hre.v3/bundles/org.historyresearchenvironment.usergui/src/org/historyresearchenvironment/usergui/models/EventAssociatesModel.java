/**
 * 
 */
package org.historyresearchenvironment.usergui.models;

/**
 * @author Michael Erichsen, &copy; HRE Ltd.
 *
 */
public class EventAssociatesModel {
	private String type;
	private String role;
	private String summary;

	/**
	 * @param type
	 * @param role
	 * @param summary
	 */
	public EventAssociatesModel(String type, String role, String summary) {
		this.type = type;
		this.role = role;
		this.summary = summary;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	public String[] getStrings() {

		final String[] sa = new String[3];
		sa[0] = type;
		sa[1] = role;
		sa[2] = summary;

		return sa;
	}

	/**
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
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

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}

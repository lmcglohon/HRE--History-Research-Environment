package org.historyresearchenvironment.tmg.h2.models;

/**
 * The persistent class for the FOCUSGROUP database table.
 *
 * SELECT GROUPNUM, GROUPNAME, RECENT, TT FROM FOCUSGROUP
 */
public class Focusgroup {

	private int groupnum;

	private String groupname;

	private String recent;

	private String tt;

	public Focusgroup() {
	}

	public String getGroupname() {
		return this.groupname;
	}

	public int getGroupnum() {
		return this.groupnum;
	}

	public String getRecent() {
		return this.recent;
	}

	public String getTt() {
		return this.tt;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public void setGroupnum(int groupnum) {
		this.groupnum = groupnum;
	}

	public void setRecent(String recent) {
		this.recent = recent;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}

}
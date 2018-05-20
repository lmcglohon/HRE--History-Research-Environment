package org.historyresearchenvironment.tmg.h2.models;

/**
 * The persistent class for the FOCUSGROUPMEMBER database table.
 *
 * SELECT GROUPNUM, MEMBERNUM, TT, DSID FROM FOCUSGROUPMEMBER
 */
public class Focusgroupmember {

	private int dsid;

	private int groupnum;

	private int membernum;

	private String tt;

	public Focusgroupmember() {
	}

	public int getDsid() {
		return this.dsid;
	}

	public int getGroupnum() {
		return this.groupnum;
	}

	public int getMembernum() {
		return this.membernum;
	}

	public String getTt() {
		return this.tt;
	}

	public void setDsid(int dsid) {
		this.dsid = dsid;
	}

	public void setGroupnum(int groupnum) {
		this.groupnum = groupnum;
	}

	public void setMembernum(int membernum) {
		this.membernum = membernum;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}

}
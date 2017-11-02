package org.historyresearchenvironment.tmg.h2.models;

/**
 * The persistent class for the FLAG database table.
 *
 * SELECT FLAGLABEL, FLAGFIELD, FLAGVALUE, SEQUENCE, DESCRIPT, ACTIVE, FLAGID,
 * PROPERTY, DSID, TT FROM FLAG
 */
public class Flag {

	private int flagid;

	private String active;

	private String descript;

	private int dsid;

	private String flagfield;

	private String flaglabel;

	private String flagvalue;

	private String property;

	private int sequence;

	private String tt;

	public Flag() {
	}

	public String getActive() {
		return this.active;
	}

	public String getDescript() {
		return this.descript;
	}

	public int getDsid() {
		return this.dsid;
	}

	public String getFlagfield() {
		return this.flagfield;
	}

	public int getFlagid() {
		return this.flagid;
	}

	public String getFlaglabel() {
		return this.flaglabel;
	}

	public String getFlagvalue() {
		return this.flagvalue;
	}

	public String getProperty() {
		return this.property;
	}

	public int getSequence() {
		return this.sequence;
	}

	public String getTt() {
		return this.tt;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public void setDsid(int dsid) {
		this.dsid = dsid;
	}

	public void setFlagfield(String flagfield) {
		this.flagfield = flagfield;
	}

	public void setFlagid(int flagid) {
		this.flagid = flagid;
	}

	public void setFlaglabel(String flaglabel) {
		this.flaglabel = flaglabel;
	}

	public void setFlagvalue(String flagvalue) {
		this.flagvalue = flagvalue;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}

}
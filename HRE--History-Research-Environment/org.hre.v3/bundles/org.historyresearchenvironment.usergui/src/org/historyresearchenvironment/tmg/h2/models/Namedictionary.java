package org.historyresearchenvironment.tmg.h2.models;

/**
 * The persistent class for the NAMEDICTIONARY database table.
 *
 * INSERT INTO NAMEDICTIONARY (UID, VALUE, SDX, TT, RECNO ) VALUES (?, ?, ?, ?,
 * ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, )
 */
public class Namedictionary {

	private int uid;

	private String sdx;

	private String tt;

	private String xvalue;

	public Namedictionary() {
	}

	public String getSdx() {
		return this.sdx;
	}

	public String getTt() {
		return this.tt;
	}

	public int getUid() {
		return this.uid;
	}

	public String getXvalue() {
		return this.xvalue;
	}

	public void setSdx(String sdx) {
		this.sdx = sdx;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public void setXvalue(String xvalue) {
		this.xvalue = xvalue;
	}

}
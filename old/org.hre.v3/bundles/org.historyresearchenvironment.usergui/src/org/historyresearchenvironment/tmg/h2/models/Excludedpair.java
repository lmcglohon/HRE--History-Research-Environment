package org.historyresearchenvironment.tmg.h2.models;

/**
 * The persistent class for the EXCLUDEDPAIR database table.
 *
 * INSERT INTO EXCLUDEDPAIR (DSID, PER1, PER2, TT ) VALUES (?, ?, ?, ?)
 */
public class Excludedpair {
	private int dsid;
	private int per1;
	private int per2;
	private String tt;

	public Excludedpair() {
	}

	public int getDsid() {
		return this.dsid;
	}

	public int getPer1() {
		return this.per1;
	}

	public int getPer2() {
		return this.per2;
	}

	public String getTt() {
		return this.tt;
	}

	public void setDsid(int dsid) {
		this.dsid = dsid;
	}

	public void setPer1(int per1) {
		this.per1 = per1;
	}

	public void setPer2(int per2) {
		this.per2 = per2;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}

}
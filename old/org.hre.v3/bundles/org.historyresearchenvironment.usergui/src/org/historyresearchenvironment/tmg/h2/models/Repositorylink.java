package org.historyresearchenvironment.tmg.h2.models;

/**
 * The persistent class for the REPOSITORYLINK database table.
 *
 * INSERT INTO REPOSITORYLINK (RNUMBER, MNUMBER, REFERENCE, XPRIMARY, TT, DSID )
 * VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, )
 */
public class Repositorylink {

	private int dsid;

	private int mnumber;

	private String reference;

	private int rnumber;

	private String tt;

	private String xprimary;

	public Repositorylink() {
	}

	public int getDsid() {
		return this.dsid;
	}

	public int getMnumber() {
		return this.mnumber;
	}

	public String getReference() {
		return this.reference;
	}

	public int getRnumber() {
		return this.rnumber;
	}

	public String getTt() {
		return this.tt;
	}

	public String getXprimary() {
		return this.xprimary;
	}

	public void setDsid(int dsid) {
		this.dsid = dsid;
	}

	public void setMnumber(int mnumber) {
		this.mnumber = mnumber;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public void setRnumber(int rnumber) {
		this.rnumber = rnumber;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}

	public void setXprimary(String xprimary) {
		this.xprimary = xprimary;
	}

}
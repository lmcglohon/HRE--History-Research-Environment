package org.historyresearchenvironment.tmg.h2.models;

/**
 * The persistent class for the PARENTCHILDRELATIONSHIP database table.
 *
 * INSERT INTO PARENTCHILDRELATIONSHIP (XPRIMARY, CHILD, PARENT, PTYPE, PNOTE,
 * PSURE, FSURE, RECNO, TT, DSID, PER_NO ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
 * ?, ?, ?, ?, ?, ?, ?, )
 */
public class Parentchildrelationship {
	private int recno;
	private int child;
	private int dsid;
	private String fsure;
	private int parent;
	private String pnote;
	private String psure;
	private int ptype;
	private String tt;
	private String xprimary;

	public Parentchildrelationship() {
	}

	public int getChild() {
		return this.child;
	}

	public int getDsid() {
		return this.dsid;
	}

	public String getFsure() {
		return this.fsure;
	}

	public int getParent() {
		return this.parent;
	}

	public String getPnote() {
		return this.pnote;
	}

	public String getPsure() {
		return this.psure;
	}

	public int getPtype() {
		return this.ptype;
	}

	public int getRecno() {
		return this.recno;
	}

	public String getTt() {
		return this.tt;
	}

	public String getXprimary() {
		return this.xprimary;
	}

	public void setChild(int child) {
		this.child = child;
	}

	public void setDsid(int dsid) {
		this.dsid = dsid;
	}

	public void setFsure(String fsure) {
		this.fsure = fsure;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public void setPnote(String pnote) {
		this.pnote = pnote;
	}

	public void setPsure(String psure) {
		this.psure = psure;
	}

	public void setPtype(int ptype) {
		this.ptype = ptype;
	}

	public void setRecno(int recno) {
		this.recno = recno;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}

	public void setXprimary(String xprimary) {
		this.xprimary = xprimary;
	}

}
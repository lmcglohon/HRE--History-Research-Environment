package org.historyresearchenvironment.tmg.h2.models;

import java.math.BigDecimal;

/**
 * The persistent class for the SOURCEELEMENT database table.
 *
 * INSERT INTO SOURCEELEMENT (RECNO, DSID, ELEMENT, GROUPNUM, TT ) VALUES (?, ?,
 * ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, )
 */
public class Sourceelement {

	private int recno;

	private int dsid;

	private String element;

	private BigDecimal groupnum;

	private String tt;

	public Sourceelement() {
	}

	public int getDsid() {
		return this.dsid;
	}

	public String getElement() {
		return this.element;
	}

	public BigDecimal getGroupnum() {
		return this.groupnum;
	}

	public int getRecno() {
		return this.recno;
	}

	public String getTt() {
		return this.tt;
	}

	public void setDsid(int dsid) {
		this.dsid = dsid;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public void setGroupnum(BigDecimal groupnum) {
		this.groupnum = groupnum;
	}

	public void setRecno(int recno) {
		this.recno = recno;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}

}
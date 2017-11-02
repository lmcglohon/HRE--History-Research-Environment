package org.historyresearchenvironment.tmg.h2.models;

/**
 * The persistent class for the NAMEPARTVALUE database table.
 *
 * INSERT INTO NAMEPARTVALUE (RECNO, UID, TYPE, ID, TT, DSID ) VALUES (?, ?, ?,
 * ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, )
 */
public class Namepartvalue {

	private int dsid;

	private int id;

	private int recno;

	private String tt;

	private int type;

	private int uid;

	public Namepartvalue() {
	}

	public int getDsid() {
		return this.dsid;
	}

	public int getId() {
		return this.id;
	}

	public int getRecno() {
		return this.recno;
	}

	public String getTt() {
		return this.tt;
	}

	public int getType() {
		return this.type;
	}

	public int getUid() {
		return this.uid;
	}

	public void setDsid(int dsid) {
		this.dsid = dsid;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setRecno(int recno) {
		this.recno = recno;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

}
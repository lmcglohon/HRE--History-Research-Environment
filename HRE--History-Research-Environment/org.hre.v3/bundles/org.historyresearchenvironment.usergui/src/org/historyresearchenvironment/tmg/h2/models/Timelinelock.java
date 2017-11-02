package org.historyresearchenvironment.tmg.h2.models;

/**
 * The persistent class for the TIMELINELOCK database table.
 *
 * INSERT INTO TIMELINELOCK (IDLOCK, TNAME, DSID, TT ) VALUES (?, ?, ?, ?, ?, ?,
 * ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, )
 */
public class Timelinelock {
	private int dsid;
	private int idlock;
	private String places;
	private String tname;
	private String tt;

	public Timelinelock() {
	}

	public int getDsid() {
		return this.dsid;
	}

	public int getIdlock() {
		return this.idlock;
	}

	public String getPlaces() {
		return this.places;
	}

	public String getTname() {
		return this.tname;
	}

	public String getTt() {
		return this.tt;
	}

	public void setDsid(int dsid) {
		this.dsid = dsid;
	}

	public void setIdlock(int idlock) {
		this.idlock = idlock;
	}

	public void setPlaces(String places) {
		this.places = places;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}

}
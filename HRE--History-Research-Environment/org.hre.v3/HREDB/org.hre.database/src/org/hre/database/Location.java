package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the LOCATIONS database table.
 * 
 */
@Entity
@Table(name = "LOCATIONS")
@NamedQuery(name = "Location.findAll", query = "SELECT l FROM Location l")
public class Location extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "RECORD_NUM")
	private int recordNum;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "HAS_CITATIONS")
	private boolean hasCitations;

	@Column(name = "HAS_MANY_NAMES")
	private boolean hasManyNames;

	@Column(name = "LOCATION_PID")
	private int locationPid;

	@Column(name = "LOCATIONS_PID")
	private int locationsPid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PRMY_LOCN_PID")
	private int prmyLocnPid;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public Location() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#delete(int)
	 */
	@Override
	protected int delete(int recordNum) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#get(int)
	 */
	@Override
	protected AbstractHreTableRow get(int recordNum) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCommitPid() {
		return this.commitPid;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public boolean getHasCitations() {
		return this.hasCitations;
	}

	public boolean getHasManyNames() {
		return this.hasManyNames;
	}

	public int getLocationPid() {
		return this.locationPid;
	}

	public int getLocationsPid() {
		return this.locationsPid;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getPrmyLocnPid() {
		return this.prmyLocnPid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public short getRights() {
		return this.rights;
	}

	public short getSetPid() {
		return this.setPid;
	}

	public int getVisibleId() {
		return this.visibleId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#post()
	 */
	@Override
	protected int post() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#put()
	 */
	@Override
	protected int put() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setHasCitations(boolean hasCitations) {
		this.hasCitations = hasCitations;
	}

	public void setHasManyNames(boolean hasManyNames) {
		this.hasManyNames = hasManyNames;
	}

	public void setLocationPid(int locationPid) {
		this.locationPid = locationPid;
	}

	public void setLocationsPid(int locationsPid) {
		this.locationsPid = locationsPid;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setPrmyLocnPid(int prmyLocnPid) {
		this.prmyLocnPid = prmyLocnPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRights(short rights) {
		this.rights = rights;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
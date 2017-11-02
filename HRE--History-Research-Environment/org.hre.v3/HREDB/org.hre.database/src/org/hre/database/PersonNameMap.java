package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the PERSON_NAME_MAPS database table.
 * 
 */
@Entity
@Table(name = "PERSON_NAME_MAPS")
@NamedQuery(name = "PersonNameMap.findAll", query = "SELECT p FROM PersonNameMap p")
public class PersonNameMap extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "ELEMENT_ID")
	private short elementId;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PARENT_NAME_PID")
	private int parentNamePid;

	@Column(name = "PERSON_NAME_MAP_PID")
	private int personNameMapPid;

	@Column(name = "PLUGIN_PID")
	private int pluginPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	private int shared;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public PersonNameMap() {
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

	public short getElementId() {
		return this.elementId;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getParentNamePid() {
		return this.parentNamePid;
	}

	public int getPersonNameMapPid() {
		return this.personNameMapPid;
	}

	public int getPluginPid() {
		return this.pluginPid;
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

	public int getShared() {
		return this.shared;
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

	public void setElementId(short elementId) {
		this.elementId = elementId;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setParentNamePid(int parentNamePid) {
		this.parentNamePid = parentNamePid;
	}

	public void setPersonNameMapPid(int personNameMapPid) {
		this.personNameMapPid = personNameMapPid;
	}

	public void setPluginPid(int pluginPid) {
		this.pluginPid = pluginPid;
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

	public void setShared(int shared) {
		this.shared = shared;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
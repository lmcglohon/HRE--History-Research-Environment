package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SCHEMA_DEFNS database table.
 * 
 */
@Entity
@Table(name = "SCHEMA_DEFNS")
@NamedQuery(name = "SchemaDefn.findAll", query = "SELECT s FROM SchemaDefn s")
public class SchemaDefn extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	private String description;

	@Column(name = "MAIN_PCKG_KEY")
	private short mainPckgKey;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SCHEMA_DEFN_PID")
	private int schemaDefnPid;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "VERSION_NAME")
	private String versionName;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public SchemaDefn() {
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

	public String getDescription() {
		return this.description;
	}

	public short getMainPckgKey() {
		return this.mainPckgKey;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public short getRights() {
		return this.rights;
	}

	public int getSchemaDefnPid() {
		return this.schemaDefnPid;
	}

	public short getSetPid() {
		return this.setPid;
	}

	public String getVersionName() {
		return this.versionName;
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

	public void setDescription(String description) {
		this.description = description;
	}

	public void setMainPckgKey(short mainPckgKey) {
		this.mainPckgKey = mainPckgKey;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRights(short rights) {
		this.rights = rights;
	}

	public void setSchemaDefnPid(int schemaDefnPid) {
		this.schemaDefnPid = schemaDefnPid;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
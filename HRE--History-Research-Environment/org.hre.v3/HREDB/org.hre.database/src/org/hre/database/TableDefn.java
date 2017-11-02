package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the TABLE_DEFNS database table.
 * 
 */
@Entity
@Table(name = "TABLE_DEFNS")
@NamedQuery(name = "TableDefn.findAll", query = "SELECT t FROM TableDefn t")
public class TableDefn extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "BASE_ENITYY_KEY")
	private short baseEnityyKey;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	private String description;

	@Column(name = "FLAG_KEY")
	private short flagKey;

	@Column(name = "IS_ADMIN")
	private boolean isAdmin;

	@Column(name = "IS_DEFN")
	private boolean isDefn;

	@Column(name = "IS_ENTITY")
	private boolean isEntity;

	@Column(name = "LAST_RECD_PID")
	private int lastRecdPid;

	@Column(name = "NOTEPAD_KEY")
	private short notepadKey;

	@Column(name = "NUM_FLAGS")
	private short numFlags;

	@Column(name = "NUM_NOTEPADS")
	private short numNotepads;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PLUGIN_PID")
	private short pluginPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SQL_NAME")
	private String sqlName;

	@Column(name = "TABLE_DEFN_PID")
	private int tableDefnPid;

	@Column(name = "VERSION_NAME")
	private String versionName;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public TableDefn() {
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

	public short getBaseEnityyKey() {
		return this.baseEnityyKey;
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

	public short getFlagKey() {
		return this.flagKey;
	}

	public boolean getIsAdmin() {
		return this.isAdmin;
	}

	public boolean getIsDefn() {
		return this.isDefn;
	}

	public boolean getIsEntity() {
		return this.isEntity;
	}

	public int getLastRecdPid() {
		return this.lastRecdPid;
	}

	public short getNotepadKey() {
		return this.notepadKey;
	}

	public short getNumFlags() {
		return this.numFlags;
	}

	public short getNumNotepads() {
		return this.numNotepads;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public short getPluginPid() {
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

	public String getSqlName() {
		return this.sqlName;
	}

	public int getTableDefnPid() {
		return this.tableDefnPid;
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

	public void setBaseEnityyKey(short baseEnityyKey) {
		this.baseEnityyKey = baseEnityyKey;
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

	public void setFlagKey(short flagKey) {
		this.flagKey = flagKey;
	}

	public void setIsAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public void setIsDefn(boolean isDefn) {
		this.isDefn = isDefn;
	}

	public void setIsEntity(boolean isEntity) {
		this.isEntity = isEntity;
	}

	public void setLastRecdPid(int lastRecdPid) {
		this.lastRecdPid = lastRecdPid;
	}

	public void setNotepadKey(short notepadKey) {
		this.notepadKey = notepadKey;
	}

	public void setNumFlags(short numFlags) {
		this.numFlags = numFlags;
	}

	public void setNumNotepads(short numNotepads) {
		this.numNotepads = numNotepads;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setPluginPid(short pluginPid) {
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

	public void setSqlName(String sqlName) {
		this.sqlName = sqlName;
	}

	public void setTableDefnPid(int tableDefnPid) {
		this.tableDefnPid = tableDefnPid;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
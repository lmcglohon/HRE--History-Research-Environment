package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the TABLE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="TABLE_DEFNS")
// @NamedQuery(name="TableDefn.findAll", query="SELECT t FROM TableDefn t")
public class TableDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private boolean hasFlags;
	private boolean hasNotepads;
	private int lastRecordPid;
	private short pluginKey;
	private short recordValidKey;
	private short setKey;
	private String sqlName;
	private short storageTypeKey;
	private int tableDefnPid;
	private String versionName;

	public TableDefn() {
	}


	// @Id
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}


	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	// @Column(name="HAS_FLAGS")
	public boolean getHasFlags() {
		return this.hasFlags;
	}

	public void setHasFlags(boolean hasFlags) {
		this.hasFlags = hasFlags;
	}


	// @Column(name="HAS_NOTEPADS")
	public boolean getHasNotepads() {
		return this.hasNotepads;
	}

	public void setHasNotepads(boolean hasNotepads) {
		this.hasNotepads = hasNotepads;
	}


	// @Column(name="LAST_RECORD_PID")
	public int getLastRecordPid() {
		return this.lastRecordPid;
	}

	public void setLastRecordPid(int lastRecordPid) {
		this.lastRecordPid = lastRecordPid;
	}


	// @Column(name="PLUGIN_KEY")
	public short getPluginKey() {
		return this.pluginKey;
	}

	public void setPluginKey(short pluginKey) {
		this.pluginKey = pluginKey;
	}


	// @Column(name="RECORD_VALID_KEY")
	public short getRecordValidKey() {
		return this.recordValidKey;
	}

	public void setRecordValidKey(short recordValidKey) {
		this.recordValidKey = recordValidKey;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(name="SQL_NAME", length=30)
	public String getSqlName() {
		return this.sqlName;
	}

	public void setSqlName(String sqlName) {
		this.sqlName = sqlName;
	}


	// @Column(name="STORAGE_TYPE_KEY")
	public short getStorageTypeKey() {
		return this.storageTypeKey;
	}

	public void setStorageTypeKey(short storageTypeKey) {
		this.storageTypeKey = storageTypeKey;
	}


	// @Column(name="TABLE_DEFN_PID", nullable=false)
	public int getTableDefnPid() {
		return this.tableDefnPid;
	}

	public void setTableDefnPid(int tableDefnPid) {
		this.tableDefnPid = tableDefnPid;
	}


	// @Column(name="VERSION_NAME", length=160)
	public String getVersionName() {
		return this.versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

}
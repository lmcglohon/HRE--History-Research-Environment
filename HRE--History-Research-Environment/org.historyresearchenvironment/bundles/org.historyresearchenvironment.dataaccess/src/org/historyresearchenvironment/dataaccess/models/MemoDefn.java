package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;


/**
 * The persistent class for the MEMO_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="MEMO_DEFNS")
// @NamedQuery(name="MemoDefn.findAll", query="SELECT m FROM MemoDefn m")
public class MemoDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private boolean isSystem;
	private int memoDefnPid;
	private short memoSetKey;
	private short pluginKey;
	private short publishTypeKey;
	private int requesterPid;
	private short requesterSubTypeKey;
	private short requesterTypeKey;
	private short setKey;

	public MemoDefn() {
	}


	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
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


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="MEMO_DEFN_PID", nullable=false)
	public int getMemoDefnPid() {
		return this.memoDefnPid;
	}

	public void setMemoDefnPid(int memoDefnPid) {
		this.memoDefnPid = memoDefnPid;
	}


	// @Column(name="MEMO_SET_KEY")
	public short getMemoSetKey() {
		return this.memoSetKey;
	}

	public void setMemoSetKey(short memoSetKey) {
		this.memoSetKey = memoSetKey;
	}


	// @Column(name="PLUGIN_KEY")
	public short getPluginKey() {
		return this.pluginKey;
	}

	public void setPluginKey(short pluginKey) {
		this.pluginKey = pluginKey;
	}


	// @Column(name="PUBLISH_TYPE_KEY")
	public short getPublishTypeKey() {
		return this.publishTypeKey;
	}

	public void setPublishTypeKey(short publishTypeKey) {
		this.publishTypeKey = publishTypeKey;
	}


	// @Column(name="REQUESTER_PID")
	public int getRequesterPid() {
		return this.requesterPid;
	}

	public void setRequesterPid(int requesterPid) {
		this.requesterPid = requesterPid;
	}


	// @Column(name="REQUESTER_SUB_TYPE_KEY")
	public short getRequesterSubTypeKey() {
		return this.requesterSubTypeKey;
	}

	public void setRequesterSubTypeKey(short requesterSubTypeKey) {
		this.requesterSubTypeKey = requesterSubTypeKey;
	}


	// @Column(name="REQUESTER_TYPE_KEY")
	public short getRequesterTypeKey() {
		return this.requesterTypeKey;
	}

	public void setRequesterTypeKey(short requesterTypeKey) {
		this.requesterTypeKey = requesterTypeKey;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

}
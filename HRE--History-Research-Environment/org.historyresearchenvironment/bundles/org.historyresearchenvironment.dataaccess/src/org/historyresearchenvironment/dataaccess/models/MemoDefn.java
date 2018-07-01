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

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="MEMO_DEFN_PID", nullable=false)
	public int getMemoDefnPid() {
		return this.memoDefnPid;
	}

	// @Column(name="MEMO_SET_KEY")
	public short getMemoSetKey() {
		return this.memoSetKey;
	}

	// @Column(name="PLUGIN_KEY")
	public short getPluginKey() {
		return this.pluginKey;
	}

	// @Column(name="PUBLISH_TYPE_KEY")
	public short getPublishTypeKey() {
		return this.publishTypeKey;
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	// @Column(name="REQUESTER_PID")
	public int getRequesterPid() {
		return this.requesterPid;
	}

	// @Column(name="REQUESTER_SUB_TYPE_KEY")
	public short getRequesterSubTypeKey() {
		return this.requesterSubTypeKey;
	}

	// @Column(name="REQUESTER_TYPE_KEY")
	public short getRequesterTypeKey() {
		return this.requesterTypeKey;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setMemoDefnPid(int memoDefnPid) {
		this.memoDefnPid = memoDefnPid;
	}

	public void setMemoSetKey(short memoSetKey) {
		this.memoSetKey = memoSetKey;
	}

	public void setPluginKey(short pluginKey) {
		this.pluginKey = pluginKey;
	}

	public void setPublishTypeKey(short publishTypeKey) {
		this.publishTypeKey = publishTypeKey;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRequesterPid(int requesterPid) {
		this.requesterPid = requesterPid;
	}

	public void setRequesterSubTypeKey(short requesterSubTypeKey) {
		this.requesterSubTypeKey = requesterSubTypeKey;
	}

	public void setRequesterTypeKey(short requesterTypeKey) {
		this.requesterTypeKey = requesterTypeKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

}
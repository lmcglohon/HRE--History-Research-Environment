package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;


/**
 * The persistent class for the COMMIT_ITEMS database table.
 * 
 */
// @Entity
// @Table(name="COMMIT_ITEMS")
// @NamedQuery(name="CommitItem.findAll", query="SELECT c FROM CommitItem c")
public class CommitItem implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitItemPid;
	private int commitPid;
	private int parentCmtPid;
	private int prevCmtPid;
	private int recordPid;
	private short setKey;
	private short tableKey;

	public CommitItem() {
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


	// @Column(name="COMMIT_ITEM_PID", nullable=false)
	public int getCommitItemPid() {
		return this.commitItemPid;
	}

	public void setCommitItemPid(int commitItemPid) {
		this.commitItemPid = commitItemPid;
	}


	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	// @Column(name="PARENT_CMT_PID")
	public int getParentCmtPid() {
		return this.parentCmtPid;
	}

	public void setParentCmtPid(int parentCmtPid) {
		this.parentCmtPid = parentCmtPid;
	}


	// @Column(name="PREV_CMT_PID")
	public int getPrevCmtPid() {
		return this.prevCmtPid;
	}

	public void setPrevCmtPid(int prevCmtPid) {
		this.prevCmtPid = prevCmtPid;
	}


	// @Column(name="RECORD_PID")
	public int getRecordPid() {
		return this.recordPid;
	}

	public void setRecordPid(int recordPid) {
		this.recordPid = recordPid;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(name="TABLE_KEY")
	public short getTableKey() {
		return this.tableKey;
	}

	public void setTableKey(short tableKey) {
		this.tableKey = tableKey;
	}

}
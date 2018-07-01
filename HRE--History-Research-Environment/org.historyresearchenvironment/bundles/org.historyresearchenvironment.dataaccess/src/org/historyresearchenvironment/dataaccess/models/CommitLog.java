package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * The persistent class for the COMMIT_LOGS database table.
 * 
 */
// @Entity
// @Table(name="COMMIT_LOGS")
// @NamedQuery(name="CommitLog.findAll", query="SELECT c FROM CommitLog c")
public class CommitLog implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int clientPid;
	private Timestamp commenced;
	private int commitLogPid;
	private int commitPid;
	private Timestamp completed;
	private short numTables;
	private short setKey;
	private int userPid;

	public CommitLog() {
	}

	// @Column(name="CLIENT_PID")
	public int getClientPid() {
		return this.clientPid;
	}

	public Timestamp getCommenced() {
		return this.commenced;
	}

	// @Column(name="COMMIT_LOG_PID", nullable=false)
	public int getCommitLogPid() {
		return this.commitLogPid;
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	public Timestamp getCompleted() {
		return this.completed;
	}

	// @Column(name="NUM_TABLES")
	public short getNumTables() {
		return this.numTables;
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="USER_PID")
	public int getUserPid() {
		return this.userPid;
	}

	public void setClientPid(int clientPid) {
		this.clientPid = clientPid;
	}

	public void setCommenced(Timestamp commenced) {
		this.commenced = commenced;
	}

	public void setCommitLogPid(int commitLogPid) {
		this.commitLogPid = commitLogPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setCompleted(Timestamp completed) {
		this.completed = completed;
	}

	public void setNumTables(short numTables) {
		this.numTables = numTables;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setUserPid(int userPid) {
		this.userPid = userPid;
	}

}
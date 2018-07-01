package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * The persistent class for the SESSIONS database table.
 * 
 */
// @Entity
// @Table(name="SESSIONS")
// @NamedQuery(name="Session.findAll", query="SELECT s FROM Session s")
public class Session implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitNum;
	private int commitPid;
	private int projectPid;
	private int sessionPid;
	private short setKey;
	private Timestamp timeClosed;
	private Timestamp timeOpened;
	private int userPid;

	public Session() {
	}

	// @Column(name="COMMIT_NUM")
	public int getCommitNum() {
		return this.commitNum;
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="PROJECT_PID")
	public int getProjectPid() {
		return this.projectPid;
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	// @Column(name="SESSION_PID", nullable=false)
	public int getSessionPid() {
		return this.sessionPid;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="TIME_CLOSED")
	public Timestamp getTimeClosed() {
		return this.timeClosed;
	}

	// @Column(name="TIME_OPENED")
	public Timestamp getTimeOpened() {
		return this.timeOpened;
	}

	// @Column(name="USER_PID")
	public int getUserPid() {
		return this.userPid;
	}

	public void setCommitNum(int commitNum) {
		this.commitNum = commitNum;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setProjectPid(int projectPid) {
		this.projectPid = projectPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setSessionPid(int sessionPid) {
		this.sessionPid = sessionPid;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setTimeClosed(Timestamp timeClosed) {
		this.timeClosed = timeClosed;
	}

	public void setTimeOpened(Timestamp timeOpened) {
		this.timeOpened = timeOpened;
	}

	public void setUserPid(int userPid) {
		this.userPid = userPid;
	}

}
package org.hre.database;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SESSIONS database table.
 * 
 */
@Entity
@Table(name = "SESSIONS")
@NamedQuery(name = "Session.findAll", query = "SELECT s FROM Session s")
public class Session extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_NUM")
	private int commitNum;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PROJECT_PID")
	private int projectPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SESSION_PID")
	private int sessionPid;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "TIME_CLOSED")
	private Timestamp timeClosed;

	@Column(name = "TIME_OPENED")
	private Timestamp timeOpened;

	@Column(name = "USER_PID")
	private int userPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public Session() {
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

	public int getCommitNum() {
		return this.commitNum;
	}

	public int getCommitPid() {
		return this.commitPid;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getProjectPid() {
		return this.projectPid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public short getRights() {
		return this.rights;
	}

	public int getSessionPid() {
		return this.sessionPid;
	}

	public short getSetPid() {
		return this.setPid;
	}

	public Timestamp getTimeClosed() {
		return this.timeClosed;
	}

	public Timestamp getTimeOpened() {
		return this.timeOpened;
	}

	public int getUserPid() {
		return this.userPid;
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

	public void setCommitNum(int commitNum) {
		this.commitNum = commitNum;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setProjectPid(int projectPid) {
		this.projectPid = projectPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRights(short rights) {
		this.rights = rights;
	}

	public void setSessionPid(int sessionPid) {
		this.sessionPid = sessionPid;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
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

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
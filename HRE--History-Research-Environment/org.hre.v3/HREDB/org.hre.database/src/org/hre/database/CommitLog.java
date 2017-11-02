package org.hre.database;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the COMMIT_LOGS database table.
 * 
 */
@Entity
@Table(name = "COMMIT_LOGS")
@NamedQuery(name = "CommitLog.findAll", query = "SELECT c FROM CommitLog c")
public class CommitLog extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "CLIENT_PID")
	private int clientPid;

	private Timestamp commence;

	@Column(name = "COMMIT_LOG_PID")
	private int commitLogPid;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	private Timestamp completed;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "NUM_TABLES")
	private short numTables;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "USER_PID")
	private int userPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public CommitLog() {
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

	public int getClientPid() {
		return this.clientPid;
	}

	public Timestamp getCommence() {
		return this.commence;
	}

	public int getCommitLogPid() {
		return this.commitLogPid;
	}

	public int getCommitPid() {
		return this.commitPid;
	}

	public Timestamp getCompleted() {
		return this.completed;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public short getNumTables() {
		return this.numTables;
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

	public short getSetPid() {
		return this.setPid;
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

	public void setClientPid(int clientPid) {
		this.clientPid = clientPid;
	}

	public void setCommence(Timestamp commence) {
		this.commence = commence;
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

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setNumTables(short numTables) {
		this.numTables = numTables;
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

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setUserPid(int userPid) {
		this.userPid = userPid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
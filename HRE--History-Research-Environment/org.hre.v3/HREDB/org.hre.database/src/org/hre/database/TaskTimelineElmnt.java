package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the TASK_TIMELINE_ELMNTS database table.
 * 
 */
@Entity
@Table(name = "TASK_TIMELINE_ELMNTS")
@NamedQuery(name = "TaskTimelineElmnt.findAll", query = "SELECT t FROM TaskTimelineElmnt t")
public class TaskTimelineElmnt extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "TASK_PID")
	private int taskPid;

	@Column(name = "TASK_TIMELINE_ELMNT_PID")
	private int taskTimelineElmntPid;

	@Column(name = "TIMELINE_PID")
	private short timelinePid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public TaskTimelineElmnt() {
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

	public int getTaskPid() {
		return this.taskPid;
	}

	public int getTaskTimelineElmntPid() {
		return this.taskTimelineElmntPid;
	}

	public short getTimelinePid() {
		return this.timelinePid;
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

	public void setTaskPid(int taskPid) {
		this.taskPid = taskPid;
	}

	public void setTaskTimelineElmntPid(int taskTimelineElmntPid) {
		this.taskTimelineElmntPid = taskTimelineElmntPid;
	}

	public void setTimelinePid(short timelinePid) {
		this.timelinePid = timelinePid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
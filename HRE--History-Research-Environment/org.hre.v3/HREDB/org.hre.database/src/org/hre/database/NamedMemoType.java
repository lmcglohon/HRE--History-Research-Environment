package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the NAMED_MEMO_TYPES database table.
 * 
 */
@Entity
@Table(name = "NAMED_MEMO_TYPES")
@NamedQuery(name = "NamedMemoType.findAll", query = "SELECT n FROM NamedMemoType n")
public class NamedMemoType extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "NAMED_MEMO_KEY")
	private int namedMemoKey;

	@Column(name = "NAMED_MEMO_TYPE_PID")
	private int namedMemoTypePid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PARENT_TAG_TYPE_KEY")
	private short parentTagTypeKey;

	@Column(name = "PARENT_TAG_TYPE_PID")
	private short parentTagTypePid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	@Column(name = "REMINDER_PID")
	private int reminderPid;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "\"SHOW\"")
	private boolean show;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public NamedMemoType() {
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

	public int getNamedMemoKey() {
		return this.namedMemoKey;
	}

	public int getNamedMemoTypePid() {
		return this.namedMemoTypePid;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public short getParentTagTypeKey() {
		return this.parentTagTypeKey;
	}

	public short getParentTagTypePid() {
		return this.parentTagTypePid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public int getReminderPid() {
		return this.reminderPid;
	}

	public short getRights() {
		return this.rights;
	}

	public short getSetPid() {
		return this.setPid;
	}

	public boolean getShow() {
		return this.show;
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

	public void setNamedMemoKey(int namedMemoKey) {
		this.namedMemoKey = namedMemoKey;
	}

	public void setNamedMemoTypePid(int namedMemoTypePid) {
		this.namedMemoTypePid = namedMemoTypePid;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setParentTagTypeKey(short parentTagTypeKey) {
		this.parentTagTypeKey = parentTagTypeKey;
	}

	public void setParentTagTypePid(short parentTagTypePid) {
		this.parentTagTypePid = parentTagTypePid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReminderPid(int reminderPid) {
		this.reminderPid = reminderPid;
	}

	public void setRights(short rights) {
		this.rights = rights;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
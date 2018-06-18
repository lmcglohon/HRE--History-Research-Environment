package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the MEMO_SET_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="MEMO_SET_DEFNS")
// @NamedQuery(name="MemoSetDefn.findAll", query="SELECT m FROM MemoSetDefn m")
public class MemoSetDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private boolean isDefault;
	private boolean isSystem;
	private int memoSetDefnPid;
	private short parentTagPid;
	private short parentTagTypeKey;
	private short reminderKey;
	private short setKey;
	private boolean show;

	public MemoSetDefn() {
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


	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}


	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="MEMO_SET_DEFN_PID", nullable=false)
	public int getMemoSetDefnPid() {
		return this.memoSetDefnPid;
	}

	public void setMemoSetDefnPid(int memoSetDefnPid) {
		this.memoSetDefnPid = memoSetDefnPid;
	}


	// @Column(name="PARENT_TAG_PID")
	public short getParentTagPid() {
		return this.parentTagPid;
	}

	public void setParentTagPid(short parentTagPid) {
		this.parentTagPid = parentTagPid;
	}


	// @Column(name="PARENT_TAG_TYPE_KEY")
	public short getParentTagTypeKey() {
		return this.parentTagTypeKey;
	}

	public void setParentTagTypeKey(short parentTagTypeKey) {
		this.parentTagTypeKey = parentTagTypeKey;
	}


	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

}
package org.historyresearchenvironment.dataaccess.models;

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

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="MEMO_SET_DEFN_PID", nullable=false)
	public int getMemoSetDefnPid() {
		return this.memoSetDefnPid;
	}

	// @Column(name="PARENT_TAG_PID")
	public short getParentTagPid() {
		return this.parentTagPid;
	}

	// @Column(name="PARENT_TAG_TYPE_KEY")
	public short getParentTagTypeKey() {
		return this.parentTagTypeKey;
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setMemoSetDefnPid(int memoSetDefnPid) {
		this.memoSetDefnPid = memoSetDefnPid;
	}

	public void setParentTagPid(short parentTagPid) {
		this.parentTagPid = parentTagPid;
	}

	public void setParentTagTypeKey(short parentTagTypeKey) {
		this.parentTagTypeKey = parentTagTypeKey;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

}
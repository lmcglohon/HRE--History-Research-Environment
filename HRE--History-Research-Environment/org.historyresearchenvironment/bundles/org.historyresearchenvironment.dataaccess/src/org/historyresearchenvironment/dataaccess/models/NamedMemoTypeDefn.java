package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the NAMED_MEMO_TYPE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="NAMED_MEMO_TYPE_DEFNS")
// @NamedQuery(name="NamedMemoTypeDefn.findAll", query="SELECT n FROM
// NamedMemoTypeDefn n")
public class NamedMemoTypeDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private boolean isDefault;
	private boolean isSystem;
	private int namedMemoTypeDefnPid;
	private short parentTagTypeKey;
	private short parentTagTypePid;
	private int reminderKey;
	private short setKey;
	private boolean show;

	public NamedMemoTypeDefn() {
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

	// @Column(name="NAMED_MEMO_TYPE_DEFN_PID", nullable=false)
	public int getNamedMemoTypeDefnPid() {
		return this.namedMemoTypeDefnPid;
	}

	// @Column(name="PARENT_TAG_TYPE_KEY")
	public short getParentTagTypeKey() {
		return this.parentTagTypeKey;
	}

	// @Column(name="PARENT_TAG_TYPE_PID")
	public short getParentTagTypePid() {
		return this.parentTagTypePid;
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	// @Column(name="REMINDER_KEY")
	public int getReminderKey() {
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

	public void setNamedMemoTypeDefnPid(int namedMemoTypeDefnPid) {
		this.namedMemoTypeDefnPid = namedMemoTypeDefnPid;
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

	public void setReminderKey(int reminderKey) {
		this.reminderKey = reminderKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

}
package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;


/**
 * The persistent class for the NAMED_MEMO_TYPE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="NAMED_MEMO_TYPE_DEFNS")
// @NamedQuery(name="NamedMemoTypeDefn.findAll", query="SELECT n FROM NamedMemoTypeDefn n")
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


	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
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


	// @Column(name="NAMED_MEMO_TYPE_DEFN_PID", nullable=false)
	public int getNamedMemoTypeDefnPid() {
		return this.namedMemoTypeDefnPid;
	}

	public void setNamedMemoTypeDefnPid(int namedMemoTypeDefnPid) {
		this.namedMemoTypeDefnPid = namedMemoTypeDefnPid;
	}


	// @Column(name="PARENT_TAG_TYPE_KEY")
	public short getParentTagTypeKey() {
		return this.parentTagTypeKey;
	}

	public void setParentTagTypeKey(short parentTagTypeKey) {
		this.parentTagTypeKey = parentTagTypeKey;
	}


	// @Column(name="PARENT_TAG_TYPE_PID")
	public short getParentTagTypePid() {
		return this.parentTagTypePid;
	}

	public void setParentTagTypePid(short parentTagTypePid) {
		this.parentTagTypePid = parentTagTypePid;
	}


	// @Column(name="REMINDER_KEY")
	public int getReminderKey() {
		return this.reminderKey;
	}

	public void setReminderKey(int reminderKey) {
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
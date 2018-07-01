package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the LIST_OBJECT_SETS database table.
 * 
 */
// @Entity
// @Table(name="LIST_OBJECT_SETS")
// @NamedQuery(name="ListObjectSet.findAll", query="SELECT l FROM ListObjectSet
// l")
public class ListObjectSet implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private short inputSubTypeKey;
	private short inputTypeKey;
	private boolean isDefault;
	private boolean isSystem;
	private int listObjectSetPid;
	private short reminderKey;
	private short setKey;
	private boolean show;

	public ListObjectSet() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="INPUT_SUB_TYPE_KEY")
	public short getInputSubTypeKey() {
		return this.inputSubTypeKey;
	}

	// @Column(name="INPUT_TYPE_KEY")
	public short getInputTypeKey() {
		return this.inputTypeKey;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="LIST_OBJECT_SET_PID", nullable=false)
	public int getListObjectSetPid() {
		return this.listObjectSetPid;
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

	public void setInputSubTypeKey(short inputSubTypeKey) {
		this.inputSubTypeKey = inputSubTypeKey;
	}

	public void setInputTypeKey(short inputTypeKey) {
		this.inputTypeKey = inputTypeKey;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setListObjectSetPid(int listObjectSetPid) {
		this.listObjectSetPid = listObjectSetPid;
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
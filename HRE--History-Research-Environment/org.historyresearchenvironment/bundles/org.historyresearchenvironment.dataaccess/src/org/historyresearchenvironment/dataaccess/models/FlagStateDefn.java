package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the FLAG_STATE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="FLAG_STATE_DEFNS")
// @NamedQuery(name="FlagStateDefn.findAll", query="SELECT f FROM FlagStateDefn
// f")
public class FlagStateDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private int flagStateDefnPid;
	private boolean isDefault;
	private boolean isSystem;
	private short parentFlagSlot;
	private short parentSubTypeKey;
	private short parentTypeKey;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private short stateValue;

	public FlagStateDefn() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="FLAG_STATE_DEFN_PID", nullable=false)
	public int getFlagStateDefnPid() {
		return this.flagStateDefnPid;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="PARENT_FLAG_SLOT")
	public short getParentFlagSlot() {
		return this.parentFlagSlot;
	}

	// @Column(name="PARENT_SUB_TYPE_KEY")
	public short getParentSubTypeKey() {
		return this.parentSubTypeKey;
	}

	// @Column(name="PARENT_TYPE_KEY")
	public short getParentTypeKey() {
		return this.parentTypeKey;
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

	// @Column(name="STATE_VALUE")
	public short getStateValue() {
		return this.stateValue;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setFlagStateDefnPid(int flagStateDefnPid) {
		this.flagStateDefnPid = flagStateDefnPid;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setParentFlagSlot(short parentFlagSlot) {
		this.parentFlagSlot = parentFlagSlot;
	}

	public void setParentSubTypeKey(short parentSubTypeKey) {
		this.parentSubTypeKey = parentSubTypeKey;
	}

	public void setParentTypeKey(short parentTypeKey) {
		this.parentTypeKey = parentTypeKey;
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

	public void setStateValue(short stateValue) {
		this.stateValue = stateValue;
	}

}
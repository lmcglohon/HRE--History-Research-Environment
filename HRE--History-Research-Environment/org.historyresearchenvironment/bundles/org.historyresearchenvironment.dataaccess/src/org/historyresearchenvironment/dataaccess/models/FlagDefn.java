package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the FLAG_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="FLAG_DEFNS")
// @NamedQuery(name="FlagDefn.findAll", query="SELECT f FROM FlagDefn f")
public class FlagDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short dfltState;
	private short displayOrder;
	private int flagDefnPid;
	private short flagSlot;
	private boolean isDefault;
	private boolean isSystem;
	private short parentSubTypeKey;
	private short parentTypeKey;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private short states;

	public FlagDefn() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DFLT_STATE")
	public short getDfltState() {
		return this.dfltState;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="FLAG_DEFN_PID", nullable=false)
	public int getFlagDefnPid() {
		return this.flagDefnPid;
	}

	// @Column(name="FLAG_SLOT")
	public short getFlagSlot() {
		return this.flagSlot;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
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

	public short getStates() {
		return this.states;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDfltState(short dfltState) {
		this.dfltState = dfltState;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setFlagDefnPid(int flagDefnPid) {
		this.flagDefnPid = flagDefnPid;
	}

	public void setFlagSlot(short flagSlot) {
		this.flagSlot = flagSlot;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
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

	public void setStates(short states) {
		this.states = states;
	}

}
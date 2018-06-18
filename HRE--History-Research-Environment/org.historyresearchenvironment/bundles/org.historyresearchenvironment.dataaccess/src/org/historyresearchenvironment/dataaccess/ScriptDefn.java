package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the SCRIPT_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="SCRIPT_DEFNS")
// @NamedQuery(name="ScriptDefn.findAll", query="SELECT s FROM ScriptDefn s")
public class ScriptDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private short actionTypeKey;
	private int commitPid;
	private short displayOrder;
	private short inputFocusTypeKey;
	private short inputSubTypeKey;
	private boolean isDefault;
	private boolean isSystem;
	private short reminderKey;
	private int scriptDefnPid;
	private short setKey;
	private boolean show;

	public ScriptDefn() {
	}


	// @Id
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}


	// @Column(name="ACTION_TYPE_KEY")
	public short getActionTypeKey() {
		return this.actionTypeKey;
	}

	public void setActionTypeKey(short actionTypeKey) {
		this.actionTypeKey = actionTypeKey;
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


	// @Column(name="INPUT_FOCUS_TYPE_KEY")
	public short getInputFocusTypeKey() {
		return this.inputFocusTypeKey;
	}

	public void setInputFocusTypeKey(short inputFocusTypeKey) {
		this.inputFocusTypeKey = inputFocusTypeKey;
	}


	// @Column(name="INPUT_SUB_TYPE_KEY")
	public short getInputSubTypeKey() {
		return this.inputSubTypeKey;
	}

	public void setInputSubTypeKey(short inputSubTypeKey) {
		this.inputSubTypeKey = inputSubTypeKey;
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


	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}


	// @Column(name="SCRIPT_DEFN_PID", nullable=false)
	public int getScriptDefnPid() {
		return this.scriptDefnPid;
	}

	public void setScriptDefnPid(int scriptDefnPid) {
		this.scriptDefnPid = scriptDefnPid;
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
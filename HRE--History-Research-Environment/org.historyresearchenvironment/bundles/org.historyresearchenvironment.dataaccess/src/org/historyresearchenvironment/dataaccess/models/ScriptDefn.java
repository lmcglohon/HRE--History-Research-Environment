package org.historyresearchenvironment.dataaccess.models;

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

	// @Column(name="ACTION_TYPE_KEY")
	public short getActionTypeKey() {
		return this.actionTypeKey;
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="INPUT_FOCUS_TYPE_KEY")
	public short getInputFocusTypeKey() {
		return this.inputFocusTypeKey;
	}

	// @Column(name="INPUT_SUB_TYPE_KEY")
	public short getInputSubTypeKey() {
		return this.inputSubTypeKey;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
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

	// @Column(name="SCRIPT_DEFN_PID", nullable=false)
	public int getScriptDefnPid() {
		return this.scriptDefnPid;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	public void setActionTypeKey(short actionTypeKey) {
		this.actionTypeKey = actionTypeKey;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setInputFocusTypeKey(short inputFocusTypeKey) {
		this.inputFocusTypeKey = inputFocusTypeKey;
	}

	public void setInputSubTypeKey(short inputSubTypeKey) {
		this.inputSubTypeKey = inputSubTypeKey;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}

	public void setScriptDefnPid(int scriptDefnPid) {
		this.scriptDefnPid = scriptDefnPid;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

}
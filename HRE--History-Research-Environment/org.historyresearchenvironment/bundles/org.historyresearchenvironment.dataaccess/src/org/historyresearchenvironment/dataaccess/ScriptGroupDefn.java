package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the SCRIPT_GROUP_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="SCRIPT_GROUP_DEFNS")
// @NamedQuery(name="ScriptGroupDefn.findAll", query="SELECT s FROM ScriptGroupDefn s")
public class ScriptGroupDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private short actionTypeKey;
	private int commitPid;
	private short displayOrder;
	private short inputFocusTypeKey;
	private short inputSubTypeKey;
	private boolean isDefault;
	private short reminderKey;
	private int scriptGroupDefnPid;
	private short setKey;
	private boolean show;

	public ScriptGroupDefn() {
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


	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}


	// @Column(name="SCRIPT_GROUP_DEFN_PID", nullable=false)
	public int getScriptGroupDefnPid() {
		return this.scriptGroupDefnPid;
	}

	public void setScriptGroupDefnPid(int scriptGroupDefnPid) {
		this.scriptGroupDefnPid = scriptGroupDefnPid;
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
package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the FIELD_VALID_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="FIELD_VALID_DEFNS")
// @NamedQuery(name="FieldValidDefn.findAll", query="SELECT f FROM FieldValidDefn f")
public class FieldValidDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private int fieldValidDefnPid;
	private boolean isDefault;
	private short modifyScriptGroupKey;
	private int modifyScriptPid;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private short viewScriptGroupKey;
	private int viewScriptPid;

	public FieldValidDefn() {
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


	// @Column(name="FIELD_VALID_DEFN_PID", nullable=false)
	public int getFieldValidDefnPid() {
		return this.fieldValidDefnPid;
	}

	public void setFieldValidDefnPid(int fieldValidDefnPid) {
		this.fieldValidDefnPid = fieldValidDefnPid;
	}


	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}


	// @Column(name="MODIFY_SCRIPT_GROUP_KEY")
	public short getModifyScriptGroupKey() {
		return this.modifyScriptGroupKey;
	}

	public void setModifyScriptGroupKey(short modifyScriptGroupKey) {
		this.modifyScriptGroupKey = modifyScriptGroupKey;
	}


	// @Column(name="MODIFY_SCRIPT_PID")
	public int getModifyScriptPid() {
		return this.modifyScriptPid;
	}

	public void setModifyScriptPid(int modifyScriptPid) {
		this.modifyScriptPid = modifyScriptPid;
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


	// @Column(name="VIEW_SCRIPT_GROUP_KEY")
	public short getViewScriptGroupKey() {
		return this.viewScriptGroupKey;
	}

	public void setViewScriptGroupKey(short viewScriptGroupKey) {
		this.viewScriptGroupKey = viewScriptGroupKey;
	}


	// @Column(name="VIEW_SCRIPT_PID")
	public int getViewScriptPid() {
		return this.viewScriptPid;
	}

	public void setViewScriptPid(int viewScriptPid) {
		this.viewScriptPid = viewScriptPid;
	}

}
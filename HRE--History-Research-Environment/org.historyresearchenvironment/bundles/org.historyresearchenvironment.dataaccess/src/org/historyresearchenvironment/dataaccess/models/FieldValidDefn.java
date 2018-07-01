package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the FIELD_VALID_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="FIELD_VALID_DEFNS")
// @NamedQuery(name="FieldValidDefn.findAll", query="SELECT f FROM
// FieldValidDefn f")
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

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="FIELD_VALID_DEFN_PID", nullable=false)
	public int getFieldValidDefnPid() {
		return this.fieldValidDefnPid;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="MODIFY_SCRIPT_GROUP_KEY")
	public short getModifyScriptGroupKey() {
		return this.modifyScriptGroupKey;
	}

	// @Column(name="MODIFY_SCRIPT_PID")
	public int getModifyScriptPid() {
		return this.modifyScriptPid;
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

	// @Column(name="VIEW_SCRIPT_GROUP_KEY")
	public short getViewScriptGroupKey() {
		return this.viewScriptGroupKey;
	}

	// @Column(name="VIEW_SCRIPT_PID")
	public int getViewScriptPid() {
		return this.viewScriptPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setFieldValidDefnPid(int fieldValidDefnPid) {
		this.fieldValidDefnPid = fieldValidDefnPid;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setModifyScriptGroupKey(short modifyScriptGroupKey) {
		this.modifyScriptGroupKey = modifyScriptGroupKey;
	}

	public void setModifyScriptPid(int modifyScriptPid) {
		this.modifyScriptPid = modifyScriptPid;
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

	public void setViewScriptGroupKey(short viewScriptGroupKey) {
		this.viewScriptGroupKey = viewScriptGroupKey;
	}

	public void setViewScriptPid(int viewScriptPid) {
		this.viewScriptPid = viewScriptPid;
	}

}
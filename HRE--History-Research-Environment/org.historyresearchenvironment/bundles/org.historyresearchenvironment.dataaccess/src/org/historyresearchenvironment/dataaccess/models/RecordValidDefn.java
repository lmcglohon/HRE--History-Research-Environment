package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the RECORD_VALID_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="RECORD_VALID_DEFNS")
// @NamedQuery(name="RecordValidDefn.findAll", query="SELECT r FROM
// RecordValidDefn r")
public class RecordValidDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short deleteScriptGroupKey;
	private int deleteScriptPid;
	private short displayOrder;
	private boolean isDefault;
	private short modifyScriptGroupKey;
	private int modifyScriptPid;
	private int recordValidDefnPid;
	private short reminder;
	private short setKey;
	private boolean show;
	private short viewScriptGroupKey;
	private int viewScriptPid;

	public RecordValidDefn() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DELETE_SCRIPT_GROUP_KEY")
	public short getDeleteScriptGroupKey() {
		return this.deleteScriptGroupKey;
	}

	// @Column(name="DELETE_SCRIPT_PID")
	public int getDeleteScriptPid() {
		return this.deleteScriptPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
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

	// @Column(name="RECORD_VALID_DEFN_PID", nullable=false)
	public int getRecordValidDefnPid() {
		return this.recordValidDefnPid;
	}

	public short getReminder() {
		return this.reminder;
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

	public void setDeleteScriptGroupKey(short deleteScriptGroupKey) {
		this.deleteScriptGroupKey = deleteScriptGroupKey;
	}

	public void setDeleteScriptPid(int deleteScriptPid) {
		this.deleteScriptPid = deleteScriptPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
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

	public void setRecordValidDefnPid(int recordValidDefnPid) {
		this.recordValidDefnPid = recordValidDefnPid;
	}

	public void setReminder(short reminder) {
		this.reminder = reminder;
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
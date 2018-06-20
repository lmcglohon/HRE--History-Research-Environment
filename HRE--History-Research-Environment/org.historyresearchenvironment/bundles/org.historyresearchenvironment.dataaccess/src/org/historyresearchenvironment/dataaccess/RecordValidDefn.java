package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the RECORD_VALID_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="RECORD_VALID_DEFNS")
// @NamedQuery(name="RecordValidDefn.findAll", query="SELECT r FROM RecordValidDefn r")
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


	// @Column(name="DELETE_SCRIPT_GROUP_KEY")
	public short getDeleteScriptGroupKey() {
		return this.deleteScriptGroupKey;
	}

	public void setDeleteScriptGroupKey(short deleteScriptGroupKey) {
		this.deleteScriptGroupKey = deleteScriptGroupKey;
	}


	// @Column(name="DELETE_SCRIPT_PID")
	public int getDeleteScriptPid() {
		return this.deleteScriptPid;
	}

	public void setDeleteScriptPid(int deleteScriptPid) {
		this.deleteScriptPid = deleteScriptPid;
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


	// @Column(name="RECORD_VALID_DEFN_PID", nullable=false)
	public int getRecordValidDefnPid() {
		return this.recordValidDefnPid;
	}

	public void setRecordValidDefnPid(int recordValidDefnPid) {
		this.recordValidDefnPid = recordValidDefnPid;
	}


	public short getReminder() {
		return this.reminder;
	}

	public void setReminder(short reminder) {
		this.reminder = reminder;
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
package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;


/**
 * The persistent class for the SUBSTN_PARAM_SET_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="SUBSTN_PARAM_SET_DEFNS")
// @NamedQuery(name="SubstnParamSetDefn.findAll", query="SELECT s FROM SubstnParamSetDefn s")
public class SubstnParamSetDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short deleteDataScriptGroupKey;
	private int deleteDataScriptPid;
	private short displayOrder;
	private short evalDataScriptGroupKey;
	private int evalDataScriptPid;
	private boolean isSystem;
	private short modifyDataScriptGroupKey;
	private int modifyDataScriptPid;
	private short paramSetKey;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private int substnParamSetDefnPid;
	private short viewDataScriptGroupKey;
	private int viewDataScriptPid;

	public SubstnParamSetDefn() {
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


	// @Column(name="DELETE_DATA_SCRIPT_GROUP_KEY")
	public short getDeleteDataScriptGroupKey() {
		return this.deleteDataScriptGroupKey;
	}

	public void setDeleteDataScriptGroupKey(short deleteDataScriptGroupKey) {
		this.deleteDataScriptGroupKey = deleteDataScriptGroupKey;
	}


	// @Column(name="DELETE_DATA_SCRIPT_PID")
	public int getDeleteDataScriptPid() {
		return this.deleteDataScriptPid;
	}

	public void setDeleteDataScriptPid(int deleteDataScriptPid) {
		this.deleteDataScriptPid = deleteDataScriptPid;
	}


	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}


	// @Column(name="EVAL_DATA_SCRIPT_GROUP_KEY")
	public short getEvalDataScriptGroupKey() {
		return this.evalDataScriptGroupKey;
	}

	public void setEvalDataScriptGroupKey(short evalDataScriptGroupKey) {
		this.evalDataScriptGroupKey = evalDataScriptGroupKey;
	}


	// @Column(name="EVAL_DATA_SCRIPT_PID")
	public int getEvalDataScriptPid() {
		return this.evalDataScriptPid;
	}

	public void setEvalDataScriptPid(int evalDataScriptPid) {
		this.evalDataScriptPid = evalDataScriptPid;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="MODIFY_DATA_SCRIPT_GROUP_KEY")
	public short getModifyDataScriptGroupKey() {
		return this.modifyDataScriptGroupKey;
	}

	public void setModifyDataScriptGroupKey(short modifyDataScriptGroupKey) {
		this.modifyDataScriptGroupKey = modifyDataScriptGroupKey;
	}


	// @Column(name="MODIFY_DATA_SCRIPT_PID")
	public int getModifyDataScriptPid() {
		return this.modifyDataScriptPid;
	}

	public void setModifyDataScriptPid(int modifyDataScriptPid) {
		this.modifyDataScriptPid = modifyDataScriptPid;
	}


	// @Column(name="PARAM_SET_KEY")
	public short getParamSetKey() {
		return this.paramSetKey;
	}

	public void setParamSetKey(short paramSetKey) {
		this.paramSetKey = paramSetKey;
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


	// @Column(name="SUBSTN_PARAM_SET_DEFN_PID", nullable=false)
	public int getSubstnParamSetDefnPid() {
		return this.substnParamSetDefnPid;
	}

	public void setSubstnParamSetDefnPid(int substnParamSetDefnPid) {
		this.substnParamSetDefnPid = substnParamSetDefnPid;
	}


	// @Column(name="VIEW_DATA_SCRIPT_GROUP_KEY")
	public short getViewDataScriptGroupKey() {
		return this.viewDataScriptGroupKey;
	}

	public void setViewDataScriptGroupKey(short viewDataScriptGroupKey) {
		this.viewDataScriptGroupKey = viewDataScriptGroupKey;
	}


	// @Column(name="VIEW_DATA_SCRIPT_PID")
	public int getViewDataScriptPid() {
		return this.viewDataScriptPid;
	}

	public void setViewDataScriptPid(int viewDataScriptPid) {
		this.viewDataScriptPid = viewDataScriptPid;
	}

}
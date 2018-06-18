package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the SUBSTN_COMMON_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="SUBSTN_COMMON_DEFNS")
// @NamedQuery(name="SubstnCommonDefn.findAll", query="SELECT s FROM SubstnCommonDefn s")
public class SubstnCommonDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private boolean isDataRetrieval;
	private boolean isSystem;
	private boolean isValueCompare;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private int substnCommonDefnPid;
	private short topStepKey;

	public SubstnCommonDefn() {
	}


	// @Id
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


	// @Column(name="IS_DATA_RETRIEVAL")
	public boolean getIsDataRetrieval() {
		return this.isDataRetrieval;
	}

	public void setIsDataRetrieval(boolean isDataRetrieval) {
		this.isDataRetrieval = isDataRetrieval;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="IS_VALUE_COMPARE")
	public boolean getIsValueCompare() {
		return this.isValueCompare;
	}

	public void setIsValueCompare(boolean isValueCompare) {
		this.isValueCompare = isValueCompare;
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


	// @Column(name="SUBSTN_COMMON_DEFN_PID", nullable=false)
	public int getSubstnCommonDefnPid() {
		return this.substnCommonDefnPid;
	}

	public void setSubstnCommonDefnPid(int substnCommonDefnPid) {
		this.substnCommonDefnPid = substnCommonDefnPid;
	}


	// @Column(name="TOP_STEP_KEY")
	public short getTopStepKey() {
		return this.topStepKey;
	}

	public void setTopStepKey(short topStepKey) {
		this.topStepKey = topStepKey;
	}

}
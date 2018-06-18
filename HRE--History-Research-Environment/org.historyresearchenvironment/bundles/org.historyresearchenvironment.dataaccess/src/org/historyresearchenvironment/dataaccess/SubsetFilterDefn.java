package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the SUBSET_FILTER_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="SUBSET_FILTER_DEFNS")
// @NamedQuery(name="SubsetFilterDefn.findAll", query="SELECT s FROM SubsetFilterDefn s")
public class SubsetFilterDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private short inputSubTypeKey;
	private short inputTypeKey;
	private boolean isDefault;
	private boolean isSystem;
	private short outputSubTypeKey;
	private short outputTypeKey;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private short startStepPid;
	private int subsetFilterDefnPid;

	public SubsetFilterDefn() {
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


	// @Column(name="INPUT_SUB_TYPE_KEY")
	public short getInputSubTypeKey() {
		return this.inputSubTypeKey;
	}

	public void setInputSubTypeKey(short inputSubTypeKey) {
		this.inputSubTypeKey = inputSubTypeKey;
	}


	// @Column(name="INPUT_TYPE_KEY")
	public short getInputTypeKey() {
		return this.inputTypeKey;
	}

	public void setInputTypeKey(short inputTypeKey) {
		this.inputTypeKey = inputTypeKey;
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


	// @Column(name="OUTPUT_SUB_TYPE_KEY")
	public short getOutputSubTypeKey() {
		return this.outputSubTypeKey;
	}

	public void setOutputSubTypeKey(short outputSubTypeKey) {
		this.outputSubTypeKey = outputSubTypeKey;
	}


	// @Column(name="OUTPUT_TYPE_KEY")
	public short getOutputTypeKey() {
		return this.outputTypeKey;
	}

	public void setOutputTypeKey(short outputTypeKey) {
		this.outputTypeKey = outputTypeKey;
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


	// @Column(name="START_STEP_PID")
	public short getStartStepPid() {
		return this.startStepPid;
	}

	public void setStartStepPid(short startStepPid) {
		this.startStepPid = startStepPid;
	}


	// @Column(name="SUBSET_FILTER_DEFN_PID", nullable=false)
	public int getSubsetFilterDefnPid() {
		return this.subsetFilterDefnPid;
	}

	public void setSubsetFilterDefnPid(int subsetFilterDefnPid) {
		this.subsetFilterDefnPid = subsetFilterDefnPid;
	}

}
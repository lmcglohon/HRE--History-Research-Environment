package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the SUBSET_FILTER_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="SUBSET_FILTER_DEFNS")
// @NamedQuery(name="SubsetFilterDefn.findAll", query="SELECT s FROM
// SubsetFilterDefn s")
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

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="INPUT_SUB_TYPE_KEY")
	public short getInputSubTypeKey() {
		return this.inputSubTypeKey;
	}

	// @Column(name="INPUT_TYPE_KEY")
	public short getInputTypeKey() {
		return this.inputTypeKey;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="OUTPUT_SUB_TYPE_KEY")
	public short getOutputSubTypeKey() {
		return this.outputSubTypeKey;
	}

	// @Column(name="OUTPUT_TYPE_KEY")
	public short getOutputTypeKey() {
		return this.outputTypeKey;
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

	// @Column(name="START_STEP_PID")
	public short getStartStepPid() {
		return this.startStepPid;
	}

	// @Column(name="SUBSET_FILTER_DEFN_PID", nullable=false)
	public int getSubsetFilterDefnPid() {
		return this.subsetFilterDefnPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setInputSubTypeKey(short inputSubTypeKey) {
		this.inputSubTypeKey = inputSubTypeKey;
	}

	public void setInputTypeKey(short inputTypeKey) {
		this.inputTypeKey = inputTypeKey;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setOutputSubTypeKey(short outputSubTypeKey) {
		this.outputSubTypeKey = outputSubTypeKey;
	}

	public void setOutputTypeKey(short outputTypeKey) {
		this.outputTypeKey = outputTypeKey;
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

	public void setStartStepPid(short startStepPid) {
		this.startStepPid = startStepPid;
	}

	public void setSubsetFilterDefnPid(int subsetFilterDefnPid) {
		this.subsetFilterDefnPid = subsetFilterDefnPid;
	}

}
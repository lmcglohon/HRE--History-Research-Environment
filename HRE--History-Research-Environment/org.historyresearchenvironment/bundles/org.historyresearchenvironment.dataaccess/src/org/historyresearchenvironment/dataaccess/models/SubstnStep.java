package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the SUBSTN_STEPS database table.
 * 
 */
// @Entity
// @Table(name="SUBSTN_STEPS")
// @NamedQuery(name="SubstnStep.findAll", query="SELECT s FROM SubstnStep s")
public class SubstnStep implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private int errorStepPid;
	private int falseStartStepPid;
	private boolean isFilterStepType;
	private boolean isSystem;
	private boolean isTemplateStepType;
	private int nextStepPid;
	private int normalStartStepPid;
	private int ownerPid;
	private int ownerSubTypeKey;
	private short ownerTypeKey;
	private short paramListKey;
	private boolean parentIsDataAlias;
	private int parentStepPid;
	private String plainText;
	private int priorStepPid;
	private short setKey;
	private short stepTypeKey;
	private int substnStepPid;

	public SubstnStep() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="ERROR_STEP_PID")
	public int getErrorStepPid() {
		return this.errorStepPid;
	}

	// @Column(name="FALSE_START_STEP_PID")
	public int getFalseStartStepPid() {
		return this.falseStartStepPid;
	}

	// @Column(name="IS_FILTER_STEP_TYPE")
	public boolean getIsFilterStepType() {
		return this.isFilterStepType;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="IS_TEMPLATE_STEP_TYPE")
	public boolean getIsTemplateStepType() {
		return this.isTemplateStepType;
	}

	// @Column(name="NEXT_STEP_PID")
	public int getNextStepPid() {
		return this.nextStepPid;
	}

	// @Column(name="NORMAL_START_STEP_PID")
	public int getNormalStartStepPid() {
		return this.normalStartStepPid;
	}

	// @Column(name="OWNER_PID")
	public int getOwnerPid() {
		return this.ownerPid;
	}

	// @Column(name="OWNER_SUB_TYPE_KEY")
	public int getOwnerSubTypeKey() {
		return this.ownerSubTypeKey;
	}

	// @Column(name="OWNER_TYPE_KEY")
	public short getOwnerTypeKey() {
		return this.ownerTypeKey;
	}

	// @Column(name="PARAM_LIST_KEY")
	public short getParamListKey() {
		return this.paramListKey;
	}

	// @Column(name="PARENT_IS_DATA_ALIAS")
	public boolean getParentIsDataAlias() {
		return this.parentIsDataAlias;
	}

	// @Column(name="PARENT_STEP_PID")
	public int getParentStepPid() {
		return this.parentStepPid;
	}

	// @Column(name="PLAIN_TEXT", length=32767)
	public String getPlainText() {
		return this.plainText;
	}

	// @Column(name="PRIOR_STEP_PID")
	public int getPriorStepPid() {
		return this.priorStepPid;
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="STEP_TYPE_KEY")
	public short getStepTypeKey() {
		return this.stepTypeKey;
	}

	// @Column(name="SUBSTN_STEP_PID", nullable=false)
	public int getSubstnStepPid() {
		return this.substnStepPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setErrorStepPid(int errorStepPid) {
		this.errorStepPid = errorStepPid;
	}

	public void setFalseStartStepPid(int falseStartStepPid) {
		this.falseStartStepPid = falseStartStepPid;
	}

	public void setIsFilterStepType(boolean isFilterStepType) {
		this.isFilterStepType = isFilterStepType;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setIsTemplateStepType(boolean isTemplateStepType) {
		this.isTemplateStepType = isTemplateStepType;
	}

	public void setNextStepPid(int nextStepPid) {
		this.nextStepPid = nextStepPid;
	}

	public void setNormalStartStepPid(int normalStartStepPid) {
		this.normalStartStepPid = normalStartStepPid;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setOwnerSubTypeKey(int ownerSubTypeKey) {
		this.ownerSubTypeKey = ownerSubTypeKey;
	}

	public void setOwnerTypeKey(short ownerTypeKey) {
		this.ownerTypeKey = ownerTypeKey;
	}

	public void setParamListKey(short paramListKey) {
		this.paramListKey = paramListKey;
	}

	public void setParentIsDataAlias(boolean parentIsDataAlias) {
		this.parentIsDataAlias = parentIsDataAlias;
	}

	public void setParentStepPid(int parentStepPid) {
		this.parentStepPid = parentStepPid;
	}

	public void setPlainText(String plainText) {
		this.plainText = plainText;
	}

	public void setPriorStepPid(int priorStepPid) {
		this.priorStepPid = priorStepPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setStepTypeKey(short stepTypeKey) {
		this.stepTypeKey = stepTypeKey;
	}

	public void setSubstnStepPid(int substnStepPid) {
		this.substnStepPid = substnStepPid;
	}

}
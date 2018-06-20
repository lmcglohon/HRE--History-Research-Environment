package org.historyresearchenvironment.dataaccess;

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


	// @Column(name="ERROR_STEP_PID")
	public int getErrorStepPid() {
		return this.errorStepPid;
	}

	public void setErrorStepPid(int errorStepPid) {
		this.errorStepPid = errorStepPid;
	}


	// @Column(name="FALSE_START_STEP_PID")
	public int getFalseStartStepPid() {
		return this.falseStartStepPid;
	}

	public void setFalseStartStepPid(int falseStartStepPid) {
		this.falseStartStepPid = falseStartStepPid;
	}


	// @Column(name="IS_FILTER_STEP_TYPE")
	public boolean getIsFilterStepType() {
		return this.isFilterStepType;
	}

	public void setIsFilterStepType(boolean isFilterStepType) {
		this.isFilterStepType = isFilterStepType;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="IS_TEMPLATE_STEP_TYPE")
	public boolean getIsTemplateStepType() {
		return this.isTemplateStepType;
	}

	public void setIsTemplateStepType(boolean isTemplateStepType) {
		this.isTemplateStepType = isTemplateStepType;
	}


	// @Column(name="NEXT_STEP_PID")
	public int getNextStepPid() {
		return this.nextStepPid;
	}

	public void setNextStepPid(int nextStepPid) {
		this.nextStepPid = nextStepPid;
	}


	// @Column(name="NORMAL_START_STEP_PID")
	public int getNormalStartStepPid() {
		return this.normalStartStepPid;
	}

	public void setNormalStartStepPid(int normalStartStepPid) {
		this.normalStartStepPid = normalStartStepPid;
	}


	// @Column(name="OWNER_PID")
	public int getOwnerPid() {
		return this.ownerPid;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}


	// @Column(name="OWNER_SUB_TYPE_KEY")
	public int getOwnerSubTypeKey() {
		return this.ownerSubTypeKey;
	}

	public void setOwnerSubTypeKey(int ownerSubTypeKey) {
		this.ownerSubTypeKey = ownerSubTypeKey;
	}


	// @Column(name="OWNER_TYPE_KEY")
	public short getOwnerTypeKey() {
		return this.ownerTypeKey;
	}

	public void setOwnerTypeKey(short ownerTypeKey) {
		this.ownerTypeKey = ownerTypeKey;
	}


	// @Column(name="PARAM_LIST_KEY")
	public short getParamListKey() {
		return this.paramListKey;
	}

	public void setParamListKey(short paramListKey) {
		this.paramListKey = paramListKey;
	}


	// @Column(name="PARENT_IS_DATA_ALIAS")
	public boolean getParentIsDataAlias() {
		return this.parentIsDataAlias;
	}

	public void setParentIsDataAlias(boolean parentIsDataAlias) {
		this.parentIsDataAlias = parentIsDataAlias;
	}


	// @Column(name="PARENT_STEP_PID")
	public int getParentStepPid() {
		return this.parentStepPid;
	}

	public void setParentStepPid(int parentStepPid) {
		this.parentStepPid = parentStepPid;
	}


	// @Column(name="PLAIN_TEXT", length=32767)
	public String getPlainText() {
		return this.plainText;
	}

	public void setPlainText(String plainText) {
		this.plainText = plainText;
	}


	// @Column(name="PRIOR_STEP_PID")
	public int getPriorStepPid() {
		return this.priorStepPid;
	}

	public void setPriorStepPid(int priorStepPid) {
		this.priorStepPid = priorStepPid;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(name="STEP_TYPE_KEY")
	public short getStepTypeKey() {
		return this.stepTypeKey;
	}

	public void setStepTypeKey(short stepTypeKey) {
		this.stepTypeKey = stepTypeKey;
	}


	// @Column(name="SUBSTN_STEP_PID", nullable=false)
	public int getSubstnStepPid() {
		return this.substnStepPid;
	}

	public void setSubstnStepPid(int substnStepPid) {
		this.substnStepPid = substnStepPid;
	}

}
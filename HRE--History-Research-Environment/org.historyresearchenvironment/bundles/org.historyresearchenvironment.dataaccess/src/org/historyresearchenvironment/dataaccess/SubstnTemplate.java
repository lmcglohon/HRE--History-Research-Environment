package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the SUBSTN_TEMPLATES database table.
 * 
 */
// @Entity
// @Table(name="SUBSTN_TEMPLATES")
// @NamedQuery(name="SubstnTemplate.findAll", query="SELECT s FROM SubstnTemplate s")
public class SubstnTemplate implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short defltParamsKey;
	private short displayOrder;
	private boolean isSystem;
	private short layoutStyleClassKey;
	private short paramsSetKey;
	private int parentStepPid;
	private short scriptGroupKey;
	private short scriptKey;
	private short setKey;
	private boolean show;
	private int substnTemplatePid;
	private short thisParamsKey;

	public SubstnTemplate() {
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


	// @Column(name="DEFLT_PARAMS_KEY")
	public short getDefltParamsKey() {
		return this.defltParamsKey;
	}

	public void setDefltParamsKey(short defltParamsKey) {
		this.defltParamsKey = defltParamsKey;
	}


	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="LAYOUT_STYLE_CLASS_KEY")
	public short getLayoutStyleClassKey() {
		return this.layoutStyleClassKey;
	}

	public void setLayoutStyleClassKey(short layoutStyleClassKey) {
		this.layoutStyleClassKey = layoutStyleClassKey;
	}


	// @Column(name="PARAMS_SET_KEY")
	public short getParamsSetKey() {
		return this.paramsSetKey;
	}

	public void setParamsSetKey(short paramsSetKey) {
		this.paramsSetKey = paramsSetKey;
	}


	// @Column(name="PARENT_STEP_PID")
	public int getParentStepPid() {
		return this.parentStepPid;
	}

	public void setParentStepPid(int parentStepPid) {
		this.parentStepPid = parentStepPid;
	}


	// @Column(name="SCRIPT_GROUP_KEY")
	public short getScriptGroupKey() {
		return this.scriptGroupKey;
	}

	public void setScriptGroupKey(short scriptGroupKey) {
		this.scriptGroupKey = scriptGroupKey;
	}


	// @Column(name="SCRIPT_KEY")
	public short getScriptKey() {
		return this.scriptKey;
	}

	public void setScriptKey(short scriptKey) {
		this.scriptKey = scriptKey;
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


	// @Column(name="SUBSTN_TEMPLATE_PID", nullable=false)
	public int getSubstnTemplatePid() {
		return this.substnTemplatePid;
	}

	public void setSubstnTemplatePid(int substnTemplatePid) {
		this.substnTemplatePid = substnTemplatePid;
	}


	// @Column(name="THIS_PARAMS_KEY")
	public short getThisParamsKey() {
		return this.thisParamsKey;
	}

	public void setThisParamsKey(short thisParamsKey) {
		this.thisParamsKey = thisParamsKey;
	}

}
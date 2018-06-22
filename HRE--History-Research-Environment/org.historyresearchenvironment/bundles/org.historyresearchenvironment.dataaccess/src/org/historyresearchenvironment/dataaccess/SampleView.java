package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the SAMPLE_VIEW database table.
 * 
 */
// @Entity
// @Table(name="SAMPLE_VIEW")
// @NamedQuery(name="SampleView.findAll", query="SELECT s FROM SampleView s")
public class SampleView implements Serializable {
	private static final long serialVersionUID = 1L;
	private short aliasKey;
	private short dataTypeKey;
	private int defltParamStepPid;
	private String defltValue;
	private short deleteDataScriptGroupKey;
	private int deleteDataScriptPid;
	private short evalDataScriptGroupKey;
	private int evalDataScriptPid;
	private short modifyDataScriptGroupKey;
	private int modifyDataScriptPid;
	private boolean mustBeEntered;
	private short paramListKey;
	private short paramNameKey;
	private short paramSetKey;
	private int parentStepPid;
	private int substnParamNamePid;
	private int substnParamValuePid;
	private boolean valueIsDataAlias;
	private boolean valueIsOtherAlias;
	private short viewDataScriptGroupKey;
	private int viewDataScriptPid;

	public SampleView() {
	}


	// @Column(name="ALIAS_KEY")
	public short getAliasKey() {
		return this.aliasKey;
	}

	public void setAliasKey(short aliasKey) {
		this.aliasKey = aliasKey;
	}


	// @Column(name="DATA_TYPE_KEY")
	public short getDataTypeKey() {
		return this.dataTypeKey;
	}

	public void setDataTypeKey(short dataTypeKey) {
		this.dataTypeKey = dataTypeKey;
	}


	// @Column(name="DEFLT_PARAM_STEP_PID")
	public int getDefltParamStepPid() {
		return this.defltParamStepPid;
	}

	public void setDefltParamStepPid(int defltParamStepPid) {
		this.defltParamStepPid = defltParamStepPid;
	}


	// @Column(name="DEFLT_VALUE", length=300)
	public String getDefltValue() {
		return this.defltValue;
	}

	public void setDefltValue(String defltValue) {
		this.defltValue = defltValue;
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


	// @Column(name="MUST_BE_ENTERED")
	public boolean getMustBeEntered() {
		return this.mustBeEntered;
	}

	public void setMustBeEntered(boolean mustBeEntered) {
		this.mustBeEntered = mustBeEntered;
	}


	// @Column(name="PARAM_LIST_KEY")
	public short getParamListKey() {
		return this.paramListKey;
	}

	public void setParamListKey(short paramListKey) {
		this.paramListKey = paramListKey;
	}


	// @Column(name="PARAM_NAME_KEY")
	public short getParamNameKey() {
		return this.paramNameKey;
	}

	public void setParamNameKey(short paramNameKey) {
		this.paramNameKey = paramNameKey;
	}


	// @Column(name="PARAM_SET_KEY")
	public short getParamSetKey() {
		return this.paramSetKey;
	}

	public void setParamSetKey(short paramSetKey) {
		this.paramSetKey = paramSetKey;
	}


	// @Column(name="PARENT_STEP_PID")
	public int getParentStepPid() {
		return this.parentStepPid;
	}

	public void setParentStepPid(int parentStepPid) {
		this.parentStepPid = parentStepPid;
	}


	// @Column(name="SUBSTN_PARAM_NAME_PID")
	public int getSubstnParamNamePid() {
		return this.substnParamNamePid;
	}

	public void setSubstnParamNamePid(int substnParamNamePid) {
		this.substnParamNamePid = substnParamNamePid;
	}


	// @Column(name="SUBSTN_PARAM_VALUE_PID")
	public int getSubstnParamValuePid() {
		return this.substnParamValuePid;
	}

	public void setSubstnParamValuePid(int substnParamValuePid) {
		this.substnParamValuePid = substnParamValuePid;
	}


	// @Column(name="VALUE_IS_DATA_ALIAS")
	public boolean getValueIsDataAlias() {
		return this.valueIsDataAlias;
	}

	public void setValueIsDataAlias(boolean valueIsDataAlias) {
		this.valueIsDataAlias = valueIsDataAlias;
	}


	// @Column(name="VALUE_IS_OTHER_ALIAS")
	public boolean getValueIsOtherAlias() {
		return this.valueIsOtherAlias;
	}

	public void setValueIsOtherAlias(boolean valueIsOtherAlias) {
		this.valueIsOtherAlias = valueIsOtherAlias;
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
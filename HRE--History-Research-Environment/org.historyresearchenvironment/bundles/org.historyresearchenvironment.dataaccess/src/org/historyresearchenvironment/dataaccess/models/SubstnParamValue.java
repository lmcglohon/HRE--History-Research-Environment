package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the SUBSTN_PARAM_VALUES database table.
 * 
 */
// @Entity
// @Table(name="SUBSTN_PARAM_VALUES")
// @NamedQuery(name="SubstnParamValue.findAll", query="SELECT s FROM
// SubstnParamValue s")
public class SubstnParamValue implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private short aliasKey;
	private int commitPid;
	private int defltParamStepPid;
	private short displayOrder;
	private boolean isSystem;
	private short paramListKey;
	private short paramNameKey;
	private short paramSetKey;
	private int parentStepPid;
	private short setKey;
	private boolean show;
	private int substnParamValuePid;
	private boolean valueIsDataAlias;
	private boolean valueIsOtherAlias;

	public SubstnParamValue() {
	}

	// @Column(name="ALIAS_KEY")
	public short getAliasKey() {
		return this.aliasKey;
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DEFLT_PARAM_STEP_PID")
	public int getDefltParamStepPid() {
		return this.defltParamStepPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="PARAM_LIST_KEY")
	public short getParamListKey() {
		return this.paramListKey;
	}

	// @Column(name="PARAM_NAME_KEY")
	public short getParamNameKey() {
		return this.paramNameKey;
	}

	// @Column(name="PARAM_SET_KEY")
	public short getParamSetKey() {
		return this.paramSetKey;
	}

	// @Column(name="PARENT_STEP_PID")
	public int getParentStepPid() {
		return this.parentStepPid;
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

	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	// @Column(name="SUBSTN_PARAM_VALUE_PID", nullable=false)
	public int getSubstnParamValuePid() {
		return this.substnParamValuePid;
	}

	// @Column(name="VALUE_IS_DATA_ALIAS")
	public boolean getValueIsDataAlias() {
		return this.valueIsDataAlias;
	}

	// @Column(name="VALUE_IS_OTHER_ALIAS")
	public boolean getValueIsOtherAlias() {
		return this.valueIsOtherAlias;
	}

	public void setAliasKey(short aliasKey) {
		this.aliasKey = aliasKey;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDefltParamStepPid(int defltParamStepPid) {
		this.defltParamStepPid = defltParamStepPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setParamListKey(short paramListKey) {
		this.paramListKey = paramListKey;
	}

	public void setParamNameKey(short paramNameKey) {
		this.paramNameKey = paramNameKey;
	}

	public void setParamSetKey(short paramSetKey) {
		this.paramSetKey = paramSetKey;
	}

	public void setParentStepPid(int parentStepPid) {
		this.parentStepPid = parentStepPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public void setSubstnParamValuePid(int substnParamValuePid) {
		this.substnParamValuePid = substnParamValuePid;
	}

	public void setValueIsDataAlias(boolean valueIsDataAlias) {
		this.valueIsDataAlias = valueIsDataAlias;
	}

	public void setValueIsOtherAlias(boolean valueIsOtherAlias) {
		this.valueIsOtherAlias = valueIsOtherAlias;
	}

}
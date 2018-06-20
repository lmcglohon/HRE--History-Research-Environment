package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the SUBSTN_PARAM_VALUES database table.
 * 
 */
// @Entity
// @Table(name="SUBSTN_PARAM_VALUES")
// @NamedQuery(name="SubstnParamValue.findAll", query="SELECT s FROM SubstnParamValue s")
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


	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}


	// @Column(name="ALIAS_KEY")
	public short getAliasKey() {
		return this.aliasKey;
	}

	public void setAliasKey(short aliasKey) {
		this.aliasKey = aliasKey;
	}


	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	// @Column(name="DEFLT_PARAM_STEP_PID")
	public int getDefltParamStepPid() {
		return this.defltParamStepPid;
	}

	public void setDefltParamStepPid(int defltParamStepPid) {
		this.defltParamStepPid = defltParamStepPid;
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


	// @Column(name="SUBSTN_PARAM_VALUE_PID", nullable=false)
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

}
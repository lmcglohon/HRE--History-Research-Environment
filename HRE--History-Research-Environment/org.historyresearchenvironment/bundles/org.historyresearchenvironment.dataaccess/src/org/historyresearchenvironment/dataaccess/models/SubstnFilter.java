package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;


/**
 * The persistent class for the SUBSTN_FILTERS database table.
 * 
 */
// @Entity
// @Table(name="SUBSTN_FILTERS")
// @NamedQuery(name="SubstnFilter.findAll", query="SELECT s FROM SubstnFilter s")
public class SubstnFilter implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short defltParamsKey;
	private short displayOrder;
	private boolean isSystem;
	private short nextSortTermKey;
	private short nextStepKey;
	private short paramsSetKey;
	private int parentStepPid;
	private short scriptGroupKey;
	private short scriptKey;
	private short setKey;
	private boolean show;
	private int substnFilterPid;
	private short substnTypeKey;
	private short thisParamsKey;

	public SubstnFilter() {
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


	// @Column(name="NEXT_SORT_TERM_KEY")
	public short getNextSortTermKey() {
		return this.nextSortTermKey;
	}

	public void setNextSortTermKey(short nextSortTermKey) {
		this.nextSortTermKey = nextSortTermKey;
	}


	// @Column(name="NEXT_STEP_KEY")
	public short getNextStepKey() {
		return this.nextStepKey;
	}

	public void setNextStepKey(short nextStepKey) {
		this.nextStepKey = nextStepKey;
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


	// @Column(name="SUBSTN_FILTER_PID", nullable=false)
	public int getSubstnFilterPid() {
		return this.substnFilterPid;
	}

	public void setSubstnFilterPid(int substnFilterPid) {
		this.substnFilterPid = substnFilterPid;
	}


	// @Column(name="SUBSTN_TYPE_KEY")
	public short getSubstnTypeKey() {
		return this.substnTypeKey;
	}

	public void setSubstnTypeKey(short substnTypeKey) {
		this.substnTypeKey = substnTypeKey;
	}


	// @Column(name="THIS_PARAMS_KEY")
	public short getThisParamsKey() {
		return this.thisParamsKey;
	}

	public void setThisParamsKey(short thisParamsKey) {
		this.thisParamsKey = thisParamsKey;
	}

}
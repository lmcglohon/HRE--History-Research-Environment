package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the SUBSTN_DATA_ALIASES database table.
 * 
 */
// @Entity
// @Table(name="SUBSTN_DATA_ALIASES")
// @NamedQuery(name="SubstnDataAlias.findAll", query="SELECT s FROM SubstnDataAlias s")
public class SubstnDataAlias implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private boolean isComplete;
	private boolean isHeadLinkOnly;
	private boolean isHeadOnly;
	private boolean isLinkOnly;
	private boolean isLinkOutputOnly;
	private boolean isOutputOnly;
	private boolean isSystem;
	private short outputSubTypeKey;
	private short outputTypeKey;
	private short paramListKey;
	private short reminderKey;
	private short requesterSubTypeKey;
	private short requesterTypeKey;
	private short setKey;
	private boolean show;
	private int substnDataAliasPid;
	private short topStepKey;

	public SubstnDataAlias() {
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


	// @Column(name="IS_COMPLETE")
	public boolean getIsComplete() {
		return this.isComplete;
	}

	public void setIsComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}


	// @Column(name="IS_HEAD_LINK_ONLY")
	public boolean getIsHeadLinkOnly() {
		return this.isHeadLinkOnly;
	}

	public void setIsHeadLinkOnly(boolean isHeadLinkOnly) {
		this.isHeadLinkOnly = isHeadLinkOnly;
	}


	// @Column(name="IS_HEAD_ONLY")
	public boolean getIsHeadOnly() {
		return this.isHeadOnly;
	}

	public void setIsHeadOnly(boolean isHeadOnly) {
		this.isHeadOnly = isHeadOnly;
	}


	// @Column(name="IS_LINK_ONLY")
	public boolean getIsLinkOnly() {
		return this.isLinkOnly;
	}

	public void setIsLinkOnly(boolean isLinkOnly) {
		this.isLinkOnly = isLinkOnly;
	}


	// @Column(name="IS_LINK_OUTPUT_ONLY")
	public boolean getIsLinkOutputOnly() {
		return this.isLinkOutputOnly;
	}

	public void setIsLinkOutputOnly(boolean isLinkOutputOnly) {
		this.isLinkOutputOnly = isLinkOutputOnly;
	}


	// @Column(name="IS_OUTPUT_ONLY")
	public boolean getIsOutputOnly() {
		return this.isOutputOnly;
	}

	public void setIsOutputOnly(boolean isOutputOnly) {
		this.isOutputOnly = isOutputOnly;
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


	// @Column(name="PARAM_LIST_KEY")
	public short getParamListKey() {
		return this.paramListKey;
	}

	public void setParamListKey(short paramListKey) {
		this.paramListKey = paramListKey;
	}


	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}


	// @Column(name="REQUESTER_SUB_TYPE_KEY")
	public short getRequesterSubTypeKey() {
		return this.requesterSubTypeKey;
	}

	public void setRequesterSubTypeKey(short requesterSubTypeKey) {
		this.requesterSubTypeKey = requesterSubTypeKey;
	}


	// @Column(name="REQUESTER_TYPE_KEY")
	public short getRequesterTypeKey() {
		return this.requesterTypeKey;
	}

	public void setRequesterTypeKey(short requesterTypeKey) {
		this.requesterTypeKey = requesterTypeKey;
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


	// @Column(name="SUBSTN_DATA_ALIAS_PID", nullable=false)
	public int getSubstnDataAliasPid() {
		return this.substnDataAliasPid;
	}

	public void setSubstnDataAliasPid(int substnDataAliasPid) {
		this.substnDataAliasPid = substnDataAliasPid;
	}


	// @Column(name="TOP_STEP_KEY")
	public short getTopStepKey() {
		return this.topStepKey;
	}

	public void setTopStepKey(short topStepKey) {
		this.topStepKey = topStepKey;
	}

}
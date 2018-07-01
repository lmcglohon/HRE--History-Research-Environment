package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the SUBSTN_DATA_ALIASES database table.
 * 
 */
// @Entity
// @Table(name="SUBSTN_DATA_ALIASES")
// @NamedQuery(name="SubstnDataAlias.findAll", query="SELECT s FROM
// SubstnDataAlias s")
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

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="IS_COMPLETE")
	public boolean getIsComplete() {
		return this.isComplete;
	}

	// @Column(name="IS_HEAD_LINK_ONLY")
	public boolean getIsHeadLinkOnly() {
		return this.isHeadLinkOnly;
	}

	// @Column(name="IS_HEAD_ONLY")
	public boolean getIsHeadOnly() {
		return this.isHeadOnly;
	}

	// @Column(name="IS_LINK_ONLY")
	public boolean getIsLinkOnly() {
		return this.isLinkOnly;
	}

	// @Column(name="IS_LINK_OUTPUT_ONLY")
	public boolean getIsLinkOutputOnly() {
		return this.isLinkOutputOnly;
	}

	// @Column(name="IS_OUTPUT_ONLY")
	public boolean getIsOutputOnly() {
		return this.isOutputOnly;
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

	// @Column(name="PARAM_LIST_KEY")
	public short getParamListKey() {
		return this.paramListKey;
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

	// @Column(name="REQUESTER_SUB_TYPE_KEY")
	public short getRequesterSubTypeKey() {
		return this.requesterSubTypeKey;
	}

	// @Column(name="REQUESTER_TYPE_KEY")
	public short getRequesterTypeKey() {
		return this.requesterTypeKey;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	// @Column(name="SUBSTN_DATA_ALIAS_PID", nullable=false)
	public int getSubstnDataAliasPid() {
		return this.substnDataAliasPid;
	}

	// @Column(name="TOP_STEP_KEY")
	public short getTopStepKey() {
		return this.topStepKey;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setIsComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

	public void setIsHeadLinkOnly(boolean isHeadLinkOnly) {
		this.isHeadLinkOnly = isHeadLinkOnly;
	}

	public void setIsHeadOnly(boolean isHeadOnly) {
		this.isHeadOnly = isHeadOnly;
	}

	public void setIsLinkOnly(boolean isLinkOnly) {
		this.isLinkOnly = isLinkOnly;
	}

	public void setIsLinkOutputOnly(boolean isLinkOutputOnly) {
		this.isLinkOutputOnly = isLinkOutputOnly;
	}

	public void setIsOutputOnly(boolean isOutputOnly) {
		this.isOutputOnly = isOutputOnly;
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

	public void setParamListKey(short paramListKey) {
		this.paramListKey = paramListKey;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}

	public void setRequesterSubTypeKey(short requesterSubTypeKey) {
		this.requesterSubTypeKey = requesterSubTypeKey;
	}

	public void setRequesterTypeKey(short requesterTypeKey) {
		this.requesterTypeKey = requesterTypeKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public void setSubstnDataAliasPid(int substnDataAliasPid) {
		this.substnDataAliasPid = substnDataAliasPid;
	}

	public void setTopStepKey(short topStepKey) {
		this.topStepKey = topStepKey;
	}

}
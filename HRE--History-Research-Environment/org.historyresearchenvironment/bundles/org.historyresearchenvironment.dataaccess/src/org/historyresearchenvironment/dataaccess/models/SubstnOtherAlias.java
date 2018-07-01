package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the SUBSTN_OTHER_ALIASES database table.
 * 
 */
// @Entity
// @Table(name="SUBSTN_OTHER_ALIASES")
// @NamedQuery(name="SubstnOtherAlias.findAll", query="SELECT s FROM
// SubstnOtherAlias s")
public class SubstnOtherAlias implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private boolean isSystem;
	private boolean isTextLayoutRelated;
	private boolean isTextStyleRelated;
	private short outputSubTypeKey;
	private short outputTypeKey;
	private short paramListKey;
	private short reminderKey;
	private short requesterSubTypeKey;
	private short requesterTypeKey;
	private short setKey;
	private boolean show;
	private int substnOtherAliasPid;
	private short topStepKey;

	public SubstnOtherAlias() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="IS_TEXT_LAYOUT_RELATED")
	public boolean getIsTextLayoutRelated() {
		return this.isTextLayoutRelated;
	}

	// @Column(name="IS_TEXT_STYLE_RELATED")
	public boolean getIsTextStyleRelated() {
		return this.isTextStyleRelated;
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

	// @Column(name="SUBSTN_OTHER_ALIAS_PID", nullable=false)
	public int getSubstnOtherAliasPid() {
		return this.substnOtherAliasPid;
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

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setIsTextLayoutRelated(boolean isTextLayoutRelated) {
		this.isTextLayoutRelated = isTextLayoutRelated;
	}

	public void setIsTextStyleRelated(boolean isTextStyleRelated) {
		this.isTextStyleRelated = isTextStyleRelated;
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

	public void setSubstnOtherAliasPid(int substnOtherAliasPid) {
		this.substnOtherAliasPid = substnOtherAliasPid;
	}

	public void setTopStepKey(short topStepKey) {
		this.topStepKey = topStepKey;
	}

}
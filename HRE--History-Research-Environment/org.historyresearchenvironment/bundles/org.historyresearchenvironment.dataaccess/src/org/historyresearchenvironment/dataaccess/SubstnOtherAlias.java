package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the SUBSTN_OTHER_ALIASES database table.
 * 
 */
// @Entity
// @Table(name="SUBSTN_OTHER_ALIASES")
// @NamedQuery(name="SubstnOtherAlias.findAll", query="SELECT s FROM SubstnOtherAlias s")
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


	// @Column(name="IS_TEXT_LAYOUT_RELATED")
	public boolean getIsTextLayoutRelated() {
		return this.isTextLayoutRelated;
	}

	public void setIsTextLayoutRelated(boolean isTextLayoutRelated) {
		this.isTextLayoutRelated = isTextLayoutRelated;
	}


	// @Column(name="IS_TEXT_STYLE_RELATED")
	public boolean getIsTextStyleRelated() {
		return this.isTextStyleRelated;
	}

	public void setIsTextStyleRelated(boolean isTextStyleRelated) {
		this.isTextStyleRelated = isTextStyleRelated;
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


	// @Column(name="SUBSTN_OTHER_ALIAS_PID", nullable=false)
	public int getSubstnOtherAliasPid() {
		return this.substnOtherAliasPid;
	}

	public void setSubstnOtherAliasPid(int substnOtherAliasPid) {
		this.substnOtherAliasPid = substnOtherAliasPid;
	}


	// @Column(name="TOP_STEP_KEY")
	public short getTopStepKey() {
		return this.topStepKey;
	}

	public void setTopStepKey(short topStepKey) {
		this.topStepKey = topStepKey;
	}

}
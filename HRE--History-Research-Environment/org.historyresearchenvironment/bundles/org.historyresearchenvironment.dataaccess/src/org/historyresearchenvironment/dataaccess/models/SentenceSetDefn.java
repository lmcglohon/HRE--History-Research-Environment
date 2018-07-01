package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the SENTENCE_SET_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="SENTENCE_SET_DEFNS")
// @NamedQuery(name="SentenceSetDefn.findAll", query="SELECT s FROM
// SentenceSetDefn s")
public class SentenceSetDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private boolean isDefault;
	private boolean isSystem;
	private short parentTagPid;
	private short parentTagTypeKey;
	private short reminderKey;
	private short sentceStyleTypeKey;
	private int sentenceSetDefnPid;
	private short setKey;
	private boolean show;

	public SentenceSetDefn() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="PARENT_TAG_PID")
	public short getParentTagPid() {
		return this.parentTagPid;
	}

	// @Column(name="PARENT_TAG_TYPE_KEY")
	public short getParentTagTypeKey() {
		return this.parentTagTypeKey;
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

	// @Column(name="SENTCE_STYLE_TYPE_KEY")
	public short getSentceStyleTypeKey() {
		return this.sentceStyleTypeKey;
	}

	// @Column(name="SENTENCE_SET_DEFN_PID", nullable=false)
	public int getSentenceSetDefnPid() {
		return this.sentenceSetDefnPid;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setParentTagPid(short parentTagPid) {
		this.parentTagPid = parentTagPid;
	}

	public void setParentTagTypeKey(short parentTagTypeKey) {
		this.parentTagTypeKey = parentTagTypeKey;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}

	public void setSentceStyleTypeKey(short sentceStyleTypeKey) {
		this.sentceStyleTypeKey = sentceStyleTypeKey;
	}

	public void setSentenceSetDefnPid(int sentenceSetDefnPid) {
		this.sentenceSetDefnPid = sentenceSetDefnPid;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

}
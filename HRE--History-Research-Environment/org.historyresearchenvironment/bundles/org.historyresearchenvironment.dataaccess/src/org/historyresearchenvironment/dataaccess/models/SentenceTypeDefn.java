package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;


/**
 * The persistent class for the SENTENCE_TYPE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="SENTENCE_TYPE_DEFNS")
// @NamedQuery(name="SentenceTypeDefn.findAll", query="SELECT s FROM SentenceTypeDefn s")
public class SentenceTypeDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private boolean isDefault;
	private boolean isSystem;
	private short reminderKey;
	private short requesterSubTypeKey;
	private short requesterTypeKey;
	private short requesterTypePid;
	private int sentenceTypeDefnPid;
	private short setKey;
	private boolean show;

	public SentenceTypeDefn() {
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


	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
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


	// @Column(name="REQUESTER_TYPE_PID")
	public short getRequesterTypePid() {
		return this.requesterTypePid;
	}

	public void setRequesterTypePid(short requesterTypePid) {
		this.requesterTypePid = requesterTypePid;
	}


	// @Column(name="SENTENCE_TYPE_DEFN_PID", nullable=false)
	public int getSentenceTypeDefnPid() {
		return this.sentenceTypeDefnPid;
	}

	public void setSentenceTypeDefnPid(int sentenceTypeDefnPid) {
		this.sentenceTypeDefnPid = sentenceTypeDefnPid;
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

}
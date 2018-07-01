package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the SENTENCE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="SENTENCE_DEFNS")
// @NamedQuery(name="SentenceDefn.findAll", query="SELECT s FROM SentenceDefn
// s")
public class SentenceDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private boolean isSystem;
	private short pluginKey;
	private short publishTypeKey;
	private int requesterPid;
	private short requesterSubTypeKey;
	private short requesterTypeKey;
	private short sentceStyleTypeKey;
	private short sentenceSetKey;
	private int sentenceTemplateDefnPid;
	private short setKey;

	public SentenceDefn() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="PLUGIN_KEY")
	public short getPluginKey() {
		return this.pluginKey;
	}

	// @Column(name="PUBLISH_TYPE_KEY")
	public short getPublishTypeKey() {
		return this.publishTypeKey;
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	// @Column(name="REQUESTER_PID")
	public int getRequesterPid() {
		return this.requesterPid;
	}

	// @Column(name="REQUESTER_SUB_TYPE_KEY")
	public short getRequesterSubTypeKey() {
		return this.requesterSubTypeKey;
	}

	// @Column(name="REQUESTER_TYPE_KEY")
	public short getRequesterTypeKey() {
		return this.requesterTypeKey;
	}

	// @Column(name="SENTCE_STYLE_TYPE_KEY")
	public short getSentceStyleTypeKey() {
		return this.sentceStyleTypeKey;
	}

	// @Column(name="SENTENCE_SET_KEY")
	public short getSentenceSetKey() {
		return this.sentenceSetKey;
	}

	// @Column(name="SENTENCE_TEMPLATE_DEFN_PID", nullable=false)
	public int getSentenceTemplateDefnPid() {
		return this.sentenceTemplateDefnPid;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setPluginKey(short pluginKey) {
		this.pluginKey = pluginKey;
	}

	public void setPublishTypeKey(short publishTypeKey) {
		this.publishTypeKey = publishTypeKey;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRequesterPid(int requesterPid) {
		this.requesterPid = requesterPid;
	}

	public void setRequesterSubTypeKey(short requesterSubTypeKey) {
		this.requesterSubTypeKey = requesterSubTypeKey;
	}

	public void setRequesterTypeKey(short requesterTypeKey) {
		this.requesterTypeKey = requesterTypeKey;
	}

	public void setSentceStyleTypeKey(short sentceStyleTypeKey) {
		this.sentceStyleTypeKey = sentceStyleTypeKey;
	}

	public void setSentenceSetKey(short sentenceSetKey) {
		this.sentenceSetKey = sentenceSetKey;
	}

	public void setSentenceTemplateDefnPid(int sentenceTemplateDefnPid) {
		this.sentenceTemplateDefnPid = sentenceTemplateDefnPid;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

}
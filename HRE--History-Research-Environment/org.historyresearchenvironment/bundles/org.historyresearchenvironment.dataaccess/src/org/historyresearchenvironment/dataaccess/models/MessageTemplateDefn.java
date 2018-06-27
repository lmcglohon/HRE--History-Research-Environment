package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;


/**
 * The persistent class for the MESSAGE_TEMPLATE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="MESSAGE_TEMPLATE_DEFNS")
// @NamedQuery(name="MessageTemplateDefn.findAll", query="SELECT m FROM MessageTemplateDefn m")
public class MessageTemplateDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private boolean isError;
	private int messageTemplateDefnPid;
	private short pluginKey;
	private int requesterPid;
	private short requesterSubTypeKey;
	private short requesterTypeKey;
	private short setKey;
	private short siteKey;

	public MessageTemplateDefn() {
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


	// @Column(name="IS_ERROR")
	public boolean getIsError() {
		return this.isError;
	}

	public void setIsError(boolean isError) {
		this.isError = isError;
	}


	// @Column(name="MESSAGE_TEMPLATE_DEFN_PID", nullable=false)
	public int getMessageTemplateDefnPid() {
		return this.messageTemplateDefnPid;
	}

	public void setMessageTemplateDefnPid(int messageTemplateDefnPid) {
		this.messageTemplateDefnPid = messageTemplateDefnPid;
	}


	// @Column(name="PLUGIN_KEY")
	public short getPluginKey() {
		return this.pluginKey;
	}

	public void setPluginKey(short pluginKey) {
		this.pluginKey = pluginKey;
	}


	// @Column(name="REQUESTER_PID")
	public int getRequesterPid() {
		return this.requesterPid;
	}

	public void setRequesterPid(int requesterPid) {
		this.requesterPid = requesterPid;
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


	// @Column(name="SITE_KEY")
	public short getSiteKey() {
		return this.siteKey;
	}

	public void setSiteKey(short siteKey) {
		this.siteKey = siteKey;
	}

}
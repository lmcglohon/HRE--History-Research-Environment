package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MESSAGES_TRANS database table.
 * 
 */
@Entity
@Table(name = "MESSAGES_TRANS")
@NamedQuery(name = "MessagesTran.findAll", query = "SELECT m FROM MessagesTran m")
public class MessagesTran extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "ENCODING_KEY")
	private short encodingKey;

	@Column(name = "IS_ERROR")
	private boolean isError;

	@Column(name = "LANG_CODE")
	private String langCode;

	private String message;

	@Column(name = "MESSAGES_TRAN_PID")
	private int messagesTranPid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PLUGIN_PID")
	private short pluginPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	@Column(name = "REQUESTER_KEY")
	private short requesterKey;

	@Column(name = "REQUESTER_PID")
	private int requesterPid;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public MessagesTran() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#delete(int)
	 */
	@Override
	protected int delete(int recordNum) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#get(int)
	 */
	@Override
	protected AbstractHreTableRow get(int recordNum) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCommitPid() {
		return this.commitPid;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public short getEncodingKey() {
		return this.encodingKey;
	}

	public boolean getIsError() {
		return this.isError;
	}

	public String getLangCode() {
		return this.langCode;
	}

	public String getMessage() {
		return this.message;
	}

	public int getMessagesTranPid() {
		return this.messagesTranPid;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public short getPluginPid() {
		return this.pluginPid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public short getRequesterKey() {
		return this.requesterKey;
	}

	public int getRequesterPid() {
		return this.requesterPid;
	}

	public short getRights() {
		return this.rights;
	}

	public short getSetPid() {
		return this.setPid;
	}

	public int getVisibleId() {
		return this.visibleId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#post()
	 */
	@Override
	protected int post() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#put()
	 */
	@Override
	protected int put() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setEncodingKey(short encodingKey) {
		this.encodingKey = encodingKey;
	}

	public void setIsError(boolean isError) {
		this.isError = isError;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setMessagesTranPid(int messagesTranPid) {
		this.messagesTranPid = messagesTranPid;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setPluginPid(short pluginPid) {
		this.pluginPid = pluginPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRequesterKey(short requesterKey) {
		this.requesterKey = requesterKey;
	}

	public void setRequesterPid(int requesterPid) {
		this.requesterPid = requesterPid;
	}

	public void setRights(short rights) {
		this.rights = rights;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
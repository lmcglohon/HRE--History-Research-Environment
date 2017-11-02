package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SENTENCE_TRANS database table.
 * 
 */
@Entity
@Table(name = "SENTENCE_TRANS")
@NamedQuery(name = "SentenceTran.findAll", query = "SELECT s FROM SentenceTran s")
public class SentenceTran extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "ENCODING_KEY")
	private short encodingKey;

	@Column(name = "LANG_CODE")
	private String langCode;

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

	private String sentence;

	@Column(name = "SENTENCE_TRAN_PID")
	private int sentenceTranPid;

	@Column(name = "SENTENCE_TRANS_PID")
	private int sentenceTransPid;

	@Column(name = "SENTENCE_TYPE_KEY")
	private short sentenceTypeKey;

	@Column(name = "SENTENCE_TYPE_PID")
	private short sentenceTypePid;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public SentenceTran() {
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

	public String getLangCode() {
		return this.langCode;
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

	public String getSentence() {
		return this.sentence;
	}

	public int getSentenceTranPid() {
		return this.sentenceTranPid;
	}

	public int getSentenceTransPid() {
		return this.sentenceTransPid;
	}

	public short getSentenceTypeKey() {
		return this.sentenceTypeKey;
	}

	public short getSentenceTypePid() {
		return this.sentenceTypePid;
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

	public void setLangCode(String langCode) {
		this.langCode = langCode;
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

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public void setSentenceTranPid(int sentenceTranPid) {
		this.sentenceTranPid = sentenceTranPid;
	}

	public void setSentenceTransPid(int sentenceTransPid) {
		this.sentenceTransPid = sentenceTransPid;
	}

	public void setSentenceTypeKey(short sentenceTypeKey) {
		this.sentenceTypeKey = sentenceTypeKey;
	}

	public void setSentenceTypePid(short sentenceTypePid) {
		this.sentenceTypePid = sentenceTypePid;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
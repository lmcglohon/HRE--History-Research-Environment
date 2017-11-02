package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SENTENCE_TYPE_DEFNS database table.
 * 
 */
@Entity
@Table(name = "SENTENCE_TYPE_DEFNS")
@NamedQuery(name = "SentenceTypeDefn.findAll", query = "SELECT s FROM SentenceTypeDefn s")
public class SentenceTypeDefn extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "IS_DFLT_SENTENCE")
	private boolean isDfltSentence;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	@Column(name = "REQUESTER_TYPE_PID")
	private short requesterTypePid;

	@Column(name = "REQUESTER_TYPE_TBL")
	private short requesterTypeTbl;

	private short rights;

	@Column(name = "SENTENCE_TYPE_DEFN_PID")
	private int sentenceTypeDefnPid;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public SentenceTypeDefn() {
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

	public boolean getIsDfltSentence() {
		return this.isDfltSentence;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public short getRequesterTypePid() {
		return this.requesterTypePid;
	}

	public short getRequesterTypeTbl() {
		return this.requesterTypeTbl;
	}

	public short getRights() {
		return this.rights;
	}

	public int getSentenceTypeDefnPid() {
		return this.sentenceTypeDefnPid;
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

	public void setIsDfltSentence(boolean isDfltSentence) {
		this.isDfltSentence = isDfltSentence;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRequesterTypePid(short requesterTypePid) {
		this.requesterTypePid = requesterTypePid;
	}

	public void setRequesterTypeTbl(short requesterTypeTbl) {
		this.requesterTypeTbl = requesterTypeTbl;
	}

	public void setRights(short rights) {
		this.rights = rights;
	}

	public void setSentenceTypeDefnPid(int sentenceTypeDefnPid) {
		this.sentenceTypeDefnPid = sentenceTypeDefnPid;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
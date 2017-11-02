package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the CITATIONS database table.
 * 
 */
@Entity
@Table(name = "CITATIONS")
@NamedQuery(name = "Citation.findAll", query = "SELECT c FROM Citation c")
public class Citation extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "ATTACH_TO_KEY")
	private short attachToKey;

	@Column(name = "ATTACH_TO_PID")
	private int attachToPid;

	@Column(name = "CITATION_PID")
	private int citationPid;

	@Column(name = "CITN_MEMOS_PID")
	private int citnMemosPid;

	@Column(name = "CITN_SURETY")
	private String citnSurety;

	@Column(name = "CITN_TAG_KEY")
	private short citnTagKey;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SOURCE_PID")
	private int sourcePid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public Citation() {
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

	public short getAttachToKey() {
		return this.attachToKey;
	}

	public int getAttachToPid() {
		return this.attachToPid;
	}

	public int getCitationPid() {
		return this.citationPid;
	}

	public int getCitnMemosPid() {
		return this.citnMemosPid;
	}

	public String getCitnSurety() {
		return this.citnSurety;
	}

	public short getCitnTagKey() {
		return this.citnTagKey;
	}

	public int getCommitPid() {
		return this.commitPid;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public short getRights() {
		return this.rights;
	}

	public short getSetPid() {
		return this.setPid;
	}

	public int getSourcePid() {
		return this.sourcePid;
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

	public void setAttachToKey(short attachToKey) {
		this.attachToKey = attachToKey;
	}

	public void setAttachToPid(int attachToPid) {
		this.attachToPid = attachToPid;
	}

	public void setCitationPid(int citationPid) {
		this.citationPid = citationPid;
	}

	public void setCitnMemosPid(int citnMemosPid) {
		this.citnMemosPid = citnMemosPid;
	}

	public void setCitnSurety(String citnSurety) {
		this.citnSurety = citnSurety;
	}

	public void setCitnTagKey(short citnTagKey) {
		this.citnTagKey = citnTagKey;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRights(short rights) {
		this.rights = rights;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setSourcePid(int sourcePid) {
		this.sourcePid = sourcePid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
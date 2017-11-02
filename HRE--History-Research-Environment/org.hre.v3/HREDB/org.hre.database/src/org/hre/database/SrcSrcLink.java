package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SRC_SRC_LINKS database table.
 * 
 */
@Entity
@Table(name = "SRC_SRC_LINKS")
@NamedQuery(name = "SrcSrcLink.findAll", query = "SELECT s FROM SrcSrcLink s")
public class SrcSrcLink extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "HAS_CITATIONS")
	private boolean hasCitations;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SOURCE1_PID")
	private int source1Pid;

	@Column(name = "SOURCE2_PID")
	private int source2Pid;

	@Column(name = "SRC_SRC_LINK_PID")
	private int srcSrcLinkPid;

	@Column(name = "SRC_SRC_TAG_KEY")
	private short srcSrcTagKey;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public SrcSrcLink() {
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

	public boolean getHasCitations() {
		return this.hasCitations;
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

	public int getSource1Pid() {
		return this.source1Pid;
	}

	public int getSource2Pid() {
		return this.source2Pid;
	}

	public int getSrcSrcLinkPid() {
		return this.srcSrcLinkPid;
	}

	public short getSrcSrcTagKey() {
		return this.srcSrcTagKey;
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

	public void setHasCitations(boolean hasCitations) {
		this.hasCitations = hasCitations;
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

	public void setSource1Pid(int source1Pid) {
		this.source1Pid = source1Pid;
	}

	public void setSource2Pid(int source2Pid) {
		this.source2Pid = source2Pid;
	}

	public void setSrcSrcLinkPid(int srcSrcLinkPid) {
		this.srcSrcLinkPid = srcSrcLinkPid;
	}

	public void setSrcSrcTagKey(short srcSrcTagKey) {
		this.srcSrcTagKey = srcSrcTagKey;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
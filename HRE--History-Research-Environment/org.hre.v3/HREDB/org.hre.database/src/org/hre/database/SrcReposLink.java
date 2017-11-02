package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SRC_REPOS_LINKS database table.
 * 
 */
@Entity
@Table(name = "SRC_REPOS_LINKS")
@NamedQuery(name = "SrcReposLink.findAll", query = "SELECT s FROM SrcReposLink s")
public class SrcReposLink extends AbstractHreTableRow implements Serializable {
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

	@Column(name = "REPOSITORY_PID")
	private int repositoryPid;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SOURCE_PID")
	private int sourcePid;

	@Column(name = "SRC_REP_TAG_KEY")
	private short srcRepTagKey;

	@Column(name = "SRC_REPOS_LINK_PID")
	private int srcReposLinkPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public SrcReposLink() {
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

	public int getRepositoryPid() {
		return this.repositoryPid;
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

	public int getSrcReposLinkPid() {
		return this.srcReposLinkPid;
	}

	public short getSrcRepTagKey() {
		return this.srcRepTagKey;
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

	public void setRepositoryPid(int repositoryPid) {
		this.repositoryPid = repositoryPid;
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

	public void setSrcReposLinkPid(int srcReposLinkPid) {
		this.srcReposLinkPid = srcReposLinkPid;
	}

	public void setSrcRepTagKey(short srcRepTagKey) {
		this.srcRepTagKey = srcRepTagKey;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
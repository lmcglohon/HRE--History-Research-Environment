package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the LOCN_REPOS_LINKS database table.
 * 
 */
@Entity
@Table(name = "LOCN_REPOS_LINKS")
@NamedQuery(name = "LocnReposLink.findAll", query = "SELECT l FROM LocnReposLink l")
public class LocnReposLink extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "RECORD_NUM")
	private int recordNum;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "HAS_CITATIONS")
	private boolean hasCitations;

	@Column(name = "LOCATION_PID")
	private int locationPid;

	@Column(name = "LOCN_REPOS_LINK_PID")
	private int locnReposLinkPid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "REP_LOCN_MEMOS_PID")
	private int repLocnMemosPid;

	@Column(name = "REP_LOCN_SENTCE_PID")
	private int repLocnSentcePid;

	@Column(name = "REPOSITORY_PID")
	private int repositoryPid;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public LocnReposLink() {
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

	public int getLocationPid() {
		return this.locationPid;
	}

	public int getLocnReposLinkPid() {
		return this.locnReposLinkPid;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public int getRepLocnMemosPid() {
		return this.repLocnMemosPid;
	}

	public int getRepLocnSentcePid() {
		return this.repLocnSentcePid;
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

	public void setLocationPid(int locationPid) {
		this.locationPid = locationPid;
	}

	public void setLocnReposLinkPid(int locnReposLinkPid) {
		this.locnReposLinkPid = locnReposLinkPid;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRepLocnMemosPid(int repLocnMemosPid) {
		this.repLocnMemosPid = repLocnMemosPid;
	}

	public void setRepLocnSentcePid(int repLocnSentcePid) {
		this.repLocnSentcePid = repLocnSentcePid;
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

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
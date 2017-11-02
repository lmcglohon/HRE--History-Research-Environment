package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SUBSET_FILTER_JOINS database table.
 * 
 */
@Entity
@Table(name = "SUBSET_FILTER_JOINS")
@NamedQuery(name = "SubsetFilterJoin.findAll", query = "SELECT s FROM SubsetFilterJoin s")
public class SubsetFilterJoin extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "A_SUBSET_PID")
	private int aSubsetPid;

	@Column(name = "B_SUBSET_PID")
	private int bSubsetPid;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "IS_TEMP_RESULT")
	private boolean isTempResult;

	@Column(name = "OPERATION_KEY")
	private int operationKey;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	@Column(name = "RESULT_SUBSET_PID")
	private int resultSubsetPid;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SUBSET_JOIN_PID")
	private int subsetJoinPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public SubsetFilterJoin() {
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

	public int getASubsetPid() {
		return this.aSubsetPid;
	}

	public int getBSubsetPid() {
		return this.bSubsetPid;
	}

	public int getCommitPid() {
		return this.commitPid;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public boolean getIsTempResult() {
		return this.isTempResult;
	}

	public int getOperationKey() {
		return this.operationKey;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public int getResultSubsetPid() {
		return this.resultSubsetPid;
	}

	public short getRights() {
		return this.rights;
	}

	public short getSetPid() {
		return this.setPid;
	}

	public int getSubsetJoinPid() {
		return this.subsetJoinPid;
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

	public void setASubsetPid(int aSubsetPid) {
		this.aSubsetPid = aSubsetPid;
	}

	public void setBSubsetPid(int bSubsetPid) {
		this.bSubsetPid = bSubsetPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setIsTempResult(boolean isTempResult) {
		this.isTempResult = isTempResult;
	}

	public void setOperationKey(int operationKey) {
		this.operationKey = operationKey;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setResultSubsetPid(int resultSubsetPid) {
		this.resultSubsetPid = resultSubsetPid;
	}

	public void setRights(short rights) {
		this.rights = rights;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setSubsetJoinPid(int subsetJoinPid) {
		this.subsetJoinPid = subsetJoinPid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
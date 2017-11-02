package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SUBSET_FILTER_ACTIONS database table.
 * 
 */
@Entity
@Table(name = "SUBSET_FILTER_ACTIONS")
@NamedQuery(name = "SubsetFilterAction.findAll", query = "SELECT s FROM SubsetFilterAction s")
public class SubsetFilterAction extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "ACTION_HAS_PARAMS")
	private boolean actionHasParams;

	@Column(name = "ACTION_KEY")
	private int actionKey;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "IS_TEMP_RESULT")
	private boolean isTempResult;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	@Column(name = "RESULT_SUBSET_PID")
	private int resultSubsetPid;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SUBSET_ACTION_PID")
	private int subsetActionPid;

	@Column(name = "TARGET_OBJ_PID")
	private int targetObjPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public SubsetFilterAction() {
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

	public boolean getActionHasParams() {
		return this.actionHasParams;
	}

	public int getActionKey() {
		return this.actionKey;
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

	public int getSubsetActionPid() {
		return this.subsetActionPid;
	}

	public int getTargetObjPid() {
		return this.targetObjPid;
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

	public void setActionHasParams(boolean actionHasParams) {
		this.actionHasParams = actionHasParams;
	}

	public void setActionKey(int actionKey) {
		this.actionKey = actionKey;
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

	public void setSubsetActionPid(int subsetActionPid) {
		this.subsetActionPid = subsetActionPid;
	}

	public void setTargetObjPid(int targetObjPid) {
		this.targetObjPid = targetObjPid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
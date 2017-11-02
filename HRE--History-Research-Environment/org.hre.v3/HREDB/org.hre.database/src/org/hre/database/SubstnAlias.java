package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SUBSTN_ALIASES database table.
 * 
 */
@Entity
@Table(name = "SUBSTN_ALIASES")
@NamedQuery(name = "SubstnAlias.findAll", query = "SELECT s FROM SubstnAlias s")
public class SubstnAlias extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "FOR_SUBSETS")
	private boolean forSubsets;

	@Column(name = "HEAD_TYPE_KEY")
	private int headTypeKey;

	@Column(name = "IS_COMPLETE")
	private boolean isComplete;

	@Column(name = "IS_DATA_ALIAS")
	private boolean isDataAlias;

	@Column(name = "IS_DATA_HEAD")
	private boolean isDataHead;

	@Column(name = "IS_DATA_TAIL")
	private boolean isDataTail;

	@Column(name = "IS_TEST_ALIAS")
	private boolean isTestAlias;

	@Column(name = "NAME_STYLE_KEY")
	private short nameStyleKey;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PARENT_TYPE_KEY")
	private short parentTypeKey;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SUBSTN_ALIAS_PID")
	private int substnAliasPid;

	@Column(name = "TAIL_TYPE_KEY")
	private int tailTypeKey;

	@Column(name = "THIS_TYPE_KEY")
	private short thisTypeKey;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public SubstnAlias() {
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

	public boolean getForSubsets() {
		return this.forSubsets;
	}

	public int getHeadTypeKey() {
		return this.headTypeKey;
	}

	public boolean getIsComplete() {
		return this.isComplete;
	}

	public boolean getIsDataAlias() {
		return this.isDataAlias;
	}

	public boolean getIsDataHead() {
		return this.isDataHead;
	}

	public boolean getIsDataTail() {
		return this.isDataTail;
	}

	public boolean getIsTestAlias() {
		return this.isTestAlias;
	}

	public short getNameStyleKey() {
		return this.nameStyleKey;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public short getParentTypeKey() {
		return this.parentTypeKey;
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

	public int getSubstnAliasPid() {
		return this.substnAliasPid;
	}

	public int getTailTypeKey() {
		return this.tailTypeKey;
	}

	public short getThisTypeKey() {
		return this.thisTypeKey;
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

	public void setForSubsets(boolean forSubsets) {
		this.forSubsets = forSubsets;
	}

	public void setHeadTypeKey(int headTypeKey) {
		this.headTypeKey = headTypeKey;
	}

	public void setIsComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

	public void setIsDataAlias(boolean isDataAlias) {
		this.isDataAlias = isDataAlias;
	}

	public void setIsDataHead(boolean isDataHead) {
		this.isDataHead = isDataHead;
	}

	public void setIsDataTail(boolean isDataTail) {
		this.isDataTail = isDataTail;
	}

	public void setIsTestAlias(boolean isTestAlias) {
		this.isTestAlias = isTestAlias;
	}

	public void setNameStyleKey(short nameStyleKey) {
		this.nameStyleKey = nameStyleKey;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setParentTypeKey(short parentTypeKey) {
		this.parentTypeKey = parentTypeKey;
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

	public void setSubstnAliasPid(int substnAliasPid) {
		this.substnAliasPid = substnAliasPid;
	}

	public void setTailTypeKey(int tailTypeKey) {
		this.tailTypeKey = tailTypeKey;
	}

	public void setThisTypeKey(short thisTypeKey) {
		this.thisTypeKey = thisTypeKey;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
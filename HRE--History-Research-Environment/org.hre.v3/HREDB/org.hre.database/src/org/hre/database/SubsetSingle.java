package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SUBSET_SINGLES database table.
 * 
 */
@Entity
@Table(name = "SUBSET_SINGLES")
@NamedQuery(name = "SubsetSingle.findAll", query = "SELECT s FROM SubsetSingle s")
public class SubsetSingle extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	@Column(name = "REFER_PID")
	private int referPid;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SUBSET_PID")
	private int subsetPid;

	@Column(name = "SUBSET_SINGLE_PID")
	private int subsetSinglePid;

	@Column(name = "USE_ORDER")
	private int useOrder;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public SubsetSingle() {
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

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public int getReferPid() {
		return this.referPid;
	}

	public short getRights() {
		return this.rights;
	}

	public short getSetPid() {
		return this.setPid;
	}

	public int getSubsetPid() {
		return this.subsetPid;
	}

	public int getSubsetSinglePid() {
		return this.subsetSinglePid;
	}

	public int getUseOrder() {
		return this.useOrder;
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

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReferPid(int referPid) {
		this.referPid = referPid;
	}

	public void setRights(short rights) {
		this.rights = rights;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setSubsetPid(int subsetPid) {
		this.subsetPid = subsetPid;
	}

	public void setSubsetSinglePid(int subsetSinglePid) {
		this.subsetSinglePid = subsetSinglePid;
	}

	public void setUseOrder(int useOrder) {
		this.useOrder = useOrder;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
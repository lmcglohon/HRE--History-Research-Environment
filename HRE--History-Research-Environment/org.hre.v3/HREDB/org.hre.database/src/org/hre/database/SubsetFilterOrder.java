package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SUBSET_FILTER_ORDERS database table.
 * 
 */
@Entity
@Table(name = "SUBSET_FILTER_ORDERS")
@NamedQuery(name = "SubsetFilterOrder.findAll", query = "SELECT s FROM SubsetFilterOrder s")
public class SubsetFilterOrder extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "NEXT_ALIAS_KEY")
	private int nextAliasKey;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PREV_ALIAS_KEY")
	private int prevAliasKey;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SUBSET_FILTER_ORDER_PID")
	private int subsetFilterOrderPid;

	@Column(name = "THIS_ALIAS_KEY")
	private int thisAliasKey;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public SubsetFilterOrder() {
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

	public int getNextAliasKey() {
		return this.nextAliasKey;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getPrevAliasKey() {
		return this.prevAliasKey;
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

	public int getSubsetFilterOrderPid() {
		return this.subsetFilterOrderPid;
	}

	public int getThisAliasKey() {
		return this.thisAliasKey;
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

	public void setNextAliasKey(int nextAliasKey) {
		this.nextAliasKey = nextAliasKey;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setPrevAliasKey(int prevAliasKey) {
		this.prevAliasKey = prevAliasKey;
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

	public void setSubsetFilterOrderPid(int subsetFilterOrderPid) {
		this.subsetFilterOrderPid = subsetFilterOrderPid;
	}

	public void setThisAliasKey(int thisAliasKey) {
		this.thisAliasKey = thisAliasKey;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the FLAG_STATE_DEFNS database table.
 * 
 */
@Entity
@Table(name = "FLAG_STATE_DEFNS")
@NamedQuery(name = "FlagStateDefn.findAll", query = "SELECT f FROM FlagStateDefn f")
public class FlagStateDefn extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COLLECTION_KEY")
	private int collectionKey;

	@Column(name = "COLLECTION_PID")
	private int collectionPid;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "DISP_ORDER")
	private short dispOrder;

	@Column(name = "FLAG_STATE_DEFN_PID")
	private int flagStateDefnPid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PARENT_FLAG_PID")
	private short parentFlagPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "STATE_VALUE")
	private short stateValue;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public FlagStateDefn() {
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

	public int getCollectionKey() {
		return this.collectionKey;
	}

	public int getCollectionPid() {
		return this.collectionPid;
	}

	public int getCommitPid() {
		return this.commitPid;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public short getDispOrder() {
		return this.dispOrder;
	}

	public int getFlagStateDefnPid() {
		return this.flagStateDefnPid;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public short getParentFlagPid() {
		return this.parentFlagPid;
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

	public short getStateValue() {
		return this.stateValue;
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

	public void setCollectionKey(int collectionKey) {
		this.collectionKey = collectionKey;
	}

	public void setCollectionPid(int collectionPid) {
		this.collectionPid = collectionPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setDispOrder(short dispOrder) {
		this.dispOrder = dispOrder;
	}

	public void setFlagStateDefnPid(int flagStateDefnPid) {
		this.flagStateDefnPid = flagStateDefnPid;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setParentFlagPid(short parentFlagPid) {
		this.parentFlagPid = parentFlagPid;
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

	public void setStateValue(short stateValue) {
		this.stateValue = stateValue;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
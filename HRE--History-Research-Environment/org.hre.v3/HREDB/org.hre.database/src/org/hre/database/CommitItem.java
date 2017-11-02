package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the COMMIT_ITEMS database table.
 * 
 */
@Entity
@Table(name = "COMMIT_ITEMS")
@NamedQuery(name = "CommitItem.findAll", query = "SELECT c FROM CommitItem c")
public class CommitItem extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_ITEM_PID")
	private int commitItemPid;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PARENT_CMT_PID")
	private int parentCmtPid;

	@Column(name = "PREV_CMT_PID")
	private int prevCmtPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	@Column(name = "RECORD_PID")
	private int recordPid;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "TABLE_PID")
	private short tablePid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public CommitItem() {
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

	public int getCommitItemPid() {
		return this.commitItemPid;
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

	public int getParentCmtPid() {
		return this.parentCmtPid;
	}

	public int getPrevCmtPid() {
		return this.prevCmtPid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public int getRecordPid() {
		return this.recordPid;
	}

	public short getRights() {
		return this.rights;
	}

	public short getSetPid() {
		return this.setPid;
	}

	public short getTablePid() {
		return this.tablePid;
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

	public void setCommitItemPid(int commitItemPid) {
		this.commitItemPid = commitItemPid;
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

	public void setParentCmtPid(int parentCmtPid) {
		this.parentCmtPid = parentCmtPid;
	}

	public void setPrevCmtPid(int prevCmtPid) {
		this.prevCmtPid = prevCmtPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRecordPid(int recordPid) {
		this.recordPid = recordPid;
	}

	public void setRights(short rights) {
		this.rights = rights;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setTablePid(short tablePid) {
		this.tablePid = tablePid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
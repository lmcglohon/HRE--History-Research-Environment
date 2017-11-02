package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SUBSET_FILTER_DEFNS database table.
 * 
 */
@Entity
@Table(name = "SUBSET_FILTER_DEFNS")
@NamedQuery(name = "SubsetFilterDefn.findAll", query = "SELECT s FROM SubsetFilterDefn s")
public class SubsetFilterDefn extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "FILTER_START_PID")
	private short filterStartPid;

	@Column(name = "INPUT_TYPE_KEY")
	private short inputTypeKey;

	@Column(name = "OUTPUT_TYPE_KEY")
	private short outputTypeKey;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SUBSET_FILTER_DEFN_PID")
	private int subsetFilterDefnPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public SubsetFilterDefn() {
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

	public short getFilterStartPid() {
		return this.filterStartPid;
	}

	public short getInputTypeKey() {
		return this.inputTypeKey;
	}

	public short getOutputTypeKey() {
		return this.outputTypeKey;
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

	public int getSubsetFilterDefnPid() {
		return this.subsetFilterDefnPid;
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

	public void setFilterStartPid(short filterStartPid) {
		this.filterStartPid = filterStartPid;
	}

	public void setInputTypeKey(short inputTypeKey) {
		this.inputTypeKey = inputTypeKey;
	}

	public void setOutputTypeKey(short outputTypeKey) {
		this.outputTypeKey = outputTypeKey;
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

	public void setSubsetFilterDefnPid(int subsetFilterDefnPid) {
		this.subsetFilterDefnPid = subsetFilterDefnPid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
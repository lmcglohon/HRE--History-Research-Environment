package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;


/**
 * The persistent class for the SUBSET_SINGLE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="SUBSET_SINGLE_DEFNS")
// @NamedQuery(name="SubsetSingleDefn.findAll", query="SELECT s FROM SubsetSingleDefn s")
public class SubsetSingleDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private int count;
	private int referPid;
	private short setKey;
	private int subsetPid;
	private int subsetSingleDefnPid;
	private int useOrder;

	public SubsetSingleDefn() {
	}


	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}


	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}


	// @Column(name="REFER_PID")
	public int getReferPid() {
		return this.referPid;
	}

	public void setReferPid(int referPid) {
		this.referPid = referPid;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(name="SUBSET_PID")
	public int getSubsetPid() {
		return this.subsetPid;
	}

	public void setSubsetPid(int subsetPid) {
		this.subsetPid = subsetPid;
	}


	// @Column(name="SUBSET_SINGLE_DEFN_PID", nullable=false)
	public int getSubsetSingleDefnPid() {
		return this.subsetSingleDefnPid;
	}

	public void setSubsetSingleDefnPid(int subsetSingleDefnPid) {
		this.subsetSingleDefnPid = subsetSingleDefnPid;
	}


	// @Column(name="USE_ORDER")
	public int getUseOrder() {
		return this.useOrder;
	}

	public void setUseOrder(int useOrder) {
		this.useOrder = useOrder;
	}

}
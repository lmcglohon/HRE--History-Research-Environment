package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the SUBSET_SINGLE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="SUBSET_SINGLE_DEFNS")
// @NamedQuery(name="SubsetSingleDefn.findAll", query="SELECT s FROM
// SubsetSingleDefn s")
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

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	public int getCount() {
		return this.count;
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	// @Column(name="REFER_PID")
	public int getReferPid() {
		return this.referPid;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="SUBSET_PID")
	public int getSubsetPid() {
		return this.subsetPid;
	}

	// @Column(name="SUBSET_SINGLE_DEFN_PID", nullable=false)
	public int getSubsetSingleDefnPid() {
		return this.subsetSingleDefnPid;
	}

	// @Column(name="USE_ORDER")
	public int getUseOrder() {
		return this.useOrder;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReferPid(int referPid) {
		this.referPid = referPid;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setSubsetPid(int subsetPid) {
		this.subsetPid = subsetPid;
	}

	public void setSubsetSingleDefnPid(int subsetSingleDefnPid) {
		this.subsetSingleDefnPid = subsetSingleDefnPid;
	}

	public void setUseOrder(int useOrder) {
		this.useOrder = useOrder;
	}

}
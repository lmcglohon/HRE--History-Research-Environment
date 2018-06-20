package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the SUBSET_MIX_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="SUBSET_MIX_DEFNS")
// @NamedQuery(name="SubsetMixDefn.findAll", query="SELECT s FROM SubsetMixDefn s")
public class SubsetMixDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private int refer1Pid;
	private int refer2Pid;
	private short setKey;
	private int subsetMixDefnPid;
	private int subsetPid;
	private int useOrder;

	public SubsetMixDefn() {
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


	// @Column(name="REFER1_PID")
	public int getRefer1Pid() {
		return this.refer1Pid;
	}

	public void setRefer1Pid(int refer1Pid) {
		this.refer1Pid = refer1Pid;
	}


	// @Column(name="REFER2_PID")
	public int getRefer2Pid() {
		return this.refer2Pid;
	}

	public void setRefer2Pid(int refer2Pid) {
		this.refer2Pid = refer2Pid;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(name="SUBSET_MIX_DEFN_PID", nullable=false)
	public int getSubsetMixDefnPid() {
		return this.subsetMixDefnPid;
	}

	public void setSubsetMixDefnPid(int subsetMixDefnPid) {
		this.subsetMixDefnPid = subsetMixDefnPid;
	}


	// @Column(name="SUBSET_PID")
	public int getSubsetPid() {
		return this.subsetPid;
	}

	public void setSubsetPid(int subsetPid) {
		this.subsetPid = subsetPid;
	}


	// @Column(name="USE_ORDER")
	public int getUseOrder() {
		return this.useOrder;
	}

	public void setUseOrder(int useOrder) {
		this.useOrder = useOrder;
	}

}
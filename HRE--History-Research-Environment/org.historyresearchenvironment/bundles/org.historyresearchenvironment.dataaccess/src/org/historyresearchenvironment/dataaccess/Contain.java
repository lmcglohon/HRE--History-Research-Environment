package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the CONTAINS database table.
 * 
 */
// @Entity
// @Table(name="CONTAINS")
// @NamedQuery(name="Contain.findAll", query="SELECT c FROM Contain c")
public class Contain implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int bestCreatePid;
	private int bestDestroyPid;
	private int bestImagePid;
	private int bestNamePid;
	private int commitPid;
	private int containPid;
	private byte[] flags;
	private boolean isSystem;
	private short setKey;
	private short subTypeKey;
	private String surety;
	private int visibleId;

	public Contain() {
	}


	// @Id
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}


	// @Column(name="BEST_CREATE_PID")
	public int getBestCreatePid() {
		return this.bestCreatePid;
	}

	public void setBestCreatePid(int bestCreatePid) {
		this.bestCreatePid = bestCreatePid;
	}


	// @Column(name="BEST_DESTROY_PID")
	public int getBestDestroyPid() {
		return this.bestDestroyPid;
	}

	public void setBestDestroyPid(int bestDestroyPid) {
		this.bestDestroyPid = bestDestroyPid;
	}


	// @Column(name="BEST_IMAGE_PID")
	public int getBestImagePid() {
		return this.bestImagePid;
	}

	public void setBestImagePid(int bestImagePid) {
		this.bestImagePid = bestImagePid;
	}


	// @Column(name="BEST_NAME_PID")
	public int getBestNamePid() {
		return this.bestNamePid;
	}

	public void setBestNamePid(int bestNamePid) {
		this.bestNamePid = bestNamePid;
	}


	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	// @Column(name="CONTAIN_PID", nullable=false)
	public int getContainPid() {
		return this.containPid;
	}

	public void setContainPid(int containPid) {
		this.containPid = containPid;
	}


	public byte[] getFlags() {
		return this.flags;
	}

	public void setFlags(byte[] flags) {
		this.flags = flags;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(name="SUB_TYPE_KEY")
	public short getSubTypeKey() {
		return this.subTypeKey;
	}

	public void setSubTypeKey(short subTypeKey) {
		this.subTypeKey = subTypeKey;
	}


	// @Column(length=10)
	public String getSurety() {
		return this.surety;
	}

	public void setSurety(String surety) {
		this.surety = surety;
	}


	// @Column(name="VISIBLE_ID")
	public int getVisibleId() {
		return this.visibleId;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
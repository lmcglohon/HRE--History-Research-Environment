package org.historyresearchenvironment.dataaccess.models;

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

	// @Column(name="BEST_CREATE_PID")
	public int getBestCreatePid() {
		return this.bestCreatePid;
	}

	// @Column(name="BEST_DESTROY_PID")
	public int getBestDestroyPid() {
		return this.bestDestroyPid;
	}

	// @Column(name="BEST_IMAGE_PID")
	public int getBestImagePid() {
		return this.bestImagePid;
	}

	// @Column(name="BEST_NAME_PID")
	public int getBestNamePid() {
		return this.bestNamePid;
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="CONTAIN_PID", nullable=false)
	public int getContainPid() {
		return this.containPid;
	}

	public byte[] getFlags() {
		return this.flags;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="SUB_TYPE_KEY")
	public short getSubTypeKey() {
		return this.subTypeKey;
	}

	// @Column(length=10)
	public String getSurety() {
		return this.surety;
	}

	// @Column(name="VISIBLE_ID")
	public int getVisibleId() {
		return this.visibleId;
	}

	public void setBestCreatePid(int bestCreatePid) {
		this.bestCreatePid = bestCreatePid;
	}

	public void setBestDestroyPid(int bestDestroyPid) {
		this.bestDestroyPid = bestDestroyPid;
	}

	public void setBestImagePid(int bestImagePid) {
		this.bestImagePid = bestImagePid;
	}

	public void setBestNamePid(int bestNamePid) {
		this.bestNamePid = bestNamePid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setContainPid(int containPid) {
		this.containPid = containPid;
	}

	public void setFlags(byte[] flags) {
		this.flags = flags;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setSubTypeKey(short subTypeKey) {
		this.subTypeKey = subTypeKey;
	}

	public void setSurety(String surety) {
		this.surety = surety;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
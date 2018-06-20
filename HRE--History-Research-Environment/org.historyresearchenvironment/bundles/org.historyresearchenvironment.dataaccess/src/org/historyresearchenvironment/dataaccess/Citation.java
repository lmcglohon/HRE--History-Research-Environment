package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the CITATIONS database table.
 * 
 */
// @Entity
// @Table(name="CITATIONS")
// @NamedQuery(name="Citation.findAll", query="SELECT c FROM Citation c")
public class Citation implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int citationPid;
	private int citingPid;
	private short citnTypeKey;
	private int commitPid;
	private String flags;
	private boolean isSystem;
	private int memoSetPid;
	private short setKey;
	private int sourcePid;
	private short sourceSubTypeKey;
	private String surety;

	public Citation() {
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


	// @Column(name="CITATION_PID", nullable=false)
	public int getCitationPid() {
		return this.citationPid;
	}

	public void setCitationPid(int citationPid) {
		this.citationPid = citationPid;
	}


	// @Column(name="CITING_PID")
	public int getCitingPid() {
		return this.citingPid;
	}

	public void setCitingPid(int citingPid) {
		this.citingPid = citingPid;
	}


	// @Column(name="CITN_TYPE_KEY")
	public short getCitnTypeKey() {
		return this.citnTypeKey;
	}

	public void setCitnTypeKey(short citnTypeKey) {
		this.citnTypeKey = citnTypeKey;
	}


	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	// @Column(length=50)
	public String getFlags() {
		return this.flags;
	}

	public void setFlags(String flags) {
		this.flags = flags;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="MEMO_SET_PID")
	public int getMemoSetPid() {
		return this.memoSetPid;
	}

	public void setMemoSetPid(int memoSetPid) {
		this.memoSetPid = memoSetPid;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(name="SOURCE_PID")
	public int getSourcePid() {
		return this.sourcePid;
	}

	public void setSourcePid(int sourcePid) {
		this.sourcePid = sourcePid;
	}


	// @Column(name="SOURCE_SUB_TYPE_KEY")
	public short getSourceSubTypeKey() {
		return this.sourceSubTypeKey;
	}

	public void setSourceSubTypeKey(short sourceSubTypeKey) {
		this.sourceSubTypeKey = sourceSubTypeKey;
	}


	// @Column(length=10)
	public String getSurety() {
		return this.surety;
	}

	public void setSurety(String surety) {
		this.surety = surety;
	}

}
package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;


/**
 * The persistent class for the BIO_NAME_MAPS database table.
 * 
 */
// @Entity
// @Table(name="BIO_NAME_MAPS")
// @NamedQuery(name="BioNameMap.findAll", query="SELECT b FROM BioNameMap b")
public class BioNameMap implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int bioNameMapPid;
	private int commitPid;
	private short elementTypeKey;
	private int inferredShared;
	private boolean isSystem;
	private int parentNamePid;
	private short parentSubTypeKey;
	private short setKey;
	private int shared;

	public BioNameMap() {
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


	// @Column(name="BIO_NAME_MAP_PID", nullable=false)
	public int getBioNameMapPid() {
		return this.bioNameMapPid;
	}

	public void setBioNameMapPid(int bioNameMapPid) {
		this.bioNameMapPid = bioNameMapPid;
	}


	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	// @Column(name="ELEMENT_TYPE_KEY")
	public short getElementTypeKey() {
		return this.elementTypeKey;
	}

	public void setElementTypeKey(short elementTypeKey) {
		this.elementTypeKey = elementTypeKey;
	}


	// @Column(name="INFERRED_SHARED")
	public int getInferredShared() {
		return this.inferredShared;
	}

	public void setInferredShared(int inferredShared) {
		this.inferredShared = inferredShared;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="PARENT_NAME_PID")
	public int getParentNamePid() {
		return this.parentNamePid;
	}

	public void setParentNamePid(int parentNamePid) {
		this.parentNamePid = parentNamePid;
	}


	// @Column(name="PARENT_SUB_TYPE_KEY")
	public short getParentSubTypeKey() {
		return this.parentSubTypeKey;
	}

	public void setParentSubTypeKey(short parentSubTypeKey) {
		this.parentSubTypeKey = parentSubTypeKey;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	public int getShared() {
		return this.shared;
	}

	public void setShared(int shared) {
		this.shared = shared;
	}

}
package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the BIO_NAME_PARTS database table.
 * 
 */
// @Entity
// @Table(name="BIO_NAME_PARTS")
// @NamedQuery(name="BioNamePart.findAll", query="SELECT b FROM BioNamePart b")
public class BioNamePart implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int bioNamePartPid;
	private int commitPid;
	private int elementPid;
	private boolean isSystem;
	private String langCode;
	private int nextNameEventPid;
	private short setKey;
	private int shared;
	private int thisNameEventPid;
	private String trans;

	public BioNamePart() {
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


	// @Column(name="BIO_NAME_PART_PID", nullable=false)
	public int getBioNamePartPid() {
		return this.bioNamePartPid;
	}

	public void setBioNamePartPid(int bioNamePartPid) {
		this.bioNamePartPid = bioNamePartPid;
	}


	// @Column(name="COMMIT_PID")
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	// @Column(name="ELEMENT_PID")
	public int getElementPid() {
		return this.elementPid;
	}

	public void setElementPid(int elementPid) {
		this.elementPid = elementPid;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="LANG_CODE", length=4)
	public String getLangCode() {
		return this.langCode;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}


	// @Column(name="NEXT_NAME_EVENT_PID")
	public int getNextNameEventPid() {
		return this.nextNameEventPid;
	}

	public void setNextNameEventPid(int nextNameEventPid) {
		this.nextNameEventPid = nextNameEventPid;
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


	// @Column(name="THIS_NAME_EVENT_PID")
	public int getThisNameEventPid() {
		return this.thisNameEventPid;
	}

	public void setThisNameEventPid(int thisNameEventPid) {
		this.thisNameEventPid = thisNameEventPid;
	}


	// @Column(length=160)
	public String getTrans() {
		return this.trans;
	}

	public void setTrans(String trans) {
		this.trans = trans;
	}

}
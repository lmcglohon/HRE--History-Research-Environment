package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the DIGITAL_NAME_PARTS database table.
 * 
 */
// @Entity
// @Table(name="DIGITAL_NAME_PARTS")
// @NamedQuery(name="DigitalNamePart.findAll", query="SELECT d FROM
// DigitalNamePart d")
public class DigitalNamePart implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private int digitalNamePartPid;
	private short elementTypeKey;
	private boolean isSystem;
	private String langCode;
	private short setKey;
	private int shared;
	private String trans;

	public DigitalNamePart() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DIGITAL_NAME_PART_PID", nullable=false)
	public int getDigitalNamePartPid() {
		return this.digitalNamePartPid;
	}

	// @Column(name="ELEMENT_TYPE_KEY")
	public short getElementTypeKey() {
		return this.elementTypeKey;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="LANG_CODE", length=4)
	public String getLangCode() {
		return this.langCode;
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

	public int getShared() {
		return this.shared;
	}

	// @Column(length=160)
	public String getTrans() {
		return this.trans;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDigitalNamePartPid(int digitalNamePartPid) {
		this.digitalNamePartPid = digitalNamePartPid;
	}

	public void setElementTypeKey(short elementTypeKey) {
		this.elementTypeKey = elementTypeKey;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setShared(int shared) {
		this.shared = shared;
	}

	public void setTrans(String trans) {
		this.trans = trans;
	}

}
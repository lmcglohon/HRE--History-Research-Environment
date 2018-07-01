package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the HINTERVALS database table.
 * 
 */
// @Entity
// @Table(name="HINTERVALS")
// @NamedQuery(name="Hinterval.findAll", query="SELECT h FROM Hinterval h")
public class Hinterval implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private int hintervalPid;
	private short hintervalTypeKey;
	private long hinterval1;
	private long hinterval2;
	private boolean isHumanCalendar;
	private boolean isSystem;
	private String langCode;
	private int namedMemoPid;
	private String originalText;
	private short setKey;
	private long sortHinterval1;
	private long sortHinterval2;
	private String surety;

	public Hinterval() {
	}

	// @Column(name="COMMIT_PID")
	public int getCommitPid() {
		return this.commitPid;
	}

	public long getHinterval1() {
		return this.hinterval1;
	}

	public long getHinterval2() {
		return this.hinterval2;
	}

	// @Column(name="HINTERVAL_PID", nullable=false)
	public int getHintervalPid() {
		return this.hintervalPid;
	}

	// @Column(name="HINTERVAL_TYPE_KEY")
	public short getHintervalTypeKey() {
		return this.hintervalTypeKey;
	}

	// @Column(name="IS_HUMAN_CALENDAR")
	public boolean getIsHumanCalendar() {
		return this.isHumanCalendar;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="LANG_CODE", length=4)
	public String getLangCode() {
		return this.langCode;
	}

	// @Column(name="NAMED_MEMO_PID")
	public int getNamedMemoPid() {
		return this.namedMemoPid;
	}

	// @Column(name="ORIGINAL_TEXT", length=160)
	public String getOriginalText() {
		return this.originalText;
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

	// @Column(name="SORT_HINTERVAL1")
	public long getSortHinterval1() {
		return this.sortHinterval1;
	}

	// @Column(name="SORT_HINTERVAL2")
	public long getSortHinterval2() {
		return this.sortHinterval2;
	}

	// @Column(length=10)
	public String getSurety() {
		return this.surety;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setHinterval1(long hinterval1) {
		this.hinterval1 = hinterval1;
	}

	public void setHinterval2(long hinterval2) {
		this.hinterval2 = hinterval2;
	}

	public void setHintervalPid(int hintervalPid) {
		this.hintervalPid = hintervalPid;
	}

	public void setHintervalTypeKey(short hintervalTypeKey) {
		this.hintervalTypeKey = hintervalTypeKey;
	}

	public void setIsHumanCalendar(boolean isHumanCalendar) {
		this.isHumanCalendar = isHumanCalendar;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	public void setNamedMemoPid(int namedMemoPid) {
		this.namedMemoPid = namedMemoPid;
	}

	public void setOriginalText(String originalText) {
		this.originalText = originalText;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setSortHinterval1(long sortHinterval1) {
		this.sortHinterval1 = sortHinterval1;
	}

	public void setSortHinterval2(long sortHinterval2) {
		this.sortHinterval2 = sortHinterval2;
	}

	public void setSurety(String surety) {
		this.surety = surety;
	}

}
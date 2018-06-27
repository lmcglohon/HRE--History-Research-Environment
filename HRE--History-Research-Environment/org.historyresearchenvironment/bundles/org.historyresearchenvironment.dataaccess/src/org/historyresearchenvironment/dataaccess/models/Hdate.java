package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;


/**
 * The persistent class for the HDATES database table.
 * 
 */
// @Entity
// @Table(name="HDATES")
// @NamedQuery(name="Hdate.findAll", query="SELECT h FROM Hdate h")
public class Hdate implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private int hdatePid;
	private short hdateTypeKey;
	private long hdate1;
	private long hdate2;
	private boolean isHumanCalendar;
	private boolean isSystem;
	private String langCode;
	private int namedMemoPid;
	private String originalText;
	private short setKey;
	private long sortHdate1;
	private long sortHdate2;
	private String surety;

	public Hdate() {
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


	// @Column(name="HDATE_PID", nullable=false)
	public int getHdatePid() {
		return this.hdatePid;
	}

	public void setHdatePid(int hdatePid) {
		this.hdatePid = hdatePid;
	}


	// @Column(name="HDATE_TYPE_KEY")
	public short getHdateTypeKey() {
		return this.hdateTypeKey;
	}

	public void setHdateTypeKey(short hdateTypeKey) {
		this.hdateTypeKey = hdateTypeKey;
	}


	public long getHdate1() {
		return this.hdate1;
	}

	public void setHdate1(long hdate1) {
		this.hdate1 = hdate1;
	}


	public long getHdate2() {
		return this.hdate2;
	}

	public void setHdate2(long hdate2) {
		this.hdate2 = hdate2;
	}


	// @Column(name="IS_HUMAN_CALENDAR")
	public boolean getIsHumanCalendar() {
		return this.isHumanCalendar;
	}

	public void setIsHumanCalendar(boolean isHumanCalendar) {
		this.isHumanCalendar = isHumanCalendar;
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


	// @Column(name="NAMED_MEMO_PID")
	public int getNamedMemoPid() {
		return this.namedMemoPid;
	}

	public void setNamedMemoPid(int namedMemoPid) {
		this.namedMemoPid = namedMemoPid;
	}


	// @Column(name="ORIGINAL_TEXT", length=160)
	public String getOriginalText() {
		return this.originalText;
	}

	public void setOriginalText(String originalText) {
		this.originalText = originalText;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(name="SORT_HDATE1")
	public long getSortHdate1() {
		return this.sortHdate1;
	}

	public void setSortHdate1(long sortHdate1) {
		this.sortHdate1 = sortHdate1;
	}


	// @Column(name="SORT_HDATE2")
	public long getSortHdate2() {
		return this.sortHdate2;
	}

	public void setSortHdate2(long sortHdate2) {
		this.sortHdate2 = sortHdate2;
	}


	// @Column(length=10)
	public String getSurety() {
		return this.surety;
	}

	public void setSurety(String surety) {
		this.surety = surety;
	}

}
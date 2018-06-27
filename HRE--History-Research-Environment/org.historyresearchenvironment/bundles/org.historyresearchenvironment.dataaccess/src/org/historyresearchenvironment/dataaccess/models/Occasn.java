package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;


/**
 * The persistent class for the OCCASNS database table.
 * 
 */
// @Entity
// @Table(name="OCCASNS")
// @NamedQuery(name="Occasn.findAll", query="SELECT o FROM Occasn o")
public class Occasn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int bestImagePid;
	private int bioParentSetPid;
	private int commitPid;
	private byte[] flags;
	private boolean isSystem;
	private int localSentceSetPid;
	private int memoSetPid;
	private int occasnPid;
	private int parentPid;
	private short parentSubTypeKey;
	private short sentceStyleKey;
	private short sentceTypeKey;
	private short setKey;
	private String surety;
	private short tagTypeKey;
	private short themeKey;
	private int themeVisibleId;

	public Occasn() {
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


	// @Column(name="BEST_IMAGE_PID")
	public int getBestImagePid() {
		return this.bestImagePid;
	}

	public void setBestImagePid(int bestImagePid) {
		this.bestImagePid = bestImagePid;
	}


	// @Column(name="BIO_PARENT_SET_PID")
	public int getBioParentSetPid() {
		return this.bioParentSetPid;
	}

	public void setBioParentSetPid(int bioParentSetPid) {
		this.bioParentSetPid = bioParentSetPid;
	}


	// @Column(name="COMMIT_PID")
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
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


	// @Column(name="LOCAL_SENTCE_SET_PID")
	public int getLocalSentceSetPid() {
		return this.localSentceSetPid;
	}

	public void setLocalSentceSetPid(int localSentceSetPid) {
		this.localSentceSetPid = localSentceSetPid;
	}


	// @Column(name="MEMO_SET_PID")
	public int getMemoSetPid() {
		return this.memoSetPid;
	}

	public void setMemoSetPid(int memoSetPid) {
		this.memoSetPid = memoSetPid;
	}


	// @Column(name="OCCASN_PID", nullable=false)
	public int getOccasnPid() {
		return this.occasnPid;
	}

	public void setOccasnPid(int occasnPid) {
		this.occasnPid = occasnPid;
	}


	// @Column(name="PARENT_PID")
	public int getParentPid() {
		return this.parentPid;
	}

	public void setParentPid(int parentPid) {
		this.parentPid = parentPid;
	}


	// @Column(name="PARENT_SUB_TYPE_KEY")
	public short getParentSubTypeKey() {
		return this.parentSubTypeKey;
	}

	public void setParentSubTypeKey(short parentSubTypeKey) {
		this.parentSubTypeKey = parentSubTypeKey;
	}


	// @Column(name="SENTCE_STYLE_KEY")
	public short getSentceStyleKey() {
		return this.sentceStyleKey;
	}

	public void setSentceStyleKey(short sentceStyleKey) {
		this.sentceStyleKey = sentceStyleKey;
	}


	// @Column(name="SENTCE_TYPE_KEY")
	public short getSentceTypeKey() {
		return this.sentceTypeKey;
	}

	public void setSentceTypeKey(short sentceTypeKey) {
		this.sentceTypeKey = sentceTypeKey;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(length=10)
	public String getSurety() {
		return this.surety;
	}

	public void setSurety(String surety) {
		this.surety = surety;
	}


	// @Column(name="TAG_TYPE_KEY")
	public short getTagTypeKey() {
		return this.tagTypeKey;
	}

	public void setTagTypeKey(short tagTypeKey) {
		this.tagTypeKey = tagTypeKey;
	}


	// @Column(name="THEME_KEY")
	public short getThemeKey() {
		return this.themeKey;
	}

	public void setThemeKey(short themeKey) {
		this.themeKey = themeKey;
	}


	// @Column(name="THEME_VISIBLE_ID")
	public int getThemeVisibleId() {
		return this.themeVisibleId;
	}

	public void setThemeVisibleId(int themeVisibleId) {
		this.themeVisibleId = themeVisibleId;
	}

}
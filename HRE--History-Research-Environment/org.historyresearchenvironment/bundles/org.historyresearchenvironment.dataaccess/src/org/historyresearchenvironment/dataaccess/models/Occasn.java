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

	// @Column(name="BEST_IMAGE_PID")
	public int getBestImagePid() {
		return this.bestImagePid;
	}

	// @Column(name="BIO_PARENT_SET_PID")
	public int getBioParentSetPid() {
		return this.bioParentSetPid;
	}

	// @Column(name="COMMIT_PID")
	public int getCommitPid() {
		return this.commitPid;
	}

	public byte[] getFlags() {
		return this.flags;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="LOCAL_SENTCE_SET_PID")
	public int getLocalSentceSetPid() {
		return this.localSentceSetPid;
	}

	// @Column(name="MEMO_SET_PID")
	public int getMemoSetPid() {
		return this.memoSetPid;
	}

	// @Column(name="OCCASN_PID", nullable=false)
	public int getOccasnPid() {
		return this.occasnPid;
	}

	// @Column(name="PARENT_PID")
	public int getParentPid() {
		return this.parentPid;
	}

	// @Column(name="PARENT_SUB_TYPE_KEY")
	public short getParentSubTypeKey() {
		return this.parentSubTypeKey;
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	// @Column(name="SENTCE_STYLE_KEY")
	public short getSentceStyleKey() {
		return this.sentceStyleKey;
	}

	// @Column(name="SENTCE_TYPE_KEY")
	public short getSentceTypeKey() {
		return this.sentceTypeKey;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(length=10)
	public String getSurety() {
		return this.surety;
	}

	// @Column(name="TAG_TYPE_KEY")
	public short getTagTypeKey() {
		return this.tagTypeKey;
	}

	// @Column(name="THEME_KEY")
	public short getThemeKey() {
		return this.themeKey;
	}

	// @Column(name="THEME_VISIBLE_ID")
	public int getThemeVisibleId() {
		return this.themeVisibleId;
	}

	public void setBestImagePid(int bestImagePid) {
		this.bestImagePid = bestImagePid;
	}

	public void setBioParentSetPid(int bioParentSetPid) {
		this.bioParentSetPid = bioParentSetPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setFlags(byte[] flags) {
		this.flags = flags;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setLocalSentceSetPid(int localSentceSetPid) {
		this.localSentceSetPid = localSentceSetPid;
	}

	public void setMemoSetPid(int memoSetPid) {
		this.memoSetPid = memoSetPid;
	}

	public void setOccasnPid(int occasnPid) {
		this.occasnPid = occasnPid;
	}

	public void setParentPid(int parentPid) {
		this.parentPid = parentPid;
	}

	public void setParentSubTypeKey(short parentSubTypeKey) {
		this.parentSubTypeKey = parentSubTypeKey;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setSentceStyleKey(short sentceStyleKey) {
		this.sentceStyleKey = sentceStyleKey;
	}

	public void setSentceTypeKey(short sentceTypeKey) {
		this.sentceTypeKey = sentceTypeKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setSurety(String surety) {
		this.surety = surety;
	}

	public void setTagTypeKey(short tagTypeKey) {
		this.tagTypeKey = tagTypeKey;
	}

	public void setThemeKey(short themeKey) {
		this.themeKey = themeKey;
	}

	public void setThemeVisibleId(int themeVisibleId) {
		this.themeVisibleId = themeVisibleId;
	}

}
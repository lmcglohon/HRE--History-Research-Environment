package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the OCCASN_OCCASNS database table.
 * 
 */
// @Entity
// @Table(name="OCCASN_OCCASNS")
// @NamedQuery(name="OccasnOccasn.findAll", query="SELECT o FROM OccasnOccasn
// o")
public class OccasnOccasn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int aBSentceSetPid;
	private int aOccasnPid;
	private short aOccasnSubTypeKey;
	private int bASentceSetPid;
	private int bOccasnPid;
	private short bOccasnSubTypeKey;
	private int commitPid;
	private short displayOrder;
	private byte[] flags;
	private boolean isSystem;
	private int memoSetPid;
	private int occasnOccasnPid;
	private short occasnOccasnTagKey;
	private short sentceStyleKey;
	private short setKey;
	private short themeKey;

	public OccasnOccasn() {
	}

	// @Column(name="A_B_SENTCE_SET_PID")
	public int getABSentceSetPid() {
		return this.aBSentceSetPid;
	}

	// @Column(name="A_OCCASN_PID")
	public int getAOccasnPid() {
		return this.aOccasnPid;
	}

	// @Column(name="A_OCCASN_SUB_TYPE_KEY")
	public short getAOccasnSubTypeKey() {
		return this.aOccasnSubTypeKey;
	}

	// @Column(name="B_A_SENTCE_SET_PID")
	public int getBASentceSetPid() {
		return this.bASentceSetPid;
	}

	// @Column(name="B_OCCASN_PID")
	public int getBOccasnPid() {
		return this.bOccasnPid;
	}

	// @Column(name="B_OCCASN_SUB_TYPE_KEY")
	public short getBOccasnSubTypeKey() {
		return this.bOccasnSubTypeKey;
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	public byte[] getFlags() {
		return this.flags;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="MEMO_SET_PID")
	public int getMemoSetPid() {
		return this.memoSetPid;
	}

	// @Column(name="OCCASN_OCCASN_PID", nullable=false)
	public int getOccasnOccasnPid() {
		return this.occasnOccasnPid;
	}

	// @Column(name="OCCASN_OCCASN_TAG_KEY")
	public short getOccasnOccasnTagKey() {
		return this.occasnOccasnTagKey;
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

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="THEME_KEY")
	public short getThemeKey() {
		return this.themeKey;
	}

	public void setABSentceSetPid(int aBSentceSetPid) {
		this.aBSentceSetPid = aBSentceSetPid;
	}

	public void setAOccasnPid(int aOccasnPid) {
		this.aOccasnPid = aOccasnPid;
	}

	public void setAOccasnSubTypeKey(short aOccasnSubTypeKey) {
		this.aOccasnSubTypeKey = aOccasnSubTypeKey;
	}

	public void setBASentceSetPid(int bASentceSetPid) {
		this.bASentceSetPid = bASentceSetPid;
	}

	public void setBOccasnPid(int bOccasnPid) {
		this.bOccasnPid = bOccasnPid;
	}

	public void setBOccasnSubTypeKey(short bOccasnSubTypeKey) {
		this.bOccasnSubTypeKey = bOccasnSubTypeKey;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setFlags(byte[] flags) {
		this.flags = flags;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setMemoSetPid(int memoSetPid) {
		this.memoSetPid = memoSetPid;
	}

	public void setOccasnOccasnPid(int occasnOccasnPid) {
		this.occasnOccasnPid = occasnOccasnPid;
	}

	public void setOccasnOccasnTagKey(short occasnOccasnTagKey) {
		this.occasnOccasnTagKey = occasnOccasnTagKey;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setSentceStyleKey(short sentceStyleKey) {
		this.sentceStyleKey = sentceStyleKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setThemeKey(short themeKey) {
		this.themeKey = themeKey;
	}

}
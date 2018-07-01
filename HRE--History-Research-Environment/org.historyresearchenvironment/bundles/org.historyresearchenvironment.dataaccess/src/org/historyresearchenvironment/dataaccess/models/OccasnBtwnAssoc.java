package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the OCCASN_BTWN_ASSOCS database table.
 * 
 */
// @Entity
// @Table(name="OCCASN_BTWN_ASSOCS")
// @NamedQuery(name="OccasnBtwnAssoc.findAll", query="SELECT o FROM
// OccasnBtwnAssoc o")
public class OccasnBtwnAssoc implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int aBSentceSetPid;
	private int aEntityPid;
	private short aEntitySubTypeKey;
	private short aEntityTypeKey;
	private int bASentceSetPid;
	private int bEntityPid;
	private short bEntitySubTypeKey;
	private short bEntityTypeKey;
	private int commitPid;
	private byte[] flags;
	private boolean isSystem;
	private int memoSetPid;
	private int occasnBtwnAssocPid;
	private short occasnBtwnAssocTagKey;
	private short occasnSubTypeKey;
	private short sentceStyleKey;
	private short setKey;
	private short themeKey;
	private int thisOccasnPid;

	public OccasnBtwnAssoc() {
	}

	// @Column(name="A_B_SENTCE_SET_PID")
	public int getABSentceSetPid() {
		return this.aBSentceSetPid;
	}

	// @Column(name="A_ENTITY_PID")
	public int getAEntityPid() {
		return this.aEntityPid;
	}

	// @Column(name="A_ENTITY_SUB_TYPE_KEY")
	public short getAEntitySubTypeKey() {
		return this.aEntitySubTypeKey;
	}

	// @Column(name="A_ENTITY_TYPE_KEY")
	public short getAEntityTypeKey() {
		return this.aEntityTypeKey;
	}

	// @Column(name="B_A_SENTCE_SET_PID")
	public int getBASentceSetPid() {
		return this.bASentceSetPid;
	}

	// @Column(name="B_ENTITY_PID")
	public int getBEntityPid() {
		return this.bEntityPid;
	}

	// @Column(name="B_ENTITY_SUB_TYPE_KEY")
	public short getBEntitySubTypeKey() {
		return this.bEntitySubTypeKey;
	}

	// @Column(name="B_ENTITY_TYPE_KEY")
	public short getBEntityTypeKey() {
		return this.bEntityTypeKey;
	}

	// @Column(name="COMMIT_PID", nullable=false)
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

	// @Column(name="MEMO_SET_PID")
	public int getMemoSetPid() {
		return this.memoSetPid;
	}

	// @Column(name="OCCASN_BTWN_ASSOC_PID", nullable=false)
	public int getOccasnBtwnAssocPid() {
		return this.occasnBtwnAssocPid;
	}

	// @Column(name="OCCASN_BTWN_ASSOC_TAG_KEY")
	public short getOccasnBtwnAssocTagKey() {
		return this.occasnBtwnAssocTagKey;
	}

	// @Column(name="OCCASN_SUB_TYPE_KEY")
	public short getOccasnSubTypeKey() {
		return this.occasnSubTypeKey;
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

	// @Column(name="THIS_OCCASN_PID")
	public int getThisOccasnPid() {
		return this.thisOccasnPid;
	}

	public void setABSentceSetPid(int aBSentceSetPid) {
		this.aBSentceSetPid = aBSentceSetPid;
	}

	public void setAEntityPid(int aEntityPid) {
		this.aEntityPid = aEntityPid;
	}

	public void setAEntitySubTypeKey(short aEntitySubTypeKey) {
		this.aEntitySubTypeKey = aEntitySubTypeKey;
	}

	public void setAEntityTypeKey(short aEntityTypeKey) {
		this.aEntityTypeKey = aEntityTypeKey;
	}

	public void setBASentceSetPid(int bASentceSetPid) {
		this.bASentceSetPid = bASentceSetPid;
	}

	public void setBEntityPid(int bEntityPid) {
		this.bEntityPid = bEntityPid;
	}

	public void setBEntitySubTypeKey(short bEntitySubTypeKey) {
		this.bEntitySubTypeKey = bEntitySubTypeKey;
	}

	public void setBEntityTypeKey(short bEntityTypeKey) {
		this.bEntityTypeKey = bEntityTypeKey;
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

	public void setMemoSetPid(int memoSetPid) {
		this.memoSetPid = memoSetPid;
	}

	public void setOccasnBtwnAssocPid(int occasnBtwnAssocPid) {
		this.occasnBtwnAssocPid = occasnBtwnAssocPid;
	}

	public void setOccasnBtwnAssocTagKey(short occasnBtwnAssocTagKey) {
		this.occasnBtwnAssocTagKey = occasnBtwnAssocTagKey;
	}

	public void setOccasnSubTypeKey(short occasnSubTypeKey) {
		this.occasnSubTypeKey = occasnSubTypeKey;
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

	public void setThisOccasnPid(int thisOccasnPid) {
		this.thisOccasnPid = thisOccasnPid;
	}

}
package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;


/**
 * The persistent class for the OCCASN_BTWN_ASSOCS database table.
 * 
 */
// @Entity
// @Table(name="OCCASN_BTWN_ASSOCS")
// @NamedQuery(name="OccasnBtwnAssoc.findAll", query="SELECT o FROM OccasnBtwnAssoc o")
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


	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}


	// @Column(name="A_B_SENTCE_SET_PID")
	public int getABSentceSetPid() {
		return this.aBSentceSetPid;
	}

	public void setABSentceSetPid(int aBSentceSetPid) {
		this.aBSentceSetPid = aBSentceSetPid;
	}


	// @Column(name="A_ENTITY_PID")
	public int getAEntityPid() {
		return this.aEntityPid;
	}

	public void setAEntityPid(int aEntityPid) {
		this.aEntityPid = aEntityPid;
	}


	// @Column(name="A_ENTITY_SUB_TYPE_KEY")
	public short getAEntitySubTypeKey() {
		return this.aEntitySubTypeKey;
	}

	public void setAEntitySubTypeKey(short aEntitySubTypeKey) {
		this.aEntitySubTypeKey = aEntitySubTypeKey;
	}


	// @Column(name="A_ENTITY_TYPE_KEY")
	public short getAEntityTypeKey() {
		return this.aEntityTypeKey;
	}

	public void setAEntityTypeKey(short aEntityTypeKey) {
		this.aEntityTypeKey = aEntityTypeKey;
	}


	// @Column(name="B_A_SENTCE_SET_PID")
	public int getBASentceSetPid() {
		return this.bASentceSetPid;
	}

	public void setBASentceSetPid(int bASentceSetPid) {
		this.bASentceSetPid = bASentceSetPid;
	}


	// @Column(name="B_ENTITY_PID")
	public int getBEntityPid() {
		return this.bEntityPid;
	}

	public void setBEntityPid(int bEntityPid) {
		this.bEntityPid = bEntityPid;
	}


	// @Column(name="B_ENTITY_SUB_TYPE_KEY")
	public short getBEntitySubTypeKey() {
		return this.bEntitySubTypeKey;
	}

	public void setBEntitySubTypeKey(short bEntitySubTypeKey) {
		this.bEntitySubTypeKey = bEntitySubTypeKey;
	}


	// @Column(name="B_ENTITY_TYPE_KEY")
	public short getBEntityTypeKey() {
		return this.bEntityTypeKey;
	}

	public void setBEntityTypeKey(short bEntityTypeKey) {
		this.bEntityTypeKey = bEntityTypeKey;
	}


	// @Column(name="COMMIT_PID", nullable=false)
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


	// @Column(name="MEMO_SET_PID")
	public int getMemoSetPid() {
		return this.memoSetPid;
	}

	public void setMemoSetPid(int memoSetPid) {
		this.memoSetPid = memoSetPid;
	}


	// @Column(name="OCCASN_BTWN_ASSOC_PID", nullable=false)
	public int getOccasnBtwnAssocPid() {
		return this.occasnBtwnAssocPid;
	}

	public void setOccasnBtwnAssocPid(int occasnBtwnAssocPid) {
		this.occasnBtwnAssocPid = occasnBtwnAssocPid;
	}


	// @Column(name="OCCASN_BTWN_ASSOC_TAG_KEY")
	public short getOccasnBtwnAssocTagKey() {
		return this.occasnBtwnAssocTagKey;
	}

	public void setOccasnBtwnAssocTagKey(short occasnBtwnAssocTagKey) {
		this.occasnBtwnAssocTagKey = occasnBtwnAssocTagKey;
	}


	// @Column(name="OCCASN_SUB_TYPE_KEY")
	public short getOccasnSubTypeKey() {
		return this.occasnSubTypeKey;
	}

	public void setOccasnSubTypeKey(short occasnSubTypeKey) {
		this.occasnSubTypeKey = occasnSubTypeKey;
	}


	// @Column(name="SENTCE_STYLE_KEY")
	public short getSentceStyleKey() {
		return this.sentceStyleKey;
	}

	public void setSentceStyleKey(short sentceStyleKey) {
		this.sentceStyleKey = sentceStyleKey;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(name="THEME_KEY")
	public short getThemeKey() {
		return this.themeKey;
	}

	public void setThemeKey(short themeKey) {
		this.themeKey = themeKey;
	}


	// @Column(name="THIS_OCCASN_PID")
	public int getThisOccasnPid() {
		return this.thisOccasnPid;
	}

	public void setThisOccasnPid(int thisOccasnPid) {
		this.thisOccasnPid = thisOccasnPid;
	}

}
package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the OCCASN_ASSOCS database table.
 * 
 */
// @Entity
// @Table(name="OCCASN_ASSOCS")
// @NamedQuery(name="OccasnAssoc.findAll", query="SELECT o FROM OccasnAssoc o")
public class OccasnAssoc implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int assocNameUsedPid;
	private short assocSubTypeKey;
	private short assocTypeKey;
	private int assocTypePid;
	private int commitPid;
	private short displayOrder;
	private boolean isSystem;
	private int localSentceSetPid;
	private int memoSetPid;
	private int occasnAssocPid;
	private short occasnAssocTagKey;
	private int occasnPid;
	private short occasnSubTypeKey;
	private short sentceStyleKey;
	private short setKey;
	private boolean show;
	private int themeKey;

	public OccasnAssoc() {
	}


	// @Id
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}


	// @Column(name="ASSOC_NAME_USED_PID")
	public int getAssocNameUsedPid() {
		return this.assocNameUsedPid;
	}

	public void setAssocNameUsedPid(int assocNameUsedPid) {
		this.assocNameUsedPid = assocNameUsedPid;
	}


	// @Column(name="ASSOC_SUB_TYPE_KEY")
	public short getAssocSubTypeKey() {
		return this.assocSubTypeKey;
	}

	public void setAssocSubTypeKey(short assocSubTypeKey) {
		this.assocSubTypeKey = assocSubTypeKey;
	}


	// @Column(name="ASSOC_TYPE_KEY")
	public short getAssocTypeKey() {
		return this.assocTypeKey;
	}

	public void setAssocTypeKey(short assocTypeKey) {
		this.assocTypeKey = assocTypeKey;
	}


	// @Column(name="ASSOC_TYPE_PID")
	public int getAssocTypePid() {
		return this.assocTypePid;
	}

	public void setAssocTypePid(int assocTypePid) {
		this.assocTypePid = assocTypePid;
	}


	// @Column(name="COMMIT_PID")
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
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


	// @Column(name="OCCASN_ASSOC_PID", nullable=false)
	public int getOccasnAssocPid() {
		return this.occasnAssocPid;
	}

	public void setOccasnAssocPid(int occasnAssocPid) {
		this.occasnAssocPid = occasnAssocPid;
	}


	// @Column(name="OCCASN_ASSOC_TAG_KEY")
	public short getOccasnAssocTagKey() {
		return this.occasnAssocTagKey;
	}

	public void setOccasnAssocTagKey(short occasnAssocTagKey) {
		this.occasnAssocTagKey = occasnAssocTagKey;
	}


	// @Column(name="OCCASN_PID")
	public int getOccasnPid() {
		return this.occasnPid;
	}

	public void setOccasnPid(int occasnPid) {
		this.occasnPid = occasnPid;
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


	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	public void setShow(boolean show) {
		this.show = show;
	}


	// @Column(name="THEME_KEY")
	public int getThemeKey() {
		return this.themeKey;
	}

	public void setThemeKey(int themeKey) {
		this.themeKey = themeKey;
	}

}
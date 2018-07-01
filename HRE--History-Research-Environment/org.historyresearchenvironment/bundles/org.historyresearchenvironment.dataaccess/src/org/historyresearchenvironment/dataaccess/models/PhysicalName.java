package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the PHYSICAL_NAMES database table.
 * 
 */
// @Entity
// @Table(name="PHYSICAL_NAMES")
// @NamedQuery(name="PhysicalName.findAll", query="SELECT p FROM PhysicalName
// p")
public class PhysicalName implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private byte[] elementsEntered;
	private boolean isSystem;
	private int memoSetPid;
	private short nameStyleKey;
	private short nameTagKey;
	private boolean nextHdateInferred;
	private int nextHdatePid;
	private int nextNameEventPid;
	private int parentPid;
	private short parentSubTypeKey;
	private int physicalNamePid;
	private int sentceSetKey;
	private short sentceStyleKey;
	private short sentceTypeKey;
	private short setKey;
	private short themeKey;
	private boolean thisHdateInferred;
	private int thisHdatePid;
	private int thisNameEventPid;

	public PhysicalName() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="ELEMENTS_ENTERED")
	public byte[] getElementsEntered() {
		return this.elementsEntered;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="MEMO_SET_PID")
	public int getMemoSetPid() {
		return this.memoSetPid;
	}

	// @Column(name="NAME_STYLE_KEY")
	public short getNameStyleKey() {
		return this.nameStyleKey;
	}

	// @Column(name="NAME_TAG_KEY")
	public short getNameTagKey() {
		return this.nameTagKey;
	}

	// @Column(name="NEXT_HDATE_INFERRED")
	public boolean getNextHdateInferred() {
		return this.nextHdateInferred;
	}

	// @Column(name="NEXT_HDATE_PID")
	public int getNextHdatePid() {
		return this.nextHdatePid;
	}

	// @Column(name="NEXT_NAME_EVENT_PID")
	public int getNextNameEventPid() {
		return this.nextNameEventPid;
	}

	// @Column(name="PARENT_PID")
	public int getParentPid() {
		return this.parentPid;
	}

	// @Column(name="PARENT_SUB_TYPE_KEY")
	public short getParentSubTypeKey() {
		return this.parentSubTypeKey;
	}

	// @Column(name="PHYSICAL_NAME_PID", nullable=false)
	public int getPhysicalNamePid() {
		return this.physicalNamePid;
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	// @Column(name="SENTCE_SET_KEY")
	public int getSentceSetKey() {
		return this.sentceSetKey;
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

	// @Column(name="THEME_KEY")
	public short getThemeKey() {
		return this.themeKey;
	}

	// @Column(name="THIS_HDATE_INFERRED")
	public boolean getThisHdateInferred() {
		return this.thisHdateInferred;
	}

	// @Column(name="THIS_HDATE_PID")
	public int getThisHdatePid() {
		return this.thisHdatePid;
	}

	// @Column(name="THIS_NAME_EVENT_PID")
	public int getThisNameEventPid() {
		return this.thisNameEventPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setElementsEntered(byte[] elementsEntered) {
		this.elementsEntered = elementsEntered;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setMemoSetPid(int memoSetPid) {
		this.memoSetPid = memoSetPid;
	}

	public void setNameStyleKey(short nameStyleKey) {
		this.nameStyleKey = nameStyleKey;
	}

	public void setNameTagKey(short nameTagKey) {
		this.nameTagKey = nameTagKey;
	}

	public void setNextHdateInferred(boolean nextHdateInferred) {
		this.nextHdateInferred = nextHdateInferred;
	}

	public void setNextHdatePid(int nextHdatePid) {
		this.nextHdatePid = nextHdatePid;
	}

	public void setNextNameEventPid(int nextNameEventPid) {
		this.nextNameEventPid = nextNameEventPid;
	}

	public void setParentPid(int parentPid) {
		this.parentPid = parentPid;
	}

	public void setParentSubTypeKey(short parentSubTypeKey) {
		this.parentSubTypeKey = parentSubTypeKey;
	}

	public void setPhysicalNamePid(int physicalNamePid) {
		this.physicalNamePid = physicalNamePid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setSentceSetKey(int sentceSetKey) {
		this.sentceSetKey = sentceSetKey;
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

	public void setThemeKey(short themeKey) {
		this.themeKey = themeKey;
	}

	public void setThisHdateInferred(boolean thisHdateInferred) {
		this.thisHdateInferred = thisHdateInferred;
	}

	public void setThisHdatePid(int thisHdatePid) {
		this.thisHdatePid = thisHdatePid;
	}

	public void setThisNameEventPid(int thisNameEventPid) {
		this.thisNameEventPid = thisNameEventPid;
	}

}
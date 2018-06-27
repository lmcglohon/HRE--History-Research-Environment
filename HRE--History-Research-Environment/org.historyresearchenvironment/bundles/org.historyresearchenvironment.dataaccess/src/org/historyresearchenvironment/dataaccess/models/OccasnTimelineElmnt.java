package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;


/**
 * The persistent class for the OCCASN_TIMELINE_ELMNTS database table.
 * 
 */
// @Entity
// @Table(name="OCCASN_TIMELINE_ELMNTS")
// @NamedQuery(name="OccasnTimelineElmnt.findAll", query="SELECT o FROM OccasnTimelineElmnt o")
public class OccasnTimelineElmnt implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private boolean isDefault;
	private boolean isSystem;
	private int occasnPid;
	private int occasnTimelineElmntPid;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private short subTypeKey;
	private short timelinePid;

	public OccasnTimelineElmnt() {
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


	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="OCCASN_PID")
	public int getOccasnPid() {
		return this.occasnPid;
	}

	public void setOccasnPid(int occasnPid) {
		this.occasnPid = occasnPid;
	}


	// @Column(name="OCCASN_TIMELINE_ELMNT_PID", nullable=false)
	public int getOccasnTimelineElmntPid() {
		return this.occasnTimelineElmntPid;
	}

	public void setOccasnTimelineElmntPid(int occasnTimelineElmntPid) {
		this.occasnTimelineElmntPid = occasnTimelineElmntPid;
	}


	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
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


	// @Column(name="SUB_TYPE_KEY")
	public short getSubTypeKey() {
		return this.subTypeKey;
	}

	public void setSubTypeKey(short subTypeKey) {
		this.subTypeKey = subTypeKey;
	}


	// @Column(name="TIMELINE_PID")
	public short getTimelinePid() {
		return this.timelinePid;
	}

	public void setTimelinePid(short timelinePid) {
		this.timelinePid = timelinePid;
	}

}
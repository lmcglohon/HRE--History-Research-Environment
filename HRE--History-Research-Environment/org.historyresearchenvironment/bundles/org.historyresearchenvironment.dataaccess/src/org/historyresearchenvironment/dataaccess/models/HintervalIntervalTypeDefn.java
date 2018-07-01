package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the HINTERVAL_INTERVAL_TYPE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="HINTERVAL_INTERVAL_TYPE_DEFNS")
// @NamedQuery(name="HintervalIntervalTypeDefn.findAll", query="SELECT h FROM
// HintervalIntervalTypeDefn h")
public class HintervalIntervalTypeDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private short calChngEndDay;
	private short calChngEndYear;
	private short calChngStartDay;
	private short calChngStartYear;
	private int commitPid;
	private short daysLost;
	private short displayOrder;
	private int hintervalIntervalTypeDefnPid;
	private boolean isDefault;
	private short originalCalendarKey;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private boolean usedOldStyle;
	private short whenWritten;
	private int whereWrittenPid;

	public HintervalIntervalTypeDefn() {
	}

	// @Column(name="CAL_CHNG_END_DAY")
	public short getCalChngEndDay() {
		return this.calChngEndDay;
	}

	// @Column(name="CAL_CHNG_END_YEAR")
	public short getCalChngEndYear() {
		return this.calChngEndYear;
	}

	// @Column(name="CAL_CHNG_START_DAY")
	public short getCalChngStartDay() {
		return this.calChngStartDay;
	}

	// @Column(name="CAL_CHNG_START_YEAR")
	public short getCalChngStartYear() {
		return this.calChngStartYear;
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DAYS_LOST")
	public short getDaysLost() {
		return this.daysLost;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="HINTERVAL_INTERVAL_TYPE_DEFN_PID", nullable=false)
	public int getHintervalIntervalTypeDefnPid() {
		return this.hintervalIntervalTypeDefnPid;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="ORIGINAL_CALENDAR_KEY")
	public short getOriginalCalendarKey() {
		return this.originalCalendarKey;
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	// @Column(name="USED_OLD_STYLE")
	public boolean getUsedOldStyle() {
		return this.usedOldStyle;
	}

	// @Column(name="WHEN_WRITTEN")
	public short getWhenWritten() {
		return this.whenWritten;
	}

	// @Column(name="WHERE_WRITTEN_PID")
	public int getWhereWrittenPid() {
		return this.whereWrittenPid;
	}

	public void setCalChngEndDay(short calChngEndDay) {
		this.calChngEndDay = calChngEndDay;
	}

	public void setCalChngEndYear(short calChngEndYear) {
		this.calChngEndYear = calChngEndYear;
	}

	public void setCalChngStartDay(short calChngStartDay) {
		this.calChngStartDay = calChngStartDay;
	}

	public void setCalChngStartYear(short calChngStartYear) {
		this.calChngStartYear = calChngStartYear;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDaysLost(short daysLost) {
		this.daysLost = daysLost;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setHintervalIntervalTypeDefnPid(int hintervalIntervalTypeDefnPid) {
		this.hintervalIntervalTypeDefnPid = hintervalIntervalTypeDefnPid;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setOriginalCalendarKey(short originalCalendarKey) {
		this.originalCalendarKey = originalCalendarKey;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public void setUsedOldStyle(boolean usedOldStyle) {
		this.usedOldStyle = usedOldStyle;
	}

	public void setWhenWritten(short whenWritten) {
		this.whenWritten = whenWritten;
	}

	public void setWhereWrittenPid(int whereWrittenPid) {
		this.whereWrittenPid = whereWrittenPid;
	}

}
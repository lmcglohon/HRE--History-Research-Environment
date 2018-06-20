package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the HINTERVAL_INTERVAL_TYPE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="HINTERVAL_INTERVAL_TYPE_DEFNS")
// @NamedQuery(name="HintervalIntervalTypeDefn.findAll", query="SELECT h FROM HintervalIntervalTypeDefn h")
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


	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}


	// @Column(name="CAL_CHNG_END_DAY")
	public short getCalChngEndDay() {
		return this.calChngEndDay;
	}

	public void setCalChngEndDay(short calChngEndDay) {
		this.calChngEndDay = calChngEndDay;
	}


	// @Column(name="CAL_CHNG_END_YEAR")
	public short getCalChngEndYear() {
		return this.calChngEndYear;
	}

	public void setCalChngEndYear(short calChngEndYear) {
		this.calChngEndYear = calChngEndYear;
	}


	// @Column(name="CAL_CHNG_START_DAY")
	public short getCalChngStartDay() {
		return this.calChngStartDay;
	}

	public void setCalChngStartDay(short calChngStartDay) {
		this.calChngStartDay = calChngStartDay;
	}


	// @Column(name="CAL_CHNG_START_YEAR")
	public short getCalChngStartYear() {
		return this.calChngStartYear;
	}

	public void setCalChngStartYear(short calChngStartYear) {
		this.calChngStartYear = calChngStartYear;
	}


	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	// @Column(name="DAYS_LOST")
	public short getDaysLost() {
		return this.daysLost;
	}

	public void setDaysLost(short daysLost) {
		this.daysLost = daysLost;
	}


	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}


	// @Column(name="HINTERVAL_INTERVAL_TYPE_DEFN_PID", nullable=false)
	public int getHintervalIntervalTypeDefnPid() {
		return this.hintervalIntervalTypeDefnPid;
	}

	public void setHintervalIntervalTypeDefnPid(int hintervalIntervalTypeDefnPid) {
		this.hintervalIntervalTypeDefnPid = hintervalIntervalTypeDefnPid;
	}


	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}


	// @Column(name="ORIGINAL_CALENDAR_KEY")
	public short getOriginalCalendarKey() {
		return this.originalCalendarKey;
	}

	public void setOriginalCalendarKey(short originalCalendarKey) {
		this.originalCalendarKey = originalCalendarKey;
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


	// @Column(name="USED_OLD_STYLE")
	public boolean getUsedOldStyle() {
		return this.usedOldStyle;
	}

	public void setUsedOldStyle(boolean usedOldStyle) {
		this.usedOldStyle = usedOldStyle;
	}


	// @Column(name="WHEN_WRITTEN")
	public short getWhenWritten() {
		return this.whenWritten;
	}

	public void setWhenWritten(short whenWritten) {
		this.whenWritten = whenWritten;
	}


	// @Column(name="WHERE_WRITTEN_PID")
	public int getWhereWrittenPid() {
		return this.whereWrittenPid;
	}

	public void setWhereWrittenPid(int whereWrittenPid) {
		this.whereWrittenPid = whereWrittenPid;
	}

}
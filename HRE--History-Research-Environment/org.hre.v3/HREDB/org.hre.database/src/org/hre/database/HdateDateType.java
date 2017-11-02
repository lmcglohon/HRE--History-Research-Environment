package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the HDATE_DATE_TYPES database table.
 * 
 */
@Entity
@Table(name = "HDATE_DATE_TYPES")
@NamedQuery(name = "HdateDateType.findAll", query = "SELECT h FROM HdateDateType h")
public class HdateDateType extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "CAL_CHNG_END_DAY")
	private short calChngEndDay;

	@Column(name = "CAL_CHNG_END_YEAR")
	private short calChngEndYear;

	@Column(name = "CAL_CHNG_START_DAY")
	private short calChngStartDay;

	@Column(name = "CAL_CHNG_START_YEAR")
	private short calChngStartYear;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DAYS_LOST")
	private short daysLost;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "HDATE_DATE_TYPE_PID")
	private int hdateDateTypePid;

	@Column(name = "ORIGINAL_CALENDAR_KEY")
	private short originalCalendarKey;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "USED_OLD_STYLE")
	private boolean usedOldStyle;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	@Column(name = "WHEN_WRITTEN")
	private short whenWritten;

	@Column(name = "WHERE_WRITTEN")
	private String whereWritten;

	public HdateDateType() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#delete(int)
	 */
	@Override
	protected int delete(int recordNum) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#get(int)
	 */
	@Override
	protected AbstractHreTableRow get(int recordNum) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public short getCalChngEndDay() {
		return this.calChngEndDay;
	}

	public short getCalChngEndYear() {
		return this.calChngEndYear;
	}

	public short getCalChngStartDay() {
		return this.calChngStartDay;
	}

	public short getCalChngStartYear() {
		return this.calChngStartYear;
	}

	public int getCommitPid() {
		return this.commitPid;
	}

	public short getDaysLost() {
		return this.daysLost;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public int getHdateDateTypePid() {
		return this.hdateDateTypePid;
	}

	public short getOriginalCalendarKey() {
		return this.originalCalendarKey;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public short getRights() {
		return this.rights;
	}

	public short getSetPid() {
		return this.setPid;
	}

	public boolean getUsedOldStyle() {
		return this.usedOldStyle;
	}

	public int getVisibleId() {
		return this.visibleId;
	}

	public short getWhenWritten() {
		return this.whenWritten;
	}

	public String getWhereWritten() {
		return this.whereWritten;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#post()
	 */
	@Override
	protected int post() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#put()
	 */
	@Override
	protected int put() throws Exception {
		// TODO Auto-generated method stub
		return 0;
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

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setHdateDateTypePid(int hdateDateTypePid) {
		this.hdateDateTypePid = hdateDateTypePid;
	}

	public void setOriginalCalendarKey(short originalCalendarKey) {
		this.originalCalendarKey = originalCalendarKey;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRights(short rights) {
		this.rights = rights;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setUsedOldStyle(boolean usedOldStyle) {
		this.usedOldStyle = usedOldStyle;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

	public void setWhenWritten(short whenWritten) {
		this.whenWritten = whenWritten;
	}

	public void setWhereWritten(String whereWritten) {
		this.whereWritten = whereWritten;
	}

}
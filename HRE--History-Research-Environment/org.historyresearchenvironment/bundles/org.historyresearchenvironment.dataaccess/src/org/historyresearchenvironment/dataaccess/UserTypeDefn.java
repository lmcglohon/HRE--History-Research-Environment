package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the USER_TYPE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="USER_TYPE_DEFNS")
// @NamedQuery(name="UserTypeDefn.findAll", query="SELECT u FROM UserTypeDefn u")
public class UserTypeDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private boolean isColorblind;
	private boolean isDefault;
	private boolean isUserDefn;
	private boolean minMouseUse;
	private boolean poorEyesight;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private int userTypeDefnPid;

	public UserTypeDefn() {
	}


	// @Id
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}


	// @Column(name="COMMIT_PID", nullable=false)
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


	// @Column(name="IS_COLORBLIND")
	public boolean getIsColorblind() {
		return this.isColorblind;
	}

	public void setIsColorblind(boolean isColorblind) {
		this.isColorblind = isColorblind;
	}


	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}


	// @Column(name="IS_USER_DEFN")
	public boolean getIsUserDefn() {
		return this.isUserDefn;
	}

	public void setIsUserDefn(boolean isUserDefn) {
		this.isUserDefn = isUserDefn;
	}


	// @Column(name="MIN_MOUSE_USE")
	public boolean getMinMouseUse() {
		return this.minMouseUse;
	}

	public void setMinMouseUse(boolean minMouseUse) {
		this.minMouseUse = minMouseUse;
	}


	// @Column(name="POOR_EYESIGHT")
	public boolean getPoorEyesight() {
		return this.poorEyesight;
	}

	public void setPoorEyesight(boolean poorEyesight) {
		this.poorEyesight = poorEyesight;
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


	// @Column(name="USER_TYPE_DEFN_PID", nullable=false)
	public int getUserTypeDefnPid() {
		return this.userTypeDefnPid;
	}

	public void setUserTypeDefnPid(int userTypeDefnPid) {
		this.userTypeDefnPid = userTypeDefnPid;
	}

}
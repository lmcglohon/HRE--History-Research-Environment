package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the USER_TYPE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="USER_TYPE_DEFNS")
// @NamedQuery(name="UserTypeDefn.findAll", query="SELECT u FROM UserTypeDefn
// u")
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

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="IS_COLORBLIND")
	public boolean getIsColorblind() {
		return this.isColorblind;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="IS_USER_DEFN")
	public boolean getIsUserDefn() {
		return this.isUserDefn;
	}

	// @Column(name="MIN_MOUSE_USE")
	public boolean getMinMouseUse() {
		return this.minMouseUse;
	}

	// @Column(name="POOR_EYESIGHT")
	public boolean getPoorEyesight() {
		return this.poorEyesight;
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

	// @Column(name="USER_TYPE_DEFN_PID", nullable=false)
	public int getUserTypeDefnPid() {
		return this.userTypeDefnPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setIsColorblind(boolean isColorblind) {
		this.isColorblind = isColorblind;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setIsUserDefn(boolean isUserDefn) {
		this.isUserDefn = isUserDefn;
	}

	public void setMinMouseUse(boolean minMouseUse) {
		this.minMouseUse = minMouseUse;
	}

	public void setPoorEyesight(boolean poorEyesight) {
		this.poorEyesight = poorEyesight;
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

	public void setUserTypeDefnPid(int userTypeDefnPid) {
		this.userTypeDefnPid = userTypeDefnPid;
	}

}
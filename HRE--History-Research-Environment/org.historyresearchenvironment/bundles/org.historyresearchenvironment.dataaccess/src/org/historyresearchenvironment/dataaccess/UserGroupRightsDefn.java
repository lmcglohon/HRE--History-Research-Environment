package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the USER_GROUP_RIGHTS_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="USER_GROUP_RIGHTS_DEFNS")
// @NamedQuery(name="UserGroupRightsDefn.findAll", query="SELECT u FROM UserGroupRightsDefn u")
public class UserGroupRightsDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private boolean canDeleteEditable;
	private boolean canEditView;
	private boolean canViewAll;
	private boolean canViewSome;
	private int commitPid;
	private short limitFlagKey;
	private short limitFlagValue;
	private short reminderKey;
	private short setKey;
	private short tableKey;
	private short userGroupKey;
	private int userGroupRightsDefnPid;

	public UserGroupRightsDefn() {
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


	// @Column(name="CAN_DELETE_EDITABLE")
	public boolean getCanDeleteEditable() {
		return this.canDeleteEditable;
	}

	public void setCanDeleteEditable(boolean canDeleteEditable) {
		this.canDeleteEditable = canDeleteEditable;
	}


	// @Column(name="CAN_EDIT_VIEW")
	public boolean getCanEditView() {
		return this.canEditView;
	}

	public void setCanEditView(boolean canEditView) {
		this.canEditView = canEditView;
	}


	// @Column(name="CAN_VIEW_ALL")
	public boolean getCanViewAll() {
		return this.canViewAll;
	}

	public void setCanViewAll(boolean canViewAll) {
		this.canViewAll = canViewAll;
	}


	// @Column(name="CAN_VIEW_SOME")
	public boolean getCanViewSome() {
		return this.canViewSome;
	}

	public void setCanViewSome(boolean canViewSome) {
		this.canViewSome = canViewSome;
	}


	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	// @Column(name="LIMIT_FLAG_KEY")
	public short getLimitFlagKey() {
		return this.limitFlagKey;
	}

	public void setLimitFlagKey(short limitFlagKey) {
		this.limitFlagKey = limitFlagKey;
	}


	// @Column(name="LIMIT_FLAG_VALUE")
	public short getLimitFlagValue() {
		return this.limitFlagValue;
	}

	public void setLimitFlagValue(short limitFlagValue) {
		this.limitFlagValue = limitFlagValue;
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


	// @Column(name="TABLE_KEY")
	public short getTableKey() {
		return this.tableKey;
	}

	public void setTableKey(short tableKey) {
		this.tableKey = tableKey;
	}


	// @Column(name="USER_GROUP_KEY")
	public short getUserGroupKey() {
		return this.userGroupKey;
	}

	public void setUserGroupKey(short userGroupKey) {
		this.userGroupKey = userGroupKey;
	}


	// @Column(name="USER_GROUP_RIGHTS_DEFN_PID", nullable=false)
	public int getUserGroupRightsDefnPid() {
		return this.userGroupRightsDefnPid;
	}

	public void setUserGroupRightsDefnPid(int userGroupRightsDefnPid) {
		this.userGroupRightsDefnPid = userGroupRightsDefnPid;
	}

}
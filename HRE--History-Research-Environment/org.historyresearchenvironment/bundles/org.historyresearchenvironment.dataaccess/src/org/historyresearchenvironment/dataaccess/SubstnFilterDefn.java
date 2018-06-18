package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the SUBSTN_FILTER_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="SUBSTN_FILTER_DEFNS")
// @NamedQuery(name="SubstnFilterDefn.findAll", query="SELECT s FROM SubstnFilterDefn s")
public class SubstnFilterDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private boolean isAction;
	private boolean isJoin;
	private boolean isSort;
	private boolean isSystem;
	private short reminderKey;
	private short scriptGroupKey;
	private short scriptKey;
	private short setKey;
	private boolean show;
	private int substnFilterDefnPid;

	public SubstnFilterDefn() {
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


	// @Column(name="IS_ACTION")
	public boolean getIsAction() {
		return this.isAction;
	}

	public void setIsAction(boolean isAction) {
		this.isAction = isAction;
	}


	// @Column(name="IS_JOIN")
	public boolean getIsJoin() {
		return this.isJoin;
	}

	public void setIsJoin(boolean isJoin) {
		this.isJoin = isJoin;
	}


	// @Column(name="IS_SORT")
	public boolean getIsSort() {
		return this.isSort;
	}

	public void setIsSort(boolean isSort) {
		this.isSort = isSort;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}


	// @Column(name="SCRIPT_GROUP_KEY")
	public short getScriptGroupKey() {
		return this.scriptGroupKey;
	}

	public void setScriptGroupKey(short scriptGroupKey) {
		this.scriptGroupKey = scriptGroupKey;
	}


	// @Column(name="SCRIPT_KEY")
	public short getScriptKey() {
		return this.scriptKey;
	}

	public void setScriptKey(short scriptKey) {
		this.scriptKey = scriptKey;
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


	// @Column(name="SUBSTN_FILTER_DEFN_PID", nullable=false)
	public int getSubstnFilterDefnPid() {
		return this.substnFilterDefnPid;
	}

	public void setSubstnFilterDefnPid(int substnFilterDefnPid) {
		this.substnFilterDefnPid = substnFilterDefnPid;
	}

}
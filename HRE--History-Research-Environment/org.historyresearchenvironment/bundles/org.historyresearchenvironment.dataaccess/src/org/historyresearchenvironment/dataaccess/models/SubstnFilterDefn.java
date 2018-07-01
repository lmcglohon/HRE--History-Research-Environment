package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the SUBSTN_FILTER_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="SUBSTN_FILTER_DEFNS")
// @NamedQuery(name="SubstnFilterDefn.findAll", query="SELECT s FROM
// SubstnFilterDefn s")
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

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="IS_ACTION")
	public boolean getIsAction() {
		return this.isAction;
	}

	// @Column(name="IS_JOIN")
	public boolean getIsJoin() {
		return this.isJoin;
	}

	// @Column(name="IS_SORT")
	public boolean getIsSort() {
		return this.isSort;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
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

	// @Column(name="SCRIPT_GROUP_KEY")
	public short getScriptGroupKey() {
		return this.scriptGroupKey;
	}

	// @Column(name="SCRIPT_KEY")
	public short getScriptKey() {
		return this.scriptKey;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	// @Column(name="SUBSTN_FILTER_DEFN_PID", nullable=false)
	public int getSubstnFilterDefnPid() {
		return this.substnFilterDefnPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setIsAction(boolean isAction) {
		this.isAction = isAction;
	}

	public void setIsJoin(boolean isJoin) {
		this.isJoin = isJoin;
	}

	public void setIsSort(boolean isSort) {
		this.isSort = isSort;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}

	public void setScriptGroupKey(short scriptGroupKey) {
		this.scriptGroupKey = scriptGroupKey;
	}

	public void setScriptKey(short scriptKey) {
		this.scriptKey = scriptKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public void setSubstnFilterDefnPid(int substnFilterDefnPid) {
		this.substnFilterDefnPid = substnFilterDefnPid;
	}

}
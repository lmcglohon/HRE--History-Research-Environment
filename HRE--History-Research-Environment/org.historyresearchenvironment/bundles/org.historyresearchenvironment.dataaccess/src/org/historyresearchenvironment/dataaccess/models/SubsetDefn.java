package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the SUBSET_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="SUBSET_DEFNS")
// @NamedQuery(name="SubsetDefn.findAll", query="SELECT s FROM SubsetDefn s")
public class SubsetDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private int displayOrder;
	private boolean isDefault;
	private boolean isSystem;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private int size;
	private int stackIndex;
	private int subsetDefnPid;
	private short subsetTypeKey;

	public SubsetDefn() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public int getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
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

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	public int getSize() {
		return this.size;
	}

	// @Column(name="STACK_INDEX")
	public int getStackIndex() {
		return this.stackIndex;
	}

	// @Column(name="SUBSET_DEFN_PID", nullable=false)
	public int getSubsetDefnPid() {
		return this.subsetDefnPid;
	}

	// @Column(name="SUBSET_TYPE_KEY")
	public short getSubsetTypeKey() {
		return this.subsetTypeKey;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDisplayOrder(int displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
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

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setStackIndex(int stackIndex) {
		this.stackIndex = stackIndex;
	}

	public void setSubsetDefnPid(int subsetDefnPid) {
		this.subsetDefnPid = subsetDefnPid;
	}

	public void setSubsetTypeKey(short subsetTypeKey) {
		this.subsetTypeKey = subsetTypeKey;
	}

}
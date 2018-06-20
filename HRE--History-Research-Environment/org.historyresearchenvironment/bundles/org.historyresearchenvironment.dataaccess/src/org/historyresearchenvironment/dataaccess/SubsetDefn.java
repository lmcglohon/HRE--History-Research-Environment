package org.historyresearchenvironment.dataaccess;

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


	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
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
	public int getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(int displayOrder) {
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


	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}


	// @Column(name="STACK_INDEX")
	public int getStackIndex() {
		return this.stackIndex;
	}

	public void setStackIndex(int stackIndex) {
		this.stackIndex = stackIndex;
	}


	// @Column(name="SUBSET_DEFN_PID", nullable=false)
	public int getSubsetDefnPid() {
		return this.subsetDefnPid;
	}

	public void setSubsetDefnPid(int subsetDefnPid) {
		this.subsetDefnPid = subsetDefnPid;
	}


	// @Column(name="SUBSET_TYPE_KEY")
	public short getSubsetTypeKey() {
		return this.subsetTypeKey;
	}

	public void setSubsetTypeKey(short subsetTypeKey) {
		this.subsetTypeKey = subsetTypeKey;
	}

}
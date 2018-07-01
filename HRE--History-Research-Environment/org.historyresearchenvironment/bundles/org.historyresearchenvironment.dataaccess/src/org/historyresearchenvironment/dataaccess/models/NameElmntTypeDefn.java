package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the NAME_ELMNT_TYPE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="NAME_ELMNT_TYPE_DEFNS")
// @NamedQuery(name="NameElmntTypeDefn.findAll", query="SELECT n FROM
// NameElmntTypeDefn n")
public class NameElmntTypeDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short dataTypeKey;
	private short displayOrder;
	private boolean isDefault;
	private boolean isSystem;
	private int nameElmntTypeDefnPid;
	private short reminderKey;
	private short setKey;
	private boolean show;

	public NameElmntTypeDefn() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DATA_TYPE_KEY")
	public short getDataTypeKey() {
		return this.dataTypeKey;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
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

	// @Column(name="NAME_ELMNT_TYPE_DEFN_PID", nullable=false)
	public int getNameElmntTypeDefnPid() {
		return this.nameElmntTypeDefnPid;
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

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDataTypeKey(short dataTypeKey) {
		this.dataTypeKey = dataTypeKey;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setNameElmntTypeDefnPid(int nameElmntTypeDefnPid) {
		this.nameElmntTypeDefnPid = nameElmntTypeDefnPid;
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

}
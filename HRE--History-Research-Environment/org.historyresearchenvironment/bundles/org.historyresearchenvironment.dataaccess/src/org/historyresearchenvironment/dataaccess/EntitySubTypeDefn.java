package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the ENTITY_SUB_TYPE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="ENTITY_SUB_TYPE_DEFNS")
// @NamedQuery(name="EntitySubTypeDefn.findAll", query="SELECT e FROM EntitySubTypeDefn e")
public class EntitySubTypeDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private short baseEntitySubTypeKey;
	private short baseEntityTypeKey;
	private int commitPid;
	private short displayOrder;
	private int entitySubTypePid;
	private short groupOfSubTypeKey;
	private short groupOfTypeKey;
	private boolean isDefault;
	private boolean isSystem;
	private short parentSubTypeKey;
	private short reminderKey;
	private short setKey;
	private boolean show;

	public EntitySubTypeDefn() {
	}


	// @Id
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}


	// @Column(name="BASE_ENTITY_SUB_TYPE_KEY")
	public short getBaseEntitySubTypeKey() {
		return this.baseEntitySubTypeKey;
	}

	public void setBaseEntitySubTypeKey(short baseEntitySubTypeKey) {
		this.baseEntitySubTypeKey = baseEntitySubTypeKey;
	}


	// @Column(name="BASE_ENTITY_TYPE_KEY")
	public short getBaseEntityTypeKey() {
		return this.baseEntityTypeKey;
	}

	public void setBaseEntityTypeKey(short baseEntityTypeKey) {
		this.baseEntityTypeKey = baseEntityTypeKey;
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


	// @Column(name="ENTITY_SUB_TYPE_PID", nullable=false)
	public int getEntitySubTypePid() {
		return this.entitySubTypePid;
	}

	public void setEntitySubTypePid(int entitySubTypePid) {
		this.entitySubTypePid = entitySubTypePid;
	}


	// @Column(name="GROUP_OF_SUB_TYPE_KEY")
	public short getGroupOfSubTypeKey() {
		return this.groupOfSubTypeKey;
	}

	public void setGroupOfSubTypeKey(short groupOfSubTypeKey) {
		this.groupOfSubTypeKey = groupOfSubTypeKey;
	}


	// @Column(name="GROUP_OF_TYPE_KEY")
	public short getGroupOfTypeKey() {
		return this.groupOfTypeKey;
	}

	public void setGroupOfTypeKey(short groupOfTypeKey) {
		this.groupOfTypeKey = groupOfTypeKey;
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


	// @Column(name="PARENT_SUB_TYPE_KEY")
	public short getParentSubTypeKey() {
		return this.parentSubTypeKey;
	}

	public void setParentSubTypeKey(short parentSubTypeKey) {
		this.parentSubTypeKey = parentSubTypeKey;
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

}
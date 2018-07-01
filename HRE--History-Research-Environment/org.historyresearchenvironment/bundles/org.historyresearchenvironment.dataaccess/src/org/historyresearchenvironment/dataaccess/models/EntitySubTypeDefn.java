package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the ENTITY_SUB_TYPE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="ENTITY_SUB_TYPE_DEFNS")
// @NamedQuery(name="EntitySubTypeDefn.findAll", query="SELECT e FROM
// EntitySubTypeDefn e")
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

	// @Column(name="BASE_ENTITY_SUB_TYPE_KEY")
	public short getBaseEntitySubTypeKey() {
		return this.baseEntitySubTypeKey;
	}

	// @Column(name="BASE_ENTITY_TYPE_KEY")
	public short getBaseEntityTypeKey() {
		return this.baseEntityTypeKey;
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="ENTITY_SUB_TYPE_PID", nullable=false)
	public int getEntitySubTypePid() {
		return this.entitySubTypePid;
	}

	// @Column(name="GROUP_OF_SUB_TYPE_KEY")
	public short getGroupOfSubTypeKey() {
		return this.groupOfSubTypeKey;
	}

	// @Column(name="GROUP_OF_TYPE_KEY")
	public short getGroupOfTypeKey() {
		return this.groupOfTypeKey;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="PARENT_SUB_TYPE_KEY")
	public short getParentSubTypeKey() {
		return this.parentSubTypeKey;
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

	public void setBaseEntitySubTypeKey(short baseEntitySubTypeKey) {
		this.baseEntitySubTypeKey = baseEntitySubTypeKey;
	}

	public void setBaseEntityTypeKey(short baseEntityTypeKey) {
		this.baseEntityTypeKey = baseEntityTypeKey;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setEntitySubTypePid(int entitySubTypePid) {
		this.entitySubTypePid = entitySubTypePid;
	}

	public void setGroupOfSubTypeKey(short groupOfSubTypeKey) {
		this.groupOfSubTypeKey = groupOfSubTypeKey;
	}

	public void setGroupOfTypeKey(short groupOfTypeKey) {
		this.groupOfTypeKey = groupOfTypeKey;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setParentSubTypeKey(short parentSubTypeKey) {
		this.parentSubTypeKey = parentSubTypeKey;
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
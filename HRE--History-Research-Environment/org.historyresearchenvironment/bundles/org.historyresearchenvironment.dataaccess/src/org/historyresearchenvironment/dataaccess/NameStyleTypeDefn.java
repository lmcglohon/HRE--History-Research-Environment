package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the NAME_STYLE_TYPE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="NAME_STYLE_TYPE_DEFNS")
// @NamedQuery(name="NameStyleTypeDefn.findAll", query="SELECT n FROM NameStyleTypeDefn n")
public class NameStyleTypeDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private int endUsagePid;
	private short entitySubTypeKey;
	private short entityTypeKey;
	private boolean isDefault;
	private boolean isSystem;
	private int nameStyleTypeDefnPid;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private int startUsagePid;

	public NameStyleTypeDefn() {
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
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}


	// @Column(name="END_USAGE_PID")
	public int getEndUsagePid() {
		return this.endUsagePid;
	}

	public void setEndUsagePid(int endUsagePid) {
		this.endUsagePid = endUsagePid;
	}


	// @Column(name="ENTITY_SUB_TYPE_KEY")
	public short getEntitySubTypeKey() {
		return this.entitySubTypeKey;
	}

	public void setEntitySubTypeKey(short entitySubTypeKey) {
		this.entitySubTypeKey = entitySubTypeKey;
	}


	// @Column(name="ENTITY_TYPE_KEY")
	public short getEntityTypeKey() {
		return this.entityTypeKey;
	}

	public void setEntityTypeKey(short entityTypeKey) {
		this.entityTypeKey = entityTypeKey;
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


	// @Column(name="NAME_STYLE_TYPE_DEFN_PID", nullable=false)
	public int getNameStyleTypeDefnPid() {
		return this.nameStyleTypeDefnPid;
	}

	public void setNameStyleTypeDefnPid(int nameStyleTypeDefnPid) {
		this.nameStyleTypeDefnPid = nameStyleTypeDefnPid;
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


	// @Column(name="START_USAGE_PID")
	public int getStartUsagePid() {
		return this.startUsagePid;
	}

	public void setStartUsagePid(int startUsagePid) {
		this.startUsagePid = startUsagePid;
	}

}
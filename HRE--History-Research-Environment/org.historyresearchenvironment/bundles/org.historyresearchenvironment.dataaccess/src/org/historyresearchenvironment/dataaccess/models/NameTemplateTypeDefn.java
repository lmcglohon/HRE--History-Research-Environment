package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;


/**
 * The persistent class for the NAME_TEMPLATE_TYPE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="NAME_TEMPLATE_TYPE_DEFNS")
// @NamedQuery(name="NameTemplateTypeDefn.findAll", query="SELECT n FROM NameTemplateTypeDefn n")
public class NameTemplateTypeDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private short entitySubTypeKey;
	private short entityTypeKey;
	private boolean isDefault;
	private boolean isMandatory;
	private boolean isSystem;
	private int nameTemplateTypeDefnPid;
	private short reminderKey;
	private short setPid;
	private boolean show;
	private boolean sortingOnly;

	public NameTemplateTypeDefn() {
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


	// @Column(name="IS_MANDATORY")
	public boolean getIsMandatory() {
		return this.isMandatory;
	}

	public void setIsMandatory(boolean isMandatory) {
		this.isMandatory = isMandatory;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="NAME_TEMPLATE_TYPE_DEFN_PID", nullable=false)
	public int getNameTemplateTypeDefnPid() {
		return this.nameTemplateTypeDefnPid;
	}

	public void setNameTemplateTypeDefnPid(int nameTemplateTypeDefnPid) {
		this.nameTemplateTypeDefnPid = nameTemplateTypeDefnPid;
	}


	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}


	// @Column(name="SET_PID", nullable=false)
	public short getSetPid() {
		return this.setPid;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}


	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	public void setShow(boolean show) {
		this.show = show;
	}


	// @Column(name="SORTING_ONLY")
	public boolean getSortingOnly() {
		return this.sortingOnly;
	}

	public void setSortingOnly(boolean sortingOnly) {
		this.sortingOnly = sortingOnly;
	}

}
package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the NAME_OUT_TEMPLATE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="NAME_OUT_TEMPLATE_DEFNS")
// @NamedQuery(name="NameOutTemplateDefn.findAll", query="SELECT n FROM
// NameOutTemplateDefn n")
public class NameOutTemplateDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private boolean isDefault;
	private boolean isSystem;
	private int nameOutTemplateDefnPid;
	private short parentNameStyleTypeKey;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private boolean sortingOnly;
	private short templateTypeKey;

	public NameOutTemplateDefn() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
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

	// @Column(name="NAME_OUT_TEMPLATE_DEFN_PID", nullable=false)
	public int getNameOutTemplateDefnPid() {
		return this.nameOutTemplateDefnPid;
	}

	// @Column(name="PARENT_NAME_STYLE_TYPE_KEY")
	public short getParentNameStyleTypeKey() {
		return this.parentNameStyleTypeKey;
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

	// @Column(name="SORTING_ONLY")
	public boolean getSortingOnly() {
		return this.sortingOnly;
	}

	// @Column(name="TEMPLATE_TYPE_KEY")
	public short getTemplateTypeKey() {
		return this.templateTypeKey;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
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

	public void setNameOutTemplateDefnPid(int nameOutTemplateDefnPid) {
		this.nameOutTemplateDefnPid = nameOutTemplateDefnPid;
	}

	public void setParentNameStyleTypeKey(short parentNameStyleTypeKey) {
		this.parentNameStyleTypeKey = parentNameStyleTypeKey;
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

	public void setSortingOnly(boolean sortingOnly) {
		this.sortingOnly = sortingOnly;
	}

	public void setTemplateTypeKey(short templateTypeKey) {
		this.templateTypeKey = templateTypeKey;
	}

}
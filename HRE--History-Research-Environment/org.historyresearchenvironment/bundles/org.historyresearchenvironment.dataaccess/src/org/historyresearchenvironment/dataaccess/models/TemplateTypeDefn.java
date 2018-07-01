package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the TEMPLATE_TYPE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="TEMPLATE_TYPE_DEFNS")
// @NamedQuery(name="TemplateTypeDefn.findAll", query="SELECT t FROM
// TemplateTypeDefn t")
public class TemplateTypeDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private short entitySubTypeKey;
	private short entityTypeKey;
	private boolean isDefault;
	private boolean isMandatory;
	private boolean isSystem;
	private short publishTypeKey;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private int templateTypeDefnPid;

	public TemplateTypeDefn() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="ENTITY_SUB_TYPE_KEY")
	public short getEntitySubTypeKey() {
		return this.entitySubTypeKey;
	}

	// @Column(name="ENTITY_TYPE_KEY")
	public short getEntityTypeKey() {
		return this.entityTypeKey;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="IS_MANDATORY")
	public boolean getIsMandatory() {
		return this.isMandatory;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="PUBLISH_TYPE_KEY")
	public short getPublishTypeKey() {
		return this.publishTypeKey;
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

	// @Column(name="TEMPLATE_TYPE_DEFN_PID", nullable=false)
	public int getTemplateTypeDefnPid() {
		return this.templateTypeDefnPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setEntitySubTypeKey(short entitySubTypeKey) {
		this.entitySubTypeKey = entitySubTypeKey;
	}

	public void setEntityTypeKey(short entityTypeKey) {
		this.entityTypeKey = entityTypeKey;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setIsMandatory(boolean isMandatory) {
		this.isMandatory = isMandatory;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setPublishTypeKey(short publishTypeKey) {
		this.publishTypeKey = publishTypeKey;
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

	public void setTemplateTypeDefnPid(int templateTypeDefnPid) {
		this.templateTypeDefnPid = templateTypeDefnPid;
	}

}
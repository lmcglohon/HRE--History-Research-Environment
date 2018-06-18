package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the TAG_GROUP_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="TAG_GROUP_DEFNS")
// @NamedQuery(name="TagGroupDefn.findAll", query="SELECT t FROM TagGroupDefn t")
public class TagGroupDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private short entitySubTypeKey;
	private short entityTypeKey;
	private boolean isDefault;
	private boolean isMajorGroup;
	private boolean isSystem;
	private short majorGrpKey;
	private short minorGrpKey;
	private short pluginKey;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private int tagGroupDefnPid;

	public TagGroupDefn() {
	}


	// @Id
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


	// @Column(name="IS_MAJOR_GROUP")
	public boolean getIsMajorGroup() {
		return this.isMajorGroup;
	}

	public void setIsMajorGroup(boolean isMajorGroup) {
		this.isMajorGroup = isMajorGroup;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="MAJOR_GRP_KEY")
	public short getMajorGrpKey() {
		return this.majorGrpKey;
	}

	public void setMajorGrpKey(short majorGrpKey) {
		this.majorGrpKey = majorGrpKey;
	}


	// @Column(name="MINOR_GRP_KEY")
	public short getMinorGrpKey() {
		return this.minorGrpKey;
	}

	public void setMinorGrpKey(short minorGrpKey) {
		this.minorGrpKey = minorGrpKey;
	}


	// @Column(name="PLUGIN_KEY")
	public short getPluginKey() {
		return this.pluginKey;
	}

	public void setPluginKey(short pluginKey) {
		this.pluginKey = pluginKey;
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


	// @Column(name="TAG_GROUP_DEFN_PID", nullable=false)
	public int getTagGroupDefnPid() {
		return this.tagGroupDefnPid;
	}

	public void setTagGroupDefnPid(int tagGroupDefnPid) {
		this.tagGroupDefnPid = tagGroupDefnPid;
	}

}
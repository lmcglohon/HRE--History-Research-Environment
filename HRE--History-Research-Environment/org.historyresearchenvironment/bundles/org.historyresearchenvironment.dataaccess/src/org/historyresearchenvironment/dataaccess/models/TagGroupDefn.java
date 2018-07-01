package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the TAG_GROUP_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="TAG_GROUP_DEFNS")
// @NamedQuery(name="TagGroupDefn.findAll", query="SELECT t FROM TagGroupDefn
// t")
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

	// @Column(name="IS_MAJOR_GROUP")
	public boolean getIsMajorGroup() {
		return this.isMajorGroup;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="MAJOR_GRP_KEY")
	public short getMajorGrpKey() {
		return this.majorGrpKey;
	}

	// @Column(name="MINOR_GRP_KEY")
	public short getMinorGrpKey() {
		return this.minorGrpKey;
	}

	// @Column(name="PLUGIN_KEY")
	public short getPluginKey() {
		return this.pluginKey;
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

	// @Column(name="TAG_GROUP_DEFN_PID", nullable=false)
	public int getTagGroupDefnPid() {
		return this.tagGroupDefnPid;
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

	public void setIsMajorGroup(boolean isMajorGroup) {
		this.isMajorGroup = isMajorGroup;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setMajorGrpKey(short majorGrpKey) {
		this.majorGrpKey = majorGrpKey;
	}

	public void setMinorGrpKey(short minorGrpKey) {
		this.minorGrpKey = minorGrpKey;
	}

	public void setPluginKey(short pluginKey) {
		this.pluginKey = pluginKey;
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

	public void setTagGroupDefnPid(int tagGroupDefnPid) {
		this.tagGroupDefnPid = tagGroupDefnPid;
	}

}
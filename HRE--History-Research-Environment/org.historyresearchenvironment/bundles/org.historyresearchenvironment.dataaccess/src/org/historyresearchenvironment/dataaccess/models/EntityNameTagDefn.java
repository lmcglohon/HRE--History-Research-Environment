package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the ENTITY_NAME_TAG_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="ENTITY_NAME_TAG_DEFNS")
// @NamedQuery(name="EntityNameTagDefn.findAll", query="SELECT e FROM
// EntityNameTagDefn e")
public class EntityNameTagDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short deleteDataScriptGroupKey;
	private int deleteDataScriptPid;
	private short dfltSentceSetKey;
	private short dfltTagGroupKey;
	private short dfltThemeKey;
	private short displayOrder;
	private int entityNameTagDefnPid;
	private short entitySubTypeKey;
	private short entityTypeKey;
	private short globalSentceSetKey;
	private boolean hasMultiPart;
	private boolean isDefault;
	private boolean isSystem;
	private short memoSetTypeKey;
	private short modifyDataScriptGroupKey;
	private int modifyDataScriptPid;
	private short pluginPid;
	private short reminderKey;
	private short sentceSetTypeKey;
	private short sentceStyleTypeKey;
	private short setKey;
	private boolean show;
	private short viewDataScriptGroupKey;
	private int viewDataScriptPid;

	public EntityNameTagDefn() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DELETE_DATA_SCRIPT_GROUP_KEY")
	public short getDeleteDataScriptGroupKey() {
		return this.deleteDataScriptGroupKey;
	}

	// @Column(name="DELETE_DATA_SCRIPT_PID")
	public int getDeleteDataScriptPid() {
		return this.deleteDataScriptPid;
	}

	// @Column(name="DFLT_SENTCE_SET_KEY")
	public short getDfltSentceSetKey() {
		return this.dfltSentceSetKey;
	}

	// @Column(name="DFLT_TAG_GROUP_KEY")
	public short getDfltTagGroupKey() {
		return this.dfltTagGroupKey;
	}

	// @Column(name="DFLT_THEME_KEY")
	public short getDfltThemeKey() {
		return this.dfltThemeKey;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="ENTITY_NAME_TAG_DEFN_PID", nullable=false)
	public int getEntityNameTagDefnPid() {
		return this.entityNameTagDefnPid;
	}

	// @Column(name="ENTITY_SUB_TYPE_KEY")
	public short getEntitySubTypeKey() {
		return this.entitySubTypeKey;
	}

	// @Column(name="ENTITY_TYPE_KEY")
	public short getEntityTypeKey() {
		return this.entityTypeKey;
	}

	// @Column(name="GLOBAL_SENTCE_SET_KEY")
	public short getGlobalSentceSetKey() {
		return this.globalSentceSetKey;
	}

	// @Column(name="HAS_MULTI_PART")
	public boolean getHasMultiPart() {
		return this.hasMultiPart;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="MEMO_SET_TYPE_KEY")
	public short getMemoSetTypeKey() {
		return this.memoSetTypeKey;
	}

	// @Column(name="MODIFY_DATA_SCRIPT_GROUP_KEY")
	public short getModifyDataScriptGroupKey() {
		return this.modifyDataScriptGroupKey;
	}

	// @Column(name="MODIFY_DATA_SCRIPT_PID")
	public int getModifyDataScriptPid() {
		return this.modifyDataScriptPid;
	}

	// @Column(name="PLUGIN_PID")
	public short getPluginPid() {
		return this.pluginPid;
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

	// @Column(name="SENTCE_SET_TYPE_KEY")
	public short getSentceSetTypeKey() {
		return this.sentceSetTypeKey;
	}

	// @Column(name="SENTCE_STYLE_TYPE_KEY")
	public short getSentceStyleTypeKey() {
		return this.sentceStyleTypeKey;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	// @Column(name="VIEW_DATA_SCRIPT_GROUP_KEY")
	public short getViewDataScriptGroupKey() {
		return this.viewDataScriptGroupKey;
	}

	// @Column(name="VIEW_DATA_SCRIPT_PID")
	public int getViewDataScriptPid() {
		return this.viewDataScriptPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDeleteDataScriptGroupKey(short deleteDataScriptGroupKey) {
		this.deleteDataScriptGroupKey = deleteDataScriptGroupKey;
	}

	public void setDeleteDataScriptPid(int deleteDataScriptPid) {
		this.deleteDataScriptPid = deleteDataScriptPid;
	}

	public void setDfltSentceSetKey(short dfltSentceSetKey) {
		this.dfltSentceSetKey = dfltSentceSetKey;
	}

	public void setDfltTagGroupKey(short dfltTagGroupKey) {
		this.dfltTagGroupKey = dfltTagGroupKey;
	}

	public void setDfltThemeKey(short dfltThemeKey) {
		this.dfltThemeKey = dfltThemeKey;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setEntityNameTagDefnPid(int entityNameTagDefnPid) {
		this.entityNameTagDefnPid = entityNameTagDefnPid;
	}

	public void setEntitySubTypeKey(short entitySubTypeKey) {
		this.entitySubTypeKey = entitySubTypeKey;
	}

	public void setEntityTypeKey(short entityTypeKey) {
		this.entityTypeKey = entityTypeKey;
	}

	public void setGlobalSentceSetKey(short globalSentceSetKey) {
		this.globalSentceSetKey = globalSentceSetKey;
	}

	public void setHasMultiPart(boolean hasMultiPart) {
		this.hasMultiPart = hasMultiPart;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setMemoSetTypeKey(short memoSetTypeKey) {
		this.memoSetTypeKey = memoSetTypeKey;
	}

	public void setModifyDataScriptGroupKey(short modifyDataScriptGroupKey) {
		this.modifyDataScriptGroupKey = modifyDataScriptGroupKey;
	}

	public void setModifyDataScriptPid(int modifyDataScriptPid) {
		this.modifyDataScriptPid = modifyDataScriptPid;
	}

	public void setPluginPid(short pluginPid) {
		this.pluginPid = pluginPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}

	public void setSentceSetTypeKey(short sentceSetTypeKey) {
		this.sentceSetTypeKey = sentceSetTypeKey;
	}

	public void setSentceStyleTypeKey(short sentceStyleTypeKey) {
		this.sentceStyleTypeKey = sentceStyleTypeKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public void setViewDataScriptGroupKey(short viewDataScriptGroupKey) {
		this.viewDataScriptGroupKey = viewDataScriptGroupKey;
	}

	public void setViewDataScriptPid(int viewDataScriptPid) {
		this.viewDataScriptPid = viewDataScriptPid;
	}

}
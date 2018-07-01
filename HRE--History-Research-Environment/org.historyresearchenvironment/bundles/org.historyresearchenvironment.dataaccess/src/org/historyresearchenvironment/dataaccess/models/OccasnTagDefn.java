package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the OCCASN_TAG_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="OCCASN_TAG_DEFNS")
// @NamedQuery(name="OccasnTagDefn.findAll", query="SELECT o FROM OccasnTagDefn
// o")
public class OccasnTagDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short deleteDataScriptGroupKey;
	private int deleteDataScriptPid;
	private short dfltTagGroupKey;
	private short dfltThemeKey;
	private short displayOrder;
	private String gedcomTag;
	private short globalSentceSetKey;
	private boolean hasParents;
	private boolean isDefault;
	private boolean isEvent;
	private boolean isSystem;
	private short maxNumHdateAssoc;
	private short maxNumKeyAssoc;
	private short maxNumLocationAssoc;
	private short memoSetTypeKey;
	private short minNumHdateAssoc;
	private short minNumKeyAssoc;
	private short minNumLocationAssoc;
	private short modifyDataScriptGroupKey;
	private int modifyDataScriptPid;
	private int occasnTagDefnPid;
	private short reminderKey;
	private short sentceSetTypeKey;
	private short sentceStyleTypeKey;
	private short setKey;
	private boolean show;
	private short viewDataScriptGroupKey;
	private int viewDataScriptPid;

	public OccasnTagDefn() {
	}

	// @Column(name="COMMIT_PID")
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

	// @Column(name="GEDCOM_TAG", length=30)
	public String getGedcomTag() {
		return this.gedcomTag;
	}

	// @Column(name="GLOBAL_SENTCE_SET_KEY")
	public short getGlobalSentceSetKey() {
		return this.globalSentceSetKey;
	}

	// @Column(name="HAS_PARENTS")
	public boolean getHasParents() {
		return this.hasParents;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="IS_EVENT")
	public boolean getIsEvent() {
		return this.isEvent;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="MAX_NUM_HDATE_ASSOC")
	public short getMaxNumHdateAssoc() {
		return this.maxNumHdateAssoc;
	}

	// @Column(name="MAX_NUM_KEY_ASSOC")
	public short getMaxNumKeyAssoc() {
		return this.maxNumKeyAssoc;
	}

	// @Column(name="MAX_NUM_LOCATION_ASSOC")
	public short getMaxNumLocationAssoc() {
		return this.maxNumLocationAssoc;
	}

	// @Column(name="MEMO_SET_TYPE_KEY")
	public short getMemoSetTypeKey() {
		return this.memoSetTypeKey;
	}

	// @Column(name="MIN_NUM_HDATE_ASSOC")
	public short getMinNumHdateAssoc() {
		return this.minNumHdateAssoc;
	}

	// @Column(name="MIN_NUM_KEY_ASSOC")
	public short getMinNumKeyAssoc() {
		return this.minNumKeyAssoc;
	}

	// @Column(name="MIN_NUM_LOCATION_ASSOC")
	public short getMinNumLocationAssoc() {
		return this.minNumLocationAssoc;
	}

	// @Column(name="MODIFY_DATA_SCRIPT_GROUP_KEY")
	public short getModifyDataScriptGroupKey() {
		return this.modifyDataScriptGroupKey;
	}

	// @Column(name="MODIFY_DATA_SCRIPT_PID")
	public int getModifyDataScriptPid() {
		return this.modifyDataScriptPid;
	}

	// @Column(name="OCCASN_TAG_DEFN_PID", nullable=false)
	public int getOccasnTagDefnPid() {
		return this.occasnTagDefnPid;
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

	public void setDfltTagGroupKey(short dfltTagGroupKey) {
		this.dfltTagGroupKey = dfltTagGroupKey;
	}

	public void setDfltThemeKey(short dfltThemeKey) {
		this.dfltThemeKey = dfltThemeKey;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setGedcomTag(String gedcomTag) {
		this.gedcomTag = gedcomTag;
	}

	public void setGlobalSentceSetKey(short globalSentceSetKey) {
		this.globalSentceSetKey = globalSentceSetKey;
	}

	public void setHasParents(boolean hasParents) {
		this.hasParents = hasParents;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setIsEvent(boolean isEvent) {
		this.isEvent = isEvent;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setMaxNumHdateAssoc(short maxNumHdateAssoc) {
		this.maxNumHdateAssoc = maxNumHdateAssoc;
	}

	public void setMaxNumKeyAssoc(short maxNumKeyAssoc) {
		this.maxNumKeyAssoc = maxNumKeyAssoc;
	}

	public void setMaxNumLocationAssoc(short maxNumLocationAssoc) {
		this.maxNumLocationAssoc = maxNumLocationAssoc;
	}

	public void setMemoSetTypeKey(short memoSetTypeKey) {
		this.memoSetTypeKey = memoSetTypeKey;
	}

	public void setMinNumHdateAssoc(short minNumHdateAssoc) {
		this.minNumHdateAssoc = minNumHdateAssoc;
	}

	public void setMinNumKeyAssoc(short minNumKeyAssoc) {
		this.minNumKeyAssoc = minNumKeyAssoc;
	}

	public void setMinNumLocationAssoc(short minNumLocationAssoc) {
		this.minNumLocationAssoc = minNumLocationAssoc;
	}

	public void setModifyDataScriptGroupKey(short modifyDataScriptGroupKey) {
		this.modifyDataScriptGroupKey = modifyDataScriptGroupKey;
	}

	public void setModifyDataScriptPid(int modifyDataScriptPid) {
		this.modifyDataScriptPid = modifyDataScriptPid;
	}

	public void setOccasnTagDefnPid(int occasnTagDefnPid) {
		this.occasnTagDefnPid = occasnTagDefnPid;
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
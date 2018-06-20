package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the OCCASN_TAG_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="OCCASN_TAG_DEFNS")
// @NamedQuery(name="OccasnTagDefn.findAll", query="SELECT o FROM OccasnTagDefn o")
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


	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}


	// @Column(name="COMMIT_PID")
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	// @Column(name="DELETE_DATA_SCRIPT_GROUP_KEY")
	public short getDeleteDataScriptGroupKey() {
		return this.deleteDataScriptGroupKey;
	}

	public void setDeleteDataScriptGroupKey(short deleteDataScriptGroupKey) {
		this.deleteDataScriptGroupKey = deleteDataScriptGroupKey;
	}


	// @Column(name="DELETE_DATA_SCRIPT_PID")
	public int getDeleteDataScriptPid() {
		return this.deleteDataScriptPid;
	}

	public void setDeleteDataScriptPid(int deleteDataScriptPid) {
		this.deleteDataScriptPid = deleteDataScriptPid;
	}


	// @Column(name="DFLT_TAG_GROUP_KEY")
	public short getDfltTagGroupKey() {
		return this.dfltTagGroupKey;
	}

	public void setDfltTagGroupKey(short dfltTagGroupKey) {
		this.dfltTagGroupKey = dfltTagGroupKey;
	}


	// @Column(name="DFLT_THEME_KEY")
	public short getDfltThemeKey() {
		return this.dfltThemeKey;
	}

	public void setDfltThemeKey(short dfltThemeKey) {
		this.dfltThemeKey = dfltThemeKey;
	}


	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}


	// @Column(name="GEDCOM_TAG", length=30)
	public String getGedcomTag() {
		return this.gedcomTag;
	}

	public void setGedcomTag(String gedcomTag) {
		this.gedcomTag = gedcomTag;
	}


	// @Column(name="GLOBAL_SENTCE_SET_KEY")
	public short getGlobalSentceSetKey() {
		return this.globalSentceSetKey;
	}

	public void setGlobalSentceSetKey(short globalSentceSetKey) {
		this.globalSentceSetKey = globalSentceSetKey;
	}


	// @Column(name="HAS_PARENTS")
	public boolean getHasParents() {
		return this.hasParents;
	}

	public void setHasParents(boolean hasParents) {
		this.hasParents = hasParents;
	}


	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}


	// @Column(name="IS_EVENT")
	public boolean getIsEvent() {
		return this.isEvent;
	}

	public void setIsEvent(boolean isEvent) {
		this.isEvent = isEvent;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="MAX_NUM_HDATE_ASSOC")
	public short getMaxNumHdateAssoc() {
		return this.maxNumHdateAssoc;
	}

	public void setMaxNumHdateAssoc(short maxNumHdateAssoc) {
		this.maxNumHdateAssoc = maxNumHdateAssoc;
	}


	// @Column(name="MAX_NUM_KEY_ASSOC")
	public short getMaxNumKeyAssoc() {
		return this.maxNumKeyAssoc;
	}

	public void setMaxNumKeyAssoc(short maxNumKeyAssoc) {
		this.maxNumKeyAssoc = maxNumKeyAssoc;
	}


	// @Column(name="MAX_NUM_LOCATION_ASSOC")
	public short getMaxNumLocationAssoc() {
		return this.maxNumLocationAssoc;
	}

	public void setMaxNumLocationAssoc(short maxNumLocationAssoc) {
		this.maxNumLocationAssoc = maxNumLocationAssoc;
	}


	// @Column(name="MEMO_SET_TYPE_KEY")
	public short getMemoSetTypeKey() {
		return this.memoSetTypeKey;
	}

	public void setMemoSetTypeKey(short memoSetTypeKey) {
		this.memoSetTypeKey = memoSetTypeKey;
	}


	// @Column(name="MIN_NUM_HDATE_ASSOC")
	public short getMinNumHdateAssoc() {
		return this.minNumHdateAssoc;
	}

	public void setMinNumHdateAssoc(short minNumHdateAssoc) {
		this.minNumHdateAssoc = minNumHdateAssoc;
	}


	// @Column(name="MIN_NUM_KEY_ASSOC")
	public short getMinNumKeyAssoc() {
		return this.minNumKeyAssoc;
	}

	public void setMinNumKeyAssoc(short minNumKeyAssoc) {
		this.minNumKeyAssoc = minNumKeyAssoc;
	}


	// @Column(name="MIN_NUM_LOCATION_ASSOC")
	public short getMinNumLocationAssoc() {
		return this.minNumLocationAssoc;
	}

	public void setMinNumLocationAssoc(short minNumLocationAssoc) {
		this.minNumLocationAssoc = minNumLocationAssoc;
	}


	// @Column(name="MODIFY_DATA_SCRIPT_GROUP_KEY")
	public short getModifyDataScriptGroupKey() {
		return this.modifyDataScriptGroupKey;
	}

	public void setModifyDataScriptGroupKey(short modifyDataScriptGroupKey) {
		this.modifyDataScriptGroupKey = modifyDataScriptGroupKey;
	}


	// @Column(name="MODIFY_DATA_SCRIPT_PID")
	public int getModifyDataScriptPid() {
		return this.modifyDataScriptPid;
	}

	public void setModifyDataScriptPid(int modifyDataScriptPid) {
		this.modifyDataScriptPid = modifyDataScriptPid;
	}


	// @Column(name="OCCASN_TAG_DEFN_PID", nullable=false)
	public int getOccasnTagDefnPid() {
		return this.occasnTagDefnPid;
	}

	public void setOccasnTagDefnPid(int occasnTagDefnPid) {
		this.occasnTagDefnPid = occasnTagDefnPid;
	}


	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}


	// @Column(name="SENTCE_SET_TYPE_KEY")
	public short getSentceSetTypeKey() {
		return this.sentceSetTypeKey;
	}

	public void setSentceSetTypeKey(short sentceSetTypeKey) {
		this.sentceSetTypeKey = sentceSetTypeKey;
	}


	// @Column(name="SENTCE_STYLE_TYPE_KEY")
	public short getSentceStyleTypeKey() {
		return this.sentceStyleTypeKey;
	}

	public void setSentceStyleTypeKey(short sentceStyleTypeKey) {
		this.sentceStyleTypeKey = sentceStyleTypeKey;
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


	// @Column(name="VIEW_DATA_SCRIPT_GROUP_KEY")
	public short getViewDataScriptGroupKey() {
		return this.viewDataScriptGroupKey;
	}

	public void setViewDataScriptGroupKey(short viewDataScriptGroupKey) {
		this.viewDataScriptGroupKey = viewDataScriptGroupKey;
	}


	// @Column(name="VIEW_DATA_SCRIPT_PID")
	public int getViewDataScriptPid() {
		return this.viewDataScriptPid;
	}

	public void setViewDataScriptPid(int viewDataScriptPid) {
		this.viewDataScriptPid = viewDataScriptPid;
	}

}
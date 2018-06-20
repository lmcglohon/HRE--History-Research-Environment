package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the OCCASN_OCCASN_TAG_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="OCCASN_OCCASN_TAG_DEFNS")
// @NamedQuery(name="OccasnOccasnTagDefn.findAll", query="SELECT o FROM OccasnOccasnTagDefn o")
public class OccasnOccasnTagDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private short aBRoleNamePairKey;
	private short aOccasnSubTypeKey;
	private int aSentceSetPid;
	private short bOccasnSubTypeKey;
	private int bSentceSetPid;
	private int commitPid;
	private short deleteDataScriptGroupKey;
	private int deleteDataScriptPid;
	private short displayOrder;
	private String gedcomTag;
	private boolean isDefault;
	private boolean isSystem;
	private short modifyDataScriptGroupKey;
	private int modifyDataScriptPid;
	private int occasnOccasnTagDefnPid;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private short tagGroupKey;
	private short themeKey;
	private short viewDataScriptGroupKey;
	private int viewDataScriptPid;

	public OccasnOccasnTagDefn() {
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


	// @Column(name="A_B_ROLE_NAME_PAIR_KEY")
	public short getABRoleNamePairKey() {
		return this.aBRoleNamePairKey;
	}

	public void setABRoleNamePairKey(short aBRoleNamePairKey) {
		this.aBRoleNamePairKey = aBRoleNamePairKey;
	}


	// @Column(name="A_OCCASN_SUB_TYPE_KEY")
	public short getAOccasnSubTypeKey() {
		return this.aOccasnSubTypeKey;
	}

	public void setAOccasnSubTypeKey(short aOccasnSubTypeKey) {
		this.aOccasnSubTypeKey = aOccasnSubTypeKey;
	}


	// @Column(name="A_SENTCE_SET_PID")
	public int getASentceSetPid() {
		return this.aSentceSetPid;
	}

	public void setASentceSetPid(int aSentceSetPid) {
		this.aSentceSetPid = aSentceSetPid;
	}


	// @Column(name="B_OCCASN_SUB_TYPE_KEY")
	public short getBOccasnSubTypeKey() {
		return this.bOccasnSubTypeKey;
	}

	public void setBOccasnSubTypeKey(short bOccasnSubTypeKey) {
		this.bOccasnSubTypeKey = bOccasnSubTypeKey;
	}


	// @Column(name="B_SENTCE_SET_PID")
	public int getBSentceSetPid() {
		return this.bSentceSetPid;
	}

	public void setBSentceSetPid(int bSentceSetPid) {
		this.bSentceSetPid = bSentceSetPid;
	}


	// @Column(name="COMMIT_PID", nullable=false)
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


	// @Column(name="OCCASN_OCCASN_TAG_DEFN_PID", nullable=false)
	public int getOccasnOccasnTagDefnPid() {
		return this.occasnOccasnTagDefnPid;
	}

	public void setOccasnOccasnTagDefnPid(int occasnOccasnTagDefnPid) {
		this.occasnOccasnTagDefnPid = occasnOccasnTagDefnPid;
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


	// @Column(name="TAG_GROUP_KEY")
	public short getTagGroupKey() {
		return this.tagGroupKey;
	}

	public void setTagGroupKey(short tagGroupKey) {
		this.tagGroupKey = tagGroupKey;
	}


	// @Column(name="THEME_KEY")
	public short getThemeKey() {
		return this.themeKey;
	}

	public void setThemeKey(short themeKey) {
		this.themeKey = themeKey;
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
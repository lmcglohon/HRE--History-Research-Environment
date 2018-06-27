package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;


/**
 * The persistent class for the OCCASN_BTWN_ASSOC_TAG_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="OCCASN_BTWN_ASSOC_TAG_DEFNS")
// @NamedQuery(name="OccasnBtwnAssocTagDefn.findAll", query="SELECT o FROM OccasnBtwnAssocTagDefn o")
public class OccasnBtwnAssocTagDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int aSubjSentceSetKey;
	private short assocASubTypeKey;
	private short assocATypeKey;
	private short assocBSubTypeKey;
	private short assocBTypeKey;
	private int bSubjSentceSetKey;
	private int commitPid;
	private short deleteDataScriptGroupKey;
	private int deleteDataScriptPid;
	private short displayOrder;
	private String gedcomTag;
	private boolean isDefault;
	private boolean isSystem;
	private short modifyDataScriptGroupKey;
	private int modifyDataScriptPid;
	private int occasnBtwnAssocTagDefnPid;
	private short occasnSubTypeKey;
	private short reminderKey;
	private short rolePairKey;
	private short sentceStyleTypeKey;
	private short setKey;
	private boolean show;
	private short tagGroupKey;
	private short themeKey;
	private short viewDataScriptGroupKey;
	private int viewDataScriptPid;

	public OccasnBtwnAssocTagDefn() {
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


	// @Column(name="A_SUBJ_SENTCE_SET_KEY")
	public int getASubjSentceSetKey() {
		return this.aSubjSentceSetKey;
	}

	public void setASubjSentceSetKey(int aSubjSentceSetKey) {
		this.aSubjSentceSetKey = aSubjSentceSetKey;
	}


	// @Column(name="ASSOC_A_SUB_TYPE_KEY")
	public short getAssocASubTypeKey() {
		return this.assocASubTypeKey;
	}

	public void setAssocASubTypeKey(short assocASubTypeKey) {
		this.assocASubTypeKey = assocASubTypeKey;
	}


	// @Column(name="ASSOC_A_TYPE_KEY")
	public short getAssocATypeKey() {
		return this.assocATypeKey;
	}

	public void setAssocATypeKey(short assocATypeKey) {
		this.assocATypeKey = assocATypeKey;
	}


	// @Column(name="ASSOC_B_SUB_TYPE_KEY")
	public short getAssocBSubTypeKey() {
		return this.assocBSubTypeKey;
	}

	public void setAssocBSubTypeKey(short assocBSubTypeKey) {
		this.assocBSubTypeKey = assocBSubTypeKey;
	}


	// @Column(name="ASSOC_B_TYPE_KEY")
	public short getAssocBTypeKey() {
		return this.assocBTypeKey;
	}

	public void setAssocBTypeKey(short assocBTypeKey) {
		this.assocBTypeKey = assocBTypeKey;
	}


	// @Column(name="B_SUBJ_SENTCE_SET_KEY")
	public int getBSubjSentceSetKey() {
		return this.bSubjSentceSetKey;
	}

	public void setBSubjSentceSetKey(int bSubjSentceSetKey) {
		this.bSubjSentceSetKey = bSubjSentceSetKey;
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


	// @Column(name="OCCASN_BTWN_ASSOC_TAG_DEFN_PID", nullable=false)
	public int getOccasnBtwnAssocTagDefnPid() {
		return this.occasnBtwnAssocTagDefnPid;
	}

	public void setOccasnBtwnAssocTagDefnPid(int occasnBtwnAssocTagDefnPid) {
		this.occasnBtwnAssocTagDefnPid = occasnBtwnAssocTagDefnPid;
	}


	// @Column(name="OCCASN_SUB_TYPE_KEY")
	public short getOccasnSubTypeKey() {
		return this.occasnSubTypeKey;
	}

	public void setOccasnSubTypeKey(short occasnSubTypeKey) {
		this.occasnSubTypeKey = occasnSubTypeKey;
	}


	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}


	// @Column(name="ROLE_PAIR_KEY")
	public short getRolePairKey() {
		return this.rolePairKey;
	}

	public void setRolePairKey(short rolePairKey) {
		this.rolePairKey = rolePairKey;
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
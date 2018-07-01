package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the CITN_TYPE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="CITN_TYPE_DEFNS")
// @NamedQuery(name="CitnTypeDefn.findAll", query="SELECT c FROM CitnTypeDefn
// c")
public class CitnTypeDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private short citingSubTypeKey;
	private short citingTypeKey;
	private int citnTypeDefnPid;
	private int commitPid;
	private short deleteDataScriptGroupKey;
	private int deleteDataScriptPid;
	private short displayOrder;
	private String gedcomTag;
	private boolean isDefault;
	private boolean isSystem;
	private short modifyDataScriptGroupKey;
	private int modifyDataScriptPid;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private short viewDataScriptGroupKey;
	private int viewDataScriptPid;

	public CitnTypeDefn() {
	}

	// @Column(name="CITING_SUB_TYPE_KEY")
	public short getCitingSubTypeKey() {
		return this.citingSubTypeKey;
	}

	// @Column(name="CITING_TYPE_KEY")
	public short getCitingTypeKey() {
		return this.citingTypeKey;
	}

	// @Column(name="CITN_TYPE_DEFN_PID", nullable=false)
	public int getCitnTypeDefnPid() {
		return this.citnTypeDefnPid;
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

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="GEDCOM_TAG", length=30)
	public String getGedcomTag() {
		return this.gedcomTag;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="MODIFY_DATA_SCRIPT_GROUP_KEY")
	public short getModifyDataScriptGroupKey() {
		return this.modifyDataScriptGroupKey;
	}

	// @Column(name="MODIFY_DATA_SCRIPT_PID")
	public int getModifyDataScriptPid() {
		return this.modifyDataScriptPid;
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

	// @Column(name="VIEW_DATA_SCRIPT_GROUP_KEY")
	public short getViewDataScriptGroupKey() {
		return this.viewDataScriptGroupKey;
	}

	// @Column(name="VIEW_DATA_SCRIPT_PID")
	public int getViewDataScriptPid() {
		return this.viewDataScriptPid;
	}

	public void setCitingSubTypeKey(short citingSubTypeKey) {
		this.citingSubTypeKey = citingSubTypeKey;
	}

	public void setCitingTypeKey(short citingTypeKey) {
		this.citingTypeKey = citingTypeKey;
	}

	public void setCitnTypeDefnPid(int citnTypeDefnPid) {
		this.citnTypeDefnPid = citnTypeDefnPid;
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

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setGedcomTag(String gedcomTag) {
		this.gedcomTag = gedcomTag;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setModifyDataScriptGroupKey(short modifyDataScriptGroupKey) {
		this.modifyDataScriptGroupKey = modifyDataScriptGroupKey;
	}

	public void setModifyDataScriptPid(int modifyDataScriptPid) {
		this.modifyDataScriptPid = modifyDataScriptPid;
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

	public void setViewDataScriptGroupKey(short viewDataScriptGroupKey) {
		this.viewDataScriptGroupKey = viewDataScriptGroupKey;
	}

	public void setViewDataScriptPid(int viewDataScriptPid) {
		this.viewDataScriptPid = viewDataScriptPid;
	}

}
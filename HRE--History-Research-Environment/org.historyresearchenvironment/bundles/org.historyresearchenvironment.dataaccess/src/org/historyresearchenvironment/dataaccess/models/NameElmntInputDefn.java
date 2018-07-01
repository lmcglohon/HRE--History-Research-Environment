package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the NAME_ELMNT_INPUT_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="NAME_ELMNT_INPUT_DEFNS")
// @NamedQuery(name="NameElmntInputDefn.findAll", query="SELECT n FROM
// NameElmntInputDefn n")
public class NameElmntInputDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short dataTypeKey;
	private short displayOrder;
	private short entitySubTypeKey;
	private short entityTypeKey;
	private short fieldRankOrder;
	private boolean isDefault;
	private boolean isDetailElmnt;
	private boolean isSystem;
	private short leftFieldElmntKey;
	private int nameElmntInputDefnPid;
	private short nameElmntTypeKey;
	private short parentNameStyleKey;
	private short reminderKey;
	private short rightFieldElmntKey;
	private short setKey;
	private boolean show;
	private short validScriptGroupKey;
	private short validScriptKey;

	public NameElmntInputDefn() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DATA_TYPE_KEY")
	public short getDataTypeKey() {
		return this.dataTypeKey;
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

	// @Column(name="FIELD_RANK_ORDER")
	public short getFieldRankOrder() {
		return this.fieldRankOrder;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="IS_DETAIL_ELMNT")
	public boolean getIsDetailElmnt() {
		return this.isDetailElmnt;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="LEFT_FIELD_ELMNT_KEY")
	public short getLeftFieldElmntKey() {
		return this.leftFieldElmntKey;
	}

	// @Column(name="NAME_ELMNT_INPUT_DEFN_PID", nullable=false)
	public int getNameElmntInputDefnPid() {
		return this.nameElmntInputDefnPid;
	}

	// @Column(name="NAME_ELMNT_TYPE_KEY")
	public short getNameElmntTypeKey() {
		return this.nameElmntTypeKey;
	}

	// @Column(name="PARENT_NAME_STYLE_KEY")
	public short getParentNameStyleKey() {
		return this.parentNameStyleKey;
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

	// @Column(name="RIGHT_FIELD_ELMNT_KEY")
	public short getRightFieldElmntKey() {
		return this.rightFieldElmntKey;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	// @Column(name="VALID_SCRIPT_GROUP_KEY")
	public short getValidScriptGroupKey() {
		return this.validScriptGroupKey;
	}

	// @Column(name="VALID_SCRIPT_KEY")
	public short getValidScriptKey() {
		return this.validScriptKey;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDataTypeKey(short dataTypeKey) {
		this.dataTypeKey = dataTypeKey;
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

	public void setFieldRankOrder(short fieldRankOrder) {
		this.fieldRankOrder = fieldRankOrder;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setIsDetailElmnt(boolean isDetailElmnt) {
		this.isDetailElmnt = isDetailElmnt;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setLeftFieldElmntKey(short leftFieldElmntKey) {
		this.leftFieldElmntKey = leftFieldElmntKey;
	}

	public void setNameElmntInputDefnPid(int nameElmntInputDefnPid) {
		this.nameElmntInputDefnPid = nameElmntInputDefnPid;
	}

	public void setNameElmntTypeKey(short nameElmntTypeKey) {
		this.nameElmntTypeKey = nameElmntTypeKey;
	}

	public void setParentNameStyleKey(short parentNameStyleKey) {
		this.parentNameStyleKey = parentNameStyleKey;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}

	public void setRightFieldElmntKey(short rightFieldElmntKey) {
		this.rightFieldElmntKey = rightFieldElmntKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public void setValidScriptGroupKey(short validScriptGroupKey) {
		this.validScriptGroupKey = validScriptGroupKey;
	}

	public void setValidScriptKey(short validScriptKey) {
		this.validScriptKey = validScriptKey;
	}

}
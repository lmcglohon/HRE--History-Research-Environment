package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the NAME_ELMNT_INPUT_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="NAME_ELMNT_INPUT_DEFNS")
// @NamedQuery(name="NameElmntInputDefn.findAll", query="SELECT n FROM NameElmntInputDefn n")
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


	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
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


	// @Column(name="DATA_TYPE_KEY")
	public short getDataTypeKey() {
		return this.dataTypeKey;
	}

	public void setDataTypeKey(short dataTypeKey) {
		this.dataTypeKey = dataTypeKey;
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


	// @Column(name="FIELD_RANK_ORDER")
	public short getFieldRankOrder() {
		return this.fieldRankOrder;
	}

	public void setFieldRankOrder(short fieldRankOrder) {
		this.fieldRankOrder = fieldRankOrder;
	}


	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}


	// @Column(name="IS_DETAIL_ELMNT")
	public boolean getIsDetailElmnt() {
		return this.isDetailElmnt;
	}

	public void setIsDetailElmnt(boolean isDetailElmnt) {
		this.isDetailElmnt = isDetailElmnt;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="LEFT_FIELD_ELMNT_KEY")
	public short getLeftFieldElmntKey() {
		return this.leftFieldElmntKey;
	}

	public void setLeftFieldElmntKey(short leftFieldElmntKey) {
		this.leftFieldElmntKey = leftFieldElmntKey;
	}


	// @Column(name="NAME_ELMNT_INPUT_DEFN_PID", nullable=false)
	public int getNameElmntInputDefnPid() {
		return this.nameElmntInputDefnPid;
	}

	public void setNameElmntInputDefnPid(int nameElmntInputDefnPid) {
		this.nameElmntInputDefnPid = nameElmntInputDefnPid;
	}


	// @Column(name="NAME_ELMNT_TYPE_KEY")
	public short getNameElmntTypeKey() {
		return this.nameElmntTypeKey;
	}

	public void setNameElmntTypeKey(short nameElmntTypeKey) {
		this.nameElmntTypeKey = nameElmntTypeKey;
	}


	// @Column(name="PARENT_NAME_STYLE_KEY")
	public short getParentNameStyleKey() {
		return this.parentNameStyleKey;
	}

	public void setParentNameStyleKey(short parentNameStyleKey) {
		this.parentNameStyleKey = parentNameStyleKey;
	}


	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}


	// @Column(name="RIGHT_FIELD_ELMNT_KEY")
	public short getRightFieldElmntKey() {
		return this.rightFieldElmntKey;
	}

	public void setRightFieldElmntKey(short rightFieldElmntKey) {
		this.rightFieldElmntKey = rightFieldElmntKey;
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


	// @Column(name="VALID_SCRIPT_GROUP_KEY")
	public short getValidScriptGroupKey() {
		return this.validScriptGroupKey;
	}

	public void setValidScriptGroupKey(short validScriptGroupKey) {
		this.validScriptGroupKey = validScriptGroupKey;
	}


	// @Column(name="VALID_SCRIPT_KEY")
	public short getValidScriptKey() {
		return this.validScriptKey;
	}

	public void setValidScriptKey(short validScriptKey) {
		this.validScriptKey = validScriptKey;
	}

}
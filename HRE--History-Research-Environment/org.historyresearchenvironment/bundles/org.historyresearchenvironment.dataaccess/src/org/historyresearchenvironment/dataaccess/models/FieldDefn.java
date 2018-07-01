package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the FIELD_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="FIELD_DEFNS")
// @NamedQuery(name="FieldDefn.findAll", query="SELECT f FROM FieldDefn f")
public class FieldDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short dataTypeKey;
	private short displayOrder;
	private short encodeTypeKey;
	private int fieldDefnPid;
	private short fieldFormatKey;
	private int fieldRecentPid;
	private short fieldValidKey;
	private boolean hasAutoFillin;
	private boolean isDefault;
	private int leftFieldPid;
	private short maxFixed;
	private short maxRecent;
	private short reminderKey;
	private int rightFieldPid;
	private int setKey;
	private boolean show;
	private String sqlName;
	private String sqlType;
	private String versionName;

	public FieldDefn() {
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

	// @Column(name="ENCODE_TYPE_KEY")
	public short getEncodeTypeKey() {
		return this.encodeTypeKey;
	}

	// @Column(name="FIELD_DEFN_PID", nullable=false)
	public int getFieldDefnPid() {
		return this.fieldDefnPid;
	}

	// @Column(name="FIELD_FORMAT_KEY")
	public short getFieldFormatKey() {
		return this.fieldFormatKey;
	}

	// @Column(name="FIELD_RECENT_PID")
	public int getFieldRecentPid() {
		return this.fieldRecentPid;
	}

	// @Column(name="FIELD_VALID_KEY")
	public short getFieldValidKey() {
		return this.fieldValidKey;
	}

	// @Column(name="HAS_AUTO_FILLIN")
	public boolean getHasAutoFillin() {
		return this.hasAutoFillin;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="LEFT_FIELD_PID")
	public int getLeftFieldPid() {
		return this.leftFieldPid;
	}

	// @Column(name="MAX_FIXED")
	public short getMaxFixed() {
		return this.maxFixed;
	}

	// @Column(name="MAX_RECENT")
	public short getMaxRecent() {
		return this.maxRecent;
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

	// @Column(name="RIGHT_FIELD_PID")
	public int getRightFieldPid() {
		return this.rightFieldPid;
	}

	// @Column(name="SET_KEY", nullable=false)
	public int getSetKey() {
		return this.setKey;
	}

	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	// @Column(name="SQL_NAME", length=30)
	public String getSqlName() {
		return this.sqlName;
	}

	// @Column(name="SQL_TYPE", length=30)
	public String getSqlType() {
		return this.sqlType;
	}

	// @Column(name="VERSION_NAME", length=300)
	public String getVersionName() {
		return this.versionName;
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

	public void setEncodeTypeKey(short encodeTypeKey) {
		this.encodeTypeKey = encodeTypeKey;
	}

	public void setFieldDefnPid(int fieldDefnPid) {
		this.fieldDefnPid = fieldDefnPid;
	}

	public void setFieldFormatKey(short fieldFormatKey) {
		this.fieldFormatKey = fieldFormatKey;
	}

	public void setFieldRecentPid(int fieldRecentPid) {
		this.fieldRecentPid = fieldRecentPid;
	}

	public void setFieldValidKey(short fieldValidKey) {
		this.fieldValidKey = fieldValidKey;
	}

	public void setHasAutoFillin(boolean hasAutoFillin) {
		this.hasAutoFillin = hasAutoFillin;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setLeftFieldPid(int leftFieldPid) {
		this.leftFieldPid = leftFieldPid;
	}

	public void setMaxFixed(short maxFixed) {
		this.maxFixed = maxFixed;
	}

	public void setMaxRecent(short maxRecent) {
		this.maxRecent = maxRecent;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}

	public void setRightFieldPid(int rightFieldPid) {
		this.rightFieldPid = rightFieldPid;
	}

	public void setSetKey(int setKey) {
		this.setKey = setKey;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public void setSqlName(String sqlName) {
		this.sqlName = sqlName;
	}

	public void setSqlType(String sqlType) {
		this.sqlType = sqlType;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

}
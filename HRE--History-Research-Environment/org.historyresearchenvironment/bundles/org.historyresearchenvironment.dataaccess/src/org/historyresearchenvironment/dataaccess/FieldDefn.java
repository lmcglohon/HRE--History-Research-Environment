package org.historyresearchenvironment.dataaccess;

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


	// @Column(name="ENCODE_TYPE_KEY")
	public short getEncodeTypeKey() {
		return this.encodeTypeKey;
	}

	public void setEncodeTypeKey(short encodeTypeKey) {
		this.encodeTypeKey = encodeTypeKey;
	}


	// @Column(name="FIELD_DEFN_PID", nullable=false)
	public int getFieldDefnPid() {
		return this.fieldDefnPid;
	}

	public void setFieldDefnPid(int fieldDefnPid) {
		this.fieldDefnPid = fieldDefnPid;
	}


	// @Column(name="FIELD_FORMAT_KEY")
	public short getFieldFormatKey() {
		return this.fieldFormatKey;
	}

	public void setFieldFormatKey(short fieldFormatKey) {
		this.fieldFormatKey = fieldFormatKey;
	}


	// @Column(name="FIELD_RECENT_PID")
	public int getFieldRecentPid() {
		return this.fieldRecentPid;
	}

	public void setFieldRecentPid(int fieldRecentPid) {
		this.fieldRecentPid = fieldRecentPid;
	}


	// @Column(name="FIELD_VALID_KEY")
	public short getFieldValidKey() {
		return this.fieldValidKey;
	}

	public void setFieldValidKey(short fieldValidKey) {
		this.fieldValidKey = fieldValidKey;
	}


	// @Column(name="HAS_AUTO_FILLIN")
	public boolean getHasAutoFillin() {
		return this.hasAutoFillin;
	}

	public void setHasAutoFillin(boolean hasAutoFillin) {
		this.hasAutoFillin = hasAutoFillin;
	}


	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}


	// @Column(name="LEFT_FIELD_PID")
	public int getLeftFieldPid() {
		return this.leftFieldPid;
	}

	public void setLeftFieldPid(int leftFieldPid) {
		this.leftFieldPid = leftFieldPid;
	}


	// @Column(name="MAX_FIXED")
	public short getMaxFixed() {
		return this.maxFixed;
	}

	public void setMaxFixed(short maxFixed) {
		this.maxFixed = maxFixed;
	}


	// @Column(name="MAX_RECENT")
	public short getMaxRecent() {
		return this.maxRecent;
	}

	public void setMaxRecent(short maxRecent) {
		this.maxRecent = maxRecent;
	}


	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}


	// @Column(name="RIGHT_FIELD_PID")
	public int getRightFieldPid() {
		return this.rightFieldPid;
	}

	public void setRightFieldPid(int rightFieldPid) {
		this.rightFieldPid = rightFieldPid;
	}


	// @Column(name="SET_KEY", nullable=false)
	public int getSetKey() {
		return this.setKey;
	}

	public void setSetKey(int setKey) {
		this.setKey = setKey;
	}


	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	public void setShow(boolean show) {
		this.show = show;
	}


	// @Column(name="SQL_NAME", length=30)
	public String getSqlName() {
		return this.sqlName;
	}

	public void setSqlName(String sqlName) {
		this.sqlName = sqlName;
	}


	// @Column(name="SQL_TYPE", length=30)
	public String getSqlType() {
		return this.sqlType;
	}

	public void setSqlType(String sqlType) {
		this.sqlType = sqlType;
	}


	// @Column(name="VERSION_NAME", length=300)
	public String getVersionName() {
		return this.versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

}
package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the FIELD_DEFNS database table.
 * 
 */
@Entity
@Table(name = "FIELD_DEFNS")
@NamedQuery(name = "FieldDefn.findAll", query = "SELECT f FROM FieldDefn f")
public class FieldDefn extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DATA_TYPE_KEY")
	private short dataTypeKey;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "ENCODE_TYPE_KEY")
	private short encodeTypeKey;

	@Column(name = "FIELD_DEFN_PID")
	private int fieldDefnPid;

	@Column(name = "FIELD_FORMAT_KEY")
	private short fieldFormatKey;

	@Column(name = "FIELD_RECENT_PID")
	private int fieldRecentPid;

	@Column(name = "FIELD_TYPE_KEY")
	private short fieldTypeKey;

	@Column(name = "FIELD_VALID_KEY")
	private short fieldValidKey;

	@Column(name = "HAS_AUTO_FILLIN")
	private boolean hasAutoFillin;

	@Column(name = "LEFT_FIELD_PID")
	private int leftFieldPid;

	@Column(name = "MAX_FIXED")
	private short maxFixed;

	@Column(name = "MAX_RECENT")
	private short maxRecent;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	@Column(name = "RIGHT_FIELD_PID")
	private int rightFieldPid;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SQL_NAME")
	private String sqlName;

	@Column(name = "SQL_TYPE")
	private String sqlType;

	@Column(name = "VERSION_NAME")
	private String versionName;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public FieldDefn() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#delete(int)
	 */
	@Override
	protected int delete(int recordNum) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#get(int)
	 */
	@Override
	protected AbstractHreTableRow get(int recordNum) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCommitPid() {
		return this.commitPid;
	}

	public short getDataTypeKey() {
		return this.dataTypeKey;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public short getEncodeTypeKey() {
		return this.encodeTypeKey;
	}

	public int getFieldDefnPid() {
		return this.fieldDefnPid;
	}

	public short getFieldFormatKey() {
		return this.fieldFormatKey;
	}

	public int getFieldRecentPid() {
		return this.fieldRecentPid;
	}

	public short getFieldTypeKey() {
		return this.fieldTypeKey;
	}

	public short getFieldValidKey() {
		return this.fieldValidKey;
	}

	public boolean getHasAutoFillin() {
		return this.hasAutoFillin;
	}

	public int getLeftFieldPid() {
		return this.leftFieldPid;
	}

	public short getMaxFixed() {
		return this.maxFixed;
	}

	public short getMaxRecent() {
		return this.maxRecent;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public int getRightFieldPid() {
		return this.rightFieldPid;
	}

	public short getRights() {
		return this.rights;
	}

	public short getSetPid() {
		return this.setPid;
	}

	public String getSqlName() {
		return this.sqlName;
	}

	public String getSqlType() {
		return this.sqlType;
	}

	public String getVersionName() {
		return this.versionName;
	}

	public int getVisibleId() {
		return this.visibleId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#post()
	 */
	@Override
	protected int post() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#put()
	 */
	@Override
	protected int put() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDataTypeKey(short dataTypeKey) {
		this.dataTypeKey = dataTypeKey;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
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

	public void setFieldTypeKey(short fieldTypeKey) {
		this.fieldTypeKey = fieldTypeKey;
	}

	public void setFieldValidKey(short fieldValidKey) {
		this.fieldValidKey = fieldValidKey;
	}

	public void setHasAutoFillin(boolean hasAutoFillin) {
		this.hasAutoFillin = hasAutoFillin;
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

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRightFieldPid(int rightFieldPid) {
		this.rightFieldPid = rightFieldPid;
	}

	public void setRights(short rights) {
		this.rights = rights;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
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

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
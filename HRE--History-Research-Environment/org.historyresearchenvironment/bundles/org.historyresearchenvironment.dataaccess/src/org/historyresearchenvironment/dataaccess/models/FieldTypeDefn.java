package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the FIELD_TYPE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="FIELD_TYPE_DEFNS")
// @NamedQuery(name="FieldTypeDefn.findAll", query="SELECT f FROM FieldTypeDefn
// f")
public class FieldTypeDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short dataTypePid;
	private short displayOrder;
	private short encodingKey;
	private int fieldTypeDefnPid;
	private int inFormatPid;
	private boolean isDefault;
	private double maxFloat;
	private long maxInteger;
	private int maxStringLen;
	private double minFloat;
	private long minInteger;
	private int minStringLen;
	private short outFormatKey;
	private short reminderKey;
	private short setKey;
	private boolean show;

	public FieldTypeDefn() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DATA_TYPE_PID")
	public short getDataTypePid() {
		return this.dataTypePid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="ENCODING_KEY")
	public short getEncodingKey() {
		return this.encodingKey;
	}

	// @Column(name="FIELD_TYPE_DEFN_PID", nullable=false)
	public int getFieldTypeDefnPid() {
		return this.fieldTypeDefnPid;
	}

	// @Column(name="IN_FORMAT_PID")
	public int getInFormatPid() {
		return this.inFormatPid;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="MAX_FLOAT")
	public double getMaxFloat() {
		return this.maxFloat;
	}

	// @Column(name="MAX_INTEGER")
	public long getMaxInteger() {
		return this.maxInteger;
	}

	// @Column(name="MAX_STRING_LEN")
	public int getMaxStringLen() {
		return this.maxStringLen;
	}

	// @Column(name="MIN_FLOAT")
	public double getMinFloat() {
		return this.minFloat;
	}

	// @Column(name="MIN_INTEGER")
	public long getMinInteger() {
		return this.minInteger;
	}

	// @Column(name="MIN_STRING_LEN")
	public int getMinStringLen() {
		return this.minStringLen;
	}

	// @Column(name="OUT_FORMAT_KEY")
	public short getOutFormatKey() {
		return this.outFormatKey;
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

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDataTypePid(short dataTypePid) {
		this.dataTypePid = dataTypePid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setEncodingKey(short encodingKey) {
		this.encodingKey = encodingKey;
	}

	public void setFieldTypeDefnPid(int fieldTypeDefnPid) {
		this.fieldTypeDefnPid = fieldTypeDefnPid;
	}

	public void setInFormatPid(int inFormatPid) {
		this.inFormatPid = inFormatPid;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setMaxFloat(double maxFloat) {
		this.maxFloat = maxFloat;
	}

	public void setMaxInteger(long maxInteger) {
		this.maxInteger = maxInteger;
	}

	public void setMaxStringLen(int maxStringLen) {
		this.maxStringLen = maxStringLen;
	}

	public void setMinFloat(double minFloat) {
		this.minFloat = minFloat;
	}

	public void setMinInteger(long minInteger) {
		this.minInteger = minInteger;
	}

	public void setMinStringLen(int minStringLen) {
		this.minStringLen = minStringLen;
	}

	public void setOutFormatKey(short outFormatKey) {
		this.outFormatKey = outFormatKey;
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

}
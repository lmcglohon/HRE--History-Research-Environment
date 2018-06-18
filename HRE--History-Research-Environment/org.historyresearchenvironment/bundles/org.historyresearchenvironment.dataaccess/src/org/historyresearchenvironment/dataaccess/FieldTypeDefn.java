package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the FIELD_TYPE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="FIELD_TYPE_DEFNS")
// @NamedQuery(name="FieldTypeDefn.findAll", query="SELECT f FROM FieldTypeDefn f")
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


	// @Id
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


	// @Column(name="DATA_TYPE_PID")
	public short getDataTypePid() {
		return this.dataTypePid;
	}

	public void setDataTypePid(short dataTypePid) {
		this.dataTypePid = dataTypePid;
	}


	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}


	// @Column(name="ENCODING_KEY")
	public short getEncodingKey() {
		return this.encodingKey;
	}

	public void setEncodingKey(short encodingKey) {
		this.encodingKey = encodingKey;
	}


	// @Column(name="FIELD_TYPE_DEFN_PID", nullable=false)
	public int getFieldTypeDefnPid() {
		return this.fieldTypeDefnPid;
	}

	public void setFieldTypeDefnPid(int fieldTypeDefnPid) {
		this.fieldTypeDefnPid = fieldTypeDefnPid;
	}


	// @Column(name="IN_FORMAT_PID")
	public int getInFormatPid() {
		return this.inFormatPid;
	}

	public void setInFormatPid(int inFormatPid) {
		this.inFormatPid = inFormatPid;
	}


	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}


	// @Column(name="MAX_FLOAT")
	public double getMaxFloat() {
		return this.maxFloat;
	}

	public void setMaxFloat(double maxFloat) {
		this.maxFloat = maxFloat;
	}


	// @Column(name="MAX_INTEGER")
	public long getMaxInteger() {
		return this.maxInteger;
	}

	public void setMaxInteger(long maxInteger) {
		this.maxInteger = maxInteger;
	}


	// @Column(name="MAX_STRING_LEN")
	public int getMaxStringLen() {
		return this.maxStringLen;
	}

	public void setMaxStringLen(int maxStringLen) {
		this.maxStringLen = maxStringLen;
	}


	// @Column(name="MIN_FLOAT")
	public double getMinFloat() {
		return this.minFloat;
	}

	public void setMinFloat(double minFloat) {
		this.minFloat = minFloat;
	}


	// @Column(name="MIN_INTEGER")
	public long getMinInteger() {
		return this.minInteger;
	}

	public void setMinInteger(long minInteger) {
		this.minInteger = minInteger;
	}


	// @Column(name="MIN_STRING_LEN")
	public int getMinStringLen() {
		return this.minStringLen;
	}

	public void setMinStringLen(int minStringLen) {
		this.minStringLen = minStringLen;
	}


	// @Column(name="OUT_FORMAT_KEY")
	public short getOutFormatKey() {
		return this.outFormatKey;
	}

	public void setOutFormatKey(short outFormatKey) {
		this.outFormatKey = outFormatKey;
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

}
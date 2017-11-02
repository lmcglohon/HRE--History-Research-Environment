package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the FIELD_TYPES database table.
 * 
 */
@Entity
@Table(name = "FIELD_TYPES")
@NamedQuery(name = "FieldType.findAll", query = "SELECT f FROM FieldType f")
public class FieldType extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DATA_TYPE_PID")
	private short dataTypePid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "ENCODING_KEY")
	private short encodingKey;

	@Column(name = "FIELD_TYPE_PID")
	private int fieldTypePid;

	@Column(name = "IN_FORMAT_PID")
	private int inFormatPid;

	@Column(name = "MAX_FLOAT")
	private double maxFloat;

	@Column(name = "MAX_INTEGER")
	private long maxInteger;

	@Column(name = "MAX_STRING_LEN")
	private int maxStringLen;

	@Column(name = "MIN_FLOAT")
	private double minFloat;

	@Column(name = "MIN_INTEGER")
	private long minInteger;

	@Column(name = "MIN_STRING_LEN")
	private int minStringLen;

	@Column(name = "OUT_FORMAT_KEY")
	private short outFormatKey;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public FieldType() {
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

	public short getDataTypePid() {
		return this.dataTypePid;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public short getEncodingKey() {
		return this.encodingKey;
	}

	public int getFieldTypePid() {
		return this.fieldTypePid;
	}

	public int getInFormatPid() {
		return this.inFormatPid;
	}

	public double getMaxFloat() {
		return this.maxFloat;
	}

	public long getMaxInteger() {
		return this.maxInteger;
	}

	public int getMaxStringLen() {
		return this.maxStringLen;
	}

	public double getMinFloat() {
		return this.minFloat;
	}

	public long getMinInteger() {
		return this.minInteger;
	}

	public int getMinStringLen() {
		return this.minStringLen;
	}

	public short getOutFormatKey() {
		return this.outFormatKey;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public short getRights() {
		return this.rights;
	}

	public short getSetPid() {
		return this.setPid;
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

	public void setDataTypePid(short dataTypePid) {
		this.dataTypePid = dataTypePid;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setEncodingKey(short encodingKey) {
		this.encodingKey = encodingKey;
	}

	public void setFieldTypePid(int fieldTypePid) {
		this.fieldTypePid = fieldTypePid;
	}

	public void setInFormatPid(int inFormatPid) {
		this.inFormatPid = inFormatPid;
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

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRights(short rights) {
		this.rights = rights;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
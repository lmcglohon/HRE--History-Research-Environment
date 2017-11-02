package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the NAME_ELMNT_INPUT_DEFNS database table.
 * 
 */
@Entity
@Table(name = "NAME_ELMNT_INPUT_DEFNS")
@NamedQuery(name = "NameElmntInputDefn.findAll", query = "SELECT n FROM NameElmntInputDefn n")
public class NameElmntInputDefn extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DATA_TYPE_KEY")
	private short dataTypeKey;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "ENTITY_TYPE_TBL")
	private short entityTypeTbl;

	@Column(name = "FIELD_VALID_KEY")
	private short fieldValidKey;

	@Column(name = "INPUT_ORDER")
	private short inputOrder;

	@Column(name = "LEFT_FIELD_ELMNT_PID")
	private short leftFieldElmntPid;

	@Column(name = "NAME_ELMNT_INPUT_DEFN_PID")
	private int nameElmntInputDefnPid;

	@Column(name = "NAME_ELMNT_TYPE_KEY")
	private short nameElmntTypeKey;

	@Column(name = "NAME_STYLE_PID")
	private short nameStylePid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	@Column(name = "RIGHT_FIELD_ELMNT_PID")
	private short rightFieldElmntPid;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public NameElmntInputDefn() {
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

	public short getEntityTypeTbl() {
		return this.entityTypeTbl;
	}

	public short getFieldValidKey() {
		return this.fieldValidKey;
	}

	public short getInputOrder() {
		return this.inputOrder;
	}

	public short getLeftFieldElmntPid() {
		return this.leftFieldElmntPid;
	}

	public int getNameElmntInputDefnPid() {
		return this.nameElmntInputDefnPid;
	}

	public short getNameElmntTypeKey() {
		return this.nameElmntTypeKey;
	}

	public short getNameStylePid() {
		return this.nameStylePid;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public short getRightFieldElmntPid() {
		return this.rightFieldElmntPid;
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

	public void setDataTypeKey(short dataTypeKey) {
		this.dataTypeKey = dataTypeKey;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setEntityTypeTbl(short entityTypeTbl) {
		this.entityTypeTbl = entityTypeTbl;
	}

	public void setFieldValidKey(short fieldValidKey) {
		this.fieldValidKey = fieldValidKey;
	}

	public void setInputOrder(short inputOrder) {
		this.inputOrder = inputOrder;
	}

	public void setLeftFieldElmntPid(short leftFieldElmntPid) {
		this.leftFieldElmntPid = leftFieldElmntPid;
	}

	public void setNameElmntInputDefnPid(int nameElmntInputDefnPid) {
		this.nameElmntInputDefnPid = nameElmntInputDefnPid;
	}

	public void setNameElmntTypeKey(short nameElmntTypeKey) {
		this.nameElmntTypeKey = nameElmntTypeKey;
	}

	public void setNameStylePid(short nameStylePid) {
		this.nameStylePid = nameStylePid;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRightFieldElmntPid(short rightFieldElmntPid) {
		this.rightFieldElmntPid = rightFieldElmntPid;
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
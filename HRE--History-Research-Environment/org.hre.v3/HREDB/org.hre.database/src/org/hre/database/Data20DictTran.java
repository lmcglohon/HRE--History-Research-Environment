package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the DATA_20_DICT_TRANS database table.
 * 
 */
@Entity
@Table(name = "DATA_20_DICT_TRANS")
@NamedQuery(name = "Data20DictTran.findAll", query = "SELECT d FROM Data20DictTran d")
public class Data20DictTran extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DATA_20_DICT_TRAN_PID")
	private int data20DictTranPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "FIELD_PID")
	private int fieldPid;

	@Column(name = "LANG_CODE")
	private String langCode;

	@Column(name = "OBJECT_KEY")
	private short objectKey;

	@Column(name = "OBJECT_PID")
	private int objectPid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PLUGIN_PID")
	private short pluginPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	private String trans;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public Data20DictTran() {
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

	public int getData20DictTranPid() {
		return this.data20DictTranPid;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public int getFieldPid() {
		return this.fieldPid;
	}

	public String getLangCode() {
		return this.langCode;
	}

	public short getObjectKey() {
		return this.objectKey;
	}

	public int getObjectPid() {
		return this.objectPid;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public short getPluginPid() {
		return this.pluginPid;
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

	public String getTrans() {
		return this.trans;
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

	public void setData20DictTranPid(int data20DictTranPid) {
		this.data20DictTranPid = data20DictTranPid;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setFieldPid(int fieldPid) {
		this.fieldPid = fieldPid;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	public void setObjectKey(short objectKey) {
		this.objectKey = objectKey;
	}

	public void setObjectPid(int objectPid) {
		this.objectPid = objectPid;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setPluginPid(short pluginPid) {
		this.pluginPid = pluginPid;
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

	public void setTrans(String trans) {
		this.trans = trans;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the LABEL_TRANS database table.
 * 
 */
@Entity
@Table(name = "LABEL_TRANS")
@NamedQuery(name = "LabelTran.findAll", query = "SELECT l FROM LabelTran l")
public class LabelTran extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	private String abbrev;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	private String description;

	@Column(name = "FIELD_PID")
	private short fieldPid;

	@Column(name = "LABEL_TRAN_PID")
	private int labelTranPid;

	@Column(name = "LANG_CODE")
	private String langCode;

	private String name;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	@Column(name = "RECORD_PID")
	private int recordPid;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	private short sort;

	@Column(name = "TABLE_PID")
	private short tablePid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public LabelTran() {
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

	public String getAbbrev() {
		return this.abbrev;
	}

	public int getCommitPid() {
		return this.commitPid;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public String getDescription() {
		return this.description;
	}

	public short getFieldPid() {
		return this.fieldPid;
	}

	public int getLabelTranPid() {
		return this.labelTranPid;
	}

	public String getLangCode() {
		return this.langCode;
	}

	public String getName() {
		return this.name;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public int getRecordPid() {
		return this.recordPid;
	}

	public short getRights() {
		return this.rights;
	}

	public short getSetPid() {
		return this.setPid;
	}

	public short getSort() {
		return this.sort;
	}

	public short getTablePid() {
		return this.tablePid;
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

	public void setAbbrev(String abbrev) {
		this.abbrev = abbrev;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setFieldPid(short fieldPid) {
		this.fieldPid = fieldPid;
	}

	public void setLabelTranPid(int labelTranPid) {
		this.labelTranPid = labelTranPid;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRecordPid(int recordPid) {
		this.recordPid = recordPid;
	}

	public void setRights(short rights) {
		this.rights = rights;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setSort(short sort) {
		this.sort = sort;
	}

	public void setTablePid(short tablePid) {
		this.tablePid = tablePid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
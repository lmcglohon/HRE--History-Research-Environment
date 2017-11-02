package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SOURCE_NAME_PARTS database table.
 * 
 */
@Entity
@Table(name = "SOURCE_NAME_PARTS")
@NamedQuery(name = "SourceNamePart.findAll", query = "SELECT s FROM SourceNamePart s")
public class SourceNamePart extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "ELEMENT_PID")
	private short elementPid;

	@Column(name = "LANG_CODE")
	private String langCode;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	private int shared;

	@Column(name = "SOURCE_NAME_PART_PID")
	private int sourceNamePartPid;

	private String trans;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public SourceNamePart() {
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

	public short getDefnPid() {
		return this.defnPid;
	}

	public short getElementPid() {
		return this.elementPid;
	}

	public String getLangCode() {
		return this.langCode;
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

	public int getShared() {
		return this.shared;
	}

	public int getSourceNamePartPid() {
		return this.sourceNamePartPid;
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

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setElementPid(short elementPid) {
		this.elementPid = elementPid;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
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

	public void setShared(int shared) {
		this.shared = shared;
	}

	public void setSourceNamePartPid(int sourceNamePartPid) {
		this.sourceNamePartPid = sourceNamePartPid;
	}

	public void setTrans(String trans) {
		this.trans = trans;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
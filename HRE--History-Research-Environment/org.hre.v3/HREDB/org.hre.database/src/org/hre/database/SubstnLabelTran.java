package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SUBSTN_LABEL_TRANS database table.
 * 
 */
@Entity
@Table(name = "SUBSTN_LABEL_TRANS")
@NamedQuery(name = "SubstnLabelTran.findAll", query = "SELECT s FROM SubstnLabelTran s")
public class SubstnLabelTran extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	private String abbrev;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	private String description;

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

	@Column(name = "SUBSTN_LABEL_TRAN_PID")
	private int substnLabelTranPid;

	@Column(name = "TABLE_KEY")
	private short tableKey;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public SubstnLabelTran() {
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

	public int getSubstnLabelTranPid() {
		return this.substnLabelTranPid;
	}

	public short getTableKey() {
		return this.tableKey;
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

	public void setSubstnLabelTranPid(int substnLabelTranPid) {
		this.substnLabelTranPid = substnLabelTranPid;
	}

	public void setTableKey(short tableKey) {
		this.tableKey = tableKey;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
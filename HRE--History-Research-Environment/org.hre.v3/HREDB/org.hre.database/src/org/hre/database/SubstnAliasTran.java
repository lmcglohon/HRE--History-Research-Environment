package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SUBSTN_ALIAS_TRANS database table.
 * 
 */
@Entity
@Table(name = "SUBSTN_ALIAS_TRANS")
@NamedQuery(name = "SubstnAliasTran.findAll", query = "SELECT s FROM SubstnAliasTran s")
public class SubstnAliasTran extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "LANG_CODE")
	private String langCode;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	private String recipe;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	@Column(name = "RECORD_PID")
	private int recordPid;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SUBSTN_ALIAS_TRAN_PID")
	private int substnAliasTranPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public SubstnAliasTran() {
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

	public String getLangCode() {
		return this.langCode;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public String getRecipe() {
		return this.recipe;
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

	public int getSubstnAliasTranPid() {
		return this.substnAliasTranPid;
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

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
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

	public void setSubstnAliasTranPid(int substnAliasTranPid) {
		this.substnAliasTranPid = substnAliasTranPid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
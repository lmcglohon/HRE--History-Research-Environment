package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SUBSTN_PARAM_DEFNS database table.
 * 
 */
@Entity
@Table(name = "SUBSTN_PARAM_DEFNS")
@NamedQuery(name = "SubstnParamDefn.findAll", query = "SELECT s FROM SubstnParamDefn s")
public class SubstnParamDefn extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFLT_VALUE")
	private String defltValue;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PARAM_TYPE_KEY")
	private short paramTypeKey;

	@Column(name = "PARAM_VALUE")
	private String paramValue;

	@Column(name = "PARENT_SUBSTN_PID")
	private int parentSubstnPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SUBSTN_PARAM_DEFN_PID")
	private int substnParamDefnPid;

	@Column(name = "SUBSTN_PARAM_DEFNS_PID")
	private int substnParamDefnsPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public SubstnParamDefn() {
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

	public String getDefltValue() {
		return this.defltValue;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public short getParamTypeKey() {
		return this.paramTypeKey;
	}

	public String getParamValue() {
		return this.paramValue;
	}

	public int getParentSubstnPid() {
		return this.parentSubstnPid;
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

	public int getSubstnParamDefnPid() {
		return this.substnParamDefnPid;
	}

	public int getSubstnParamDefnsPid() {
		return this.substnParamDefnsPid;
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

	public void setDefltValue(String defltValue) {
		this.defltValue = defltValue;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setParamTypeKey(short paramTypeKey) {
		this.paramTypeKey = paramTypeKey;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

	public void setParentSubstnPid(int parentSubstnPid) {
		this.parentSubstnPid = parentSubstnPid;
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

	public void setSubstnParamDefnPid(int substnParamDefnPid) {
		this.substnParamDefnPid = substnParamDefnPid;
	}

	public void setSubstnParamDefnsPid(int substnParamDefnsPid) {
		this.substnParamDefnsPid = substnParamDefnsPid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
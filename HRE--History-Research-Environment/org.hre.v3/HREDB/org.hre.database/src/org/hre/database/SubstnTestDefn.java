package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SUBSTN_TEST_DEFNS database table.
 * 
 */
@Entity
@Table(name = "SUBSTN_TEST_DEFNS")
@NamedQuery(name = "SubstnTestDefn.findAll", query = "SELECT s FROM SubstnTestDefn s")
public class SubstnTestDefn extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "ACTION_KEY")
	private short actionKey;

	@Column(name = "ARG1_KEY")
	private short arg1Key;

	@Column(name = "ARG2_KEY")
	private short arg2Key;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PARENT_TYPE_KEY")
	private short parentTypeKey;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SUBSTN_TEST_DEFN_PID")
	private int substnTestDefnPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public SubstnTestDefn() {
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

	public short getActionKey() {
		return this.actionKey;
	}

	public short getArg1Key() {
		return this.arg1Key;
	}

	public short getArg2Key() {
		return this.arg2Key;
	}

	public int getCommitPid() {
		return this.commitPid;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public short getParentTypeKey() {
		return this.parentTypeKey;
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

	public int getSubstnTestDefnPid() {
		return this.substnTestDefnPid;
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

	public void setActionKey(short actionKey) {
		this.actionKey = actionKey;
	}

	public void setArg1Key(short arg1Key) {
		this.arg1Key = arg1Key;
	}

	public void setArg2Key(short arg2Key) {
		this.arg2Key = arg2Key;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setParentTypeKey(short parentTypeKey) {
		this.parentTypeKey = parentTypeKey;
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

	public void setSubstnTestDefnPid(int substnTestDefnPid) {
		this.substnTestDefnPid = substnTestDefnPid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
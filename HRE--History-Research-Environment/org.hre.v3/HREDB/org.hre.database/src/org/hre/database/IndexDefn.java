package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the INDEX_DEFNS database table.
 * 
 */
@Entity
@Table(name = "INDEX_DEFNS")
@NamedQuery(name = "IndexDefn.findAll", query = "SELECT i FROM IndexDefn i")
public class IndexDefn extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "INDEX_DEFN_PID")
	private int indexDefnPid;

	@Column(name = "INDEX_KEY")
	private short indexKey;

	@Column(name = "IS_PRIMARY")
	private boolean isPrimary;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PARENT_TABLE_KEY")
	private short parentTableKey;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SQL_INDEX_DEFN")
	private String sqlIndexDefn;

	@Column(name = "SQL_INDEX_NAME")
	private String sqlIndexName;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public IndexDefn() {
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

	public int getIndexDefnPid() {
		return this.indexDefnPid;
	}

	public short getIndexKey() {
		return this.indexKey;
	}

	public boolean getIsPrimary() {
		return this.isPrimary;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public short getParentTableKey() {
		return this.parentTableKey;
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

	public String getSqlIndexDefn() {
		return this.sqlIndexDefn;
	}

	public String getSqlIndexName() {
		return this.sqlIndexName;
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

	public void setIndexDefnPid(int indexDefnPid) {
		this.indexDefnPid = indexDefnPid;
	}

	public void setIndexKey(short indexKey) {
		this.indexKey = indexKey;
	}

	public void setIsPrimary(boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setParentTableKey(short parentTableKey) {
		this.parentTableKey = parentTableKey;
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

	public void setSqlIndexDefn(String sqlIndexDefn) {
		this.sqlIndexDefn = sqlIndexDefn;
	}

	public void setSqlIndexName(String sqlIndexName) {
		this.sqlIndexName = sqlIndexName;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
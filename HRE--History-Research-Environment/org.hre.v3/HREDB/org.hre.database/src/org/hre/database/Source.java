package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SOURCES database table.
 * 
 */
@Entity
@Table(name = "SOURCES")
@NamedQuery(name = "Source.findAll", query = "SELECT s FROM Source s")
public class Source extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "HAS_MANY_NAMES")
	private boolean hasManyNames;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PRMY_NAME_PID")
	private int prmyNamePid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SOURCE_PID")
	private int sourcePid;

	@Column(name = "SRC_MEMOS_PID")
	private int srcMemosPid;

	@Column(name = "SRC_SURETY")
	private String srcSurety;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public Source() {
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

	public boolean getHasManyNames() {
		return this.hasManyNames;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getPrmyNamePid() {
		return this.prmyNamePid;
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

	public int getSourcePid() {
		return this.sourcePid;
	}

	public int getSrcMemosPid() {
		return this.srcMemosPid;
	}

	public String getSrcSurety() {
		return this.srcSurety;
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

	public void setHasManyNames(boolean hasManyNames) {
		this.hasManyNames = hasManyNames;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setPrmyNamePid(int prmyNamePid) {
		this.prmyNamePid = prmyNamePid;
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

	public void setSourcePid(int sourcePid) {
		this.sourcePid = sourcePid;
	}

	public void setSrcMemosPid(int srcMemosPid) {
		this.srcMemosPid = srcMemosPid;
	}

	public void setSrcSurety(String srcSurety) {
		this.srcSurety = srcSurety;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
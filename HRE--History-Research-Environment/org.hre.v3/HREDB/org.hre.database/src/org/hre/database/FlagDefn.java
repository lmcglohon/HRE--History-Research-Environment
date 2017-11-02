package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the FLAG_DEFNS database table.
 * 
 */
@Entity
@Table(name = "FLAG_DEFNS")
@NamedQuery(name = "FlagDefn.findAll", query = "SELECT f FROM FlagDefn f")
public class FlagDefn extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "ALLOW_COLLECTIONS")
	private boolean allowCollections;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "DFLT_STATE")
	private short dfltState;

	@Column(name = "DISP_ORDER")
	private short dispOrder;

	@Column(name = "FLAG_DEFN_PID")
	private int flagDefnPid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PARENT_OBJ_KEY")
	private short parentObjKey;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "\"SHOW\"")
	private boolean show;

	private short states;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public FlagDefn() {
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

	public boolean getAllowCollections() {
		return this.allowCollections;
	}

	public int getCommitPid() {
		return this.commitPid;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public short getDfltState() {
		return this.dfltState;
	}

	public short getDispOrder() {
		return this.dispOrder;
	}

	public int getFlagDefnPid() {
		return this.flagDefnPid;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public short getParentObjKey() {
		return this.parentObjKey;
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

	public boolean getShow() {
		return this.show;
	}

	public short getStates() {
		return this.states;
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

	public void setAllowCollections(boolean allowCollections) {
		this.allowCollections = allowCollections;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setDfltState(short dfltState) {
		this.dfltState = dfltState;
	}

	public void setDispOrder(short dispOrder) {
		this.dispOrder = dispOrder;
	}

	public void setFlagDefnPid(int flagDefnPid) {
		this.flagDefnPid = flagDefnPid;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setParentObjKey(short parentObjKey) {
		this.parentObjKey = parentObjKey;
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

	public void setShow(boolean show) {
		this.show = show;
	}

	public void setStates(short states) {
		this.states = states;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
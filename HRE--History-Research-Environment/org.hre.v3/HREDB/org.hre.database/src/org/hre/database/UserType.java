package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the USER_TYPES database table.
 * 
 */
@Entity
@Table(name = "USER_TYPES")
@NamedQuery(name = "UserType.findAll", query = "SELECT u FROM UserType u")
public class UserType extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "IS_COLORBLIND")
	private boolean isColorblind;

	@Column(name = "MIN_MOUSE_USE")
	private boolean minMouseUse;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "POOR_EYESIGHT")
	private boolean poorEyesight;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "USER_TYPE_PID")
	private int userTypePid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public UserType() {
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

	public boolean getIsColorblind() {
		return this.isColorblind;
	}

	public boolean getMinMouseUse() {
		return this.minMouseUse;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public boolean getPoorEyesight() {
		return this.poorEyesight;
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

	public int getUserTypePid() {
		return this.userTypePid;
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

	public void setIsColorblind(boolean isColorblind) {
		this.isColorblind = isColorblind;
	}

	public void setMinMouseUse(boolean minMouseUse) {
		this.minMouseUse = minMouseUse;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setPoorEyesight(boolean poorEyesight) {
		this.poorEyesight = poorEyesight;
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

	public void setUserTypePid(int userTypePid) {
		this.userTypePid = userTypePid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
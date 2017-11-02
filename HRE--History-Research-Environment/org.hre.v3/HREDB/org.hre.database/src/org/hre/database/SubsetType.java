package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SUBSET_TYPES database table.
 * 
 */
@Entity
@Table(name = "SUBSET_TYPES")
@NamedQuery(name = "SubsetType.findAll", query = "SELECT s FROM SubsetType s")
public class SubsetType extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "FOCUS1_KEY")
	private short focus1Key;

	@Column(name = "FOCUS2_KEY")
	private short focus2Key;

	@Column(name = "IS_ALL")
	private boolean isAll;

	@Column(name = "IS_MIXED")
	private boolean isMixed;

	@Column(name = "IS_SAME_LINK")
	private boolean isSameLink;

	@Column(name = "IS_SAME_TYPES")
	private boolean isSameTypes;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECENT_MAX")
	private short recentMax;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SUBSET_TYPE_PID")
	private int subsetTypePid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public SubsetType() {
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

	public short getFocus1Key() {
		return this.focus1Key;
	}

	public short getFocus2Key() {
		return this.focus2Key;
	}

	public boolean getIsAll() {
		return this.isAll;
	}

	public boolean getIsMixed() {
		return this.isMixed;
	}

	public boolean getIsSameLink() {
		return this.isSameLink;
	}

	public boolean getIsSameTypes() {
		return this.isSameTypes;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public short getRecentMax() {
		return this.recentMax;
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

	public int getSubsetTypePid() {
		return this.subsetTypePid;
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

	public void setFocus1Key(short focus1Key) {
		this.focus1Key = focus1Key;
	}

	public void setFocus2Key(short focus2Key) {
		this.focus2Key = focus2Key;
	}

	public void setIsAll(boolean isAll) {
		this.isAll = isAll;
	}

	public void setIsMixed(boolean isMixed) {
		this.isMixed = isMixed;
	}

	public void setIsSameLink(boolean isSameLink) {
		this.isSameLink = isSameLink;
	}

	public void setIsSameTypes(boolean isSameTypes) {
		this.isSameTypes = isSameTypes;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setRecentMax(short recentMax) {
		this.recentMax = recentMax;
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

	public void setSubsetTypePid(int subsetTypePid) {
		this.subsetTypePid = subsetTypePid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
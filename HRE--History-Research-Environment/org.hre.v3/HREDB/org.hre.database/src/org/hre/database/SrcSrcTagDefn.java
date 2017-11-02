package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SRC_SRC_TAG_DEFNS database table.
 * 
 */
@Entity
@Table(name = "SRC_SRC_TAG_DEFNS")
@NamedQuery(name = "SrcSrcTagDefn.findAll", query = "SELECT s FROM SrcSrcTagDefn s")
public class SrcSrcTagDefn extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	@Column(name = "REMINDER_PID")
	private short reminderPid;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "\"SHOW\"")
	private boolean show;

	@Column(name = "SRC_SRC_TAG_DEFN_PID")
	private int srcSrcTagDefnPid;

	@Column(name = "SRC_SRC_TAG_KEY")
	private short srcSrcTagKey;

	@Column(name = "TAG_RULE_KEY")
	private short tagRuleKey;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public SrcSrcTagDefn() {
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

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public short getReminderPid() {
		return this.reminderPid;
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

	public int getSrcSrcTagDefnPid() {
		return this.srcSrcTagDefnPid;
	}

	public short getSrcSrcTagKey() {
		return this.srcSrcTagKey;
	}

	public short getTagRuleKey() {
		return this.tagRuleKey;
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

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReminderPid(short reminderPid) {
		this.reminderPid = reminderPid;
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

	public void setSrcSrcTagDefnPid(int srcSrcTagDefnPid) {
		this.srcSrcTagDefnPid = srcSrcTagDefnPid;
	}

	public void setSrcSrcTagKey(short srcSrcTagKey) {
		this.srcSrcTagKey = srcSrcTagKey;
	}

	public void setTagRuleKey(short tagRuleKey) {
		this.tagRuleKey = tagRuleKey;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
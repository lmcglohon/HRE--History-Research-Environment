package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the CITATION_TAG_DEFNS database table.
 * 
 */
@Entity
@Table(name = "CITATION_TAG_DEFNS")
@NamedQuery(name = "CitationTagDefn.findAll", query = "SELECT c FROM CitationTagDefn c")
public class CitationTagDefn extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "ATTACH_TO_TYPE_KEY")
	private short attachToTypeKey;

	@Column(name = "CITATION_TAG_DEFN_PID")
	private int citationTagDefnPid;

	@Column(name = "CITN_TAG_RULE_PID")
	private short citnTagRulePid;

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

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public CitationTagDefn() {
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

	public short getAttachToTypeKey() {
		return this.attachToTypeKey;
	}

	public int getCitationTagDefnPid() {
		return this.citationTagDefnPid;
	}

	public short getCitnTagRulePid() {
		return this.citnTagRulePid;
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

	public void setAttachToTypeKey(short attachToTypeKey) {
		this.attachToTypeKey = attachToTypeKey;
	}

	public void setCitationTagDefnPid(int citationTagDefnPid) {
		this.citationTagDefnPid = citationTagDefnPid;
	}

	public void setCitnTagRulePid(short citnTagRulePid) {
		this.citnTagRulePid = citnTagRulePid;
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

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
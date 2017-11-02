package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the EVENT_TAG_DEFNS database table.
 * 
 */
@Entity
@Table(name = "EVENT_TAG_DEFNS")
@NamedQuery(name = "EventTagDefn.findAll", query = "SELECT e FROM EventTagDefn e")
public class EventTagDefn extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "ALLOW_HDATE")
	private boolean allowHdate;

	@Column(name = "ALLOW_LOCATION")
	private boolean allowLocation;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "DFLT_GROUP_KEY")
	private short dfltGroupKey;

	@Column(name = "DFLT_SENTCE_PID")
	private int dfltSentcePid;

	@Column(name = "DFLT_THEME_KEY")
	private short dfltThemeKey;

	@Column(name = "EVENT_TAG_DEFN_PID")
	private int eventTagDefnPid;

	@Column(name = "MEMO_TYPES_KEY")
	private short memoTypesKey;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	@Column(name = "REMINDER_PID")
	private short reminderPid;

	private short rights;

	@Column(name = "SENTCE_TYPES_KEY")
	private short sentceTypesKey;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "\"SHOW\"")
	private boolean show;

	@Column(name = "TAG_RULE_KEY")
	private short tagRuleKey;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public EventTagDefn() {
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

	public boolean getAllowHdate() {
		return this.allowHdate;
	}

	public boolean getAllowLocation() {
		return this.allowLocation;
	}

	public int getCommitPid() {
		return this.commitPid;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public short getDfltGroupKey() {
		return this.dfltGroupKey;
	}

	public int getDfltSentcePid() {
		return this.dfltSentcePid;
	}

	public short getDfltThemeKey() {
		return this.dfltThemeKey;
	}

	public int getEventTagDefnPid() {
		return this.eventTagDefnPid;
	}

	public short getMemoTypesKey() {
		return this.memoTypesKey;
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

	public short getSentceTypesKey() {
		return this.sentceTypesKey;
	}

	public short getSetPid() {
		return this.setPid;
	}

	public boolean getShow() {
		return this.show;
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

	public void setAllowHdate(boolean allowHdate) {
		this.allowHdate = allowHdate;
	}

	public void setAllowLocation(boolean allowLocation) {
		this.allowLocation = allowLocation;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setDfltGroupKey(short dfltGroupKey) {
		this.dfltGroupKey = dfltGroupKey;
	}

	public void setDfltSentcePid(int dfltSentcePid) {
		this.dfltSentcePid = dfltSentcePid;
	}

	public void setDfltThemeKey(short dfltThemeKey) {
		this.dfltThemeKey = dfltThemeKey;
	}

	public void setEventTagDefnPid(int eventTagDefnPid) {
		this.eventTagDefnPid = eventTagDefnPid;
	}

	public void setMemoTypesKey(short memoTypesKey) {
		this.memoTypesKey = memoTypesKey;
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

	public void setSentceTypesKey(short sentceTypesKey) {
		this.sentceTypesKey = sentceTypesKey;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public void setTagRuleKey(short tagRuleKey) {
		this.tagRuleKey = tagRuleKey;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
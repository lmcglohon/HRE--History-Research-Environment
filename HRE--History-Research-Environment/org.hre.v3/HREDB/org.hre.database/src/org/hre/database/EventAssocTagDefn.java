package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the EVENT_ASSOC_TAG_DEFNS database table.
 * 
 */
@Entity
@Table(name = "EVENT_ASSOC_TAG_DEFNS")
@NamedQuery(name = "EventAssocTagDefn.findAll", query = "SELECT e FROM EventAssocTagDefn e")
public class EventAssocTagDefn extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "ASSOC_PID")
	private int assocPid;

	@Column(name = "ASSOC_SUB_TYPE_KEY")
	private short assocSubTypeKey;

	@Column(name = "ASSOC_TYPE_KEY")
	private short assocTypeKey;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "EVENT_ASSOC_TAG_DEFN_PID")
	private int eventAssocTagDefnPid;

	@Column(name = "GLOBAL_SENTCES_PID")
	private int globalSentcesPid;

	@Column(name = "GROUP_KEY")
	private short groupKey;

	@Column(name = "LIFE_PHASE_KEY")
	private short lifePhaseKey;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	@Column(name = "REMINDER_PID")
	private int reminderPid;

	private short rights;

	@Column(name = "ROLE_NAME_KEY")
	private short roleNameKey;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "\"SHOW\"")
	private boolean show;

	@Column(name = "SORT_ORDER")
	private short sortOrder;

	@Column(name = "TAG_RULE_KEY")
	private short tagRuleKey;

	@Column(name = "THEME_KEY")
	private short themeKey;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public EventAssocTagDefn() {
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

	public int getAssocPid() {
		return this.assocPid;
	}

	public short getAssocSubTypeKey() {
		return this.assocSubTypeKey;
	}

	public short getAssocTypeKey() {
		return this.assocTypeKey;
	}

	public int getCommitPid() {
		return this.commitPid;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public int getEventAssocTagDefnPid() {
		return this.eventAssocTagDefnPid;
	}

	public int getGlobalSentcesPid() {
		return this.globalSentcesPid;
	}

	public short getGroupKey() {
		return this.groupKey;
	}

	public short getLifePhaseKey() {
		return this.lifePhaseKey;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public int getReminderPid() {
		return this.reminderPid;
	}

	public short getRights() {
		return this.rights;
	}

	public short getRoleNameKey() {
		return this.roleNameKey;
	}

	public short getSetPid() {
		return this.setPid;
	}

	public boolean getShow() {
		return this.show;
	}

	public short getSortOrder() {
		return this.sortOrder;
	}

	public short getTagRuleKey() {
		return this.tagRuleKey;
	}

	public short getThemeKey() {
		return this.themeKey;
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

	public void setAssocPid(int assocPid) {
		this.assocPid = assocPid;
	}

	public void setAssocSubTypeKey(short assocSubTypeKey) {
		this.assocSubTypeKey = assocSubTypeKey;
	}

	public void setAssocTypeKey(short assocTypeKey) {
		this.assocTypeKey = assocTypeKey;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setEventAssocTagDefnPid(int eventAssocTagDefnPid) {
		this.eventAssocTagDefnPid = eventAssocTagDefnPid;
	}

	public void setGlobalSentcesPid(int globalSentcesPid) {
		this.globalSentcesPid = globalSentcesPid;
	}

	public void setGroupKey(short groupKey) {
		this.groupKey = groupKey;
	}

	public void setLifePhaseKey(short lifePhaseKey) {
		this.lifePhaseKey = lifePhaseKey;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReminderPid(int reminderPid) {
		this.reminderPid = reminderPid;
	}

	public void setRights(short rights) {
		this.rights = rights;
	}

	public void setRoleNameKey(short roleNameKey) {
		this.roleNameKey = roleNameKey;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public void setSortOrder(short sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setTagRuleKey(short tagRuleKey) {
		this.tagRuleKey = tagRuleKey;
	}

	public void setThemeKey(short themeKey) {
		this.themeKey = themeKey;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the TASK_BTWN_ASSOC_TAG_DEFNS database table.
 * 
 */
@Entity
@Table(name = "TASK_BTWN_ASSOC_TAG_DEFNS")
@NamedQuery(name = "TaskBtwnAssocTagDefn.findAll", query = "SELECT t FROM TaskBtwnAssocTagDefn t")
public class TaskBtwnAssocTagDefn extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "A_SUBJ_SENTCS_PID")
	private int aSubjSentcsPid;

	@Column(name = "ASSOC_A_SUB_TYPE_KEY")
	private short assocASubTypeKey;

	@Column(name = "ASSOC_A_TYPE_KEY")
	private short assocATypeKey;

	@Column(name = "ASSOC_A_TYPE_PID")
	private int assocATypePid;

	@Column(name = "ASSOC_B_SUB_TYPE_KEY")
	private short assocBSubTypeKey;

	@Column(name = "ASSOC_B_TYPE_KEY")
	private short assocBTypeKey;

	@Column(name = "ASSOC_B_TYPE_PID")
	private int assocBTypePid;

	@Column(name = "B_SUBJ_SENTCS_PID")
	private int bSubjSentcsPid;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "GROUP_KEY")
	private short groupKey;

	@Column(name = "OBJECT_KEY")
	private short objectKey;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	@Column(name = "REMINDER_PID")
	private short reminderPid;

	private short rights;

	@Column(name = "ROLE_PAIR_PID")
	private short rolePairPid;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "\"SHOW\"")
	private boolean show;

	@Column(name = "TAG_RULE_KEY")
	private short tagRuleKey;

	@Column(name = "TASK_BTWN_ASSOC_TAG_DEFN_PID")
	private int taskBtwnAssocTagDefnPid;

	@Column(name = "THEME_KEY")
	private short themeKey;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public TaskBtwnAssocTagDefn() {
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

	public short getAssocASubTypeKey() {
		return this.assocASubTypeKey;
	}

	public short getAssocATypeKey() {
		return this.assocATypeKey;
	}

	public int getAssocATypePid() {
		return this.assocATypePid;
	}

	public short getAssocBSubTypeKey() {
		return this.assocBSubTypeKey;
	}

	public short getAssocBTypeKey() {
		return this.assocBTypeKey;
	}

	public int getAssocBTypePid() {
		return this.assocBTypePid;
	}

	public int getASubjSentcsPid() {
		return this.aSubjSentcsPid;
	}

	public int getBSubjSentcsPid() {
		return this.bSubjSentcsPid;
	}

	public int getCommitPid() {
		return this.commitPid;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public short getGroupKey() {
		return this.groupKey;
	}

	public short getObjectKey() {
		return this.objectKey;
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

	public short getRolePairPid() {
		return this.rolePairPid;
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

	public int getTaskBtwnAssocTagDefnPid() {
		return this.taskBtwnAssocTagDefnPid;
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

	public void setAssocASubTypeKey(short assocASubTypeKey) {
		this.assocASubTypeKey = assocASubTypeKey;
	}

	public void setAssocATypeKey(short assocATypeKey) {
		this.assocATypeKey = assocATypeKey;
	}

	public void setAssocATypePid(int assocATypePid) {
		this.assocATypePid = assocATypePid;
	}

	public void setAssocBSubTypeKey(short assocBSubTypeKey) {
		this.assocBSubTypeKey = assocBSubTypeKey;
	}

	public void setAssocBTypeKey(short assocBTypeKey) {
		this.assocBTypeKey = assocBTypeKey;
	}

	public void setAssocBTypePid(int assocBTypePid) {
		this.assocBTypePid = assocBTypePid;
	}

	public void setASubjSentcsPid(int aSubjSentcsPid) {
		this.aSubjSentcsPid = aSubjSentcsPid;
	}

	public void setBSubjSentcsPid(int bSubjSentcsPid) {
		this.bSubjSentcsPid = bSubjSentcsPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setGroupKey(short groupKey) {
		this.groupKey = groupKey;
	}

	public void setObjectKey(short objectKey) {
		this.objectKey = objectKey;
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

	public void setRolePairPid(short rolePairPid) {
		this.rolePairPid = rolePairPid;
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

	public void setTaskBtwnAssocTagDefnPid(int taskBtwnAssocTagDefnPid) {
		this.taskBtwnAssocTagDefnPid = taskBtwnAssocTagDefnPid;
	}

	public void setThemeKey(short themeKey) {
		this.themeKey = themeKey;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
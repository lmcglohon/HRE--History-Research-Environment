package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the TASK_BTWN_ASSOC_DEFNS database table.
 * 
 */
@Entity
@Table(name = "TASK_BTWN_ASSOC_DEFNS")
@NamedQuery(name = "TaskBtwnAssocDefn.findAll", query = "SELECT t FROM TaskBtwnAssocDefn t")
public class TaskBtwnAssocDefn extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "A_B_SENTCS_PID")
	private int aBSentcsPid;

	@Column(name = "A_ENTITY_TYPE_KEY")
	private short aEntityTypeKey;

	@Column(name = "A_ENTITY_TYPE_PID")
	private int aEntityTypePid;

	@Column(name = "A_PROJECT_PID")
	private short aProjectPid;

	@Column(name = "B_A_SENTCS_PID")
	private int bASentcsPid;

	@Column(name = "B_ENTITY_TYPE_KEY")
	private short bEntityTypeKey;

	@Column(name = "B_ENTITY_TYPE_PID")
	private int bEntityTypePid;

	@Column(name = "B_PROJECT_PID")
	private short bProjectPid;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "LOCAL_MEMOS_PID")
	private int localMemosPid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "TAG_TYPE_KEY")
	private short tagTypeKey;

	@Column(name = "TASK_BTWN_ASSOC_PID")
	private int taskBtwnAssocPid;

	@Column(name = "TASK_PARENT_PID")
	private int taskParentPid;

	@Column(name = "TASK_PID")
	private int taskPid;

	@Column(name = "TASK_PROJECT_PID")
	private short taskProjectPid;

	@Column(name = "THEME_KEY")
	private short themeKey;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public TaskBtwnAssocDefn() {
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

	public int getABSentcsPid() {
		return this.aBSentcsPid;
	}

	public short getAEntityTypeKey() {
		return this.aEntityTypeKey;
	}

	public int getAEntityTypePid() {
		return this.aEntityTypePid;
	}

	public short getAProjectPid() {
		return this.aProjectPid;
	}

	public int getBASentcsPid() {
		return this.bASentcsPid;
	}

	public short getBEntityTypeKey() {
		return this.bEntityTypeKey;
	}

	public int getBEntityTypePid() {
		return this.bEntityTypePid;
	}

	public short getBProjectPid() {
		return this.bProjectPid;
	}

	public int getCommitPid() {
		return this.commitPid;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public int getLocalMemosPid() {
		return this.localMemosPid;
	}

	public int getOwnerPid() {
		return this.ownerPid;
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

	public short getTagTypeKey() {
		return this.tagTypeKey;
	}

	public int getTaskBtwnAssocPid() {
		return this.taskBtwnAssocPid;
	}

	public int getTaskParentPid() {
		return this.taskParentPid;
	}

	public int getTaskPid() {
		return this.taskPid;
	}

	public short getTaskProjectPid() {
		return this.taskProjectPid;
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

	public void setABSentcsPid(int aBSentcsPid) {
		this.aBSentcsPid = aBSentcsPid;
	}

	public void setAEntityTypeKey(short aEntityTypeKey) {
		this.aEntityTypeKey = aEntityTypeKey;
	}

	public void setAEntityTypePid(int aEntityTypePid) {
		this.aEntityTypePid = aEntityTypePid;
	}

	public void setAProjectPid(short aProjectPid) {
		this.aProjectPid = aProjectPid;
	}

	public void setBASentcsPid(int bASentcsPid) {
		this.bASentcsPid = bASentcsPid;
	}

	public void setBEntityTypeKey(short bEntityTypeKey) {
		this.bEntityTypeKey = bEntityTypeKey;
	}

	public void setBEntityTypePid(int bEntityTypePid) {
		this.bEntityTypePid = bEntityTypePid;
	}

	public void setBProjectPid(short bProjectPid) {
		this.bProjectPid = bProjectPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setLocalMemosPid(int localMemosPid) {
		this.localMemosPid = localMemosPid;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
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

	public void setTagTypeKey(short tagTypeKey) {
		this.tagTypeKey = tagTypeKey;
	}

	public void setTaskBtwnAssocPid(int taskBtwnAssocPid) {
		this.taskBtwnAssocPid = taskBtwnAssocPid;
	}

	public void setTaskParentPid(int taskParentPid) {
		this.taskParentPid = taskParentPid;
	}

	public void setTaskPid(int taskPid) {
		this.taskPid = taskPid;
	}

	public void setTaskProjectPid(short taskProjectPid) {
		this.taskProjectPid = taskProjectPid;
	}

	public void setThemeKey(short themeKey) {
		this.themeKey = themeKey;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
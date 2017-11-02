package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the TASK_ASSOC_LINKS database table.
 * 
 */
@Entity
@Table(name = "TASK_ASSOC_LINKS")
@NamedQuery(name = "TaskAssocLink.findAll", query = "SELECT t FROM TaskAssocLink t")
public class TaskAssocLink extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "ASSOC_PROJECT_PID")
	private int assocProjectPid;

	@Column(name = "ASSOC_TYPE_KEY")
	private short assocTypeKey;

	@Column(name = "ASSOC_TYPE_PID")
	private int assocTypePid;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "LOCAL_MEMOS_PID")
	private int localMemosPid;

	@Column(name = "LOCAL_SENTCS_PID")
	private int localSentcsPid;

	@Column(name = "OBJECT_PID")
	private int objectPid;

	@Column(name = "OBJECT_PROJECT_PID")
	private int objectProjectPid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PARENT_PID")
	private int parentPid;

	@Column(name = "PARENT_TYPE_KEY")
	private short parentTypeKey;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SORT_ORDER")
	private short sortOrder;

	@Column(name = "TAG_TYPE_KEY")
	private short tagTypeKey;

	@Column(name = "TASK_ASSOC_LINK_PID")
	private int taskAssocLinkPid;

	@Column(name = "THEME_KEY")
	private short themeKey;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public TaskAssocLink() {
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

	public int getAssocProjectPid() {
		return this.assocProjectPid;
	}

	public short getAssocTypeKey() {
		return this.assocTypeKey;
	}

	public int getAssocTypePid() {
		return this.assocTypePid;
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

	public int getLocalSentcsPid() {
		return this.localSentcsPid;
	}

	public int getObjectPid() {
		return this.objectPid;
	}

	public int getObjectProjectPid() {
		return this.objectProjectPid;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getParentPid() {
		return this.parentPid;
	}

	public short getParentTypeKey() {
		return this.parentTypeKey;
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

	public short getSortOrder() {
		return this.sortOrder;
	}

	public short getTagTypeKey() {
		return this.tagTypeKey;
	}

	public int getTaskAssocLinkPid() {
		return this.taskAssocLinkPid;
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

	public void setAssocProjectPid(int assocProjectPid) {
		this.assocProjectPid = assocProjectPid;
	}

	public void setAssocTypeKey(short assocTypeKey) {
		this.assocTypeKey = assocTypeKey;
	}

	public void setAssocTypePid(int assocTypePid) {
		this.assocTypePid = assocTypePid;
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

	public void setLocalSentcsPid(int localSentcsPid) {
		this.localSentcsPid = localSentcsPid;
	}

	public void setObjectPid(int objectPid) {
		this.objectPid = objectPid;
	}

	public void setObjectProjectPid(int objectProjectPid) {
		this.objectProjectPid = objectProjectPid;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setParentPid(int parentPid) {
		this.parentPid = parentPid;
	}

	public void setParentTypeKey(short parentTypeKey) {
		this.parentTypeKey = parentTypeKey;
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

	public void setSortOrder(short sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setTagTypeKey(short tagTypeKey) {
		this.tagTypeKey = tagTypeKey;
	}

	public void setTaskAssocLinkPid(int taskAssocLinkPid) {
		this.taskAssocLinkPid = taskAssocLinkPid;
	}

	public void setThemeKey(short themeKey) {
		this.themeKey = themeKey;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the TASKS database table.
 * 
 */
@Entity
@Table(name = "TASKS")
@NamedQuery(name = "Task.findAll", query = "SELECT t FROM Task t")
public class Task extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "HAS_MEMOS")
	private boolean hasMemos;

	@Column(name = "HDATE_INFERRED")
	private boolean hdateInferred;

	@Column(name = "HDATE_PID")
	private int hdatePid;

	@Column(name = "LOCAL_SENTCE_PID")
	private int localSentcePid;

	@Column(name = "LOCATION_INFERRED")
	private boolean locationInferred;

	@Column(name = "LOCATION_PID")
	private int locationPid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PARENT_PID")
	private int parentPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SENTCE_TYPE_KEY")
	private short sentceTypeKey;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SORT_ORDER")
	private short sortOrder;

	@Column(name = "TAG_TYPE_KEY")
	private short tagTypeKey;

	@Column(name = "TASK_PID")
	private int taskPid;

	@Column(name = "THEME_KEY")
	private short themeKey;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public Task() {
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

	public boolean getHasMemos() {
		return this.hasMemos;
	}

	public boolean getHdateInferred() {
		return this.hdateInferred;
	}

	public int getHdatePid() {
		return this.hdatePid;
	}

	public int getLocalSentcePid() {
		return this.localSentcePid;
	}

	public boolean getLocationInferred() {
		return this.locationInferred;
	}

	public int getLocationPid() {
		return this.locationPid;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getParentPid() {
		return this.parentPid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public short getRights() {
		return this.rights;
	}

	public short getSentceTypeKey() {
		return this.sentceTypeKey;
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

	public int getTaskPid() {
		return this.taskPid;
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

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setHasMemos(boolean hasMemos) {
		this.hasMemos = hasMemos;
	}

	public void setHdateInferred(boolean hdateInferred) {
		this.hdateInferred = hdateInferred;
	}

	public void setHdatePid(int hdatePid) {
		this.hdatePid = hdatePid;
	}

	public void setLocalSentcePid(int localSentcePid) {
		this.localSentcePid = localSentcePid;
	}

	public void setLocationInferred(boolean locationInferred) {
		this.locationInferred = locationInferred;
	}

	public void setLocationPid(int locationPid) {
		this.locationPid = locationPid;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setParentPid(int parentPid) {
		this.parentPid = parentPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRights(short rights) {
		this.rights = rights;
	}

	public void setSentceTypeKey(short sentceTypeKey) {
		this.sentceTypeKey = sentceTypeKey;
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

	public void setTaskPid(int taskPid) {
		this.taskPid = taskPid;
	}

	public void setThemeKey(short themeKey) {
		this.themeKey = themeKey;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
package org.hre.database;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the VIEWPOINT_CONFIGS database table.
 * 
 */
@Entity
@Table(name = "VIEWPOINT_CONFIGS")
@NamedQuery(name = "ViewpointConfig.findAll", query = "SELECT v FROM ViewpointConfig v")
public class ViewpointConfig extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "DISPLAY_TYPE_PID")
	private short displayTypePid;

	private int height;

	@Column(name = "IS_DEFAULT")
	private boolean isDefault;

	@Column(name = "LAST_OPENED")
	private Timestamp lastOpened;

	@Column(name = "LEFT_EDGE")
	private int leftEdge;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "TOP_EDGE")
	private int topEdge;

	@Column(name = "VIEWPOINT_CONFIG_PID")
	private int viewpointConfigPid;

	@Column(name = "VIEWPOINT_TYPE_KEY")
	private short viewpointTypeKey;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	private int width;

	public ViewpointConfig() {
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

	public short getDisplayTypePid() {
		return this.displayTypePid;
	}

	public int getHeight() {
		return this.height;
	}

	public boolean getIsDefault() {
		return this.isDefault;
	}

	public Timestamp getLastOpened() {
		return this.lastOpened;
	}

	public int getLeftEdge() {
		return this.leftEdge;
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

	public int getTopEdge() {
		return this.topEdge;
	}

	public int getViewpointConfigPid() {
		return this.viewpointConfigPid;
	}

	public short getViewpointTypeKey() {
		return this.viewpointTypeKey;
	}

	public int getVisibleId() {
		return this.visibleId;
	}

	public int getWidth() {
		return this.width;
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

	public void setDisplayTypePid(short displayTypePid) {
		this.displayTypePid = displayTypePid;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setLastOpened(Timestamp lastOpened) {
		this.lastOpened = lastOpened;
	}

	public void setLeftEdge(int leftEdge) {
		this.leftEdge = leftEdge;
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

	public void setTopEdge(int topEdge) {
		this.topEdge = topEdge;
	}

	public void setViewpointConfigPid(int viewpointConfigPid) {
		this.viewpointConfigPid = viewpointConfigPid;
	}

	public void setViewpointTypeKey(short viewpointTypeKey) {
		this.viewpointTypeKey = viewpointTypeKey;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
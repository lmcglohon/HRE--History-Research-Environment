package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the VIEWPOINT_ELEMENTS database table.
 * 
 */
@Entity
@Table(name = "VIEWPOINT_ELEMENTS")
@NamedQuery(name = "ViewpointElement.findAll", query = "SELECT v FROM ViewpointElement v")
public class ViewpointElement extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "AUTO_UPDATE")
	private boolean autoUpdate;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "IS_MASTER")
	private boolean isMaster;

	@Column(name = "IS_SECOND_COPY")
	private boolean isSecondCopy;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SCREEN_CONFIG_PID")
	private short screenConfigPid;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SHOW_ON_OPEN")
	private boolean showOnOpen;

	@Column(name = "VIEWPOINT_ELEMENT_PID")
	private int viewpointElementPid;

	@Column(name = "VIEWPOINT_PID")
	private int viewpointPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public ViewpointElement() {
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

	public boolean getAutoUpdate() {
		return this.autoUpdate;
	}

	public int getCommitPid() {
		return this.commitPid;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public boolean getIsMaster() {
		return this.isMaster;
	}

	public boolean getIsSecondCopy() {
		return this.isSecondCopy;
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

	public short getScreenConfigPid() {
		return this.screenConfigPid;
	}

	public short getSetPid() {
		return this.setPid;
	}

	public boolean getShowOnOpen() {
		return this.showOnOpen;
	}

	public int getViewpointElementPid() {
		return this.viewpointElementPid;
	}

	public int getViewpointPid() {
		return this.viewpointPid;
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

	public void setAutoUpdate(boolean autoUpdate) {
		this.autoUpdate = autoUpdate;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setIsMaster(boolean isMaster) {
		this.isMaster = isMaster;
	}

	public void setIsSecondCopy(boolean isSecondCopy) {
		this.isSecondCopy = isSecondCopy;
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

	public void setScreenConfigPid(short screenConfigPid) {
		this.screenConfigPid = screenConfigPid;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setShowOnOpen(boolean showOnOpen) {
		this.showOnOpen = showOnOpen;
	}

	public void setViewpointElementPid(int viewpointElementPid) {
		this.viewpointElementPid = viewpointElementPid;
	}

	public void setViewpointPid(int viewpointPid) {
		this.viewpointPid = viewpointPid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
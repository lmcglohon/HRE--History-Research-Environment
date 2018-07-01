package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the VIEWPOINT_ELEMENTS database table.
 * 
 */
// @Entity
// @Table(name="VIEWPOINT_ELEMENTS")
// @NamedQuery(name="ViewpointElement.findAll", query="SELECT v FROM
// ViewpointElement v")
public class ViewpointElement implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private boolean autoUpdate;
	private int commitPid;
	private boolean isMaster;
	private boolean isSecondCopy;
	private short screenConfigPid;
	private short setKey;
	private boolean showOnOpen;
	private int viewpointElementPid;
	private int viewpointPid;

	public ViewpointElement() {
	}

	// @Column(name="AUTO_UPDATE")
	public boolean getAutoUpdate() {
		return this.autoUpdate;
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="IS_MASTER")
	public boolean getIsMaster() {
		return this.isMaster;
	}

	// @Column(name="IS_SECOND_COPY")
	public boolean getIsSecondCopy() {
		return this.isSecondCopy;
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	// @Column(name="SCREEN_CONFIG_PID")
	public short getScreenConfigPid() {
		return this.screenConfigPid;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="SHOW_ON_OPEN")
	public boolean getShowOnOpen() {
		return this.showOnOpen;
	}

	// @Column(name="VIEWPOINT_ELEMENT_PID", nullable=false)
	public int getViewpointElementPid() {
		return this.viewpointElementPid;
	}

	// @Column(name="VIEWPOINT_PID")
	public int getViewpointPid() {
		return this.viewpointPid;
	}

	public void setAutoUpdate(boolean autoUpdate) {
		this.autoUpdate = autoUpdate;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setIsMaster(boolean isMaster) {
		this.isMaster = isMaster;
	}

	public void setIsSecondCopy(boolean isSecondCopy) {
		this.isSecondCopy = isSecondCopy;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setScreenConfigPid(short screenConfigPid) {
		this.screenConfigPid = screenConfigPid;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
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

}
package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the VIEWPOINT_CONFIGS database table.
 * 
 */
// @Entity
// @Table(name="VIEWPOINT_CONFIGS")
// @NamedQuery(name="ViewpointConfig.findAll", query="SELECT v FROM ViewpointConfig v")
public class ViewpointConfig implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private short displayTypeKey;
	private int height;
	private boolean isDefault;
	private Timestamp lastOpened;
	private int leftEdge;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private int topEdge;
	private int viewpointConfigPid;
	private short viewpointSubTypeKey;
	private short viewpointTypeKey;
	private int width;

	public ViewpointConfig() {
	}


	// @Id
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}


	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}


	// @Column(name="DISPLAY_TYPE_KEY")
	public short getDisplayTypeKey() {
		return this.displayTypeKey;
	}

	public void setDisplayTypeKey(short displayTypeKey) {
		this.displayTypeKey = displayTypeKey;
	}


	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}


	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}


	// @Column(name="LAST_OPENED")
	public Timestamp getLastOpened() {
		return this.lastOpened;
	}

	public void setLastOpened(Timestamp lastOpened) {
		this.lastOpened = lastOpened;
	}


	// @Column(name="LEFT_EDGE")
	public int getLeftEdge() {
		return this.leftEdge;
	}

	public void setLeftEdge(int leftEdge) {
		this.leftEdge = leftEdge;
	}


	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	public void setShow(boolean show) {
		this.show = show;
	}


	// @Column(name="TOP_EDGE")
	public int getTopEdge() {
		return this.topEdge;
	}

	public void setTopEdge(int topEdge) {
		this.topEdge = topEdge;
	}


	// @Column(name="VIEWPOINT_CONFIG_PID", nullable=false)
	public int getViewpointConfigPid() {
		return this.viewpointConfigPid;
	}

	public void setViewpointConfigPid(int viewpointConfigPid) {
		this.viewpointConfigPid = viewpointConfigPid;
	}


	// @Column(name="VIEWPOINT_SUB_TYPE_KEY")
	public short getViewpointSubTypeKey() {
		return this.viewpointSubTypeKey;
	}

	public void setViewpointSubTypeKey(short viewpointSubTypeKey) {
		this.viewpointSubTypeKey = viewpointSubTypeKey;
	}


	// @Column(name="VIEWPOINT_TYPE_KEY")
	public short getViewpointTypeKey() {
		return this.viewpointTypeKey;
	}

	public void setViewpointTypeKey(short viewpointTypeKey) {
		this.viewpointTypeKey = viewpointTypeKey;
	}


	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
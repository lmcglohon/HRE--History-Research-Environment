package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * The persistent class for the VIEWPOINT_CONFIGS database table.
 * 
 */
// @Entity
// @Table(name="VIEWPOINT_CONFIGS")
// @NamedQuery(name="ViewpointConfig.findAll", query="SELECT v FROM
// ViewpointConfig v")
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

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="DISPLAY_TYPE_KEY")
	public short getDisplayTypeKey() {
		return this.displayTypeKey;
	}

	public int getHeight() {
		return this.height;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="LAST_OPENED")
	public Timestamp getLastOpened() {
		return this.lastOpened;
	}

	// @Column(name="LEFT_EDGE")
	public int getLeftEdge() {
		return this.leftEdge;
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	// @Column(name="TOP_EDGE")
	public int getTopEdge() {
		return this.topEdge;
	}

	// @Column(name="VIEWPOINT_CONFIG_PID", nullable=false)
	public int getViewpointConfigPid() {
		return this.viewpointConfigPid;
	}

	// @Column(name="VIEWPOINT_SUB_TYPE_KEY")
	public short getViewpointSubTypeKey() {
		return this.viewpointSubTypeKey;
	}

	// @Column(name="VIEWPOINT_TYPE_KEY")
	public short getViewpointTypeKey() {
		return this.viewpointTypeKey;
	}

	public int getWidth() {
		return this.width;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setDisplayTypeKey(short displayTypeKey) {
		this.displayTypeKey = displayTypeKey;
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

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public void setTopEdge(int topEdge) {
		this.topEdge = topEdge;
	}

	public void setViewpointConfigPid(int viewpointConfigPid) {
		this.viewpointConfigPid = viewpointConfigPid;
	}

	public void setViewpointSubTypeKey(short viewpointSubTypeKey) {
		this.viewpointSubTypeKey = viewpointSubTypeKey;
	}

	public void setViewpointTypeKey(short viewpointTypeKey) {
		this.viewpointTypeKey = viewpointTypeKey;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
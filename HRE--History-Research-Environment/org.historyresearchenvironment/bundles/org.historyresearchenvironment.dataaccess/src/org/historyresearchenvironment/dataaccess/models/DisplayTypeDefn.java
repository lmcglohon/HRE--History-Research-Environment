package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the DISPLAY_TYPE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="DISPLAY_TYPE_DEFNS")
// @NamedQuery(name="DisplayTypeDefn.findAll", query="SELECT d FROM
// DisplayTypeDefn d")
public class DisplayTypeDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private boolean autoRotate;
	private int commitPid;
	private short displayOrder;
	private int displayTypeDefnPid;
	private boolean hasInternet;
	private boolean hasKeyboard;
	private boolean hasServer;
	private int height;
	private boolean isDefault;
	private short reminder;
	private short screenCount;
	private short setKey;
	private boolean show;
	private boolean touchScreen;
	private int width;

	public DisplayTypeDefn() {
	}

	// @Column(name="AUTO_ROTATE")
	public boolean getAutoRotate() {
		return this.autoRotate;
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="DISPLAY_TYPE_DEFN_PID", nullable=false)
	public int getDisplayTypeDefnPid() {
		return this.displayTypeDefnPid;
	}

	// @Column(name="HAS_INTERNET")
	public boolean getHasInternet() {
		return this.hasInternet;
	}

	// @Column(name="HAS_KEYBOARD")
	public boolean getHasKeyboard() {
		return this.hasKeyboard;
	}

	// @Column(name="HAS_SERVER")
	public boolean getHasServer() {
		return this.hasServer;
	}

	public int getHeight() {
		return this.height;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	public short getReminder() {
		return this.reminder;
	}

	// @Column(name="SCREEN_COUNT")
	public short getScreenCount() {
		return this.screenCount;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	// @Column(name="TOUCH_SCREEN")
	public boolean getTouchScreen() {
		return this.touchScreen;
	}

	public int getWidth() {
		return this.width;
	}

	public void setAutoRotate(boolean autoRotate) {
		this.autoRotate = autoRotate;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setDisplayTypeDefnPid(int displayTypeDefnPid) {
		this.displayTypeDefnPid = displayTypeDefnPid;
	}

	public void setHasInternet(boolean hasInternet) {
		this.hasInternet = hasInternet;
	}

	public void setHasKeyboard(boolean hasKeyboard) {
		this.hasKeyboard = hasKeyboard;
	}

	public void setHasServer(boolean hasServer) {
		this.hasServer = hasServer;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReminder(short reminder) {
		this.reminder = reminder;
	}

	public void setScreenCount(short screenCount) {
		this.screenCount = screenCount;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public void setTouchScreen(boolean touchScreen) {
		this.touchScreen = touchScreen;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
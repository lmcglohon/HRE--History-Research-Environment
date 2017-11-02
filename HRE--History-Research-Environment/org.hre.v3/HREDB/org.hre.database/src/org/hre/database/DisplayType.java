package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the DISPLAY_TYPES database table.
 * 
 */
@Entity
@Table(name = "DISPLAY_TYPES")
@NamedQuery(name = "DisplayType.findAll", query = "SELECT d FROM DisplayType d")
public class DisplayType extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "AUTO_ROTATE")
	private boolean autoRotate;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "DISPLAY_TYPE_PID")
	private int displayTypePid;

	@Column(name = "HAS_INTERNET")
	private boolean hasInternet;

	@Column(name = "HAS_KEYBOARD")
	private boolean hasKeyboard;

	@Column(name = "HAS_SERVER")
	private boolean hasServer;

	private int height;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SCREEN_COUNT")
	private short screenCount;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "TOUCH_SCREEN_")
	private boolean touchScreen;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	private int width;

	public DisplayType() {
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

	public boolean getAutoRotate() {
		return this.autoRotate;
	}

	public int getCommitPid() {
		return this.commitPid;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public int getDisplayTypePid() {
		return this.displayTypePid;
	}

	public boolean getHasInternet() {
		return this.hasInternet;
	}

	public boolean getHasKeyboard() {
		return this.hasKeyboard;
	}

	public boolean getHasServer() {
		return this.hasServer;
	}

	public int getHeight() {
		return this.height;
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

	public short getScreenCount() {
		return this.screenCount;
	}

	public short getSetPid() {
		return this.setPid;
	}

	public boolean getTouchScreen() {
		return this.touchScreen;
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

	public void setAutoRotate(boolean autoRotate) {
		this.autoRotate = autoRotate;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setDisplayTypePid(int displayTypePid) {
		this.displayTypePid = displayTypePid;
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

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRights(short rights) {
		this.rights = rights;
	}

	public void setScreenCount(short screenCount) {
		this.screenCount = screenCount;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setTouchScreen(boolean touchScreen) {
		this.touchScreen = touchScreen;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
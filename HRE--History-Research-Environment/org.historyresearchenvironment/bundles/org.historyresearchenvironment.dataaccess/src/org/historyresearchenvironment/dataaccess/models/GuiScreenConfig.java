package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;


/**
 * The persistent class for the GUI_SCREEN_CONFIGS database table.
 * 
 */
// @Entity
// @Table(name="GUI_SCREEN_CONFIGS")
// @NamedQuery(name="GuiScreenConfig.findAll", query="SELECT g FROM GuiScreenConfig g")
public class GuiScreenConfig implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private int guiScreenConfigPid;
	private boolean isDefault;
	private short pluginKey;
	private short reminderKey;
	private short setKey;
	private boolean show;

	public GuiScreenConfig() {
	}


	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
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


	// @Column(name="GUI_SCREEN_CONFIG_PID", nullable=false)
	public int getGuiScreenConfigPid() {
		return this.guiScreenConfigPid;
	}

	public void setGuiScreenConfigPid(int guiScreenConfigPid) {
		this.guiScreenConfigPid = guiScreenConfigPid;
	}


	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}


	// @Column(name="PLUGIN_KEY")
	public short getPluginKey() {
		return this.pluginKey;
	}

	public void setPluginKey(short pluginKey) {
		this.pluginKey = pluginKey;
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

}
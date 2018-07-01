package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the GUI_SCREEN_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="GUI_SCREEN_DEFNS")
// @NamedQuery(name="GuiScreenDefn.findAll", query="SELECT g FROM GuiScreenDefn
// g")
public class GuiScreenDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private int guiScreenDefnPid;
	private boolean isDefault;
	private short pluginKey;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private short topElement;

	public GuiScreenDefn() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="GUI_SCREEN_DEFN_PID", nullable=false)
	public int getGuiScreenDefnPid() {
		return this.guiScreenDefnPid;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="PLUGIN_KEY")
	public short getPluginKey() {
		return this.pluginKey;
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

	// @Column(name="TOP_ELEMENT")
	public short getTopElement() {
		return this.topElement;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setGuiScreenDefnPid(int guiScreenDefnPid) {
		this.guiScreenDefnPid = guiScreenDefnPid;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setPluginKey(short pluginKey) {
		this.pluginKey = pluginKey;
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

	public void setTopElement(short topElement) {
		this.topElement = topElement;
	}

}
package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the GUI_ELEMENTS database table.
 * 
 */
// @Entity
// @Table(name="GUI_ELEMENTS")
// @NamedQuery(name="GuiElement.findAll", query="SELECT g FROM GuiElement g")
public class GuiElement implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private int guiElementPid;
	private short guiScreenPid;
	private short pluginKey;
	private short setKey;

	public GuiElement() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="GUI_ELEMENT_PID", nullable=false)
	public int getGuiElementPid() {
		return this.guiElementPid;
	}

	// @Column(name="GUI_SCREEN_PID")
	public short getGuiScreenPid() {
		return this.guiScreenPid;
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

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setGuiElementPid(int guiElementPid) {
		this.guiElementPid = guiElementPid;
	}

	public void setGuiScreenPid(short guiScreenPid) {
		this.guiScreenPid = guiScreenPid;
	}

	public void setPluginKey(short pluginKey) {
		this.pluginKey = pluginKey;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

}
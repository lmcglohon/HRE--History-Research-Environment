package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the GUI_ELEMENT_SETTINGS database table.
 * 
 */
@Entity
@Table(name = "GUI_ELEMENT_SETTINGS")
@NamedQuery(name = "GuiElementSetting.findAll", query = "SELECT g FROM GuiElementSetting g")
public class GuiElementSetting extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "FONT_COLOR")
	private short fontColor;

	@Column(name = "FONT_NAME")
	private String fontName;

	@Column(name = "FONT_SIZE")
	private short fontSize;

	@Column(name = "FONT_STYLE")
	private short fontStyle;

	@Column(name = "GUI_ELEMENT_PID")
	private int guiElementPid;

	@Column(name = "GUI_ELEMENT_SETTING_PID")
	private int guiElementSettingPid;

	@Column(name = "HAS_STRING")
	private boolean hasString;

	@Column(name = "IS_CONTAINER")
	private boolean isContainer;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PLUGIN_PID")
	private short pluginPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	private String string;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	private short width;

	public GuiElementSetting() {
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

	public short getFontColor() {
		return this.fontColor;
	}

	public String getFontName() {
		return this.fontName;
	}

	public short getFontSize() {
		return this.fontSize;
	}

	public short getFontStyle() {
		return this.fontStyle;
	}

	public int getGuiElementPid() {
		return this.guiElementPid;
	}

	public int getGuiElementSettingPid() {
		return this.guiElementSettingPid;
	}

	public boolean getHasString() {
		return this.hasString;
	}

	public boolean getIsContainer() {
		return this.isContainer;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public short getPluginPid() {
		return this.pluginPid;
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

	public String getString() {
		return this.string;
	}

	public int getVisibleId() {
		return this.visibleId;
	}

	public short getWidth() {
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

	public void setFontColor(short fontColor) {
		this.fontColor = fontColor;
	}

	public void setFontName(String fontName) {
		this.fontName = fontName;
	}

	public void setFontSize(short fontSize) {
		this.fontSize = fontSize;
	}

	public void setFontStyle(short fontStyle) {
		this.fontStyle = fontStyle;
	}

	public void setGuiElementPid(int guiElementPid) {
		this.guiElementPid = guiElementPid;
	}

	public void setGuiElementSettingPid(int guiElementSettingPid) {
		this.guiElementSettingPid = guiElementSettingPid;
	}

	public void setHasString(boolean hasString) {
		this.hasString = hasString;
	}

	public void setIsContainer(boolean isContainer) {
		this.isContainer = isContainer;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setPluginPid(short pluginPid) {
		this.pluginPid = pluginPid;
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

	public void setString(String string) {
		this.string = string;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

	public void setWidth(short width) {
		this.width = width;
	}

}
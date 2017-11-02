package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the GUI_ELEMENT_TYPES database table.
 * 
 */
@Entity
@Table(name = "GUI_ELEMENT_TYPES")
@NamedQuery(name = "GuiElementType.findAll", query = "SELECT g FROM GuiElementType g")
public class GuiElementType extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "DFLT_FONT_COLOR")
	private short dfltFontColor;

	@Column(name = "DFLT_FONT_NAME")
	private String dfltFontName;

	@Column(name = "DFLT_FONT_SIZE")
	private short dfltFontSize;

	@Column(name = "DFLT_FONT_STYLE")
	private short dfltFontStyle;

	@Column(name = "DFLT_HEIGHT")
	private short dfltHeight;

	@Column(name = "DFLT_STRING")
	private String dfltString;

	@Column(name = "DFLT_WIDTH")
	private short dfltWidth;

	@Column(name = "GUI_ELEMENT_TYPE_PID")
	private int guiElementTypePid;

	@Column(name = "HAS_STRING")
	private boolean hasString;

	@Column(name = "IS_CONTAINER")
	private boolean isContainer;

	@Column(name = "MIN_HEIGHT")
	private short minHeight;

	@Column(name = "MIN_WIDTH")
	private short minWidth;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PLUGIN_PID")
	private short pluginPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SWT_COMPONENT")
	private String swtComponent;

	@Column(name = "SWT_TYPE")
	private String swtType;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public GuiElementType() {
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

	public short getDfltFontColor() {
		return this.dfltFontColor;
	}

	public String getDfltFontName() {
		return this.dfltFontName;
	}

	public short getDfltFontSize() {
		return this.dfltFontSize;
	}

	public short getDfltFontStyle() {
		return this.dfltFontStyle;
	}

	public short getDfltHeight() {
		return this.dfltHeight;
	}

	public String getDfltString() {
		return this.dfltString;
	}

	public short getDfltWidth() {
		return this.dfltWidth;
	}

	public int getGuiElementTypePid() {
		return this.guiElementTypePid;
	}

	public boolean getHasString() {
		return this.hasString;
	}

	public boolean getIsContainer() {
		return this.isContainer;
	}

	public short getMinHeight() {
		return this.minHeight;
	}

	public short getMinWidth() {
		return this.minWidth;
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

	public String getSwtComponent() {
		return this.swtComponent;
	}

	public String getSwtType() {
		return this.swtType;
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

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setDfltFontColor(short dfltFontColor) {
		this.dfltFontColor = dfltFontColor;
	}

	public void setDfltFontName(String dfltFontName) {
		this.dfltFontName = dfltFontName;
	}

	public void setDfltFontSize(short dfltFontSize) {
		this.dfltFontSize = dfltFontSize;
	}

	public void setDfltFontStyle(short dfltFontStyle) {
		this.dfltFontStyle = dfltFontStyle;
	}

	public void setDfltHeight(short dfltHeight) {
		this.dfltHeight = dfltHeight;
	}

	public void setDfltString(String dfltString) {
		this.dfltString = dfltString;
	}

	public void setDfltWidth(short dfltWidth) {
		this.dfltWidth = dfltWidth;
	}

	public void setGuiElementTypePid(int guiElementTypePid) {
		this.guiElementTypePid = guiElementTypePid;
	}

	public void setHasString(boolean hasString) {
		this.hasString = hasString;
	}

	public void setIsContainer(boolean isContainer) {
		this.isContainer = isContainer;
	}

	public void setMinHeight(short minHeight) {
		this.minHeight = minHeight;
	}

	public void setMinWidth(short minWidth) {
		this.minWidth = minWidth;
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

	public void setSwtComponent(String swtComponent) {
		this.swtComponent = swtComponent;
	}

	public void setSwtType(String swtType) {
		this.swtType = swtType;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the GUI_ELEMENTS database table.
 * 
 */
@Entity
@Table(name = "GUI_ELEMENTS")
@NamedQuery(name = "GuiElement.findAll", query = "SELECT g FROM GuiElement g")
public class GuiElement extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "CONTAINER_PID")
	private short containerPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "ELEMENT_TYPE_PID")
	private int elementTypePid;

	@Column(name = "GUI_ELEMENT_PID")
	private int guiElementPid;

	@Column(name = "GUI_SCREEN_PID")
	private short guiScreenPid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PLUGIN_PID")
	private short pluginPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "TRANSLATION_PID")
	private int translationPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public GuiElement() {
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

	public short getContainerPid() {
		return this.containerPid;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public int getElementTypePid() {
		return this.elementTypePid;
	}

	public int getGuiElementPid() {
		return this.guiElementPid;
	}

	public short getGuiScreenPid() {
		return this.guiScreenPid;
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

	public int getTranslationPid() {
		return this.translationPid;
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

	public void setContainerPid(short containerPid) {
		this.containerPid = containerPid;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setElementTypePid(int elementTypePid) {
		this.elementTypePid = elementTypePid;
	}

	public void setGuiElementPid(int guiElementPid) {
		this.guiElementPid = guiElementPid;
	}

	public void setGuiScreenPid(short guiScreenPid) {
		this.guiScreenPid = guiScreenPid;
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

	public void setTranslationPid(int translationPid) {
		this.translationPid = translationPid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
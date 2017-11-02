package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the GUI_LANGUAGE_NAMES database table.
 * 
 */
@Entity
@Table(name = "GUI_LANGUAGE_NAMES")
@NamedQuery(name = "GuiLanguageName.findAll", query = "SELECT g FROM GuiLanguageName g")
public class GuiLanguageName extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "FROM_LANGUAGE")
	private String fromLanguage;

	@Column(name = "GUI_LANGUAGE_NAME_PID")
	private int guiLanguageNamePid;

	@Column(name = "GUI_LANGUAGE_NAMES_PID")
	private int guiLanguageNamesPid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "TO_LANGUAGE")
	private String toLanguage;

	private String translation;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public GuiLanguageName() {
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

	public String getFromLanguage() {
		return this.fromLanguage;
	}

	public int getGuiLanguageNamePid() {
		return this.guiLanguageNamePid;
	}

	public int getGuiLanguageNamesPid() {
		return this.guiLanguageNamesPid;
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

	public short getSetPid() {
		return this.setPid;
	}

	public String getToLanguage() {
		return this.toLanguage;
	}

	public String getTranslation() {
		return this.translation;
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

	public void setFromLanguage(String fromLanguage) {
		this.fromLanguage = fromLanguage;
	}

	public void setGuiLanguageNamePid(int guiLanguageNamePid) {
		this.guiLanguageNamePid = guiLanguageNamePid;
	}

	public void setGuiLanguageNamesPid(int guiLanguageNamesPid) {
		this.guiLanguageNamesPid = guiLanguageNamesPid;
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

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setToLanguage(String toLanguage) {
		this.toLanguage = toLanguage;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
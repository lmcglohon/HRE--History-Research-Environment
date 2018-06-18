package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the GUI_LANGUAGE_NAMES database table.
 * 
 */
// @Entity
// @Table(name="GUI_LANGUAGE_NAMES")
// @NamedQuery(name="GuiLanguageName.findAll", query="SELECT g FROM GuiLanguageName g")
public class GuiLanguageName implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private String fromLanguage;
	private int guiLanguageNamePid;
	private short setKey;
	private String toLanguage;
	private String translation;

	public GuiLanguageName() {
	}


	// @Id
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


	// @Column(name="FROM_LANGUAGE", length=4)
	public String getFromLanguage() {
		return this.fromLanguage;
	}

	public void setFromLanguage(String fromLanguage) {
		this.fromLanguage = fromLanguage;
	}


	// @Column(name="GUI_LANGUAGE_NAME_PID", nullable=false)
	public int getGuiLanguageNamePid() {
		return this.guiLanguageNamePid;
	}

	public void setGuiLanguageNamePid(int guiLanguageNamePid) {
		this.guiLanguageNamePid = guiLanguageNamePid;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(name="TO_LANGUAGE", length=4)
	public String getToLanguage() {
		return this.toLanguage;
	}

	public void setToLanguage(String toLanguage) {
		this.toLanguage = toLanguage;
	}


	// @Column(length=60)
	public String getTranslation() {
		return this.translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}

}
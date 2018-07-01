package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the GUI_LANGUAGE_NAMES database table.
 * 
 */
// @Entity
// @Table(name="GUI_LANGUAGE_NAMES")
// @NamedQuery(name="GuiLanguageName.findAll", query="SELECT g FROM
// GuiLanguageName g")
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

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="FROM_LANGUAGE", length=4)
	public String getFromLanguage() {
		return this.fromLanguage;
	}

	// @Column(name="GUI_LANGUAGE_NAME_PID", nullable=false)
	public int getGuiLanguageNamePid() {
		return this.guiLanguageNamePid;
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

	// @Column(name="TO_LANGUAGE", length=4)
	public String getToLanguage() {
		return this.toLanguage;
	}

	// @Column(length=60)
	public String getTranslation() {
		return this.translation;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setFromLanguage(String fromLanguage) {
		this.fromLanguage = fromLanguage;
	}

	public void setGuiLanguageNamePid(int guiLanguageNamePid) {
		this.guiLanguageNamePid = guiLanguageNamePid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setToLanguage(String toLanguage) {
		this.toLanguage = toLanguage;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}

}
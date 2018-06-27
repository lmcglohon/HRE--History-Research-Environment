package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;


/**
 * The persistent class for the LANGUAGE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="LANGUAGE_DEFNS")
// @NamedQuery(name="LanguageDefn.findAll", query="SELECT l FROM LanguageDefn l")
public class LanguageDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private boolean isDataLang;
	private boolean isDefault;
	private boolean isGuiLang;
	private String languageCode;
	private int languageDefnPid;
	private String languageName;
	private short reminderKey;
	private short setKey;
	private boolean show;

	public LanguageDefn() {
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


	// @Column(name="IS_DATA_LANG")
	public boolean getIsDataLang() {
		return this.isDataLang;
	}

	public void setIsDataLang(boolean isDataLang) {
		this.isDataLang = isDataLang;
	}


	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}


	// @Column(name="IS_GUI_LANG")
	public boolean getIsGuiLang() {
		return this.isGuiLang;
	}

	public void setIsGuiLang(boolean isGuiLang) {
		this.isGuiLang = isGuiLang;
	}


	// @Column(name="LANGUAGE_CODE", length=4)
	public String getLanguageCode() {
		return this.languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}


	// @Column(name="LANGUAGE_DEFN_PID", nullable=false)
	public int getLanguageDefnPid() {
		return this.languageDefnPid;
	}

	public void setLanguageDefnPid(int languageDefnPid) {
		this.languageDefnPid = languageDefnPid;
	}


	// @Column(name="LANGUAGE_NAME", length=60)
	public String getLanguageName() {
		return this.languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
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
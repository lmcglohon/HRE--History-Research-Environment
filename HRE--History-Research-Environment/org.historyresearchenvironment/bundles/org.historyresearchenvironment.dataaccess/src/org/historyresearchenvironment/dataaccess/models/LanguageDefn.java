package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the LANGUAGE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="LANGUAGE_DEFNS")
// @NamedQuery(name="LanguageDefn.findAll", query="SELECT l FROM LanguageDefn
// l")
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

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="IS_DATA_LANG")
	public boolean getIsDataLang() {
		return this.isDataLang;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="IS_GUI_LANG")
	public boolean getIsGuiLang() {
		return this.isGuiLang;
	}

	// @Column(name="LANGUAGE_CODE", length=4)
	public String getLanguageCode() {
		return this.languageCode;
	}

	// @Column(name="LANGUAGE_DEFN_PID", nullable=false)
	public int getLanguageDefnPid() {
		return this.languageDefnPid;
	}

	// @Column(name="LANGUAGE_NAME", length=60)
	public String getLanguageName() {
		return this.languageName;
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

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setIsDataLang(boolean isDataLang) {
		this.isDataLang = isDataLang;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setIsGuiLang(boolean isGuiLang) {
		this.isGuiLang = isGuiLang;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public void setLanguageDefnPid(int languageDefnPid) {
		this.languageDefnPid = languageDefnPid;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
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

}
package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the LANGUAGE_NAME_TRANS database table.
 * 
 */
// @Entity
// @Table(name="LANGUAGE_NAME_TRANS")
// @NamedQuery(name="LanguageNameTran.findAll", query="SELECT l FROM
// LanguageNameTran l")
public class LanguageNameTran implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private String fromLanguage;
	private int languageNameTranPid;
	private short setKey;
	private String toLanguage;
	private String translation;

	public LanguageNameTran() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="FROM_LANGUAGE", length=4)
	public String getFromLanguage() {
		return this.fromLanguage;
	}

	// @Column(name="LANGUAGE_NAME_TRAN_PID", nullable=false)
	public int getLanguageNameTranPid() {
		return this.languageNameTranPid;
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

	public void setLanguageNameTranPid(int languageNameTranPid) {
		this.languageNameTranPid = languageNameTranPid;
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
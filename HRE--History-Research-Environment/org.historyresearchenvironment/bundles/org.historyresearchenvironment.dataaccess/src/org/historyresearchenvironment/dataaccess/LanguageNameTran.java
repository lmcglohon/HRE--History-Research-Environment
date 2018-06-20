package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the LANGUAGE_NAME_TRANS database table.
 * 
 */
// @Entity
// @Table(name="LANGUAGE_NAME_TRANS")
// @NamedQuery(name="LanguageNameTran.findAll", query="SELECT l FROM LanguageNameTran l")
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


	// @Column(name="FROM_LANGUAGE", length=4)
	public String getFromLanguage() {
		return this.fromLanguage;
	}

	public void setFromLanguage(String fromLanguage) {
		this.fromLanguage = fromLanguage;
	}


	// @Column(name="LANGUAGE_NAME_TRAN_PID", nullable=false)
	public int getLanguageNameTranPid() {
		return this.languageNameTranPid;
	}

	public void setLanguageNameTranPid(int languageNameTranPid) {
		this.languageNameTranPid = languageNameTranPid;
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
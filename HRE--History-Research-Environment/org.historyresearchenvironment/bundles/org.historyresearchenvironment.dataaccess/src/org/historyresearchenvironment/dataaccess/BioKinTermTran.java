package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the BIO_KIN_TERM_TRANS database table.
 * 
 */
// @Entity
// @Table(name="BIO_KIN_TERM_TRANS")
// @NamedQuery(name="BioKinTermTran.findAll", query="SELECT b FROM BioKinTermTran b")
public class BioKinTermTran implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int bioKinTermTranPid;
	private int commitPid;
	private short kinEthnicityKey;
	private String kinTerm;
	private boolean kinTermHasSubstn;
	private String langCode;
	private short setKey;

	public BioKinTermTran() {
	}


	// @Id
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}


	// @Column(name="BIO_KIN_TERM_TRAN_PID", nullable=false)
	public int getBioKinTermTranPid() {
		return this.bioKinTermTranPid;
	}

	public void setBioKinTermTranPid(int bioKinTermTranPid) {
		this.bioKinTermTranPid = bioKinTermTranPid;
	}


	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	// @Column(name="KIN_ETHNICITY_KEY")
	public short getKinEthnicityKey() {
		return this.kinEthnicityKey;
	}

	public void setKinEthnicityKey(short kinEthnicityKey) {
		this.kinEthnicityKey = kinEthnicityKey;
	}


	// @Column(name="KIN_TERM", length=100)
	public String getKinTerm() {
		return this.kinTerm;
	}

	public void setKinTerm(String kinTerm) {
		this.kinTerm = kinTerm;
	}


	// @Column(name="KIN_TERM_HAS_SUBSTN")
	public boolean getKinTermHasSubstn() {
		return this.kinTermHasSubstn;
	}

	public void setKinTermHasSubstn(boolean kinTermHasSubstn) {
		this.kinTermHasSubstn = kinTermHasSubstn;
	}


	// @Column(name="LANG_CODE", length=4)
	public String getLangCode() {
		return this.langCode;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

}
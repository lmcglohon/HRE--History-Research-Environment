package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the SCRIPT_TRANS database table.
 * 
 */
// @Entity
// @Table(name="SCRIPT_TRANS")
// @NamedQuery(name="ScriptTran.findAll", query="SELECT s FROM ScriptTran s")
public class ScriptTran implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private String langCode;
	private int parentPid;
	private String script;
	private int scriptTranPid;
	private short setKey;

	public ScriptTran() {
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


	// @Column(name="LANG_CODE", length=4)
	public String getLangCode() {
		return this.langCode;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}


	// @Column(name="PARENT_PID")
	public int getParentPid() {
		return this.parentPid;
	}

	public void setParentPid(int parentPid) {
		this.parentPid = parentPid;
	}


	// @Column(length=32000)
	public String getScript() {
		return this.script;
	}

	public void setScript(String script) {
		this.script = script;
	}


	// @Column(name="SCRIPT_TRAN_PID", nullable=false)
	public int getScriptTranPid() {
		return this.scriptTranPid;
	}

	public void setScriptTranPid(int scriptTranPid) {
		this.scriptTranPid = scriptTranPid;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

}
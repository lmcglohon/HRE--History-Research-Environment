package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the BIO_NOTEPADS database table.
 * 
 */
// @Entity
// @Table(name="BIO_NOTEPADS")
// @NamedQuery(name="BioNotepad.findAll", query="SELECT b FROM BioNotepad b")
public class BioNotepad implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int bioNotepadPid;
	private int commitPid;
	private boolean isSystem;
	private String notepad;
	private short notepadDefnKey;
	private int parentPid;
	private short parentSubTypeKey;
	private short setKey;

	public BioNotepad() {
	}

	// @Column(name="BIO_NOTEPAD_PID", nullable=false)
	public int getBioNotepadPid() {
		return this.bioNotepadPid;
	}

	// @Column(name="COMMIT_PID")
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(length=32000)
	public String getNotepad() {
		return this.notepad;
	}

	// @Column(name="NOTEPAD_DEFN_KEY")
	public short getNotepadDefnKey() {
		return this.notepadDefnKey;
	}

	// @Column(name="PARENT_PID")
	public int getParentPid() {
		return this.parentPid;
	}

	// @Column(name="PARENT_SUB_TYPE_KEY")
	public short getParentSubTypeKey() {
		return this.parentSubTypeKey;
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

	public void setBioNotepadPid(int bioNotepadPid) {
		this.bioNotepadPid = bioNotepadPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setNotepad(String notepad) {
		this.notepad = notepad;
	}

	public void setNotepadDefnKey(short notepadDefnKey) {
		this.notepadDefnKey = notepadDefnKey;
	}

	public void setParentPid(int parentPid) {
		this.parentPid = parentPid;
	}

	public void setParentSubTypeKey(short parentSubTypeKey) {
		this.parentSubTypeKey = parentSubTypeKey;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

}
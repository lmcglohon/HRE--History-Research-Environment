package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the CONTAIN_NOTEPADS database table.
 * 
 */
// @Entity
// @Table(name="CONTAIN_NOTEPADS")
// @NamedQuery(name="ContainNotepad.findAll", query="SELECT c FROM ContainNotepad c")
public class ContainNotepad implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private int containNotepadPid;
	private boolean isSystem;
	private String notepad;
	private short notepadDefnKey;
	private int parentPid;
	private short parentSubTypeKey;
	private short setKey;

	public ContainNotepad() {
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


	// @Column(name="CONTAIN_NOTEPAD_PID", nullable=false)
	public int getContainNotepadPid() {
		return this.containNotepadPid;
	}

	public void setContainNotepadPid(int containNotepadPid) {
		this.containNotepadPid = containNotepadPid;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(length=32000)
	public String getNotepad() {
		return this.notepad;
	}

	public void setNotepad(String notepad) {
		this.notepad = notepad;
	}


	// @Column(name="NOTEPAD_DEFN_KEY")
	public short getNotepadDefnKey() {
		return this.notepadDefnKey;
	}

	public void setNotepadDefnKey(short notepadDefnKey) {
		this.notepadDefnKey = notepadDefnKey;
	}


	// @Column(name="PARENT_PID")
	public int getParentPid() {
		return this.parentPid;
	}

	public void setParentPid(int parentPid) {
		this.parentPid = parentPid;
	}


	// @Column(name="PARENT_SUB_TYPE_KEY")
	public short getParentSubTypeKey() {
		return this.parentSubTypeKey;
	}

	public void setParentSubTypeKey(short parentSubTypeKey) {
		this.parentSubTypeKey = parentSubTypeKey;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

}
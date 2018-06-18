package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the PHYSICAL_NOTEPADS database table.
 * 
 */
// @Entity
// @Table(name="PHYSICAL_NOTEPADS")
// @NamedQuery(name="PhysicalNotepad.findAll", query="SELECT p FROM PhysicalNotepad p")
public class PhysicalNotepad implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private boolean isSystem;
	private String notepad;
	private short notepadDefnPid;
	private int parentPid;
	private short parentSubTypeKey;
	private int physicalNotepadPid;
	private short setKey;

	public PhysicalNotepad() {
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


	// @Column(name="NOTEPAD_DEFN_PID")
	public short getNotepadDefnPid() {
		return this.notepadDefnPid;
	}

	public void setNotepadDefnPid(short notepadDefnPid) {
		this.notepadDefnPid = notepadDefnPid;
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


	// @Column(name="PHYSICAL_NOTEPAD_PID", nullable=false)
	public int getPhysicalNotepadPid() {
		return this.physicalNotepadPid;
	}

	public void setPhysicalNotepadPid(int physicalNotepadPid) {
		this.physicalNotepadPid = physicalNotepadPid;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

}
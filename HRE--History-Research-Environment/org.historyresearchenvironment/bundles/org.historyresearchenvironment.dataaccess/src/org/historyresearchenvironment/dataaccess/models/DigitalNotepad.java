package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the DIGITAL_NOTEPADS database table.
 * 
 */
// @Entity
// @Table(name="DIGITAL_NOTEPADS")
// @NamedQuery(name="DigitalNotepad.findAll", query="SELECT d FROM
// DigitalNotepad d")
public class DigitalNotepad implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private int digitalNotepadPid;
	private boolean isSystem;
	private String notepad;
	private short notepadDefnPid;
	private int parentPid;
	private short parentSubTypeKey;
	private short setKey;

	public DigitalNotepad() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DIGITAL_NOTEPAD_PID", nullable=false)
	public int getDigitalNotepadPid() {
		return this.digitalNotepadPid;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(length=32000)
	public String getNotepad() {
		return this.notepad;
	}

	// @Column(name="NOTEPAD_DEFN_PID")
	public short getNotepadDefnPid() {
		return this.notepadDefnPid;
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

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDigitalNotepadPid(int digitalNotepadPid) {
		this.digitalNotepadPid = digitalNotepadPid;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setNotepad(String notepad) {
		this.notepad = notepad;
	}

	public void setNotepadDefnPid(short notepadDefnPid) {
		this.notepadDefnPid = notepadDefnPid;
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
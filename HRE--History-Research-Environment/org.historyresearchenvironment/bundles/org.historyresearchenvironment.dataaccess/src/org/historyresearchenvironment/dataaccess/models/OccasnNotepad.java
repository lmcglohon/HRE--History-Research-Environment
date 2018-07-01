package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the OCCASN_NOTEPADS database table.
 * 
 */
// @Entity
// @Table(name="OCCASN_NOTEPADS")
// @NamedQuery(name="OccasnNotepad.findAll", query="SELECT o FROM OccasnNotepad
// o")
public class OccasnNotepad implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private boolean isSystem;
	private String notepad;
	private short notepadDefnPid;
	private int occasnNotepadPid;
	private int parentPid;
	private short parentSubTypeKey;
	private short setKeyd;

	public OccasnNotepad() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
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

	// @Column(name="NOTEPAD_DEFN_PID")
	public short getNotepadDefnPid() {
		return this.notepadDefnPid;
	}

	// @Column(name="OCCASN_NOTEPAD_PID", nullable=false)
	public int getOccasnNotepadPid() {
		return this.occasnNotepadPid;
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

	// @Column(name="SET_KEYD", nullable=false)
	public short getSetKeyd() {
		return this.setKeyd;
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

	public void setNotepadDefnPid(short notepadDefnPid) {
		this.notepadDefnPid = notepadDefnPid;
	}

	public void setOccasnNotepadPid(int occasnNotepadPid) {
		this.occasnNotepadPid = occasnNotepadPid;
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

	public void setSetKeyd(short setKeyd) {
		this.setKeyd = setKeyd;
	}

}
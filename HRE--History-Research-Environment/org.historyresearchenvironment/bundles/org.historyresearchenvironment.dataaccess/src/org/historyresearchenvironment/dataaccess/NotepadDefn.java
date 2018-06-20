package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the NOTEPAD_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="NOTEPAD_DEFNS")
// @NamedQuery(name="NotepadDefn.findAll", query="SELECT n FROM NotepadDefn n")
public class NotepadDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private short fieldTypeKey;
	private boolean isDefault;
	private boolean isSystem;
	private short length;
	private int notepadDefnPid;
	private short notepadStorageKey;
	private short parentSubTypeKey;
	private short parentTypeKey;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private short unitsKey;

	public NotepadDefn() {
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


	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}


	// @Column(name="FIELD_TYPE_KEY")
	public short getFieldTypeKey() {
		return this.fieldTypeKey;
	}

	public void setFieldTypeKey(short fieldTypeKey) {
		this.fieldTypeKey = fieldTypeKey;
	}


	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	public short getLength() {
		return this.length;
	}

	public void setLength(short length) {
		this.length = length;
	}


	// @Column(name="NOTEPAD_DEFN_PID", nullable=false)
	public int getNotepadDefnPid() {
		return this.notepadDefnPid;
	}

	public void setNotepadDefnPid(int notepadDefnPid) {
		this.notepadDefnPid = notepadDefnPid;
	}


	// @Column(name="NOTEPAD_STORAGE_KEY")
	public short getNotepadStorageKey() {
		return this.notepadStorageKey;
	}

	public void setNotepadStorageKey(short notepadStorageKey) {
		this.notepadStorageKey = notepadStorageKey;
	}


	// @Column(name="PARENT_SUB_TYPE_KEY")
	public short getParentSubTypeKey() {
		return this.parentSubTypeKey;
	}

	public void setParentSubTypeKey(short parentSubTypeKey) {
		this.parentSubTypeKey = parentSubTypeKey;
	}


	// @Column(name="PARENT_TYPE_KEY")
	public short getParentTypeKey() {
		return this.parentTypeKey;
	}

	public void setParentTypeKey(short parentTypeKey) {
		this.parentTypeKey = parentTypeKey;
	}


	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	public void setShow(boolean show) {
		this.show = show;
	}


	// @Column(name="UNITS_KEY")
	public short getUnitsKey() {
		return this.unitsKey;
	}

	public void setUnitsKey(short unitsKey) {
		this.unitsKey = unitsKey;
	}

}
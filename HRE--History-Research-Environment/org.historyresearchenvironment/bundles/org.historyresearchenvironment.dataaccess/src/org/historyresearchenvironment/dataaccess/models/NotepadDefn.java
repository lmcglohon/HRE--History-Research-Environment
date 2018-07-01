package org.historyresearchenvironment.dataaccess.models;

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

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="FIELD_TYPE_KEY")
	public short getFieldTypeKey() {
		return this.fieldTypeKey;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public short getLength() {
		return this.length;
	}

	// @Column(name="NOTEPAD_DEFN_PID", nullable=false)
	public int getNotepadDefnPid() {
		return this.notepadDefnPid;
	}

	// @Column(name="NOTEPAD_STORAGE_KEY")
	public short getNotepadStorageKey() {
		return this.notepadStorageKey;
	}

	// @Column(name="PARENT_SUB_TYPE_KEY")
	public short getParentSubTypeKey() {
		return this.parentSubTypeKey;
	}

	// @Column(name="PARENT_TYPE_KEY")
	public short getParentTypeKey() {
		return this.parentTypeKey;
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	// @Column(name="UNITS_KEY")
	public short getUnitsKey() {
		return this.unitsKey;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setFieldTypeKey(short fieldTypeKey) {
		this.fieldTypeKey = fieldTypeKey;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setLength(short length) {
		this.length = length;
	}

	public void setNotepadDefnPid(int notepadDefnPid) {
		this.notepadDefnPid = notepadDefnPid;
	}

	public void setNotepadStorageKey(short notepadStorageKey) {
		this.notepadStorageKey = notepadStorageKey;
	}

	public void setParentSubTypeKey(short parentSubTypeKey) {
		this.parentSubTypeKey = parentSubTypeKey;
	}

	public void setParentTypeKey(short parentTypeKey) {
		this.parentTypeKey = parentTypeKey;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public void setUnitsKey(short unitsKey) {
		this.unitsKey = unitsKey;
	}

}
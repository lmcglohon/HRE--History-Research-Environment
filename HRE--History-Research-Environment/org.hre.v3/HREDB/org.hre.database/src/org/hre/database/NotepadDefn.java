package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the NOTEPAD_DEFNS database table.
 * 
 */
@Entity
@Table(name = "NOTEPAD_DEFNS")
@NamedQuery(name = "NotepadDefn.findAll", query = "SELECT n FROM NotepadDefn n")
public class NotepadDefn extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "FIELD_TYPE_KEY")
	private short fieldTypeKey;

	private short length;

	@Column(name = "NO_SHOW")
	private boolean noShow;

	@Column(name = "NOTEPAD_DEFN_PID")
	private int notepadDefnPid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PARENT_OBJ_KEY")
	private short parentObjKey;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public NotepadDefn() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#delete(int)
	 */
	@Override
	protected int delete(int recordNum) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#get(int)
	 */
	@Override
	protected AbstractHreTableRow get(int recordNum) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCommitPid() {
		return this.commitPid;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public short getFieldTypeKey() {
		return this.fieldTypeKey;
	}

	public short getLength() {
		return this.length;
	}

	public boolean getNoShow() {
		return this.noShow;
	}

	public int getNotepadDefnPid() {
		return this.notepadDefnPid;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public short getParentObjKey() {
		return this.parentObjKey;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public short getRights() {
		return this.rights;
	}

	public short getSetPid() {
		return this.setPid;
	}

	public int getVisibleId() {
		return this.visibleId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#post()
	 */
	@Override
	protected int post() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#put()
	 */
	@Override
	protected int put() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setFieldTypeKey(short fieldTypeKey) {
		this.fieldTypeKey = fieldTypeKey;
	}

	public void setLength(short length) {
		this.length = length;
	}

	public void setNoShow(boolean noShow) {
		this.noShow = noShow;
	}

	public void setNotepadDefnPid(int notepadDefnPid) {
		this.notepadDefnPid = notepadDefnPid;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setParentObjKey(short parentObjKey) {
		this.parentObjKey = parentObjKey;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRights(short rights) {
		this.rights = rights;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the NAME_STYLE_TYPE_DEFNS database table.
 * 
 */
@Entity
@Table(name = "NAME_STYLE_TYPE_DEFNS")
@NamedQuery(name = "NameStyleTypeDefn.findAll", query = "SELECT n FROM NameStyleTypeDefn n")
public class NameStyleTypeDefn extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "ENTITY_TYPE_KEY")
	private short entityTypeKey;

	@Column(name = "NAME_ELMNTS_INPUT_KEY")
	private short nameElmntsInputKey;

	@Column(name = "NAME_OUT_TEMPLATES_KEY")
	private short nameOutTemplatesKey;

	@Column(name = "NAME_STYLE_TYPE_DEFN_PID")
	private int nameStyleTypeDefnPid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public NameStyleTypeDefn() {
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

	public short getEntityTypeKey() {
		return this.entityTypeKey;
	}

	public short getNameElmntsInputKey() {
		return this.nameElmntsInputKey;
	}

	public short getNameOutTemplatesKey() {
		return this.nameOutTemplatesKey;
	}

	public int getNameStyleTypeDefnPid() {
		return this.nameStyleTypeDefnPid;
	}

	public int getOwnerPid() {
		return this.ownerPid;
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

	public void setEntityTypeKey(short entityTypeKey) {
		this.entityTypeKey = entityTypeKey;
	}

	public void setNameElmntsInputKey(short nameElmntsInputKey) {
		this.nameElmntsInputKey = nameElmntsInputKey;
	}

	public void setNameOutTemplatesKey(short nameOutTemplatesKey) {
		this.nameOutTemplatesKey = nameOutTemplatesKey;
	}

	public void setNameStyleTypeDefnPid(int nameStyleTypeDefnPid) {
		this.nameStyleTypeDefnPid = nameStyleTypeDefnPid;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
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
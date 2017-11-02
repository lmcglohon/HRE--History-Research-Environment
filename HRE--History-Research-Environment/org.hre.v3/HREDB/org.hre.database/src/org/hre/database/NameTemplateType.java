package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the NAME_TEMPLATE_TYPES database table.
 * 
 */
@Entity
@Table(name = "NAME_TEMPLATE_TYPES")
@NamedQuery(name = "NameTemplateType.findAll", query = "SELECT n FROM NameTemplateType n")
public class NameTemplateType extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "ENTITY_TYPE_KEY")
	private short entityTypeKey;

	@Column(name = "IS_MANDATORY")
	private boolean isMandatory;

	@Column(name = "NAME_ELMNT_TYPE_DEFN_PID")
	private int nameElmntTypeDefnPid;

	@Column(name = "OUT_TEMPLATE_TYPE_KEY")
	private short outTemplateTypeKey;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SORTING_ONLY")
	private boolean sortingOnly;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public NameTemplateType() {
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

	public boolean getIsMandatory() {
		return this.isMandatory;
	}

	public int getNameElmntTypeDefnPid() {
		return this.nameElmntTypeDefnPid;
	}

	public short getOutTemplateTypeKey() {
		return this.outTemplateTypeKey;
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

	public boolean getSortingOnly() {
		return this.sortingOnly;
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

	public void setIsMandatory(boolean isMandatory) {
		this.isMandatory = isMandatory;
	}

	public void setNameElmntTypeDefnPid(int nameElmntTypeDefnPid) {
		this.nameElmntTypeDefnPid = nameElmntTypeDefnPid;
	}

	public void setOutTemplateTypeKey(short outTemplateTypeKey) {
		this.outTemplateTypeKey = outTemplateTypeKey;
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

	public void setSortingOnly(boolean sortingOnly) {
		this.sortingOnly = sortingOnly;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the ROLE_NAME_TRANS database table.
 * 
 */
@Entity
@Table(name = "ROLE_NAME_TRANS")
@NamedQuery(name = "RoleNameTran.findAll", query = "SELECT r FROM RoleNameTran r")
public class RoleNameTran extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "LANG_CODE")
	private String langCode;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PLUGIN_PID")
	private short pluginPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	private String role;

	@Column(name = "ROLE_NAME_TRAN_PID")
	private int roleNameTranPid;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "TAG_KEY")
	private short tagKey;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public RoleNameTran() {
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

	public String getLangCode() {
		return this.langCode;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public short getPluginPid() {
		return this.pluginPid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public short getRights() {
		return this.rights;
	}

	public String getRole() {
		return this.role;
	}

	public int getRoleNameTranPid() {
		return this.roleNameTranPid;
	}

	public short getSetPid() {
		return this.setPid;
	}

	public short getTagKey() {
		return this.tagKey;
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

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setPluginPid(short pluginPid) {
		this.pluginPid = pluginPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRights(short rights) {
		this.rights = rights;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setRoleNameTranPid(int roleNameTranPid) {
		this.roleNameTranPid = roleNameTranPid;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setTagKey(short tagKey) {
		this.tagKey = tagKey;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
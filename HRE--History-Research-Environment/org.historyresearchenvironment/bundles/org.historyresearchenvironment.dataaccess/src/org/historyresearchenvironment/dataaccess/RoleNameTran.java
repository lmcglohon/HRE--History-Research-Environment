package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the ROLE_NAME_TRANS database table.
 * 
 */
// @Entity
// @Table(name="ROLE_NAME_TRANS")
// @NamedQuery(name="RoleNameTran.findAll", query="SELECT r FROM RoleNameTran r")
public class RoleNameTran implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private boolean isSystem;
	private String langCode;
	private short pluginKey;
	private String role;
	private int roleNameTranPid;
	private short setKey;
	private short tagKey;

	public RoleNameTran() {
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


	// @Column(name="LANG_CODE", length=4)
	public String getLangCode() {
		return this.langCode;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}


	// @Column(name="PLUGIN_KEY")
	public short getPluginKey() {
		return this.pluginKey;
	}

	public void setPluginKey(short pluginKey) {
		this.pluginKey = pluginKey;
	}


	// @Column(length=60)
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}


	// @Column(name="ROLE_NAME_TRAN_PID", nullable=false)
	public int getRoleNameTranPid() {
		return this.roleNameTranPid;
	}

	public void setRoleNameTranPid(int roleNameTranPid) {
		this.roleNameTranPid = roleNameTranPid;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(name="TAG_KEY")
	public short getTagKey() {
		return this.tagKey;
	}

	public void setTagKey(short tagKey) {
		this.tagKey = tagKey;
	}

}
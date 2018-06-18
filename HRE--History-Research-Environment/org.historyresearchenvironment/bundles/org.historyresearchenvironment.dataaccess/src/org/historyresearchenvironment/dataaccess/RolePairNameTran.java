package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the ROLE_PAIR_NAME_TRANS database table.
 * 
 */
// @Entity
// @Table(name="ROLE_PAIR_NAME_TRANS")
// @NamedQuery(name="RolePairNameTran.findAll", query="SELECT r FROM RolePairNameTran r")
public class RolePairNameTran implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private boolean isSystem;
	private String langCode;
	private short pluginKey;
	private String roleAToB;
	private String roleBToA;
	private int rolePairNameTranPid;
	private short setKey;
	private short tagKey;

	public RolePairNameTran() {
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


	// @Column(name="ROLE_A_TO_B", length=60)
	public String getRoleAToB() {
		return this.roleAToB;
	}

	public void setRoleAToB(String roleAToB) {
		this.roleAToB = roleAToB;
	}


	// @Column(name="ROLE_B_TO_A", length=60)
	public String getRoleBToA() {
		return this.roleBToA;
	}

	public void setRoleBToA(String roleBToA) {
		this.roleBToA = roleBToA;
	}


	// @Column(name="ROLE_PAIR_NAME_TRAN_PID", nullable=false)
	public int getRolePairNameTranPid() {
		return this.rolePairNameTranPid;
	}

	public void setRolePairNameTranPid(int rolePairNameTranPid) {
		this.rolePairNameTranPid = rolePairNameTranPid;
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
package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the ROLE_PAIR_NAME_TRANS database table.
 * 
 */
// @Entity
// @Table(name="ROLE_PAIR_NAME_TRANS")
// @NamedQuery(name="RolePairNameTran.findAll", query="SELECT r FROM
// RolePairNameTran r")
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

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="LANG_CODE", length=4)
	public String getLangCode() {
		return this.langCode;
	}

	// @Column(name="PLUGIN_KEY")
	public short getPluginKey() {
		return this.pluginKey;
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	// @Column(name="ROLE_A_TO_B", length=60)
	public String getRoleAToB() {
		return this.roleAToB;
	}

	// @Column(name="ROLE_B_TO_A", length=60)
	public String getRoleBToA() {
		return this.roleBToA;
	}

	// @Column(name="ROLE_PAIR_NAME_TRAN_PID", nullable=false)
	public int getRolePairNameTranPid() {
		return this.rolePairNameTranPid;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="TAG_KEY")
	public short getTagKey() {
		return this.tagKey;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	public void setPluginKey(short pluginKey) {
		this.pluginKey = pluginKey;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRoleAToB(String roleAToB) {
		this.roleAToB = roleAToB;
	}

	public void setRoleBToA(String roleBToA) {
		this.roleBToA = roleBToA;
	}

	public void setRolePairNameTranPid(int rolePairNameTranPid) {
		this.rolePairNameTranPid = rolePairNameTranPid;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setTagKey(short tagKey) {
		this.tagKey = tagKey;
	}

}
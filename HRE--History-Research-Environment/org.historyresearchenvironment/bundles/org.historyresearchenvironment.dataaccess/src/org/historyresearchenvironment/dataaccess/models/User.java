package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the USERS database table.
 * 
 */
// @Entity
// @Table(name="USERS")
// @NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private String email;
	private String logonName;
	private String password;
	private short setKey;
	private int userGroupPid;
	private String userName;
	private int userPid;
	private int userTypePid;

	public User() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(length=100)
	public String getEmail() {
		return this.email;
	}

	// @Column(name="LOGON_NAME", length=100)
	public String getLogonName() {
		return this.logonName;
	}

	// @Column(length=100)
	public String getPassword() {
		return this.password;
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="USER_GROUP_PID")
	public int getUserGroupPid() {
		return this.userGroupPid;
	}

	// @Column(name="USER_NAME", length=100)
	public String getUserName() {
		return this.userName;
	}

	// @Column(name="USER_PID", nullable=false)
	public int getUserPid() {
		return this.userPid;
	}

	// @Column(name="USER_TYPE_PID")
	public int getUserTypePid() {
		return this.userTypePid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setLogonName(String logonName) {
		this.logonName = logonName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setUserGroupPid(int userGroupPid) {
		this.userGroupPid = userGroupPid;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserPid(int userPid) {
		this.userPid = userPid;
	}

	public void setUserTypePid(int userTypePid) {
		this.userTypePid = userTypePid;
	}

}
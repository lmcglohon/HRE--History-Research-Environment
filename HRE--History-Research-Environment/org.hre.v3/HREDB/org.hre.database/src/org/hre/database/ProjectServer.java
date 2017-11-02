package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the PROJECT_SERVERS database table.
 * 
 */
@Entity
@Table(name = "PROJECT_SERVERS")
@NamedQuery(name = "ProjectServer.findAll", query = "SELECT p FROM ProjectServer p")
public class ProjectServer extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	private String email;

	@Column(name = "LOGON_NAME")
	private String logonName;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	private String password;

	@Column(name = "PROJECT_SERVER_PID")
	private int projectServerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "USER_GROUP_PID")
	private short userGroupPid;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public ProjectServer() {
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

	public String getEmail() {
		return this.email;
	}

	public String getLogonName() {
		return this.logonName;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public String getPassword() {
		return this.password;
	}

	public int getProjectServerPid() {
		return this.projectServerPid;
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

	public short getUserGroupPid() {
		return this.userGroupPid;
	}

	public String getUserName() {
		return this.userName;
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

	public void setEmail(String email) {
		this.email = email;
	}

	public void setLogonName(String logonName) {
		this.logonName = logonName;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setProjectServerPid(int projectServerPid) {
		this.projectServerPid = projectServerPid;
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

	public void setUserGroupPid(short userGroupPid) {
		this.userGroupPid = userGroupPid;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the PROJECTS database table.
 * 
 */
// @Entity
// @Table(name="PROJECTS")
// @NamedQuery(name="Project.findAll", query="SELECT p FROM Project p")
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private Timestamp commenced;
	private int commitPid;
	private int projectPid;
	private short setKey;

	public Project() {
	}


	// @Id
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}


	public Timestamp getCommenced() {
		return this.commenced;
	}

	public void setCommenced(Timestamp commenced) {
		this.commenced = commenced;
	}


	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	// @Column(name="PROJECT_PID", nullable=false)
	public int getProjectPid() {
		return this.projectPid;
	}

	public void setProjectPid(int projectPid) {
		this.projectPid = projectPid;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

}
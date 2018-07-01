package org.historyresearchenvironment.dataaccess.models;

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

	public Timestamp getCommenced() {
		return this.commenced;
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="PROJECT_PID", nullable=false)
	public int getProjectPid() {
		return this.projectPid;
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

	public void setCommenced(Timestamp commenced) {
		this.commenced = commenced;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setProjectPid(int projectPid) {
		this.projectPid = projectPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

}
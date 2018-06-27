package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;


/**
 * The persistent class for the FIELD_RECENTS database table.
 * 
 */
// @Entity
// @Table(name="FIELD_RECENTS")
// @NamedQuery(name="FieldRecent.findAll", query="SELECT f FROM FieldRecent f")
public class FieldRecent implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short fieldPid;
	private int fieldRecentPid;
	private int fixed01Pid;
	private int fixed02Pid;
	private int fixed03Pid;
	private int fixed04Pid;
	private int fixed05Pid;
	private int recent01Pid;
	private int recent02Pid;
	private int recent03Pid;
	private int recent04Pid;
	private int recent05Pid;
	private int recent06Pid;
	private int recent07Pid;
	private int recent08Pid;
	private int recent09Pid;
	private int recent10Pid;
	private int recent11Pid;
	private int recent12Pid;
	private int recent13Pid;
	private int recent14Pid;
	private int recent15Pid;
	private short setKey;
	private short tableKey;

	public FieldRecent() {
	}


	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
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


	// @Column(name="FIELD_PID")
	public short getFieldPid() {
		return this.fieldPid;
	}

	public void setFieldPid(short fieldPid) {
		this.fieldPid = fieldPid;
	}


	// @Column(name="FIELD_RECENT_PID", nullable=false)
	public int getFieldRecentPid() {
		return this.fieldRecentPid;
	}

	public void setFieldRecentPid(int fieldRecentPid) {
		this.fieldRecentPid = fieldRecentPid;
	}


	// @Column(name="FIXED01_PID")
	public int getFixed01Pid() {
		return this.fixed01Pid;
	}

	public void setFixed01Pid(int fixed01Pid) {
		this.fixed01Pid = fixed01Pid;
	}


	// @Column(name="FIXED02_PID")
	public int getFixed02Pid() {
		return this.fixed02Pid;
	}

	public void setFixed02Pid(int fixed02Pid) {
		this.fixed02Pid = fixed02Pid;
	}


	// @Column(name="FIXED03_PID")
	public int getFixed03Pid() {
		return this.fixed03Pid;
	}

	public void setFixed03Pid(int fixed03Pid) {
		this.fixed03Pid = fixed03Pid;
	}


	// @Column(name="FIXED04_PID")
	public int getFixed04Pid() {
		return this.fixed04Pid;
	}

	public void setFixed04Pid(int fixed04Pid) {
		this.fixed04Pid = fixed04Pid;
	}


	// @Column(name="FIXED05_PID")
	public int getFixed05Pid() {
		return this.fixed05Pid;
	}

	public void setFixed05Pid(int fixed05Pid) {
		this.fixed05Pid = fixed05Pid;
	}


	// @Column(name="RECENT01_PID")
	public int getRecent01Pid() {
		return this.recent01Pid;
	}

	public void setRecent01Pid(int recent01Pid) {
		this.recent01Pid = recent01Pid;
	}


	// @Column(name="RECENT02_PID")
	public int getRecent02Pid() {
		return this.recent02Pid;
	}

	public void setRecent02Pid(int recent02Pid) {
		this.recent02Pid = recent02Pid;
	}


	// @Column(name="RECENT03_PID")
	public int getRecent03Pid() {
		return this.recent03Pid;
	}

	public void setRecent03Pid(int recent03Pid) {
		this.recent03Pid = recent03Pid;
	}


	// @Column(name="RECENT04_PID")
	public int getRecent04Pid() {
		return this.recent04Pid;
	}

	public void setRecent04Pid(int recent04Pid) {
		this.recent04Pid = recent04Pid;
	}


	// @Column(name="RECENT05_PID")
	public int getRecent05Pid() {
		return this.recent05Pid;
	}

	public void setRecent05Pid(int recent05Pid) {
		this.recent05Pid = recent05Pid;
	}


	// @Column(name="RECENT06_PID")
	public int getRecent06Pid() {
		return this.recent06Pid;
	}

	public void setRecent06Pid(int recent06Pid) {
		this.recent06Pid = recent06Pid;
	}


	// @Column(name="RECENT07_PID")
	public int getRecent07Pid() {
		return this.recent07Pid;
	}

	public void setRecent07Pid(int recent07Pid) {
		this.recent07Pid = recent07Pid;
	}


	// @Column(name="RECENT08_PID")
	public int getRecent08Pid() {
		return this.recent08Pid;
	}

	public void setRecent08Pid(int recent08Pid) {
		this.recent08Pid = recent08Pid;
	}


	// @Column(name="RECENT09_PID")
	public int getRecent09Pid() {
		return this.recent09Pid;
	}

	public void setRecent09Pid(int recent09Pid) {
		this.recent09Pid = recent09Pid;
	}


	// @Column(name="RECENT10_PID")
	public int getRecent10Pid() {
		return this.recent10Pid;
	}

	public void setRecent10Pid(int recent10Pid) {
		this.recent10Pid = recent10Pid;
	}


	// @Column(name="RECENT11_PID")
	public int getRecent11Pid() {
		return this.recent11Pid;
	}

	public void setRecent11Pid(int recent11Pid) {
		this.recent11Pid = recent11Pid;
	}


	// @Column(name="RECENT12_PID")
	public int getRecent12Pid() {
		return this.recent12Pid;
	}

	public void setRecent12Pid(int recent12Pid) {
		this.recent12Pid = recent12Pid;
	}


	// @Column(name="RECENT13_PID")
	public int getRecent13Pid() {
		return this.recent13Pid;
	}

	public void setRecent13Pid(int recent13Pid) {
		this.recent13Pid = recent13Pid;
	}


	// @Column(name="RECENT14_PID")
	public int getRecent14Pid() {
		return this.recent14Pid;
	}

	public void setRecent14Pid(int recent14Pid) {
		this.recent14Pid = recent14Pid;
	}


	// @Column(name="RECENT15_PID")
	public int getRecent15Pid() {
		return this.recent15Pid;
	}

	public void setRecent15Pid(int recent15Pid) {
		this.recent15Pid = recent15Pid;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(name="TABLE_KEY")
	public short getTableKey() {
		return this.tableKey;
	}

	public void setTableKey(short tableKey) {
		this.tableKey = tableKey;
	}

}
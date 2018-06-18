package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the BIO_ETHNICITY_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="BIO_ETHNICITY_DEFNS")
// @NamedQuery(name="BioEthnicityDefn.findAll", query="SELECT b FROM BioEthnicityDefn b")
public class BioEthnicityDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int bioEthnicityDefnPid;
	private int commitPid;
	private short displayOrder;
	private boolean isDefault;
	private short reminderKey;
	private short setKey;
	private boolean show;

	public BioEthnicityDefn() {
	}


	// @Id
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}


	// @Column(name="BIO_ETHNICITY_DEFN_PID", nullable=false)
	public int getBioEthnicityDefnPid() {
		return this.bioEthnicityDefnPid;
	}

	public void setBioEthnicityDefnPid(int bioEthnicityDefnPid) {
		this.bioEthnicityDefnPid = bioEthnicityDefnPid;
	}


	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}


	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}


	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

}
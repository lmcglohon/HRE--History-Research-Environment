package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the BIO_KIN_TERM_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="BIO_KIN_TERM_DEFNS")
// @NamedQuery(name="BioKinTermDefn.findAll", query="SELECT b FROM
// BioKinTermDefn b")
public class BioKinTermDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private String ancestorKinCode;
	private int bioKinTermDefnPid;
	private int commitPid;
	private boolean currentIsFemale;
	private String descendantKinCode;
	private boolean focusIsFemale;
	private short kinEthnicityKey;
	private short kinTermTransKey;
	private short reminderKey;
	private short removedGeneration;
	private short setKey;
	private boolean show;
	private short thisGeneration;

	public BioKinTermDefn() {
	}

	// @Column(name="ANCESTOR_KIN_CODE", length=8)
	public String getAncestorKinCode() {
		return this.ancestorKinCode;
	}

	// @Column(name="BIO_KIN_TERM_DEFN_PID", nullable=false)
	public int getBioKinTermDefnPid() {
		return this.bioKinTermDefnPid;
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="CURRENT_IS_FEMALE")
	public boolean getCurrentIsFemale() {
		return this.currentIsFemale;
	}

	// @Column(name="DESCENDANT_KIN_CODE", length=8)
	public String getDescendantKinCode() {
		return this.descendantKinCode;
	}

	// @Column(name="FOCUS_IS_FEMALE")
	public boolean getFocusIsFemale() {
		return this.focusIsFemale;
	}

	// @Column(name="KIN_ETHNICITY_KEY")
	public short getKinEthnicityKey() {
		return this.kinEthnicityKey;
	}

	// @Column(name="KIN_TERM_TRANS_KEY")
	public short getKinTermTransKey() {
		return this.kinTermTransKey;
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	// @Column(name="REMOVED_GENERATION")
	public short getRemovedGeneration() {
		return this.removedGeneration;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	// @Column(name="THIS_GENERATION")
	public short getThisGeneration() {
		return this.thisGeneration;
	}

	public void setAncestorKinCode(String ancestorKinCode) {
		this.ancestorKinCode = ancestorKinCode;
	}

	public void setBioKinTermDefnPid(int bioKinTermDefnPid) {
		this.bioKinTermDefnPid = bioKinTermDefnPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setCurrentIsFemale(boolean currentIsFemale) {
		this.currentIsFemale = currentIsFemale;
	}

	public void setDescendantKinCode(String descendantKinCode) {
		this.descendantKinCode = descendantKinCode;
	}

	public void setFocusIsFemale(boolean focusIsFemale) {
		this.focusIsFemale = focusIsFemale;
	}

	public void setKinEthnicityKey(short kinEthnicityKey) {
		this.kinEthnicityKey = kinEthnicityKey;
	}

	public void setKinTermTransKey(short kinTermTransKey) {
		this.kinTermTransKey = kinTermTransKey;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}

	public void setRemovedGeneration(short removedGeneration) {
		this.removedGeneration = removedGeneration;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public void setThisGeneration(short thisGeneration) {
		this.thisGeneration = thisGeneration;
	}

}
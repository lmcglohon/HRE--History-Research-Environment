package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the LABEL_TRANS database table.
 * 
 */
// @Entity
// @Table(name="LABEL_TRANS")
// @NamedQuery(name="LabelTran.findAll", query="SELECT l FROM LabelTran l")
public class LabelTran implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private String abbrev;
	private int commitPid;
	private String description;
	private short fieldKey;
	private boolean isUserData;
	private int labelTranPid;
	private String langCode;
	private String name;
	private int recordPid;
	private short setKey;
	private short sortOrder;
	private int stepPid;
	private short tableKey;

	public LabelTran() {
	}

	// @Column(length=60)
	public String getAbbrev() {
		return this.abbrev;
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(length=300)
	public String getDescription() {
		return this.description;
	}

	// @Column(name="FIELD_KEY")
	public short getFieldKey() {
		return this.fieldKey;
	}

	// @Column(name="IS_USER_DATA")
	public boolean getIsUserData() {
		return this.isUserData;
	}

	// @Column(name="LABEL_TRAN_PID", nullable=false)
	public int getLabelTranPid() {
		return this.labelTranPid;
	}

	// @Column(name="LANG_CODE", length=4)
	public String getLangCode() {
		return this.langCode;
	}

	// @Column(length=160)
	public String getName() {
		return this.name;
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	// @Column(name="RECORD_PID")
	public int getRecordPid() {
		return this.recordPid;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="SORT_ORDER")
	public short getSortOrder() {
		return this.sortOrder;
	}

	// @Column(name="STEP_PID")
	public int getStepPid() {
		return this.stepPid;
	}

	// @Column(name="TABLE_KEY")
	public short getTableKey() {
		return this.tableKey;
	}

	public void setAbbrev(String abbrev) {
		this.abbrev = abbrev;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setFieldKey(short fieldKey) {
		this.fieldKey = fieldKey;
	}

	public void setIsUserData(boolean isUserData) {
		this.isUserData = isUserData;
	}

	public void setLabelTranPid(int labelTranPid) {
		this.labelTranPid = labelTranPid;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRecordPid(int recordPid) {
		this.recordPid = recordPid;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setSortOrder(short sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setStepPid(int stepPid) {
		this.stepPid = stepPid;
	}

	public void setTableKey(short tableKey) {
		this.tableKey = tableKey;
	}

}
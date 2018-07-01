package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the SCHEMA_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="SCHEMA_DEFNS")
// @NamedQuery(name="SchemaDefn.findAll", query="SELECT s FROM SchemaDefn s")
public class SchemaDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private boolean isDefault;
	private short mainPckgKey;
	private short reminderKey;
	private int schemaDefnPid;
	private short setKey;
	private boolean show;
	private String versionName;

	public SchemaDefn() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="MAIN_PCKG_KEY", nullable=false)
	public short getMainPckgKey() {
		return this.mainPckgKey;
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	// @Column(name="REMINDER_KEY", nullable=false)
	public short getReminderKey() {
		return this.reminderKey;
	}

	// @Column(name="SCHEMA_DEFN_PID", nullable=false)
	public int getSchemaDefnPid() {
		return this.schemaDefnPid;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	// @Column(name="VERSION_NAME", nullable=false, length=160)
	public String getVersionName() {
		return this.versionName;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setMainPckgKey(short mainPckgKey) {
		this.mainPckgKey = mainPckgKey;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}

	public void setSchemaDefnPid(int schemaDefnPid) {
		this.schemaDefnPid = schemaDefnPid;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

}
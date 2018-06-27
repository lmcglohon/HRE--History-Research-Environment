package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;


/**
 * The persistent class for the PACKAGE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="PACKAGE_DEFNS")
// @NamedQuery(name="PackageDefn.findAll", query="SELECT p FROM PackageDefn p")
public class PackageDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private boolean isDefault;
	private boolean isMainPckg;
	private boolean isNative;
	private int packageDefnPid;
	private short parentSchemaKey;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private String versonName;

	public PackageDefn() {
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


	// @Column(name="IS_MAIN_PCKG")
	public boolean getIsMainPckg() {
		return this.isMainPckg;
	}

	public void setIsMainPckg(boolean isMainPckg) {
		this.isMainPckg = isMainPckg;
	}


	// @Column(name="IS_NATIVE")
	public boolean getIsNative() {
		return this.isNative;
	}

	public void setIsNative(boolean isNative) {
		this.isNative = isNative;
	}


	// @Column(name="PACKAGE_DEFN_PID", nullable=false)
	public int getPackageDefnPid() {
		return this.packageDefnPid;
	}

	public void setPackageDefnPid(int packageDefnPid) {
		this.packageDefnPid = packageDefnPid;
	}


	// @Column(name="PARENT_SCHEMA_KEY")
	public short getParentSchemaKey() {
		return this.parentSchemaKey;
	}

	public void setParentSchemaKey(short parentSchemaKey) {
		this.parentSchemaKey = parentSchemaKey;
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


	// @Column(name="VERSON_NAME", length=160)
	public String getVersonName() {
		return this.versonName;
	}

	public void setVersonName(String versonName) {
		this.versonName = versonName;
	}

}
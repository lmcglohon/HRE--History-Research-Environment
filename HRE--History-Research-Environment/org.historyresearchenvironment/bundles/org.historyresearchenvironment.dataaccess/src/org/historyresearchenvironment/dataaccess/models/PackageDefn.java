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

	// @Column(name="IS_MAIN_PCKG")
	public boolean getIsMainPckg() {
		return this.isMainPckg;
	}

	// @Column(name="IS_NATIVE")
	public boolean getIsNative() {
		return this.isNative;
	}

	// @Column(name="PACKAGE_DEFN_PID", nullable=false)
	public int getPackageDefnPid() {
		return this.packageDefnPid;
	}

	// @Column(name="PARENT_SCHEMA_KEY")
	public short getParentSchemaKey() {
		return this.parentSchemaKey;
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

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	// @Column(name="VERSON_NAME", length=160)
	public String getVersonName() {
		return this.versonName;
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

	public void setIsMainPckg(boolean isMainPckg) {
		this.isMainPckg = isMainPckg;
	}

	public void setIsNative(boolean isNative) {
		this.isNative = isNative;
	}

	public void setPackageDefnPid(int packageDefnPid) {
		this.packageDefnPid = packageDefnPid;
	}

	public void setParentSchemaKey(short parentSchemaKey) {
		this.parentSchemaKey = parentSchemaKey;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public void setVersonName(String versonName) {
		this.versonName = versonName;
	}

}
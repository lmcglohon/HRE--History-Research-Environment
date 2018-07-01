package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the PLUGIN_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="PLUGIN_DEFNS")
// @NamedQuery(name="PluginDefn.findAll", query="SELECT p FROM PluginDefn p")
public class PluginDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private boolean isDefault;
	private boolean isNative;
	private short parentPckgKey;
	private int pluginDefnPid;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private String versonName;

	public PluginDefn() {
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

	// @Column(name="IS_NATIVE")
	public boolean getIsNative() {
		return this.isNative;
	}

	// @Column(name="PARENT_PCKG_KEY")
	public short getParentPckgKey() {
		return this.parentPckgKey;
	}

	// @Column(name="PLUGIN_DEFN_PID", nullable=false)
	public int getPluginDefnPid() {
		return this.pluginDefnPid;
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

	public void setIsNative(boolean isNative) {
		this.isNative = isNative;
	}

	public void setParentPckgKey(short parentPckgKey) {
		this.parentPckgKey = parentPckgKey;
	}

	public void setPluginDefnPid(int pluginDefnPid) {
		this.pluginDefnPid = pluginDefnPid;
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
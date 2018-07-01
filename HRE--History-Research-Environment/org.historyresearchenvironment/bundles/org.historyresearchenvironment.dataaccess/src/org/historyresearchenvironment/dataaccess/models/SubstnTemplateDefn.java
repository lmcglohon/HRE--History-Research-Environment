package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the SUBSTN_TEMPLATE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="SUBSTN_TEMPLATE_DEFNS")
// @NamedQuery(name="SubstnTemplateDefn.findAll", query="SELECT s FROM
// SubstnTemplateDefn s")
public class SubstnTemplateDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private boolean isSystem;
	private boolean isTextLayout;
	private boolean isTextStyle;
	private short reminderKey;
	private short scriptGroupKey;
	private short scriptKey;
	private short setKey;
	private boolean show;
	private int substnTemplateDefnPid;

	public SubstnTemplateDefn() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="IS_TEXT_LAYOUT")
	public boolean getIsTextLayout() {
		return this.isTextLayout;
	}

	// @Column(name="IS_TEXT_STYLE")
	public boolean getIsTextStyle() {
		return this.isTextStyle;
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

	// @Column(name="SCRIPT_GROUP_KEY")
	public short getScriptGroupKey() {
		return this.scriptGroupKey;
	}

	// @Column(name="SCRIPT_KEY")
	public short getScriptKey() {
		return this.scriptKey;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	// @Column(name="SUBSTN_TEMPLATE_DEFN_PID", nullable=false)
	public int getSubstnTemplateDefnPid() {
		return this.substnTemplateDefnPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setIsTextLayout(boolean isTextLayout) {
		this.isTextLayout = isTextLayout;
	}

	public void setIsTextStyle(boolean isTextStyle) {
		this.isTextStyle = isTextStyle;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}

	public void setScriptGroupKey(short scriptGroupKey) {
		this.scriptGroupKey = scriptGroupKey;
	}

	public void setScriptKey(short scriptKey) {
		this.scriptKey = scriptKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public void setSubstnTemplateDefnPid(int substnTemplateDefnPid) {
		this.substnTemplateDefnPid = substnTemplateDefnPid;
	}

}
package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the SUBSTN_TEMPLATE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="SUBSTN_TEMPLATE_DEFNS")
// @NamedQuery(name="SubstnTemplateDefn.findAll", query="SELECT s FROM SubstnTemplateDefn s")
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


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="IS_TEXT_LAYOUT")
	public boolean getIsTextLayout() {
		return this.isTextLayout;
	}

	public void setIsTextLayout(boolean isTextLayout) {
		this.isTextLayout = isTextLayout;
	}


	// @Column(name="IS_TEXT_STYLE")
	public boolean getIsTextStyle() {
		return this.isTextStyle;
	}

	public void setIsTextStyle(boolean isTextStyle) {
		this.isTextStyle = isTextStyle;
	}


	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}


	// @Column(name="SCRIPT_GROUP_KEY")
	public short getScriptGroupKey() {
		return this.scriptGroupKey;
	}

	public void setScriptGroupKey(short scriptGroupKey) {
		this.scriptGroupKey = scriptGroupKey;
	}


	// @Column(name="SCRIPT_KEY")
	public short getScriptKey() {
		return this.scriptKey;
	}

	public void setScriptKey(short scriptKey) {
		this.scriptKey = scriptKey;
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


	// @Column(name="SUBSTN_TEMPLATE_DEFN_PID", nullable=false)
	public int getSubstnTemplateDefnPid() {
		return this.substnTemplateDefnPid;
	}

	public void setSubstnTemplateDefnPid(int substnTemplateDefnPid) {
		this.substnTemplateDefnPid = substnTemplateDefnPid;
	}

}
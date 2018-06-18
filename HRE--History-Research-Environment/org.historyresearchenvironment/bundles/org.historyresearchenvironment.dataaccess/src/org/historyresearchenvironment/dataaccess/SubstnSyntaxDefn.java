package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the SUBSTN_SYNTAX_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="SUBSTN_SYNTAX_DEFNS")
// @NamedQuery(name="SubstnSyntaxDefn.findAll", query="SELECT s FROM SubstnSyntaxDefn s")
public class SubstnSyntaxDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private boolean enclosesMarkup;
	private String internalBeginMark;
	private String internalBeginTrue;
	private String internalDividerMark;
	private String internalEndMark;
	private String internalEndTrue;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private int substnSyntaxDefnPid;
	private String visibleBeginMark;
	private String visibleBeginTrue;
	private String visibleDividerMark;
	private String visibleEndMark;
	private String visibleEndTrue;

	public SubstnSyntaxDefn() {
	}


	// @Id
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


	// @Column(name="ENCLOSES_MARKUP")
	public boolean getEnclosesMarkup() {
		return this.enclosesMarkup;
	}

	public void setEnclosesMarkup(boolean enclosesMarkup) {
		this.enclosesMarkup = enclosesMarkup;
	}


	// @Column(name="INTERNAL_BEGIN_MARK", length=10)
	public String getInternalBeginMark() {
		return this.internalBeginMark;
	}

	public void setInternalBeginMark(String internalBeginMark) {
		this.internalBeginMark = internalBeginMark;
	}


	// @Column(name="INTERNAL_BEGIN_TRUE", length=10)
	public String getInternalBeginTrue() {
		return this.internalBeginTrue;
	}

	public void setInternalBeginTrue(String internalBeginTrue) {
		this.internalBeginTrue = internalBeginTrue;
	}


	// @Column(name="INTERNAL_DIVIDER_MARK", length=10)
	public String getInternalDividerMark() {
		return this.internalDividerMark;
	}

	public void setInternalDividerMark(String internalDividerMark) {
		this.internalDividerMark = internalDividerMark;
	}


	// @Column(name="INTERNAL_END_MARK", length=10)
	public String getInternalEndMark() {
		return this.internalEndMark;
	}

	public void setInternalEndMark(String internalEndMark) {
		this.internalEndMark = internalEndMark;
	}


	// @Column(name="INTERNAL_END_TRUE", length=10)
	public String getInternalEndTrue() {
		return this.internalEndTrue;
	}

	public void setInternalEndTrue(String internalEndTrue) {
		this.internalEndTrue = internalEndTrue;
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


	// @Column(name="SUBSTN_SYNTAX_DEFN_PID", nullable=false)
	public int getSubstnSyntaxDefnPid() {
		return this.substnSyntaxDefnPid;
	}

	public void setSubstnSyntaxDefnPid(int substnSyntaxDefnPid) {
		this.substnSyntaxDefnPid = substnSyntaxDefnPid;
	}


	// @Column(name="VISIBLE_BEGIN_MARK", length=10)
	public String getVisibleBeginMark() {
		return this.visibleBeginMark;
	}

	public void setVisibleBeginMark(String visibleBeginMark) {
		this.visibleBeginMark = visibleBeginMark;
	}


	// @Column(name="VISIBLE_BEGIN_TRUE", length=10)
	public String getVisibleBeginTrue() {
		return this.visibleBeginTrue;
	}

	public void setVisibleBeginTrue(String visibleBeginTrue) {
		this.visibleBeginTrue = visibleBeginTrue;
	}


	// @Column(name="VISIBLE_DIVIDER_MARK", length=10)
	public String getVisibleDividerMark() {
		return this.visibleDividerMark;
	}

	public void setVisibleDividerMark(String visibleDividerMark) {
		this.visibleDividerMark = visibleDividerMark;
	}


	// @Column(name="VISIBLE_END_MARK", length=10)
	public String getVisibleEndMark() {
		return this.visibleEndMark;
	}

	public void setVisibleEndMark(String visibleEndMark) {
		this.visibleEndMark = visibleEndMark;
	}


	// @Column(name="VISIBLE_END_TRUE", length=10)
	public String getVisibleEndTrue() {
		return this.visibleEndTrue;
	}

	public void setVisibleEndTrue(String visibleEndTrue) {
		this.visibleEndTrue = visibleEndTrue;
	}

}
package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;

/**
 * The persistent class for the TEMPLATE_VIEW database table.
 * 
 */
// // @Entity
// // @Table(name="TEMPLATE_VIEW")
// // @NamedQuery(name="TemplateView.findAll", query="SELECT t FROM TemplateView
// t")
public class TemplateView implements Serializable {
	private static final long serialVersionUID = 1L;
	private int commitPid;
	private short elementPid;
	private String langCode;
	private int nextNameEventPid;
	private int physicalNamePartPid;
	private int recordNum;
	private short setKey;
	private int shared;
	private int thisNameEventPid;
	private String trans;

	public TemplateView() {
	}

	// // @Column(name="COMMIT_PID")
	public int getCommitPid() {
		return this.commitPid;
	}

	// // @Column(name="ELEMENT_PID")
	public short getElementPid() {
		return this.elementPid;
	}

	// // @Column(name="LANG_CODE", length=4)
	public String getLangCode() {
		return this.langCode;
	}

	// // @Column(name="NEXT_NAME_EVENT_PID")
	public int getNextNameEventPid() {
		return this.nextNameEventPid;
	}

	// // @Column(name="PHYSICAL_NAME_PART_PID")
	public int getPhysicalNamePartPid() {
		return this.physicalNamePartPid;
	}

	// // @Id
	// // @Column(name="RECORD_NUM")
	public int getRecordNum() {
		return this.recordNum;
	}

	// // @Column(name="SET_KEY")
	public short getSetKey() {
		return this.setKey;
	}

	public int getShared() {
		return this.shared;
	}

	// // @Column(name="THIS_NAME_EVENT_PID")
	public int getThisNameEventPid() {
		return this.thisNameEventPid;
	}

	// // @Column(length=160)
	public String getTrans() {
		return this.trans;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setElementPid(short elementPid) {
		this.elementPid = elementPid;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	public void setNextNameEventPid(int nextNameEventPid) {
		this.nextNameEventPid = nextNameEventPid;
	}

	public void setPhysicalNamePartPid(int physicalNamePartPid) {
		this.physicalNamePartPid = physicalNamePartPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setShared(int shared) {
		this.shared = shared;
	}

	public void setThisNameEventPid(int thisNameEventPid) {
		this.thisNameEventPid = thisNameEventPid;
	}

	public void setTrans(String trans) {
		this.trans = trans;
	}

}
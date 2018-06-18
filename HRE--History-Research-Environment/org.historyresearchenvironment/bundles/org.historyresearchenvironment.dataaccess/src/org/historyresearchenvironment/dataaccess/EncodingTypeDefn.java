package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the ENCODING_TYPE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="ENCODING_TYPE_DEFNS")
// @NamedQuery(name="EncodingTypeDefn.findAll", query="SELECT e FROM EncodingTypeDefn e")
public class EncodingTypeDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private int encodingTypeDefnPid;
	private boolean isDefault;
	private boolean isExportType;
	private boolean isImportType;
	private boolean isInternalType;
	private short reminderKey;
	private short setKey;
	private boolean show;

	public EncodingTypeDefn() {
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


	// @Column(name="ENCODING_TYPE_DEFN_PID", nullable=false)
	public int getEncodingTypeDefnPid() {
		return this.encodingTypeDefnPid;
	}

	public void setEncodingTypeDefnPid(int encodingTypeDefnPid) {
		this.encodingTypeDefnPid = encodingTypeDefnPid;
	}


	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}


	// @Column(name="IS_EXPORT_TYPE")
	public boolean getIsExportType() {
		return this.isExportType;
	}

	public void setIsExportType(boolean isExportType) {
		this.isExportType = isExportType;
	}


	// @Column(name="IS_IMPORT_TYPE")
	public boolean getIsImportType() {
		return this.isImportType;
	}

	public void setIsImportType(boolean isImportType) {
		this.isImportType = isImportType;
	}


	// @Column(name="IS_INTERNAL_TYPE")
	public boolean getIsInternalType() {
		return this.isInternalType;
	}

	public void setIsInternalType(boolean isInternalType) {
		this.isInternalType = isInternalType;
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

}
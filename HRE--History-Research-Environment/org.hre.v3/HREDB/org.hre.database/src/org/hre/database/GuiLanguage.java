package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the GUI_LANGUAGES database table.
 * 
 */
@Entity
@Table(name = "GUI_LANGUAGES")
@NamedQuery(name = "GuiLanguage.findAll", query = "SELECT g FROM GuiLanguage g")
public class GuiLanguage extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DATA1_LANGUAGE")
	private String data1Language;

	@Column(name = "DATA2_LANGUAGE")
	private String data2Language;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "DFLT_LANGUAGE")
	private String dfltLanguage;

	@Column(name = "GUI_LANGUAGE")
	private String guiLanguage;

	@Column(name = "GUI_LANGUAGE_PID")
	private int guiLanguagePid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	@Column(name = "REPORT_LANGUAGE")
	private String reportLanguage;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public GuiLanguage() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#delete(int)
	 */
	@Override
	protected int delete(int recordNum) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#get(int)
	 */
	@Override
	protected AbstractHreTableRow get(int recordNum) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCommitPid() {
		return this.commitPid;
	}

	public String getData1Language() {
		return this.data1Language;
	}

	public String getData2Language() {
		return this.data2Language;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public String getDfltLanguage() {
		return this.dfltLanguage;
	}

	public String getGuiLanguage() {
		return this.guiLanguage;
	}

	public int getGuiLanguagePid() {
		return this.guiLanguagePid;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public String getReportLanguage() {
		return this.reportLanguage;
	}

	public short getRights() {
		return this.rights;
	}

	public short getSetPid() {
		return this.setPid;
	}

	public int getVisibleId() {
		return this.visibleId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#post()
	 */
	@Override
	protected int post() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#put()
	 */
	@Override
	protected int put() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setData1Language(String data1Language) {
		this.data1Language = data1Language;
	}

	public void setData2Language(String data2Language) {
		this.data2Language = data2Language;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setDfltLanguage(String dfltLanguage) {
		this.dfltLanguage = dfltLanguage;
	}

	public void setGuiLanguage(String guiLanguage) {
		this.guiLanguage = guiLanguage;
	}

	public void setGuiLanguagePid(int guiLanguagePid) {
		this.guiLanguagePid = guiLanguagePid;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReportLanguage(String reportLanguage) {
		this.reportLanguage = reportLanguage;
	}

	public void setRights(short rights) {
		this.rights = rights;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
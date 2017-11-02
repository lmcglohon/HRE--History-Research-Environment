package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the HDATES database table.
 * 
 */
@Entity
@Table(name = "HDATES")
@NamedQuery(name = "Hdate.findAll", query = "SELECT h FROM Hdate h")
public class Hdate extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "HAS_CITATIONS")
	private boolean hasCitations;

	@Column(name = "HDATE_MEMOS_PID")
	private int hdateMemosPid;

	@Column(name = "HDATE_PID")
	private int hdatePid;

	@Column(name = "HDATE_SURETY")
	private String hdateSurety;

	@Column(name = "HDATE_TYPE_KEY")
	private short hdateTypeKey;

	private long hdate1;

	private long hdate2;

	@Column(name = "LANG_CODE")
	private String langCode;

	@Column(name = "ORIGINAL_TEXT")
	private String originalText;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SORT_HDATE1")
	private long sortHdate1;

	@Column(name = "SORT_HDATE2")
	private long sortHdate2;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public Hdate() {
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

	public short getDefnPid() {
		return this.defnPid;
	}

	public boolean getHasCitations() {
		return this.hasCitations;
	}

	public long getHdate1() {
		return this.hdate1;
	}

	public long getHdate2() {
		return this.hdate2;
	}

	public int getHdateMemosPid() {
		return this.hdateMemosPid;
	}

	public int getHdatePid() {
		return this.hdatePid;
	}

	public String getHdateSurety() {
		return this.hdateSurety;
	}

	public short getHdateTypeKey() {
		return this.hdateTypeKey;
	}

	public String getLangCode() {
		return this.langCode;
	}

	public String getOriginalText() {
		return this.originalText;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public short getRights() {
		return this.rights;
	}

	public short getSetPid() {
		return this.setPid;
	}

	public long getSortHdate1() {
		return this.sortHdate1;
	}

	public long getSortHdate2() {
		return this.sortHdate2;
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

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setHasCitations(boolean hasCitations) {
		this.hasCitations = hasCitations;
	}

	public void setHdate1(long hdate1) {
		this.hdate1 = hdate1;
	}

	public void setHdate2(long hdate2) {
		this.hdate2 = hdate2;
	}

	public void setHdateMemosPid(int hdateMemosPid) {
		this.hdateMemosPid = hdateMemosPid;
	}

	public void setHdatePid(int hdatePid) {
		this.hdatePid = hdatePid;
	}

	public void setHdateSurety(String hdateSurety) {
		this.hdateSurety = hdateSurety;
	}

	public void setHdateTypeKey(short hdateTypeKey) {
		this.hdateTypeKey = hdateTypeKey;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	public void setOriginalText(String originalText) {
		this.originalText = originalText;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRights(short rights) {
		this.rights = rights;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setSortHdate1(long sortHdate1) {
		this.sortHdate1 = sortHdate1;
	}

	public void setSortHdate2(long sortHdate2) {
		this.sortHdate2 = sortHdate2;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
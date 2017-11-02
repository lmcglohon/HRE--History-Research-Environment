package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SOURCE_NAMES database table.
 * 
 */
@Entity
@Table(name = "SOURCE_NAMES")
@NamedQuery(name = "SourceName.findAll", query = "SELECT s FROM SourceName s")
public class SourceName extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "HAS_MEMOS")
	private boolean hasMemos;

	@Column(name = "HDATE_INFERRED")
	private boolean hdateInferred;

	@Column(name = "HDATE_PID")
	private int hdatePid;

	@Column(name = "LOCAL_SENTCE_PID")
	private int localSentcePid;

	@Column(name = "NAME_TAG_KEY")
	private short nameTagKey;

	@Column(name = "NAME_TAG_STYLE")
	private short nameTagStyle;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PARENT_PID")
	private int parentPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SENTCE_TYPE_KEY")
	private short sentceTypeKey;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SOURCE_NAME_PID")
	private int sourceNamePid;

	@Column(name = "THEME_KEY")
	private short themeKey;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public SourceName() {
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

	public boolean getHasMemos() {
		return this.hasMemos;
	}

	public boolean getHdateInferred() {
		return this.hdateInferred;
	}

	public int getHdatePid() {
		return this.hdatePid;
	}

	public int getLocalSentcePid() {
		return this.localSentcePid;
	}

	public short getNameTagKey() {
		return this.nameTagKey;
	}

	public short getNameTagStyle() {
		return this.nameTagStyle;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getParentPid() {
		return this.parentPid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public short getRights() {
		return this.rights;
	}

	public short getSentceTypeKey() {
		return this.sentceTypeKey;
	}

	public short getSetPid() {
		return this.setPid;
	}

	public int getSourceNamePid() {
		return this.sourceNamePid;
	}

	public short getThemeKey() {
		return this.themeKey;
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

	public void setHasMemos(boolean hasMemos) {
		this.hasMemos = hasMemos;
	}

	public void setHdateInferred(boolean hdateInferred) {
		this.hdateInferred = hdateInferred;
	}

	public void setHdatePid(int hdatePid) {
		this.hdatePid = hdatePid;
	}

	public void setLocalSentcePid(int localSentcePid) {
		this.localSentcePid = localSentcePid;
	}

	public void setNameTagKey(short nameTagKey) {
		this.nameTagKey = nameTagKey;
	}

	public void setNameTagStyle(short nameTagStyle) {
		this.nameTagStyle = nameTagStyle;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setParentPid(int parentPid) {
		this.parentPid = parentPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRights(short rights) {
		this.rights = rights;
	}

	public void setSentceTypeKey(short sentceTypeKey) {
		this.sentceTypeKey = sentceTypeKey;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setSourceNamePid(int sourceNamePid) {
		this.sourceNamePid = sourceNamePid;
	}

	public void setThemeKey(short themeKey) {
		this.themeKey = themeKey;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
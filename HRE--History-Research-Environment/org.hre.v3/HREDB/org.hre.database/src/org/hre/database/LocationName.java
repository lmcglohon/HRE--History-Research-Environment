package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the LOCATION_NAMES database table.
 * 
 */
@Entity
@Table(name = "LOCATION_NAMES")
@NamedQuery(name = "LocationName.findAll", query = "SELECT l FROM LocationName l")
public class LocationName extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "RECORD_NUM")
	private int recordNum;

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

	@Column(name = "LOCATION_NAME_PID")
	private int locationNamePid;

	@Column(name = "NAME_STYLE_KEY")
	private short nameStyleKey;

	@Column(name = "NAME_TAG_KEY")
	private short nameTagKey;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PARENT_PID")
	private int parentPid;

	private short rights;

	@Column(name = "SENTCE_TYPE_KEY")
	private short sentceTypeKey;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "THEME_KEY")
	private short themeKey;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	@ManyToOne
	private Location location;

	public LocationName() {
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

	public Location getLocation() {
		return location;
	}

	public int getLocationNamePid() {
		return this.locationNamePid;
	}

	public short getNameStyleKey() {
		return this.nameStyleKey;
	}

	public short getNameTagKey() {
		return this.nameTagKey;
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

	public void setLocation(Location param) {
		this.location = param;
	}

	public void setLocationNamePid(int locationNamePid) {
		this.locationNamePid = locationNamePid;
	}

	public void setNameStyleKey(short nameStyleKey) {
		this.nameStyleKey = nameStyleKey;
	}

	public void setNameTagKey(short nameTagKey) {
		this.nameTagKey = nameTagKey;
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

	public void setThemeKey(short themeKey) {
		this.themeKey = themeKey;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
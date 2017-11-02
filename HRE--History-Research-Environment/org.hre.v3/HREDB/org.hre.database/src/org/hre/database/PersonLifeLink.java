package org.hre.database;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the PERSON_LIFE_LINKS database table.
 * 
 */
@Entity
@Table(name = "PERSON_LIFE_LINKS")
@NamedQuery(name = "PersonLifeLink.findAll", query = "SELECT p FROM PersonLifeLink p")
public class PersonLifeLink extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "BETWEEN_ASSOC_PID")
	private int betweenAssocPid;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "EVENT_PID")
	private int eventPid;

	@Column(name = "LAST_UPDATE")
	private Timestamp lastUpdate;

	@Column(name = "OTHER_PERSON_PID")
	private int otherPersonPid;

	@Column(name = "OTHER_ROLE_PID")
	private int otherRolePid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PERSON_LIFE_LINK_PID")
	private int personLifeLinkPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SUBJECT_PERSON_PID")
	private int subjectPersonPid;

	@Column(name = "SUBJECT_ROLE_PID")
	private int subjectRolePid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public PersonLifeLink() {
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

	public int getBetweenAssocPid() {
		return this.betweenAssocPid;
	}

	public int getCommitPid() {
		return this.commitPid;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public int getEventPid() {
		return this.eventPid;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public int getOtherPersonPid() {
		return this.otherPersonPid;
	}

	public int getOtherRolePid() {
		return this.otherRolePid;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getPersonLifeLinkPid() {
		return this.personLifeLinkPid;
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

	public int getSubjectPersonPid() {
		return this.subjectPersonPid;
	}

	public int getSubjectRolePid() {
		return this.subjectRolePid;
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

	public void setBetweenAssocPid(int betweenAssocPid) {
		this.betweenAssocPid = betweenAssocPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setEventPid(int eventPid) {
		this.eventPid = eventPid;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public void setOtherPersonPid(int otherPersonPid) {
		this.otherPersonPid = otherPersonPid;
	}

	public void setOtherRolePid(int otherRolePid) {
		this.otherRolePid = otherRolePid;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setPersonLifeLinkPid(int personLifeLinkPid) {
		this.personLifeLinkPid = personLifeLinkPid;
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

	public void setSubjectPersonPid(int subjectPersonPid) {
		this.subjectPersonPid = subjectPersonPid;
	}

	public void setSubjectRolePid(int subjectRolePid) {
		this.subjectRolePid = subjectRolePid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
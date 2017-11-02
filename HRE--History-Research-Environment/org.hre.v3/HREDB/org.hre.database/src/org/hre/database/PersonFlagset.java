package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the PERSON_FLAGSETS database table.
 * 
 */
@Entity
@Table(name = "PERSON_FLAGSETS")
@NamedQuery(name = "PersonFlagset.findAll", query = "SELECT p FROM PersonFlagset p")
public class PersonFlagset extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	private short f001;

	private short f002;

	private short f003;

	private short f004;

	private short f005;

	private short f006;

	private short f007;

	private short f008;

	private short f009;

	private short f010;

	private short f011;

	private short f012;

	private short f013;

	private short f014;

	private short f015;

	private short f016;

	private short f017;

	private short f018;

	private short f019;

	private short f020;

	private short f021;

	private short f022;

	private short f023;

	private short f024;

	private short f025;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PARENT_OBJ_PID")
	private short parentObjPid;

	@Column(name = "PERSON_FLAGSET_PID")
	private int personFlagsetPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public PersonFlagset() {
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

	public short getF001() {
		return this.f001;
	}

	public short getF002() {
		return this.f002;
	}

	public short getF003() {
		return this.f003;
	}

	public short getF004() {
		return this.f004;
	}

	public short getF005() {
		return this.f005;
	}

	public short getF006() {
		return this.f006;
	}

	public short getF007() {
		return this.f007;
	}

	public short getF008() {
		return this.f008;
	}

	public short getF009() {
		return this.f009;
	}

	public short getF010() {
		return this.f010;
	}

	public short getF011() {
		return this.f011;
	}

	public short getF012() {
		return this.f012;
	}

	public short getF013() {
		return this.f013;
	}

	public short getF014() {
		return this.f014;
	}

	public short getF015() {
		return this.f015;
	}

	public short getF016() {
		return this.f016;
	}

	public short getF017() {
		return this.f017;
	}

	public short getF018() {
		return this.f018;
	}

	public short getF019() {
		return this.f019;
	}

	public short getF020() {
		return this.f020;
	}

	public short getF021() {
		return this.f021;
	}

	public short getF022() {
		return this.f022;
	}

	public short getF023() {
		return this.f023;
	}

	public short getF024() {
		return this.f024;
	}

	public short getF025() {
		return this.f025;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public short getParentObjPid() {
		return this.parentObjPid;
	}

	public int getPersonFlagsetPid() {
		return this.personFlagsetPid;
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

	public void setF001(short f001) {
		this.f001 = f001;
	}

	public void setF002(short f002) {
		this.f002 = f002;
	}

	public void setF003(short f003) {
		this.f003 = f003;
	}

	public void setF004(short f004) {
		this.f004 = f004;
	}

	public void setF005(short f005) {
		this.f005 = f005;
	}

	public void setF006(short f006) {
		this.f006 = f006;
	}

	public void setF007(short f007) {
		this.f007 = f007;
	}

	public void setF008(short f008) {
		this.f008 = f008;
	}

	public void setF009(short f009) {
		this.f009 = f009;
	}

	public void setF010(short f010) {
		this.f010 = f010;
	}

	public void setF011(short f011) {
		this.f011 = f011;
	}

	public void setF012(short f012) {
		this.f012 = f012;
	}

	public void setF013(short f013) {
		this.f013 = f013;
	}

	public void setF014(short f014) {
		this.f014 = f014;
	}

	public void setF015(short f015) {
		this.f015 = f015;
	}

	public void setF016(short f016) {
		this.f016 = f016;
	}

	public void setF017(short f017) {
		this.f017 = f017;
	}

	public void setF018(short f018) {
		this.f018 = f018;
	}

	public void setF019(short f019) {
		this.f019 = f019;
	}

	public void setF020(short f020) {
		this.f020 = f020;
	}

	public void setF021(short f021) {
		this.f021 = f021;
	}

	public void setF022(short f022) {
		this.f022 = f022;
	}

	public void setF023(short f023) {
		this.f023 = f023;
	}

	public void setF024(short f024) {
		this.f024 = f024;
	}

	public void setF025(short f025) {
		this.f025 = f025;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setParentObjPid(short parentObjPid) {
		this.parentObjPid = parentObjPid;
	}

	public void setPersonFlagsetPid(int personFlagsetPid) {
		this.personFlagsetPid = personFlagsetPid;
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

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
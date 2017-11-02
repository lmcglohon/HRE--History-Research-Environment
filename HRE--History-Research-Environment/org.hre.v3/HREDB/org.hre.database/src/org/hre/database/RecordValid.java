package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the RECORD_VALIDS database table.
 * 
 */
@Entity
@Table(name = "RECORD_VALIDS")
@NamedQuery(name = "RecordValid.findAll", query = "SELECT r FROM RecordValid r")
public class RecordValid extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PLUGIN_ID")
	private int pluginId;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	@Column(name = "RECORD_RULE_KEY")
	private short recordRuleKey;

	@Column(name = "RECORD_VALID_KEY")
	private short recordValidKey;

	@Column(name = "RECORD_VALID_PID")
	private int recordValidPid;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public RecordValid() {
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

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getPluginId() {
		return this.pluginId;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public short getRecordRuleKey() {
		return this.recordRuleKey;
	}

	public short getRecordValidKey() {
		return this.recordValidKey;
	}

	public int getRecordValidPid() {
		return this.recordValidPid;
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

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setPluginId(int pluginId) {
		this.pluginId = pluginId;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRecordRuleKey(short recordRuleKey) {
		this.recordRuleKey = recordRuleKey;
	}

	public void setRecordValidKey(short recordValidKey) {
		this.recordValidKey = recordValidKey;
	}

	public void setRecordValidPid(int recordValidPid) {
		this.recordValidPid = recordValidPid;
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
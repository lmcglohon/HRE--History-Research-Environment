package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the PLUGINS database table.
 * 
 */
@Entity
@Table(name = "PLUGINS")
@NamedQuery(name = "Plugin.findAll", query = "SELECT p FROM Plugin p")
public class Plugin extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	private String description;

	@Column(name = "IS_MAIN_PLUGIN")
	private boolean isMainPlugin;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PARENT_PCKG_KEY")
	private short parentPckgKey;

	@Column(name = "PLUGIN_PID")
	private int pluginPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "VERSON_NAME")
	private String versonName;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public Plugin() {
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

	public String getDescription() {
		return this.description;
	}

	public boolean getIsMainPlugin() {
		return this.isMainPlugin;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public short getParentPckgKey() {
		return this.parentPckgKey;
	}

	public int getPluginPid() {
		return this.pluginPid;
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

	public String getVersonName() {
		return this.versonName;
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

	public void setDescription(String description) {
		this.description = description;
	}

	public void setIsMainPlugin(boolean isMainPlugin) {
		this.isMainPlugin = isMainPlugin;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setParentPckgKey(short parentPckgKey) {
		this.parentPckgKey = parentPckgKey;
	}

	public void setPluginPid(int pluginPid) {
		this.pluginPid = pluginPid;
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

	public void setVersonName(String versonName) {
		this.versonName = versonName;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
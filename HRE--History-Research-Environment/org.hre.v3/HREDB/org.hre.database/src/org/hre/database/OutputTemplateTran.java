package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the OUTPUT_TEMPLATE_TRANS database table.
 * 
 */
@Entity
@Table(name = "OUTPUT_TEMPLATE_TRANS")
@NamedQuery(name = "OutputTemplateTran.findAll", query = "SELECT o FROM OutputTemplateTran o")
public class OutputTemplateTran extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "ENCODING_KEY")
	private short encodingKey;

	@Column(name = "LANG_CODE")
	private String langCode;

	@Column(name = "NAME_STYLE_KEY")
	private short nameStyleKey;

	@Column(name = "OUTPUT_TEMPLATE_TRAN_PID")
	private int outputTemplateTranPid;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PLUGIN_PID")
	private short pluginPid;

	@Column(name = "PUBLISH_TYPE_KEY")
	private short publishTypeKey;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	private String template;

	@Column(name = "TEMPLATE_TYPE_KEY")
	private short templateTypeKey;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public OutputTemplateTran() {
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

	public short getEncodingKey() {
		return this.encodingKey;
	}

	public String getLangCode() {
		return this.langCode;
	}

	public short getNameStyleKey() {
		return this.nameStyleKey;
	}

	public int getOutputTemplateTranPid() {
		return this.outputTemplateTranPid;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public short getPluginPid() {
		return this.pluginPid;
	}

	public short getPublishTypeKey() {
		return this.publishTypeKey;
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

	public String getTemplate() {
		return this.template;
	}

	public short getTemplateTypeKey() {
		return this.templateTypeKey;
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

	public void setEncodingKey(short encodingKey) {
		this.encodingKey = encodingKey;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	public void setNameStyleKey(short nameStyleKey) {
		this.nameStyleKey = nameStyleKey;
	}

	public void setOutputTemplateTranPid(int outputTemplateTranPid) {
		this.outputTemplateTranPid = outputTemplateTranPid;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setPluginPid(short pluginPid) {
		this.pluginPid = pluginPid;
	}

	public void setPublishTypeKey(short publishTypeKey) {
		this.publishTypeKey = publishTypeKey;
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

	public void setTemplate(String template) {
		this.template = template;
	}

	public void setTemplateTypeKey(short templateTypeKey) {
		this.templateTypeKey = templateTypeKey;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
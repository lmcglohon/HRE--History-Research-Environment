package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the OUTPUT_TEMPLATE_TRANS database table.
 * 
 */
// @Entity
// @Table(name="OUTPUT_TEMPLATE_TRANS")
// @NamedQuery(name="OutputTemplateTran.findAll", query="SELECT o FROM
// OutputTemplateTran o")
public class OutputTemplateTran implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short entityTypeKey;
	private boolean isSystem;
	private String langCode;
	private short nameStyleKey;
	private int outputTemplateTranPid;
	private short pluginKey;
	private short sentceStyleTypeKey;
	private short setKey;
	private short subTypeKey;
	private String template;
	private short templateTypeKey;

	public OutputTemplateTran() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="ENTITY_TYPE_KEY")
	public short getEntityTypeKey() {
		return this.entityTypeKey;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="LANG_CODE", length=4)
	public String getLangCode() {
		return this.langCode;
	}

	// @Column(name="NAME_STYLE_KEY")
	public short getNameStyleKey() {
		return this.nameStyleKey;
	}

	// @Column(name="OUTPUT_TEMPLATE_TRAN_PID", nullable=false)
	public int getOutputTemplateTranPid() {
		return this.outputTemplateTranPid;
	}

	// @Column(name="PLUGIN_KEY")
	public short getPluginKey() {
		return this.pluginKey;
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	// @Column(name="SENTCE_STYLE_TYPE_KEY")
	public short getSentceStyleTypeKey() {
		return this.sentceStyleTypeKey;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="SUB_TYPE_KEY")
	public short getSubTypeKey() {
		return this.subTypeKey;
	}

	// @Column(length=4000)
	public String getTemplate() {
		return this.template;
	}

	// @Column(name="TEMPLATE_TYPE_KEY")
	public short getTemplateTypeKey() {
		return this.templateTypeKey;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setEntityTypeKey(short entityTypeKey) {
		this.entityTypeKey = entityTypeKey;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
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

	public void setPluginKey(short pluginKey) {
		this.pluginKey = pluginKey;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setSentceStyleTypeKey(short sentceStyleTypeKey) {
		this.sentceStyleTypeKey = sentceStyleTypeKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setSubTypeKey(short subTypeKey) {
		this.subTypeKey = subTypeKey;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public void setTemplateTypeKey(short templateTypeKey) {
		this.templateTypeKey = templateTypeKey;
	}

}
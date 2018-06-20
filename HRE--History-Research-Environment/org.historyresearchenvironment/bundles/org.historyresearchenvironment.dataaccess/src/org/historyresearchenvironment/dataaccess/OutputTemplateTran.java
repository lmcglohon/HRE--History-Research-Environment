package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the OUTPUT_TEMPLATE_TRANS database table.
 * 
 */
// @Entity
// @Table(name="OUTPUT_TEMPLATE_TRANS")
// @NamedQuery(name="OutputTemplateTran.findAll", query="SELECT o FROM OutputTemplateTran o")
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


	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}


	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	// @Column(name="ENTITY_TYPE_KEY")
	public short getEntityTypeKey() {
		return this.entityTypeKey;
	}

	public void setEntityTypeKey(short entityTypeKey) {
		this.entityTypeKey = entityTypeKey;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="LANG_CODE", length=4)
	public String getLangCode() {
		return this.langCode;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}


	// @Column(name="NAME_STYLE_KEY")
	public short getNameStyleKey() {
		return this.nameStyleKey;
	}

	public void setNameStyleKey(short nameStyleKey) {
		this.nameStyleKey = nameStyleKey;
	}


	// @Column(name="OUTPUT_TEMPLATE_TRAN_PID", nullable=false)
	public int getOutputTemplateTranPid() {
		return this.outputTemplateTranPid;
	}

	public void setOutputTemplateTranPid(int outputTemplateTranPid) {
		this.outputTemplateTranPid = outputTemplateTranPid;
	}


	// @Column(name="PLUGIN_KEY")
	public short getPluginKey() {
		return this.pluginKey;
	}

	public void setPluginKey(short pluginKey) {
		this.pluginKey = pluginKey;
	}


	// @Column(name="SENTCE_STYLE_TYPE_KEY")
	public short getSentceStyleTypeKey() {
		return this.sentceStyleTypeKey;
	}

	public void setSentceStyleTypeKey(short sentceStyleTypeKey) {
		this.sentceStyleTypeKey = sentceStyleTypeKey;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(name="SUB_TYPE_KEY")
	public short getSubTypeKey() {
		return this.subTypeKey;
	}

	public void setSubTypeKey(short subTypeKey) {
		this.subTypeKey = subTypeKey;
	}


	// @Column(length=4000)
	public String getTemplate() {
		return this.template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}


	// @Column(name="TEMPLATE_TYPE_KEY")
	public short getTemplateTypeKey() {
		return this.templateTypeKey;
	}

	public void setTemplateTypeKey(short templateTypeKey) {
		this.templateTypeKey = templateTypeKey;
	}

}
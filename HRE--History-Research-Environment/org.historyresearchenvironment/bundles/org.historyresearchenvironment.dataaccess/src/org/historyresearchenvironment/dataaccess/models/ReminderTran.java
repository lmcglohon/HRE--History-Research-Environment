package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the REMINDER_TRANS database table.
 * 
 */
// @Entity
// @Table(name="REMINDER_TRANS")
// @NamedQuery(name="ReminderTran.findAll", query="SELECT r FROM ReminderTran
// r")
public class ReminderTran implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short encodingKey;
	private short entityTypeKey;
	private boolean isWholeScreen;
	private String langCode;
	private short pluginKey;
	private String reminder;
	private int reminderTranPid;
	private short screenKey;
	private short screenPid;
	private short setKey;
	private short subTypeKey;

	public ReminderTran() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="ENCODING_KEY")
	public short getEncodingKey() {
		return this.encodingKey;
	}

	// @Column(name="ENTITY_TYPE_KEY")
	public short getEntityTypeKey() {
		return this.entityTypeKey;
	}

	// @Column(name="IS_WHOLE_SCREEN")
	public boolean getIsWholeScreen() {
		return this.isWholeScreen;
	}

	// @Column(name="LANG_CODE", length=4)
	public String getLangCode() {
		return this.langCode;
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

	// @Column(length=400)
	public String getReminder() {
		return this.reminder;
	}

	// @Column(name="REMINDER_TRAN_PID", nullable=false)
	public int getReminderTranPid() {
		return this.reminderTranPid;
	}

	// @Column(name="SCREEN_KEY")
	public short getScreenKey() {
		return this.screenKey;
	}

	// @Column(name="SCREEN_PID")
	public short getScreenPid() {
		return this.screenPid;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="SUB_TYPE_KEY")
	public short getSubTypeKey() {
		return this.subTypeKey;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setEncodingKey(short encodingKey) {
		this.encodingKey = encodingKey;
	}

	public void setEntityTypeKey(short entityTypeKey) {
		this.entityTypeKey = entityTypeKey;
	}

	public void setIsWholeScreen(boolean isWholeScreen) {
		this.isWholeScreen = isWholeScreen;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	public void setPluginKey(short pluginKey) {
		this.pluginKey = pluginKey;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReminder(String reminder) {
		this.reminder = reminder;
	}

	public void setReminderTranPid(int reminderTranPid) {
		this.reminderTranPid = reminderTranPid;
	}

	public void setScreenKey(short screenKey) {
		this.screenKey = screenKey;
	}

	public void setScreenPid(short screenPid) {
		this.screenPid = screenPid;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setSubTypeKey(short subTypeKey) {
		this.subTypeKey = subTypeKey;
	}

}
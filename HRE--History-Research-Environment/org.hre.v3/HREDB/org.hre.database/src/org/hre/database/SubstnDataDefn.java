package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SUBSTN_DATA_DEFNS database table.
 * 
 */
@Entity
@Table(name = "SUBSTN_DATA_DEFNS")
@NamedQuery(name = "SubstnDataDefn.findAll", query = "SELECT s FROM SubstnDataDefn s")
public class SubstnDataDefn extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "ARG1_TYPE_KEY")
	private short arg1TypeKey;

	@Column(name = "ARG2_IS_CONSTANT")
	private boolean arg2IsConstant;

	@Column(name = "ARG2_VALUE")
	private String arg2Value;

	@Column(name = "ASK_QUESTION_PID")
	private int askQuestionPid;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "HEAD_TYPE_KEY")
	private short headTypeKey;

	@Column(name = "IS_COMPLETE")
	private boolean isComplete;

	@Column(name = "IS_DATA_HEAD")
	private boolean isDataHead;

	@Column(name = "IS_DATA_TAIL")
	private boolean isDataTail;

	@Column(name = "IS_RUN_TIME_ASK")
	private boolean isRunTimeAsk;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PARENT_TYPE_KEY")
	private short parentTypeKey;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "SUBSTN_DATA_DEFN_PID")
	private int substnDataDefnPid;

	@Column(name = "SUBSTN_DATA_DEFNS_PID")
	private int substnDataDefnsPid;

	@Column(name = "TAIL_TYPE_KEY")
	private short tailTypeKey;

	@Column(name = "THIS_TYPE_KEY")
	private short thisTypeKey;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public SubstnDataDefn() {
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

	public short getArg1TypeKey() {
		return this.arg1TypeKey;
	}

	public boolean getArg2IsConstant() {
		return this.arg2IsConstant;
	}

	public String getArg2Value() {
		return this.arg2Value;
	}

	public int getAskQuestionPid() {
		return this.askQuestionPid;
	}

	public int getCommitPid() {
		return this.commitPid;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public short getHeadTypeKey() {
		return this.headTypeKey;
	}

	public boolean getIsComplete() {
		return this.isComplete;
	}

	public boolean getIsDataHead() {
		return this.isDataHead;
	}

	public boolean getIsDataTail() {
		return this.isDataTail;
	}

	public boolean getIsRunTimeAsk() {
		return this.isRunTimeAsk;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public short getParentTypeKey() {
		return this.parentTypeKey;
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

	public int getSubstnDataDefnPid() {
		return this.substnDataDefnPid;
	}

	public int getSubstnDataDefnsPid() {
		return this.substnDataDefnsPid;
	}

	public short getTailTypeKey() {
		return this.tailTypeKey;
	}

	public short getThisTypeKey() {
		return this.thisTypeKey;
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

	public void setArg1TypeKey(short arg1TypeKey) {
		this.arg1TypeKey = arg1TypeKey;
	}

	public void setArg2IsConstant(boolean arg2IsConstant) {
		this.arg2IsConstant = arg2IsConstant;
	}

	public void setArg2Value(String arg2Value) {
		this.arg2Value = arg2Value;
	}

	public void setAskQuestionPid(int askQuestionPid) {
		this.askQuestionPid = askQuestionPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setHeadTypeKey(short headTypeKey) {
		this.headTypeKey = headTypeKey;
	}

	public void setIsComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

	public void setIsDataHead(boolean isDataHead) {
		this.isDataHead = isDataHead;
	}

	public void setIsDataTail(boolean isDataTail) {
		this.isDataTail = isDataTail;
	}

	public void setIsRunTimeAsk(boolean isRunTimeAsk) {
		this.isRunTimeAsk = isRunTimeAsk;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setParentTypeKey(short parentTypeKey) {
		this.parentTypeKey = parentTypeKey;
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

	public void setSubstnDataDefnPid(int substnDataDefnPid) {
		this.substnDataDefnPid = substnDataDefnPid;
	}

	public void setSubstnDataDefnsPid(int substnDataDefnsPid) {
		this.substnDataDefnsPid = substnDataDefnsPid;
	}

	public void setTailTypeKey(short tailTypeKey) {
		this.tailTypeKey = tailTypeKey;
	}

	public void setThisTypeKey(short thisTypeKey) {
		this.thisTypeKey = thisTypeKey;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
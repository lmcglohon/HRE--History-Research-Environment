package org.hre.database;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the USER_MESSAGES database table.
 * 
 */
@Entity
@Table(name = "USER_MESSAGES")
@NamedQuery(name = "UserMessage.findAll", query = "SELECT u FROM UserMessage u")
public class UserMessage extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "FROM_USER_PID")
	private int fromUserPid;

	@Column(name = "IS_ACKD")
	private boolean isAckd;

	@Column(name = "IS_READ")
	private boolean isRead;

	private String message;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private boolean replied;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "TIME_SENT")
	private Timestamp timeSent;

	@Column(name = "TO_USER_PID")
	private int toUserPid;

	@Column(name = "USER_MESSAGE_PID")
	private int userMessagePid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public UserMessage() {
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

	public int getFromUserPid() {
		return this.fromUserPid;
	}

	public boolean getIsAckd() {
		return this.isAckd;
	}

	public boolean getIsRead() {
		return this.isRead;
	}

	public String getMessage() {
		return this.message;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public boolean getReplied() {
		return this.replied;
	}

	public short getRights() {
		return this.rights;
	}

	public short getSetPid() {
		return this.setPid;
	}

	public Timestamp getTimeSent() {
		return this.timeSent;
	}

	public int getToUserPid() {
		return this.toUserPid;
	}

	public int getUserMessagePid() {
		return this.userMessagePid;
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

	public void setFromUserPid(int fromUserPid) {
		this.fromUserPid = fromUserPid;
	}

	public void setIsAckd(boolean isAckd) {
		this.isAckd = isAckd;
	}

	public void setIsRead(boolean isRead) {
		this.isRead = isRead;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReplied(boolean replied) {
		this.replied = replied;
	}

	public void setRights(short rights) {
		this.rights = rights;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setTimeSent(Timestamp timeSent) {
		this.timeSent = timeSent;
	}

	public void setToUserPid(int toUserPid) {
		this.toUserPid = toUserPid;
	}

	public void setUserMessagePid(int userMessagePid) {
		this.userMessagePid = userMessagePid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
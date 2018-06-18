package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the USER_MESSAGES database table.
 * 
 */
// @Entity
// @Table(name="USER_MESSAGES")
// @NamedQuery(name="UserMessage.findAll", query="SELECT u FROM UserMessage u")
public class UserMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private int fromUserPid;
	private boolean isAckd;
	private boolean isRead;
	private String message;
	private boolean replied;
	private short setKey;
	private Timestamp timeSent;
	private int toUserPid;
	private int userMessagePid;

	public UserMessage() {
	}


	// @Id
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


	// @Column(name="FROM_USER_PID")
	public int getFromUserPid() {
		return this.fromUserPid;
	}

	public void setFromUserPid(int fromUserPid) {
		this.fromUserPid = fromUserPid;
	}


	// @Column(name="IS_ACKD")
	public boolean getIsAckd() {
		return this.isAckd;
	}

	public void setIsAckd(boolean isAckd) {
		this.isAckd = isAckd;
	}


	// @Column(name="IS_READ")
	public boolean getIsRead() {
		return this.isRead;
	}

	public void setIsRead(boolean isRead) {
		this.isRead = isRead;
	}


	// @Column(length=300)
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public boolean getReplied() {
		return this.replied;
	}

	public void setReplied(boolean replied) {
		this.replied = replied;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(name="TIME_SENT")
	public Timestamp getTimeSent() {
		return this.timeSent;
	}

	public void setTimeSent(Timestamp timeSent) {
		this.timeSent = timeSent;
	}


	// @Column(name="TO_USER_PID")
	public int getToUserPid() {
		return this.toUserPid;
	}

	public void setToUserPid(int toUserPid) {
		this.toUserPid = toUserPid;
	}


	// @Column(name="USER_MESSAGE_PID", nullable=false)
	public int getUserMessagePid() {
		return this.userMessagePid;
	}

	public void setUserMessagePid(int userMessagePid) {
		this.userMessagePid = userMessagePid;
	}

}
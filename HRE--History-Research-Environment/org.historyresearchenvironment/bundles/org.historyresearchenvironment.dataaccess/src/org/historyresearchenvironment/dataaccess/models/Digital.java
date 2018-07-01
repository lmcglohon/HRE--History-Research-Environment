package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the DIGITALS database table.
 * 
 */
// @Entity
// @Table(name="DIGITALS")
// @NamedQuery(name="Digital.findAll", query="SELECT d FROM Digital d")
public class Digital implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int bestCreatePid;
	private int bestDestroyPid;
	private int bestImagePid;
	private int bestNamePid;
	private byte[] binaryContent;
	private String charContent;
	private int commitPid;
	private int digitalPid;
	private int editedCopyPid;
	private short encodingKey;
	private String filePath;
	private byte[] flags;
	private short imageHeight;
	private short imageWidth;
	private boolean isBinary;
	private boolean isInternal;
	private boolean isSystem;
	private boolean pathIsFull;
	private short setKey;
	private short subTypeKey;
	private String surety;
	private int visibleId;

	public Digital() {
	}

	// @Column(name="BEST_CREATE_PID")
	public int getBestCreatePid() {
		return this.bestCreatePid;
	}

	// @Column(name="BEST_DESTROY_PID")
	public int getBestDestroyPid() {
		return this.bestDestroyPid;
	}

	// @Column(name="BEST_IMAGE_PID")
	public int getBestImagePid() {
		return this.bestImagePid;
	}

	// @Column(name="BEST_NAME_PID")
	public int getBestNamePid() {
		return this.bestNamePid;
	}

	// @Lob
	// @Column(name="BINARY_CONTENT")
	public byte[] getBinaryContent() {
		return this.binaryContent;
	}

	// @Lob
	// @Column(name="CHAR_CONTENT")
	public String getCharContent() {
		return this.charContent;
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DIGITAL_PID", nullable=false)
	public int getDigitalPid() {
		return this.digitalPid;
	}

	// @Column(name="EDITED_COPY_PID")
	public int getEditedCopyPid() {
		return this.editedCopyPid;
	}

	// @Column(name="ENCODING_KEY")
	public short getEncodingKey() {
		return this.encodingKey;
	}

	// @Column(name="FILE_PATH", length=300)
	public String getFilePath() {
		return this.filePath;
	}

	public byte[] getFlags() {
		return this.flags;
	}

	// @Column(name="IMAGE_HEIGHT")
	public short getImageHeight() {
		return this.imageHeight;
	}

	// @Column(name="IMAGE_WIDTH")
	public short getImageWidth() {
		return this.imageWidth;
	}

	// @Column(name="IS_BINARY")
	public boolean getIsBinary() {
		return this.isBinary;
	}

	// @Column(name="IS_INTERNAL")
	public boolean getIsInternal() {
		return this.isInternal;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="PATH_IS_FULL")
	public boolean getPathIsFull() {
		return this.pathIsFull;
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="SUB_TYPE_KEY")
	public short getSubTypeKey() {
		return this.subTypeKey;
	}

	// @Column(length=10)
	public String getSurety() {
		return this.surety;
	}

	// @Column(name="VISIBLE_ID")
	public int getVisibleId() {
		return this.visibleId;
	}

	public void setBestCreatePid(int bestCreatePid) {
		this.bestCreatePid = bestCreatePid;
	}

	public void setBestDestroyPid(int bestDestroyPid) {
		this.bestDestroyPid = bestDestroyPid;
	}

	public void setBestImagePid(int bestImagePid) {
		this.bestImagePid = bestImagePid;
	}

	public void setBestNamePid(int bestNamePid) {
		this.bestNamePid = bestNamePid;
	}

	public void setBinaryContent(byte[] binaryContent) {
		this.binaryContent = binaryContent;
	}

	public void setCharContent(String charContent) {
		this.charContent = charContent;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDigitalPid(int digitalPid) {
		this.digitalPid = digitalPid;
	}

	public void setEditedCopyPid(int editedCopyPid) {
		this.editedCopyPid = editedCopyPid;
	}

	public void setEncodingKey(short encodingKey) {
		this.encodingKey = encodingKey;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public void setFlags(byte[] flags) {
		this.flags = flags;
	}

	public void setImageHeight(short imageHeight) {
		this.imageHeight = imageHeight;
	}

	public void setImageWidth(short imageWidth) {
		this.imageWidth = imageWidth;
	}

	public void setIsBinary(boolean isBinary) {
		this.isBinary = isBinary;
	}

	public void setIsInternal(boolean isInternal) {
		this.isInternal = isInternal;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setPathIsFull(boolean pathIsFull) {
		this.pathIsFull = pathIsFull;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setSubTypeKey(short subTypeKey) {
		this.subTypeKey = subTypeKey;
	}

	public void setSurety(String surety) {
		this.surety = surety;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
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


	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}


	// @Column(name="BEST_CREATE_PID")
	public int getBestCreatePid() {
		return this.bestCreatePid;
	}

	public void setBestCreatePid(int bestCreatePid) {
		this.bestCreatePid = bestCreatePid;
	}


	// @Column(name="BEST_DESTROY_PID")
	public int getBestDestroyPid() {
		return this.bestDestroyPid;
	}

	public void setBestDestroyPid(int bestDestroyPid) {
		this.bestDestroyPid = bestDestroyPid;
	}


	// @Column(name="BEST_IMAGE_PID")
	public int getBestImagePid() {
		return this.bestImagePid;
	}

	public void setBestImagePid(int bestImagePid) {
		this.bestImagePid = bestImagePid;
	}


	// @Column(name="BEST_NAME_PID")
	public int getBestNamePid() {
		return this.bestNamePid;
	}

	public void setBestNamePid(int bestNamePid) {
		this.bestNamePid = bestNamePid;
	}


	// @Lob
	// @Column(name="BINARY_CONTENT")
	public byte[] getBinaryContent() {
		return this.binaryContent;
	}

	public void setBinaryContent(byte[] binaryContent) {
		this.binaryContent = binaryContent;
	}


	// @Lob
	// @Column(name="CHAR_CONTENT")
	public String getCharContent() {
		return this.charContent;
	}

	public void setCharContent(String charContent) {
		this.charContent = charContent;
	}


	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	// @Column(name="DIGITAL_PID", nullable=false)
	public int getDigitalPid() {
		return this.digitalPid;
	}

	public void setDigitalPid(int digitalPid) {
		this.digitalPid = digitalPid;
	}


	// @Column(name="EDITED_COPY_PID")
	public int getEditedCopyPid() {
		return this.editedCopyPid;
	}

	public void setEditedCopyPid(int editedCopyPid) {
		this.editedCopyPid = editedCopyPid;
	}


	// @Column(name="ENCODING_KEY")
	public short getEncodingKey() {
		return this.encodingKey;
	}

	public void setEncodingKey(short encodingKey) {
		this.encodingKey = encodingKey;
	}


	// @Column(name="FILE_PATH", length=300)
	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}


	public byte[] getFlags() {
		return this.flags;
	}

	public void setFlags(byte[] flags) {
		this.flags = flags;
	}


	// @Column(name="IMAGE_HEIGHT")
	public short getImageHeight() {
		return this.imageHeight;
	}

	public void setImageHeight(short imageHeight) {
		this.imageHeight = imageHeight;
	}


	// @Column(name="IMAGE_WIDTH")
	public short getImageWidth() {
		return this.imageWidth;
	}

	public void setImageWidth(short imageWidth) {
		this.imageWidth = imageWidth;
	}


	// @Column(name="IS_BINARY")
	public boolean getIsBinary() {
		return this.isBinary;
	}

	public void setIsBinary(boolean isBinary) {
		this.isBinary = isBinary;
	}


	// @Column(name="IS_INTERNAL")
	public boolean getIsInternal() {
		return this.isInternal;
	}

	public void setIsInternal(boolean isInternal) {
		this.isInternal = isInternal;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="PATH_IS_FULL")
	public boolean getPathIsFull() {
		return this.pathIsFull;
	}

	public void setPathIsFull(boolean pathIsFull) {
		this.pathIsFull = pathIsFull;
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


	// @Column(length=10)
	public String getSurety() {
		return this.surety;
	}

	public void setSurety(String surety) {
		this.surety = surety;
	}


	// @Column(name="VISIBLE_ID")
	public int getVisibleId() {
		return this.visibleId;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
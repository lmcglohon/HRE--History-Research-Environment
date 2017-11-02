package org.hre.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the IMAGES database table.
 * 
 */
@Entity
@Table(name = "IMAGES")
@NamedQuery(name = "Image.findAll", query = "SELECT i FROM Image i")
public class Image extends AbstractHreTableRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "ENCODING_KEY")
	private short encodingKey;

	@Column(name = "FILE_PATH")
	private String filePath;

	@Column(name = "IMAGE_HDATE_PID")
	private int imageHdatePid;

	@Column(name = "IMAGE_HEIGHT")
	private short imageHeight;

	@Column(name = "IMAGE_PID")
	private int imagePid;

	@Column(name = "IMAGE_SURETY")
	private String imageSurety;

	@Column(name = "IMAGE_WIDTH")
	private short imageWidth;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public Image() {
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

	public String getFilePath() {
		return this.filePath;
	}

	public int getImageHdatePid() {
		return this.imageHdatePid;
	}

	public short getImageHeight() {
		return this.imageHeight;
	}

	public int getImagePid() {
		return this.imagePid;
	}

	public String getImageSurety() {
		return this.imageSurety;
	}

	public short getImageWidth() {
		return this.imageWidth;
	}

	public int getOwnerPid() {
		return this.ownerPid;
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

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public void setImageHdatePid(int imageHdatePid) {
		this.imageHdatePid = imageHdatePid;
	}

	public void setImageHeight(short imageHeight) {
		this.imageHeight = imageHeight;
	}

	public void setImagePid(int imagePid) {
		this.imagePid = imagePid;
	}

	public void setImageSurety(String imageSurety) {
		this.imageSurety = imageSurety;
	}

	public void setImageWidth(short imageWidth) {
		this.imageWidth = imageWidth;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
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

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
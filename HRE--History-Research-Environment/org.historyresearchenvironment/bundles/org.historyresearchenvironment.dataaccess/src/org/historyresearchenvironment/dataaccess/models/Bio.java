package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the BIOS database table.
 * 
 */
// @Entity
// @Table(name="BIOS")
// @NamedQuery(name="Bio.findAll", query="SELECT b FROM Bio b")
public class Bio implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int bestBioFemaleParentPid;
	private int bestBioMaleParentPid;
	private int bestBirthPid;
	private int bestDeathPid;
	private int bestImagePid;
	private int bestNamePid;
	private int bestNonBioParent1Pid;
	private int bestNonBioParent2Pid;
	private int bioPid;
	private int commitPid;
	private short eggProviderIssueOrder;
	private byte[] flags;
	private boolean isSystem;
	private short livingKey;
	private short setKey;
	private short sexKey;
	private short spermProviderIssueOrder;
	private short subTypeKey;
	private String surety;
	private boolean useBioFemaleParent;
	private boolean useBioMaleParent;
	private int visibleId;

	public Bio() {
	}

	// @Column(name="BEST_BIO_FEMALE_PARENT_PID")
	public int getBestBioFemaleParentPid() {
		return this.bestBioFemaleParentPid;
	}

	// @Column(name="BEST_BIO_MALE_PARENT_PID")
	public int getBestBioMaleParentPid() {
		return this.bestBioMaleParentPid;
	}

	// @Column(name="BEST_BIRTH_PID")
	public int getBestBirthPid() {
		return this.bestBirthPid;
	}

	// @Column(name="BEST_DEATH_PID")
	public int getBestDeathPid() {
		return this.bestDeathPid;
	}

	// @Column(name="BEST_IMAGE_PID")
	public int getBestImagePid() {
		return this.bestImagePid;
	}

	// @Column(name="BEST_NAME_PID")
	public int getBestNamePid() {
		return this.bestNamePid;
	}

	// @Column(name="BEST_NON_BIO_PARENT1_PID")
	public int getBestNonBioParent1Pid() {
		return this.bestNonBioParent1Pid;
	}

	// @Column(name="BEST_NON_BIO_PARENT2_PID")
	public int getBestNonBioParent2Pid() {
		return this.bestNonBioParent2Pid;
	}

	// @Column(name="BIO_PID", nullable=false)
	public int getBioPid() {
		return this.bioPid;
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="EGG_PROVIDER_ISSUE_ORDER")
	public short getEggProviderIssueOrder() {
		return this.eggProviderIssueOrder;
	}

	public byte[] getFlags() {
		return this.flags;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="LIVING_KEY")
	public short getLivingKey() {
		return this.livingKey;
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

	// @Column(name="SEX_KEY")
	public short getSexKey() {
		return this.sexKey;
	}

	// @Column(name="SPERM_PROVIDER_ISSUE_ORDER")
	public short getSpermProviderIssueOrder() {
		return this.spermProviderIssueOrder;
	}

	// @Column(name="SUB_TYPE_KEY")
	public short getSubTypeKey() {
		return this.subTypeKey;
	}

	// @Column(length=10)
	public String getSurety() {
		return this.surety;
	}

	// @Column(name="USE_BIO_FEMALE_PARENT")
	public boolean getUseBioFemaleParent() {
		return this.useBioFemaleParent;
	}

	// @Column(name="USE_BIO_MALE_PARENT")
	public boolean getUseBioMaleParent() {
		return this.useBioMaleParent;
	}

	// @Column(name="VISIBLE_ID", nullable=false)
	public int getVisibleId() {
		return this.visibleId;
	}

	public void setBestBioFemaleParentPid(int bestBioFemaleParentPid) {
		this.bestBioFemaleParentPid = bestBioFemaleParentPid;
	}

	public void setBestBioMaleParentPid(int bestBioMaleParentPid) {
		this.bestBioMaleParentPid = bestBioMaleParentPid;
	}

	public void setBestBirthPid(int bestBirthPid) {
		this.bestBirthPid = bestBirthPid;
	}

	public void setBestDeathPid(int bestDeathPid) {
		this.bestDeathPid = bestDeathPid;
	}

	public void setBestImagePid(int bestImagePid) {
		this.bestImagePid = bestImagePid;
	}

	public void setBestNamePid(int bestNamePid) {
		this.bestNamePid = bestNamePid;
	}

	public void setBestNonBioParent1Pid(int bestNonBioParent1Pid) {
		this.bestNonBioParent1Pid = bestNonBioParent1Pid;
	}

	public void setBestNonBioParent2Pid(int bestNonBioParent2Pid) {
		this.bestNonBioParent2Pid = bestNonBioParent2Pid;
	}

	public void setBioPid(int bioPid) {
		this.bioPid = bioPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setEggProviderIssueOrder(short eggProviderIssueOrder) {
		this.eggProviderIssueOrder = eggProviderIssueOrder;
	}

	public void setFlags(byte[] flags) {
		this.flags = flags;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setLivingKey(short livingKey) {
		this.livingKey = livingKey;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setSexKey(short sexKey) {
		this.sexKey = sexKey;
	}

	public void setSpermProviderIssueOrder(short spermProviderIssueOrder) {
		this.spermProviderIssueOrder = spermProviderIssueOrder;
	}

	public void setSubTypeKey(short subTypeKey) {
		this.subTypeKey = subTypeKey;
	}

	public void setSurety(String surety) {
		this.surety = surety;
	}

	public void setUseBioFemaleParent(boolean useBioFemaleParent) {
		this.useBioFemaleParent = useBioFemaleParent;
	}

	public void setUseBioMaleParent(boolean useBioMaleParent) {
		this.useBioMaleParent = useBioMaleParent;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
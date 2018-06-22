package org.historyresearchenvironment.dataaccess;

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

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	// @Column(name="BEST_BIO_FEMALE_PARENT_PID")
	public int getBestBioFemaleParentPid() {
		return this.bestBioFemaleParentPid;
	}

	public void setBestBioFemaleParentPid(int bestBioFemaleParentPid) {
		this.bestBioFemaleParentPid = bestBioFemaleParentPid;
	}

	// @Column(name="BEST_BIO_MALE_PARENT_PID")
	public int getBestBioMaleParentPid() {
		return this.bestBioMaleParentPid;
	}

	public void setBestBioMaleParentPid(int bestBioMaleParentPid) {
		this.bestBioMaleParentPid = bestBioMaleParentPid;
	}

	// @Column(name="BEST_BIRTH_PID")
	public int getBestBirthPid() {
		return this.bestBirthPid;
	}

	public void setBestBirthPid(int bestBirthPid) {
		this.bestBirthPid = bestBirthPid;
	}

	// @Column(name="BEST_DEATH_PID")
	public int getBestDeathPid() {
		return this.bestDeathPid;
	}

	public void setBestDeathPid(int bestDeathPid) {
		this.bestDeathPid = bestDeathPid;
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

	// @Column(name="BEST_NON_BIO_PARENT1_PID")
	public int getBestNonBioParent1Pid() {
		return this.bestNonBioParent1Pid;
	}

	public void setBestNonBioParent1Pid(int bestNonBioParent1Pid) {
		this.bestNonBioParent1Pid = bestNonBioParent1Pid;
	}

	// @Column(name="BEST_NON_BIO_PARENT2_PID")
	public int getBestNonBioParent2Pid() {
		return this.bestNonBioParent2Pid;
	}

	public void setBestNonBioParent2Pid(int bestNonBioParent2Pid) {
		this.bestNonBioParent2Pid = bestNonBioParent2Pid;
	}

	// @Column(name="BIO_PID", nullable=false)
	public int getBioPid() {
		return this.bioPid;
	}

	public void setBioPid(int bioPid) {
		this.bioPid = bioPid;
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	// @Column(name="EGG_PROVIDER_ISSUE_ORDER")
	public short getEggProviderIssueOrder() {
		return this.eggProviderIssueOrder;
	}

	public void setEggProviderIssueOrder(short eggProviderIssueOrder) {
		this.eggProviderIssueOrder = eggProviderIssueOrder;
	}

	public byte[] getFlags() {
		return this.flags;
	}

	public void setFlags(byte[] flags) {
		this.flags = flags;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	// @Column(name="LIVING_KEY")
	public short getLivingKey() {
		return this.livingKey;
	}

	public void setLivingKey(short livingKey) {
		this.livingKey = livingKey;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	// @Column(name="SEX_KEY")
	public short getSexKey() {
		return this.sexKey;
	}

	public void setSexKey(short sexKey) {
		this.sexKey = sexKey;
	}

	// @Column(name="SPERM_PROVIDER_ISSUE_ORDER")
	public short getSpermProviderIssueOrder() {
		return this.spermProviderIssueOrder;
	}

	public void setSpermProviderIssueOrder(short spermProviderIssueOrder) {
		this.spermProviderIssueOrder = spermProviderIssueOrder;
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

	// @Column(name="USE_BIO_FEMALE_PARENT")
	public boolean getUseBioFemaleParent() {
		return this.useBioFemaleParent;
	}

	public void setUseBioFemaleParent(boolean useBioFemaleParent) {
		this.useBioFemaleParent = useBioFemaleParent;
	}

	// @Column(name="USE_BIO_MALE_PARENT")
	public boolean getUseBioMaleParent() {
		return this.useBioMaleParent;
	}

	public void setUseBioMaleParent(boolean useBioMaleParent) {
		this.useBioMaleParent = useBioMaleParent;
	}

	// @Column(name="VISIBLE_ID", nullable=false)
	public int getVisibleId() {
		return this.visibleId;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
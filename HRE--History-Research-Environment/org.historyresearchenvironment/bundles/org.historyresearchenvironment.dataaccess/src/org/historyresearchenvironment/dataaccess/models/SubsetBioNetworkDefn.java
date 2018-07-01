package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the SUBSET_BIO_NETWORK_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="SUBSET_BIO_NETWORK_DEFNS")
// @NamedQuery(name="SubsetBioNetworkDefn.findAll", query="SELECT s FROM
// SubsetBioNetworkDefn s")
public class SubsetBioNetworkDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int bioPid;
	private int commitPid;
	private int commonParentSetPid;
	private boolean isAncestralLink;
	private boolean isViaFemaleAncestor;
	private short kinCode;
	private short minGeneration;
	private int parentSetPid;
	private short setKey;
	private int subsetBioNetworkDefnPid;
	private int subsetPid;
	private short thisGeneration;
	private int useOrder;

	public SubsetBioNetworkDefn() {
	}

	// @Column(name="BIO_PID")
	public int getBioPid() {
		return this.bioPid;
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="COMMON_PARENT_SET_PID")
	public int getCommonParentSetPid() {
		return this.commonParentSetPid;
	}

	// @Column(name="IS_ANCESTRAL_LINK")
	public boolean getIsAncestralLink() {
		return this.isAncestralLink;
	}

	// @Column(name="IS_VIA_FEMALE_ANCESTOR")
	public boolean getIsViaFemaleAncestor() {
		return this.isViaFemaleAncestor;
	}

	// @Column(name="KIN_CODE")
	public short getKinCode() {
		return this.kinCode;
	}

	// @Column(name="MIN_GENERATION")
	public short getMinGeneration() {
		return this.minGeneration;
	}

	// @Column(name="PARENT_SET_PID")
	public int getParentSetPid() {
		return this.parentSetPid;
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

	// @Column(name="SUBSET_BIO_NETWORK_DEFN_PID")
	public int getSubsetBioNetworkDefnPid() {
		return this.subsetBioNetworkDefnPid;
	}

	// @Column(name="SUBSET_PID")
	public int getSubsetPid() {
		return this.subsetPid;
	}

	// @Column(name="THIS_GENERATION")
	public short getThisGeneration() {
		return this.thisGeneration;
	}

	// @Column(name="USE_ORDER")
	public int getUseOrder() {
		return this.useOrder;
	}

	public void setBioPid(int bioPid) {
		this.bioPid = bioPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setCommonParentSetPid(int commonParentSetPid) {
		this.commonParentSetPid = commonParentSetPid;
	}

	public void setIsAncestralLink(boolean isAncestralLink) {
		this.isAncestralLink = isAncestralLink;
	}

	public void setIsViaFemaleAncestor(boolean isViaFemaleAncestor) {
		this.isViaFemaleAncestor = isViaFemaleAncestor;
	}

	public void setKinCode(short kinCode) {
		this.kinCode = kinCode;
	}

	public void setMinGeneration(short minGeneration) {
		this.minGeneration = minGeneration;
	}

	public void setParentSetPid(int parentSetPid) {
		this.parentSetPid = parentSetPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setSubsetBioNetworkDefnPid(int subsetBioNetworkDefnPid) {
		this.subsetBioNetworkDefnPid = subsetBioNetworkDefnPid;
	}

	public void setSubsetPid(int subsetPid) {
		this.subsetPid = subsetPid;
	}

	public void setThisGeneration(short thisGeneration) {
		this.thisGeneration = thisGeneration;
	}

	public void setUseOrder(int useOrder) {
		this.useOrder = useOrder;
	}

}
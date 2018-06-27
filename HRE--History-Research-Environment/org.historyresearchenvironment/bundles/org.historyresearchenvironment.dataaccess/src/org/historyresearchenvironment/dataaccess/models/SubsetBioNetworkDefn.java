package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;


/**
 * The persistent class for the SUBSET_BIO_NETWORK_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="SUBSET_BIO_NETWORK_DEFNS")
// @NamedQuery(name="SubsetBioNetworkDefn.findAll", query="SELECT s FROM SubsetBioNetworkDefn s")
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


	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}


	// @Column(name="BIO_PID")
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


	// @Column(name="COMMON_PARENT_SET_PID")
	public int getCommonParentSetPid() {
		return this.commonParentSetPid;
	}

	public void setCommonParentSetPid(int commonParentSetPid) {
		this.commonParentSetPid = commonParentSetPid;
	}


	// @Column(name="IS_ANCESTRAL_LINK")
	public boolean getIsAncestralLink() {
		return this.isAncestralLink;
	}

	public void setIsAncestralLink(boolean isAncestralLink) {
		this.isAncestralLink = isAncestralLink;
	}


	// @Column(name="IS_VIA_FEMALE_ANCESTOR")
	public boolean getIsViaFemaleAncestor() {
		return this.isViaFemaleAncestor;
	}

	public void setIsViaFemaleAncestor(boolean isViaFemaleAncestor) {
		this.isViaFemaleAncestor = isViaFemaleAncestor;
	}


	// @Column(name="KIN_CODE")
	public short getKinCode() {
		return this.kinCode;
	}

	public void setKinCode(short kinCode) {
		this.kinCode = kinCode;
	}


	// @Column(name="MIN_GENERATION")
	public short getMinGeneration() {
		return this.minGeneration;
	}

	public void setMinGeneration(short minGeneration) {
		this.minGeneration = minGeneration;
	}


	// @Column(name="PARENT_SET_PID")
	public int getParentSetPid() {
		return this.parentSetPid;
	}

	public void setParentSetPid(int parentSetPid) {
		this.parentSetPid = parentSetPid;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(name="SUBSET_BIO_NETWORK_DEFN_PID")
	public int getSubsetBioNetworkDefnPid() {
		return this.subsetBioNetworkDefnPid;
	}

	public void setSubsetBioNetworkDefnPid(int subsetBioNetworkDefnPid) {
		this.subsetBioNetworkDefnPid = subsetBioNetworkDefnPid;
	}


	// @Column(name="SUBSET_PID")
	public int getSubsetPid() {
		return this.subsetPid;
	}

	public void setSubsetPid(int subsetPid) {
		this.subsetPid = subsetPid;
	}


	// @Column(name="THIS_GENERATION")
	public short getThisGeneration() {
		return this.thisGeneration;
	}

	public void setThisGeneration(short thisGeneration) {
		this.thisGeneration = thisGeneration;
	}


	// @Column(name="USE_ORDER")
	public int getUseOrder() {
		return this.useOrder;
	}

	public void setUseOrder(int useOrder) {
		this.useOrder = useOrder;
	}

}
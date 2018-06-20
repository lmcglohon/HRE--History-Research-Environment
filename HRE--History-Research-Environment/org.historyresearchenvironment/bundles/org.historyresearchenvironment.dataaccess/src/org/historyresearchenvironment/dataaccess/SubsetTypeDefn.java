package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the SUBSET_TYPE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="SUBSET_TYPE_DEFNS")
// @NamedQuery(name="SubsetTypeDefn.findAll", query="SELECT s FROM SubsetTypeDefn s")
public class SubsetTypeDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private short ancestorGens;
	private short bioFlagState;
	private int bioFocusPid;
	private int commitPid;
	private short descendantGens;
	private short displayOrder;
	private boolean excludeMixedSexLinks;
	private boolean excludeNonGeneticLinks;
	private short focus1SubTypeKey;
	private short focus1TypeKey;
	private short focus2SubTypeKey;
	private short focus2TypeKey;
	private boolean isAll;
	private boolean isBioNetwork;
	private boolean isDefault;
	private boolean isMixed;
	private boolean isSingle;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private int subsetTypeDefnPid;
	private int useBioFlag;

	public SubsetTypeDefn() {
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


	// @Column(name="ANCESTOR_GENS")
	public short getAncestorGens() {
		return this.ancestorGens;
	}

	public void setAncestorGens(short ancestorGens) {
		this.ancestorGens = ancestorGens;
	}


	// @Column(name="BIO_FLAG_STATE")
	public short getBioFlagState() {
		return this.bioFlagState;
	}

	public void setBioFlagState(short bioFlagState) {
		this.bioFlagState = bioFlagState;
	}


	// @Column(name="BIO_FOCUS_PID")
	public int getBioFocusPid() {
		return this.bioFocusPid;
	}

	public void setBioFocusPid(int bioFocusPid) {
		this.bioFocusPid = bioFocusPid;
	}


	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	// @Column(name="DESCENDANT_GENS")
	public short getDescendantGens() {
		return this.descendantGens;
	}

	public void setDescendantGens(short descendantGens) {
		this.descendantGens = descendantGens;
	}


	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}


	// @Column(name="EXCLUDE_MIXED_SEX_LINKS")
	public boolean getExcludeMixedSexLinks() {
		return this.excludeMixedSexLinks;
	}

	public void setExcludeMixedSexLinks(boolean excludeMixedSexLinks) {
		this.excludeMixedSexLinks = excludeMixedSexLinks;
	}


	// @Column(name="EXCLUDE_NON_GENETIC_LINKS")
	public boolean getExcludeNonGeneticLinks() {
		return this.excludeNonGeneticLinks;
	}

	public void setExcludeNonGeneticLinks(boolean excludeNonGeneticLinks) {
		this.excludeNonGeneticLinks = excludeNonGeneticLinks;
	}


	// @Column(name="FOCUS1_SUB_TYPE_KEY")
	public short getFocus1SubTypeKey() {
		return this.focus1SubTypeKey;
	}

	public void setFocus1SubTypeKey(short focus1SubTypeKey) {
		this.focus1SubTypeKey = focus1SubTypeKey;
	}


	// @Column(name="FOCUS1_TYPE_KEY")
	public short getFocus1TypeKey() {
		return this.focus1TypeKey;
	}

	public void setFocus1TypeKey(short focus1TypeKey) {
		this.focus1TypeKey = focus1TypeKey;
	}


	// @Column(name="FOCUS2_SUB_TYPE_KEY")
	public short getFocus2SubTypeKey() {
		return this.focus2SubTypeKey;
	}

	public void setFocus2SubTypeKey(short focus2SubTypeKey) {
		this.focus2SubTypeKey = focus2SubTypeKey;
	}


	// @Column(name="FOCUS2_TYPE_KEY")
	public short getFocus2TypeKey() {
		return this.focus2TypeKey;
	}

	public void setFocus2TypeKey(short focus2TypeKey) {
		this.focus2TypeKey = focus2TypeKey;
	}


	// @Column(name="IS_ALL")
	public boolean getIsAll() {
		return this.isAll;
	}

	public void setIsAll(boolean isAll) {
		this.isAll = isAll;
	}


	// @Column(name="IS_BIO_NETWORK")
	public boolean getIsBioNetwork() {
		return this.isBioNetwork;
	}

	public void setIsBioNetwork(boolean isBioNetwork) {
		this.isBioNetwork = isBioNetwork;
	}


	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}


	// @Column(name="IS_MIXED")
	public boolean getIsMixed() {
		return this.isMixed;
	}

	public void setIsMixed(boolean isMixed) {
		this.isMixed = isMixed;
	}


	// @Column(name="IS_SINGLE")
	public boolean getIsSingle() {
		return this.isSingle;
	}

	public void setIsSingle(boolean isSingle) {
		this.isSingle = isSingle;
	}


	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	public void setShow(boolean show) {
		this.show = show;
	}


	// @Column(name="SUBSET_TYPE_DEFN_PID", nullable=false)
	public int getSubsetTypeDefnPid() {
		return this.subsetTypeDefnPid;
	}

	public void setSubsetTypeDefnPid(int subsetTypeDefnPid) {
		this.subsetTypeDefnPid = subsetTypeDefnPid;
	}


	// @Column(name="USE_BIO_FLAG")
	public int getUseBioFlag() {
		return this.useBioFlag;
	}

	public void setUseBioFlag(int useBioFlag) {
		this.useBioFlag = useBioFlag;
	}

}
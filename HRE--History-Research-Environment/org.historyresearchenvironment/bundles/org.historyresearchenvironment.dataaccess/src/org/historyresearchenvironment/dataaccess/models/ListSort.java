package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;


/**
 * The persistent class for the LIST_SORTS database table.
 * 
 */
// @Entity
// @Table(name="LIST_SORTS")
// @NamedQuery(name="ListSort.findAll", query="SELECT l FROM ListSort l")
public class ListSort implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private boolean emptySortHigh;
	private boolean isSystem;
	private int listSortPid;
	private short parentSortSetKey;
	private short setKey;
	private String sortAlias;
	private boolean sortHighLast;
	private short useOrder;

	public ListSort() {
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


	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	// @Column(name="EMPTY_SORT_HIGH")
	public boolean getEmptySortHigh() {
		return this.emptySortHigh;
	}

	public void setEmptySortHigh(boolean emptySortHigh) {
		this.emptySortHigh = emptySortHigh;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="LIST_SORT_PID", nullable=false)
	public int getListSortPid() {
		return this.listSortPid;
	}

	public void setListSortPid(int listSortPid) {
		this.listSortPid = listSortPid;
	}


	// @Column(name="PARENT_SORT_SET_KEY")
	public short getParentSortSetKey() {
		return this.parentSortSetKey;
	}

	public void setParentSortSetKey(short parentSortSetKey) {
		this.parentSortSetKey = parentSortSetKey;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(name="SORT_ALIAS", length=300)
	public String getSortAlias() {
		return this.sortAlias;
	}

	public void setSortAlias(String sortAlias) {
		this.sortAlias = sortAlias;
	}


	// @Column(name="SORT_HIGH_LAST")
	public boolean getSortHighLast() {
		return this.sortHighLast;
	}

	public void setSortHighLast(boolean sortHighLast) {
		this.sortHighLast = sortHighLast;
	}


	// @Column(name="USE_ORDER")
	public short getUseOrder() {
		return this.useOrder;
	}

	public void setUseOrder(short useOrder) {
		this.useOrder = useOrder;
	}

}
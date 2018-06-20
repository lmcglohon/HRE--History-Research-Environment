package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the LIST_OBJECTS database table.
 * 
 */
// @Entity
// @Table(name="LIST_OBJECTS")
// @NamedQuery(name="ListObject.findAll", query="SELECT l FROM ListObject l")
public class ListObject implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private String accentAlias;
	private short accentKey;
	private short cellMinHeight;
	private short cellMinWidth;
	private short cellNowHeight;
	private short cellNowWidth;
	private short cellStyleKey;
	private int commitPid;
	private boolean isSystem;
	private short labelStyleKey;
	private int listObjectPid;
	private String marginLabel;
	private String objectAlias;
	private short parentObjSetKey;
	private short setKey;
	private boolean useAliasLabel;
	private short useOrder;

	public ListObject() {
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


	// @Column(name="ACCENT_ALIAS", length=300)
	public String getAccentAlias() {
		return this.accentAlias;
	}

	public void setAccentAlias(String accentAlias) {
		this.accentAlias = accentAlias;
	}


	// @Column(name="ACCENT_KEY")
	public short getAccentKey() {
		return this.accentKey;
	}

	public void setAccentKey(short accentKey) {
		this.accentKey = accentKey;
	}


	// @Column(name="CELL_MIN_HEIGHT")
	public short getCellMinHeight() {
		return this.cellMinHeight;
	}

	public void setCellMinHeight(short cellMinHeight) {
		this.cellMinHeight = cellMinHeight;
	}


	// @Column(name="CELL_MIN_WIDTH")
	public short getCellMinWidth() {
		return this.cellMinWidth;
	}

	public void setCellMinWidth(short cellMinWidth) {
		this.cellMinWidth = cellMinWidth;
	}


	// @Column(name="CELL_NOW_HEIGHT")
	public short getCellNowHeight() {
		return this.cellNowHeight;
	}

	public void setCellNowHeight(short cellNowHeight) {
		this.cellNowHeight = cellNowHeight;
	}


	// @Column(name="CELL_NOW_WIDTH")
	public short getCellNowWidth() {
		return this.cellNowWidth;
	}

	public void setCellNowWidth(short cellNowWidth) {
		this.cellNowWidth = cellNowWidth;
	}


	// @Column(name="CELL_STYLE_KEY")
	public short getCellStyleKey() {
		return this.cellStyleKey;
	}

	public void setCellStyleKey(short cellStyleKey) {
		this.cellStyleKey = cellStyleKey;
	}


	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="LABEL_STYLE_KEY")
	public short getLabelStyleKey() {
		return this.labelStyleKey;
	}

	public void setLabelStyleKey(short labelStyleKey) {
		this.labelStyleKey = labelStyleKey;
	}


	// @Column(name="LIST_OBJECT_PID", nullable=false)
	public int getListObjectPid() {
		return this.listObjectPid;
	}

	public void setListObjectPid(int listObjectPid) {
		this.listObjectPid = listObjectPid;
	}


	// @Column(name="MARGIN_LABEL", length=100)
	public String getMarginLabel() {
		return this.marginLabel;
	}

	public void setMarginLabel(String marginLabel) {
		this.marginLabel = marginLabel;
	}


	// @Column(name="OBJECT_ALIAS", length=300)
	public String getObjectAlias() {
		return this.objectAlias;
	}

	public void setObjectAlias(String objectAlias) {
		this.objectAlias = objectAlias;
	}


	// @Column(name="PARENT_OBJ_SET_KEY")
	public short getParentObjSetKey() {
		return this.parentObjSetKey;
	}

	public void setParentObjSetKey(short parentObjSetKey) {
		this.parentObjSetKey = parentObjSetKey;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(name="USE_ALIAS_LABEL")
	public boolean getUseAliasLabel() {
		return this.useAliasLabel;
	}

	public void setUseAliasLabel(boolean useAliasLabel) {
		this.useAliasLabel = useAliasLabel;
	}


	// @Column(name="USE_ORDER")
	public short getUseOrder() {
		return this.useOrder;
	}

	public void setUseOrder(short useOrder) {
		this.useOrder = useOrder;
	}

}
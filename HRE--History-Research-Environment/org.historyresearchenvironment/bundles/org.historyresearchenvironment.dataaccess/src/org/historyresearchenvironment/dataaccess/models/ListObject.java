package org.historyresearchenvironment.dataaccess.models;

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

	// @Column(name="ACCENT_ALIAS", length=300)
	public String getAccentAlias() {
		return this.accentAlias;
	}

	// @Column(name="ACCENT_KEY")
	public short getAccentKey() {
		return this.accentKey;
	}

	// @Column(name="CELL_MIN_HEIGHT")
	public short getCellMinHeight() {
		return this.cellMinHeight;
	}

	// @Column(name="CELL_MIN_WIDTH")
	public short getCellMinWidth() {
		return this.cellMinWidth;
	}

	// @Column(name="CELL_NOW_HEIGHT")
	public short getCellNowHeight() {
		return this.cellNowHeight;
	}

	// @Column(name="CELL_NOW_WIDTH")
	public short getCellNowWidth() {
		return this.cellNowWidth;
	}

	// @Column(name="CELL_STYLE_KEY")
	public short getCellStyleKey() {
		return this.cellStyleKey;
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="LABEL_STYLE_KEY")
	public short getLabelStyleKey() {
		return this.labelStyleKey;
	}

	// @Column(name="LIST_OBJECT_PID", nullable=false)
	public int getListObjectPid() {
		return this.listObjectPid;
	}

	// @Column(name="MARGIN_LABEL", length=100)
	public String getMarginLabel() {
		return this.marginLabel;
	}

	// @Column(name="OBJECT_ALIAS", length=300)
	public String getObjectAlias() {
		return this.objectAlias;
	}

	// @Column(name="PARENT_OBJ_SET_KEY")
	public short getParentObjSetKey() {
		return this.parentObjSetKey;
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

	// @Column(name="USE_ALIAS_LABEL")
	public boolean getUseAliasLabel() {
		return this.useAliasLabel;
	}

	// @Column(name="USE_ORDER")
	public short getUseOrder() {
		return this.useOrder;
	}

	public void setAccentAlias(String accentAlias) {
		this.accentAlias = accentAlias;
	}

	public void setAccentKey(short accentKey) {
		this.accentKey = accentKey;
	}

	public void setCellMinHeight(short cellMinHeight) {
		this.cellMinHeight = cellMinHeight;
	}

	public void setCellMinWidth(short cellMinWidth) {
		this.cellMinWidth = cellMinWidth;
	}

	public void setCellNowHeight(short cellNowHeight) {
		this.cellNowHeight = cellNowHeight;
	}

	public void setCellNowWidth(short cellNowWidth) {
		this.cellNowWidth = cellNowWidth;
	}

	public void setCellStyleKey(short cellStyleKey) {
		this.cellStyleKey = cellStyleKey;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setLabelStyleKey(short labelStyleKey) {
		this.labelStyleKey = labelStyleKey;
	}

	public void setListObjectPid(int listObjectPid) {
		this.listObjectPid = listObjectPid;
	}

	public void setMarginLabel(String marginLabel) {
		this.marginLabel = marginLabel;
	}

	public void setObjectAlias(String objectAlias) {
		this.objectAlias = objectAlias;
	}

	public void setParentObjSetKey(short parentObjSetKey) {
		this.parentObjSetKey = parentObjSetKey;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setUseAliasLabel(boolean useAliasLabel) {
		this.useAliasLabel = useAliasLabel;
	}

	public void setUseOrder(short useOrder) {
		this.useOrder = useOrder;
	}

}
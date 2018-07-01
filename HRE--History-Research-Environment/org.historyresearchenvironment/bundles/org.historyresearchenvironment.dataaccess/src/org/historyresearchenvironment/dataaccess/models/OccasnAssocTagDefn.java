package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the OCCASN_ASSOC_TAG_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="OCCASN_ASSOC_TAG_DEFNS")
// @NamedQuery(name="OccasnAssocTagDefn.findAll", query="SELECT o FROM
// OccasnAssocTagDefn o")
public class OccasnAssocTagDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private short assocSubTypeKey;
	private short assocTypeKey;
	private int commitPid;
	private short displayOrder;
	private String gedcomTag;
	private short groupKey;
	private boolean isDefault;
	private boolean isRequiredRole;
	private boolean isUserDefn;
	private short maxInRole;
	private short minInRole;
	private int occasnAssocTagDefnPid;
	private short occasnSubTypeKey;
	private short occasnTagTypeKey;
	private short reminderKey;
	private short roleNameKey;
	private int sentceSetPid;
	private short sentceStyleTypeKey;
	private short setKey;
	private boolean show;
	private short tagRuleKey;
	private short themeKey;

	public OccasnAssocTagDefn() {
	}

	// @Column(name="ASSOC_SUB_TYPE_KEY")
	public short getAssocSubTypeKey() {
		return this.assocSubTypeKey;
	}

	// @Column(name="ASSOC_TYPE_KEY")
	public short getAssocTypeKey() {
		return this.assocTypeKey;
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="GEDCOM_TAG", length=30)
	public String getGedcomTag() {
		return this.gedcomTag;
	}

	// @Column(name="GROUP_KEY")
	public short getGroupKey() {
		return this.groupKey;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="IS_REQUIRED_ROLE")
	public boolean getIsRequiredRole() {
		return this.isRequiredRole;
	}

	// @Column(name="IS_USER_DEFN")
	public boolean getIsUserDefn() {
		return this.isUserDefn;
	}

	// @Column(name="MAX_IN_ROLE")
	public short getMaxInRole() {
		return this.maxInRole;
	}

	// @Column(name="MIN_IN_ROLE")
	public short getMinInRole() {
		return this.minInRole;
	}

	// @Column(name="OCCASN_ASSOC_TAG_DEFN_PID", nullable=false)
	public int getOccasnAssocTagDefnPid() {
		return this.occasnAssocTagDefnPid;
	}

	// @Column(name="OCCASN_SUB_TYPE_KEY")
	public short getOccasnSubTypeKey() {
		return this.occasnSubTypeKey;
	}

	// @Column(name="OCCASN_TAG_TYPE_KEY")
	public short getOccasnTagTypeKey() {
		return this.occasnTagTypeKey;
	}

	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	// @Column(name="ROLE_NAME_KEY")
	public short getRoleNameKey() {
		return this.roleNameKey;
	}

	// @Column(name="SENTCE_SET_PID")
	public int getSentceSetPid() {
		return this.sentceSetPid;
	}

	// @Column(name="SENTCE_STYLE_TYPE_KEY")
	public short getSentceStyleTypeKey() {
		return this.sentceStyleTypeKey;
	}

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	// @Column(name="TAG_RULE_KEY")
	public short getTagRuleKey() {
		return this.tagRuleKey;
	}

	// @Column(name="THEME_KEY")
	public short getThemeKey() {
		return this.themeKey;
	}

	public void setAssocSubTypeKey(short assocSubTypeKey) {
		this.assocSubTypeKey = assocSubTypeKey;
	}

	public void setAssocTypeKey(short assocTypeKey) {
		this.assocTypeKey = assocTypeKey;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setGedcomTag(String gedcomTag) {
		this.gedcomTag = gedcomTag;
	}

	public void setGroupKey(short groupKey) {
		this.groupKey = groupKey;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setIsRequiredRole(boolean isRequiredRole) {
		this.isRequiredRole = isRequiredRole;
	}

	public void setIsUserDefn(boolean isUserDefn) {
		this.isUserDefn = isUserDefn;
	}

	public void setMaxInRole(short maxInRole) {
		this.maxInRole = maxInRole;
	}

	public void setMinInRole(short minInRole) {
		this.minInRole = minInRole;
	}

	public void setOccasnAssocTagDefnPid(int occasnAssocTagDefnPid) {
		this.occasnAssocTagDefnPid = occasnAssocTagDefnPid;
	}

	public void setOccasnSubTypeKey(short occasnSubTypeKey) {
		this.occasnSubTypeKey = occasnSubTypeKey;
	}

	public void setOccasnTagTypeKey(short occasnTagTypeKey) {
		this.occasnTagTypeKey = occasnTagTypeKey;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}

	public void setRoleNameKey(short roleNameKey) {
		this.roleNameKey = roleNameKey;
	}

	public void setSentceSetPid(int sentceSetPid) {
		this.sentceSetPid = sentceSetPid;
	}

	public void setSentceStyleTypeKey(short sentceStyleTypeKey) {
		this.sentceStyleTypeKey = sentceStyleTypeKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public void setTagRuleKey(short tagRuleKey) {
		this.tagRuleKey = tagRuleKey;
	}

	public void setThemeKey(short themeKey) {
		this.themeKey = themeKey;
	}

}
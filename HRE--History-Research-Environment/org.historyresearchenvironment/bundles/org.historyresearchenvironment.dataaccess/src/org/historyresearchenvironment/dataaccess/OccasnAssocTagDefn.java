package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the OCCASN_ASSOC_TAG_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="OCCASN_ASSOC_TAG_DEFNS")
// @NamedQuery(name="OccasnAssocTagDefn.findAll", query="SELECT o FROM OccasnAssocTagDefn o")
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


	// @Id
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}


	// @Column(name="ASSOC_SUB_TYPE_KEY")
	public short getAssocSubTypeKey() {
		return this.assocSubTypeKey;
	}

	public void setAssocSubTypeKey(short assocSubTypeKey) {
		this.assocSubTypeKey = assocSubTypeKey;
	}


	// @Column(name="ASSOC_TYPE_KEY")
	public short getAssocTypeKey() {
		return this.assocTypeKey;
	}

	public void setAssocTypeKey(short assocTypeKey) {
		this.assocTypeKey = assocTypeKey;
	}


	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}


	// @Column(name="GEDCOM_TAG", length=30)
	public String getGedcomTag() {
		return this.gedcomTag;
	}

	public void setGedcomTag(String gedcomTag) {
		this.gedcomTag = gedcomTag;
	}


	// @Column(name="GROUP_KEY")
	public short getGroupKey() {
		return this.groupKey;
	}

	public void setGroupKey(short groupKey) {
		this.groupKey = groupKey;
	}


	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}


	// @Column(name="IS_REQUIRED_ROLE")
	public boolean getIsRequiredRole() {
		return this.isRequiredRole;
	}

	public void setIsRequiredRole(boolean isRequiredRole) {
		this.isRequiredRole = isRequiredRole;
	}


	// @Column(name="IS_USER_DEFN")
	public boolean getIsUserDefn() {
		return this.isUserDefn;
	}

	public void setIsUserDefn(boolean isUserDefn) {
		this.isUserDefn = isUserDefn;
	}


	// @Column(name="MAX_IN_ROLE")
	public short getMaxInRole() {
		return this.maxInRole;
	}

	public void setMaxInRole(short maxInRole) {
		this.maxInRole = maxInRole;
	}


	// @Column(name="MIN_IN_ROLE")
	public short getMinInRole() {
		return this.minInRole;
	}

	public void setMinInRole(short minInRole) {
		this.minInRole = minInRole;
	}


	// @Column(name="OCCASN_ASSOC_TAG_DEFN_PID", nullable=false)
	public int getOccasnAssocTagDefnPid() {
		return this.occasnAssocTagDefnPid;
	}

	public void setOccasnAssocTagDefnPid(int occasnAssocTagDefnPid) {
		this.occasnAssocTagDefnPid = occasnAssocTagDefnPid;
	}


	// @Column(name="OCCASN_SUB_TYPE_KEY")
	public short getOccasnSubTypeKey() {
		return this.occasnSubTypeKey;
	}

	public void setOccasnSubTypeKey(short occasnSubTypeKey) {
		this.occasnSubTypeKey = occasnSubTypeKey;
	}


	// @Column(name="OCCASN_TAG_TYPE_KEY")
	public short getOccasnTagTypeKey() {
		return this.occasnTagTypeKey;
	}

	public void setOccasnTagTypeKey(short occasnTagTypeKey) {
		this.occasnTagTypeKey = occasnTagTypeKey;
	}


	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}


	// @Column(name="ROLE_NAME_KEY")
	public short getRoleNameKey() {
		return this.roleNameKey;
	}

	public void setRoleNameKey(short roleNameKey) {
		this.roleNameKey = roleNameKey;
	}


	// @Column(name="SENTCE_SET_PID")
	public int getSentceSetPid() {
		return this.sentceSetPid;
	}

	public void setSentceSetPid(int sentceSetPid) {
		this.sentceSetPid = sentceSetPid;
	}


	// @Column(name="SENTCE_STYLE_TYPE_KEY")
	public short getSentceStyleTypeKey() {
		return this.sentceStyleTypeKey;
	}

	public void setSentceStyleTypeKey(short sentceStyleTypeKey) {
		this.sentceStyleTypeKey = sentceStyleTypeKey;
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


	// @Column(name="TAG_RULE_KEY")
	public short getTagRuleKey() {
		return this.tagRuleKey;
	}

	public void setTagRuleKey(short tagRuleKey) {
		this.tagRuleKey = tagRuleKey;
	}


	// @Column(name="THEME_KEY")
	public short getThemeKey() {
		return this.themeKey;
	}

	public void setThemeKey(short themeKey) {
		this.themeKey = themeKey;
	}

}
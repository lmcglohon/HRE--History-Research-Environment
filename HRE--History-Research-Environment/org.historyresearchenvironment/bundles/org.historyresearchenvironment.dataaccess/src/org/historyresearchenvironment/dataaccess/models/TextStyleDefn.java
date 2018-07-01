package org.historyresearchenvironment.dataaccess.models;

import java.io.Serializable;

/**
 * The persistent class for the TEXT_STYLE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="TEXT_STYLE_DEFNS")
// @NamedQuery(name="TextStyleDefn.findAll", query="SELECT t FROM TextStyleDefn
// t")
public class TextStyleDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private short fontColor;
	private boolean fontIsBold;
	private boolean fontIsItalic;
	private String fontName;
	private short fontSize;
	private boolean fontUnderlined;
	private short highlightColor;
	private boolean isDefault;
	private boolean isUserDefn;
	private short marker1LinkKey;
	private short marker2LinkKey;
	private short marker3LinkKey;
	private short marker4LinkKey;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private short textLinkKey;
	private int textStyleDefnPid;

	public TextStyleDefn() {
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="FONT_COLOR")
	public short getFontColor() {
		return this.fontColor;
	}

	// @Column(name="FONT_IS_BOLD")
	public boolean getFontIsBold() {
		return this.fontIsBold;
	}

	// @Column(name="FONT_IS_ITALIC")
	public boolean getFontIsItalic() {
		return this.fontIsItalic;
	}

	// @Column(name="FONT_NAME", length=60)
	public String getFontName() {
		return this.fontName;
	}

	// @Column(name="FONT_SIZE")
	public short getFontSize() {
		return this.fontSize;
	}

	// @Column(name="FONT_UNDERLINED")
	public boolean getFontUnderlined() {
		return this.fontUnderlined;
	}

	// @Column(name="HIGHLIGHT_COLOR")
	public short getHighlightColor() {
		return this.highlightColor;
	}

	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	// @Column(name="IS_USER_DEFN")
	public boolean getIsUserDefn() {
		return this.isUserDefn;
	}

	// @Column(name="MARKER1_LINK_KEY")
	public short getMarker1LinkKey() {
		return this.marker1LinkKey;
	}

	// @Column(name="MARKER2_LINK_KEY")
	public short getMarker2LinkKey() {
		return this.marker2LinkKey;
	}

	// @Column(name="MARKER3_LINK_KEY")
	public short getMarker3LinkKey() {
		return this.marker3LinkKey;
	}

	// @Column(name="MARKER4_LINK_KEY")
	public short getMarker4LinkKey() {
		return this.marker4LinkKey;
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

	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	// @Column(name="TEXT_LINK_KEY")
	public short getTextLinkKey() {
		return this.textLinkKey;
	}

	// @Column(name="TEXT_STYLE_DEFN_PID", nullable=false)
	public int getTextStyleDefnPid() {
		return this.textStyleDefnPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setFontColor(short fontColor) {
		this.fontColor = fontColor;
	}

	public void setFontIsBold(boolean fontIsBold) {
		this.fontIsBold = fontIsBold;
	}

	public void setFontIsItalic(boolean fontIsItalic) {
		this.fontIsItalic = fontIsItalic;
	}

	public void setFontName(String fontName) {
		this.fontName = fontName;
	}

	public void setFontSize(short fontSize) {
		this.fontSize = fontSize;
	}

	public void setFontUnderlined(boolean fontUnderlined) {
		this.fontUnderlined = fontUnderlined;
	}

	public void setHighlightColor(short highlightColor) {
		this.highlightColor = highlightColor;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setIsUserDefn(boolean isUserDefn) {
		this.isUserDefn = isUserDefn;
	}

	public void setMarker1LinkKey(short marker1LinkKey) {
		this.marker1LinkKey = marker1LinkKey;
	}

	public void setMarker2LinkKey(short marker2LinkKey) {
		this.marker2LinkKey = marker2LinkKey;
	}

	public void setMarker3LinkKey(short marker3LinkKey) {
		this.marker3LinkKey = marker3LinkKey;
	}

	public void setMarker4LinkKey(short marker4LinkKey) {
		this.marker4LinkKey = marker4LinkKey;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public void setTextLinkKey(short textLinkKey) {
		this.textLinkKey = textLinkKey;
	}

	public void setTextStyleDefnPid(int textStyleDefnPid) {
		this.textStyleDefnPid = textStyleDefnPid;
	}

}
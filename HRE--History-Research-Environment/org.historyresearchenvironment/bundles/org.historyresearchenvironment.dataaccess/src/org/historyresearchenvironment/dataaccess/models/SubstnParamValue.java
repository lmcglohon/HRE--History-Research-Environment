package org.historyresearchenvironment.dataaccess.models;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * The persistent class for the SUBSTN_PARAM_VALUES database table.
 * 
 * @version 2018-07-13
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */

public class SubstnParamValue extends AbstractHreDataModel {
	private static final String DELETE = "DELETE FROM PUBLIC.SUBSTN_PARAM_VALUES WHERE PARAM_SET_KEY = ?";
	private static final String DELETEALL = "DELETE FROM PUBLIC.SUBSTN_PARAM_VALUES";
	private static final String INSERT = "INSERT INTO PUBLIC.SUBSTN_PARAM_VALUES (RECORD_NUM, SET_KEY, COMMIT_PID, SUBSTN_PARAM_VALUE_PID,"
			+ "	 IS_SYSTEM, PARENT_STEP_PID, PARAM_LIST_KEY, PARAM_SET_KEY, PARAM_NAME_KEY,"
			+ "	 VALUE_IS_DATA_ALIAS, VALUE_IS_OTHER_ALIAS, ALIAS_KEY, DEFLT_PARAM_STEP_PID,"
			+ "	 DISPLAY_ORDER, SHOW) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final String SELECT = "SELECT RECORD_NUM, SET_KEY, COMMIT_PID, SUBSTN_PARAM_VALUE_PID,"
			+ " IS_SYSTEM, PARENT_STEP_PID, PARAM_LIST_KEY, PARAM_SET_KEY, PARAM_NAME_KEY,"
			+ " VALUE_IS_DATA_ALIAS, VALUE_IS_OTHER_ALIAS, ALIAS_KEY, DEFLT_PARAM_STEP_PID,"
			+ " DISPLAY_ORDER, SHOW FROM PUBLIC.SUBSTN_PARAM_VALUES WHERE PARAM_SET_KEY = ?";
	private static final String SELECTALL = "SELECT RECORD_NUM, SET_KEY, COMMIT_PID, SUBSTN_PARAM_VALUE_PID,"
			+ "	IS_SYSTEM, PARENT_STEP_PID, PARAM_LIST_KEY, PARAM_SET_KEY, PARAM_NAME_KEY,"
			+ "	VALUE_IS_DATA_ALIAS, VALUE_IS_OTHER_ALIAS, ALIAS_KEY, DEFLT_PARAM_STEP_PID,"
			+ "	DISPLAY_ORDER, SHOW FROM PUBLIC.SUBSTN_PARAM_VALUES";
	private static final String UPDATE = "UPDATE PUBLIC.SUBSTN_PARAM_VALUES SET"
			+ " RECORD_NUM, SET_KEY = ?, COMMIT_PID = ?, SUBSTN_PARAM_VALUE_PID = ?,"
			+ " IS_SYSTEM = ?, PARENT_STEP_PID = ?, PARAM_LIST_KEY = ?,  PARAM_NAME_KEY = ?,"
			+ " VALUE_IS_DATA_ALIAS = ?, VALUE_IS_OTHER_ALIAS = ?, ALIAS_KEY = ?, DEFLT_PARAM_STEP_PID = ?,"
			+ " DISPLAY_ORDER = ?, SHOW = ? WHERE PARAM_SET_KEY = ?";

	private static final long serialVersionUID = 1L;
	private int recordNum;
	private short aliasKey;
	private int commitPid;
	private int defltParamStepPid;
	private short displayOrder;
	private boolean isSystem;
	private short paramListKey;
	private short paramNameKey;
	private short paramSetKey;
	private int parentStepPid;
	private short setKey;
	private boolean show;
	private int substnParamValuePid;
	private boolean valueIsDataAlias;
	private boolean valueIsOtherAlias;

	private ArrayList<AbstractHreDataModel> modelList;
	private SubstnParamValue model;

	/**
	 * Constructor
	 *
	 * @throws SQLException
	 */
	public SubstnParamValue() throws SQLException {
	}

	/**
	 * Constructor
	 *
	 * @param paramSetKey2
	 */
	public SubstnParamValue(short paramSetKey) throws SQLException {
		super();
		this.paramSetKey = paramSetKey;
		get(paramSetKey);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.dataaccess.models.AbstractHreDataAccess#delete
	 * ()
	 */
	@Override
	public void delete() throws SQLException {
		ps = conn.prepareStatement(DELETEALL);
		ps.executeUpdate();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.dataaccess.models.AbstractHreDataAccess#delete
	 * (int)
	 */
	@Override
	public void delete(int key) throws SQLException {
		ps = conn.prepareStatement(DELETE);
		ps.setInt(1, key);
		ps.executeUpdate();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.dataaccess.models.AbstractHreDataAccess#get()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<AbstractHreDataModel> get() throws SQLException {
		ps = conn.prepareStatement(SELECTALL);
		rs = ps.executeQuery();
		modelList = new ArrayList<AbstractHreDataModel>();

		while (rs.next()) {
			model = new SubstnParamValue();
			model.setRecordNum(rs.getInt("RECORD_NUM"));
			model.setSetKey(rs.getShort("SET_KEY"));
			model.setCommitPid(rs.getInt("COMMIT_PID"));
			model.setSubstnParamValuePid(rs.getInt("SUBSTN_PARAM_VALUE_PID"));
			model.setIsSystem(rs.getBoolean("IS_SYSTEM"));
			model.setParentStepPid(rs.getInt("PARENT_STEP_PID"));
			model.setParamListKey(rs.getShort("PARENT_STEP_PID"));
			model.setParamSetKey(rs.getShort("PARAM_SET_KEY"));
			model.setParamNameKey(rs.getShort("PARENT_STEP_PID"));
			model.setValueIsDataAlias(rs.getBoolean("VALUE_IS_DATA_ALIAS"));
			model.setValueIsOtherAlias(rs.getBoolean("VALUE_IS_OTHER_ALIAS"));
			model.setAliasKey(rs.getShort("ALIAS_KEY"));
			model.setDefltParamStepPid(rs.getInt("DEFLT_PARAM_STEP_PID"));
			model.setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
			model.setShow(rs.getBoolean("SHOW"));

			modelList.add(model);
		}

		return modelList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.dataaccess.models.AbstractHreDataAccess#get(
	 * int)
	 */
	@Override
	public AbstractHreDataModel get(int key) throws SQLException {
		ps = conn.prepareStatement(SELECT);
		ps.setShort(1, (short) key);
		rs = ps.executeQuery();

		if (rs.next()) {
			setRecordNum(rs.getInt("RECORD_NUM"));
			setSetKey(rs.getShort("SET_KEY"));
			setCommitPid(rs.getInt("COMMIT_PID"));
			setSubstnParamValuePid(rs.getInt("SUBSTN_PARAM_VALUE_PID"));
			setIsSystem(rs.getBoolean("IS_SYSTEM"));
			setParentStepPid(rs.getInt("PARENT_STEP_PID"));
			setParamListKey(rs.getShort("PARENT_STEP_PID"));
			setParamSetKey(rs.getShort("PARAM_SET_KEY"));
			setParamNameKey(rs.getShort("PARENT_STEP_PID"));
			setValueIsDataAlias(rs.getBoolean("VALUE_IS_DATA_ALIAS"));
			setValueIsOtherAlias(rs.getBoolean("VALUE_IS_OTHER_ALIAS"));
			setAliasKey(rs.getShort("ALIAS_KEY"));
			setDefltParamStepPid(rs.getInt("DEFLT_PARAM_STEP_PID"));
			setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
			setShow(rs.getBoolean("SHOW"));
		}
		return this;
	}

	// @Column(name="ALIAS_KEY")
	public short getAliasKey() {
		return this.aliasKey;
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DEFLT_PARAM_STEP_PID")
	public int getDefltParamStepPid() {
		return this.defltParamStepPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="PARAM_LIST_KEY")
	public short getParamListKey() {
		return this.paramListKey;
	}

	// @Column(name="PARAM_NAME_KEY")
	public short getParamNameKey() {
		return this.paramNameKey;
	}

	// @Column(name="PARAM_SET_KEY")
	public short getParamSetKey() {
		return this.paramSetKey;
	}

	// @Column(name="PARENT_STEP_PID")
	public int getParentStepPid() {
		return this.parentStepPid;
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

	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	// @Column(name="SUBSTN_PARAM_VALUE_PID", nullable=false)
	public int getSubstnParamValuePid() {
		return this.substnParamValuePid;
	}

	// @Column(name="VALUE_IS_DATA_ALIAS")
	public boolean getValueIsDataAlias() {
		return this.valueIsDataAlias;
	}

	// @Column(name="VALUE_IS_OTHER_ALIAS")
	public boolean getValueIsOtherAlias() {
		return this.valueIsOtherAlias;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.dataaccess.models.AbstractHreDataAccess#post(
	 * org.historyresearchenvironment.dataaccess.models.AbstractHreDataAccess)
	 */
	public void post(AbstractHreDataModel model) throws SQLException {
		ps = conn.prepareStatement(INSERT);

		ps.setInt(1, getRecordNum());
		ps.setShort(2, getSetKey());
		ps.setInt(3, getCommitPid());
		ps.setInt(4, getSubstnParamValuePid());
		ps.setBoolean(5, getIsSystem());
		ps.setInt(6, getParentStepPid());
		ps.setShort(7, getParamListKey());
		ps.setShort(8, getParamSetKey());
		ps.setShort(9, getParamNameKey());
		ps.setBoolean(10, getValueIsDataAlias());
		ps.setBoolean(11, getValueIsOtherAlias());
		ps.setShort(12, getAliasKey());
		ps.setInt(13, getDefltParamStepPid());
		ps.setShort(14, getDisplayOrder());
		ps.setBoolean(15, getShow());

		ps.executeUpdate();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.dataaccess.models.AbstractHreDataAccess#put(
	 * org.historyresearchenvironment.dataaccess.models.AbstractHreDataAccess)
	 */
	public void put(AbstractHreDataModel model) throws SQLException {
		ps = conn.prepareStatement(UPDATE);

		ps.setInt(1, getRecordNum());
		ps.setShort(2, getSetKey());
		ps.setInt(3, getCommitPid());
		ps.setInt(4, getSubstnParamValuePid());
		ps.setBoolean(5, getIsSystem());
		ps.setInt(6, getParentStepPid());
		ps.setShort(7, getParamListKey());
		ps.setShort(8, getParamSetKey());
		ps.setShort(9, getParamNameKey());
		ps.setBoolean(10, getValueIsDataAlias());
		ps.setBoolean(11, getValueIsOtherAlias());
		ps.setShort(12, getAliasKey());
		ps.setInt(13, getDefltParamStepPid());
		ps.setShort(14, getDisplayOrder());
		ps.setBoolean(15, getShow());

		ps.executeUpdate();

	}

	public void setAliasKey(short aliasKey) {
		this.aliasKey = aliasKey;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDefltParamStepPid(int defltParamStepPid) {
		this.defltParamStepPid = defltParamStepPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setParamListKey(short paramListKey) {
		this.paramListKey = paramListKey;
	}

	public void setParamNameKey(short paramNameKey) {
		this.paramNameKey = paramNameKey;
	}

	public void setParamSetKey(short paramSetKey) {
		this.paramSetKey = paramSetKey;
	}

	public void setParentStepPid(int parentStepPid) {
		this.parentStepPid = parentStepPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public void setSubstnParamValuePid(int substnParamValuePid) {
		this.substnParamValuePid = substnParamValuePid;
	}

	public void setValueIsDataAlias(boolean valueIsDataAlias) {
		this.valueIsDataAlias = valueIsDataAlias;
	}

	public void setValueIsOtherAlias(boolean valueIsOtherAlias) {
		this.valueIsOtherAlias = valueIsOtherAlias;
	}

}
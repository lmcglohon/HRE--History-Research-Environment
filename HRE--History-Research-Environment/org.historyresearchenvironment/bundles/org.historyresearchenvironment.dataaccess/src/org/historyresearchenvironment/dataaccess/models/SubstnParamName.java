package org.historyresearchenvironment.dataaccess.models;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * The persistent class for the SUBSTN_PARAM_NAMES database table.
 * 
 * @version 2018-07-07
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */

public class SubstnParamName extends AbstractHreDataModel {
	private static final String DELETE = "DELETE FROM PUBLIC.SUBSTN_PARAM_NAMES WHERE PARAM_SET_KEY = ?";
	private static final String DELETEALL = "DELETE FROM PUBLIC.SUBSTN_PARAM_NAMES";
	private static final String INSERT = "INSERT INTO PUBLIC.SUBSTN_PARAM_NAMES (RECORD_NUM, SET_KEY, COMMIT_PID,"
			+ " SUBSTN_PARAM_NAME_PID, IS_SYSTEM, VIEW_DATA_SCRIPT_GROUP_KEY,"
			+ " VIEW_DATA_SCRIPT_PID, MODIFY_DATA_SCRIPT_GROUP_KEY, MODIFY_DATA_SCRIPT_PID,"
			+ " DELETE_DATA_SCRIPT_GROUP_KEY, DELETE_DATA_SCRIPT_PID, EVAL_DATA_SCRIPT_GROUP_KEY,"
			+ " EVAL_DATA_SCRIPT_PID, PARAM_SET_KEY, DATA_TYPE_KEY, MUST_BE_ENTERED,"
			+ " DEFLT_VALUE, DISPLAY_ORDER, SHOW) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
			+ " ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final String SELECT = "SELECT SHOW, DISPLAY_ORDER, DEFLT_VALUE, MUST_BE_ENTERED, DATA_TYPE_KEY,"
			+ " PARAM_SET_KEY, EVAL_DATA_SCRIPT_PID, EVAL_DATA_SCRIPT_GROUP_KEY,"
			+ " DELETE_DATA_SCRIPT_PID, DELETE_DATA_SCRIPT_GROUP_KEY, MODIFY_DATA_SCRIPT_PID,"
			+ " MODIFY_DATA_SCRIPT_GROUP_KEY, VIEW_DATA_SCRIPT_PID, VIEW_DATA_SCRIPT_GROUP_KEY,"
			+ " IS_SYSTEM, SUBSTN_PARAM_NAME_PID, COMMIT_PID, SET_KEY, RECORD_NUM FROM PUBLIC.SUBSTN_PARAM_NAMES"
			+ " WHERE PARAM_SET_KEY = ?";
	private static final String SELECTALL = "SELECT SHOW, DISPLAY_ORDER, DEFLT_VALUE, MUST_BE_ENTERED, DATA_TYPE_KEY,"
			+ " PARAM_SET_KEY, EVAL_DATA_SCRIPT_PID, EVAL_DATA_SCRIPT_GROUP_KEY,"
			+ " DELETE_DATA_SCRIPT_PID, DELETE_DATA_SCRIPT_GROUP_KEY, MODIFY_DATA_SCRIPT_PID,"
			+ " MODIFY_DATA_SCRIPT_GROUP_KEY, VIEW_DATA_SCRIPT_PID, VIEW_DATA_SCRIPT_GROUP_KEY,"
			+ " IS_SYSTEM, SUBSTN_PARAM_NAME_PID, COMMIT_PID, SET_KEY, RECORD_NUM FROM PUBLIC.SUBSTN_PARAM_NAMES";
	private static final String UPDATE = "UPDATE PUBLIC.SUBSTN_PARAM_NAMES"
			+ " SET RECORD_NUM = ?, SET_KEY = ?, COMMIT_PID = ?,"
			+ " SUBSTN_PARAM_NAME_PID = ?, IS_SYSTEM = ?, VIEW_DATA_SCRIPT_GROUP_KEY = ?,"
			+ " VIEW_DATA_SCRIPT_PID = ?, MODIFY_DATA_SCRIPT_GROUP_KEY = ?,"
			+ " MODIFY_DATA_SCRIPT_PID = ?, DELETE_DATA_SCRIPT_GROUP_KEY = ?,"
			+ " DELETE_DATA_SCRIPT_PID = ?, EVAL_DATA_SCRIPT_GROUP_KEY = ?,"
			+ " EVAL_DATA_SCRIPT_PID = ?, DATA_TYPE_KEY = ?, MUST_BE_ENTERED = ?, DEFLT_VALUE = ?, DISPLAY_ORDER = ?,"
			+ " SHOW = ? WHERE PARAM_SET_KEY = ?";

	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short dataTypeKey;
	private String defltValue;
	private short deleteDataScriptGroupKey;
	private int deleteDataScriptPid;
	private short displayOrder;
	private short evalDataScriptGroupKey;
	private int evalDataScriptPid;
	private boolean isSystem;
	private short modifyDataScriptGroupKey;
	private int modifyDataScriptPid;
	private boolean mustBeEntered;
	private short paramSetKey;
	private short setKey;
	private boolean show;
	private int substnParamNamePid;
	private short viewDataScriptGroupKey;
	private int viewDataScriptPid;
	private ArrayList<AbstractHreDataModel> modelList;
	private SubstnParamName model;

	/**
	 * Constructor
	 *
	 * @throws SQLException
	 */
	public SubstnParamName() throws SQLException {
	}

	/**
	 * Constructor
	 *
	 * @param paramSetKey
	 * @throws SQLException
	 */
	public SubstnParamName(short paramSetKey) throws SQLException {
		super();
		this.paramSetKey = paramSetKey;
		get(paramSetKey);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.dataModel.models.AbstractHreDataModel#delete
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
	 * org.historyresearchenvironment.dataModel.models.AbstractHreDataModel#delete
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
	 * org.historyresearchenvironment.dataModel.models.AbstractHreDataModel#get()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<AbstractHreDataModel> get() throws SQLException {
		ps = conn.prepareStatement(SELECTALL);
		rs = ps.executeQuery();
		modelList = new ArrayList<AbstractHreDataModel>();

		while (rs.next()) {
			model = new SubstnParamName();
			model.setRecordNum(rs.getInt("RECORD_NUM"));
			model.setSetKey(rs.getShort("SET_KEY"));
			model.setCommitPid(rs.getInt("COMMIT_PID"));
			model.setSubstnParamNamePid(rs.getInt("SUBSTN_PARAM_NAME_PID"));
			model.setIsSystem(rs.getBoolean("IS_SYSTEM"));
			model.setViewDataScriptGroupKey(rs.getShort("VIEW_DATA_SCRIPT_GROUP_KEY"));
			model.setViewDataScriptPid(rs.getInt(" VIEW_DATA_SCRIPT_PID"));
			model.setModifyDataScriptGroupKey(rs.getShort("MODIFY_DATA_SCRIPT_GROUP_KEY"));
			model.setModifyDataScriptPid(rs.getInt("MODIFY_DATA_SCRIPT_PID"));
			model.setDeleteDataScriptGroupKey(rs.getShort("DELETE_DATA_SCRIPT_GROUP_KEY"));
			model.setDeleteDataScriptPid(rs.getInt("DELETE_DATA_SCRIPT_PID"));
			model.setEvalDataScriptGroupKey(rs.getShort("EVAL_DATA_SCRIPT_GROUP_KEY"));
			model.setEvalDataScriptPid(rs.getInt("EVAL_DATA_SCRIPT_PID"));
			model.setParamSetKey(rs.getShort("PARAM_SET_KEY"));
			model.setDataTypeKey(rs.getShort("DATA_TYPE_KEY"));
			model.setMustBeEntered(rs.getBoolean("MUST_BE_ENTERED"));
			model.setDefltValue(rs.getString("DEFLT_VALUE"));
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
	 * org.historyresearchenvironment.dataModel.models.AbstractHreDataModel#get(
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
			setSubstnParamNamePid(rs.getInt("SUBSTN_PARAM_NAME_PID"));
			setIsSystem(rs.getBoolean("IS_SYSTEM"));
			setViewDataScriptGroupKey(rs.getShort("VIEW_DATA_SCRIPT_GROUP_KEY"));
			setViewDataScriptPid(rs.getInt(" VIEW_DATA_SCRIPT_PID"));
			setModifyDataScriptGroupKey(rs.getShort("MODIFY_DATA_SCRIPT_GROUP_KEY"));
			setModifyDataScriptPid(rs.getInt("MODIFY_DATA_SCRIPT_PID"));
			setDeleteDataScriptGroupKey(rs.getShort("DELETE_DATA_SCRIPT_GROUP_KEY"));
			setDeleteDataScriptPid(rs.getInt("DELETE_DATA_SCRIPT_PID"));
			setEvalDataScriptGroupKey(rs.getShort("EVAL_DATA_SCRIPT_GROUP_KEY"));
			setEvalDataScriptPid(rs.getInt("EVAL_DATA_SCRIPT_PID"));
			setParamSetKey(rs.getShort("PARAM_SET_KEY"));
			setDataTypeKey(rs.getShort("DATA_TYPE_KEY"));
			setMustBeEntered(rs.getBoolean("MUST_BE_ENTERED"));
			setDefltValue(rs.getString("DEFLT_VALUE"));
			setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
			setShow(rs.getBoolean("SHOW"));
		}

		return this;
	}

	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	// @Column(name="DATA_TYPE_KEY")
	public short getDataTypeKey() {
		return this.dataTypeKey;
	}

	// @Column(name="DEFLT_VALUE", length=300)
	public String getDefltValue() {
		return this.defltValue;
	}

	// @Column(name="DELETE_DATA_SCRIPT_GROUP_KEY")
	public short getDeleteDataScriptGroupKey() {
		return this.deleteDataScriptGroupKey;
	}

	// @Column(name="DELETE_DATA_SCRIPT_PID")
	public int getDeleteDataScriptPid() {
		return this.deleteDataScriptPid;
	}

	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	// @Column(name="EVAL_DATA_SCRIPT_GROUP_KEY")
	public short getEvalDataScriptGroupKey() {
		return this.evalDataScriptGroupKey;
	}

	// @Column(name="EVAL_DATA_SCRIPT_PID")
	public int getEvalDataScriptPid() {
		return this.evalDataScriptPid;
	}

	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	// @Column(name="MODIFY_DATA_SCRIPT_GROUP_KEY")
	public short getModifyDataScriptGroupKey() {
		return this.modifyDataScriptGroupKey;
	}

	// @Column(name="MODIFY_DATA_SCRIPT_PID")
	public int getModifyDataScriptPid() {
		return this.modifyDataScriptPid;
	}

	// @Column(name="MUST_BE_ENTERED")
	public boolean getMustBeEntered() {
		return this.mustBeEntered;
	}

	// @Column(name="PARAM_SET_KEY")
	public short getParamSetKey() {
		return this.paramSetKey;
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

	// @Column(name="SUBSTN_PARAM_NAME_PID", nullable=false)
	public int getSubstnParamNamePid() {
		return this.substnParamNamePid;
	}

	// @Column(name="VIEW_DATA_SCRIPT_GROUP_KEY")
	public short getViewDataScriptGroupKey() {
		return this.viewDataScriptGroupKey;
	}

	// @Column(name="VIEW_DATA_SCRIPT_PID")
	public int getViewDataScriptPid() {
		return this.viewDataScriptPid;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.dataModel.models.AbstractHreDataModel#post(
	 * org.historyresearchenvironment.dataModel.models.AbstractHreDataModel)
	 */
	@Override
	public void post(AbstractHreDataModel model) throws SQLException {
		ps = conn.prepareStatement(INSERT);
		ps.setInt(1, getSubstnParamNamePid());
		ps.setShort(2, getViewDataScriptGroupKey());
		ps.setString(3, getDefltValue());

		ps.setInt(1, getRecordNum());
		ps.setShort(2, getSetKey());
		ps.setInt(3, getCommitPid());
		ps.setInt(4, getSubstnParamNamePid());
		ps.setInt(5, getViewDataScriptGroupKey());
		ps.setInt(6, getViewDataScriptPid());
		ps.setInt(7, getModifyDataScriptGroupKey());
		ps.setInt(8, getModifyDataScriptPid());
		ps.setInt(9, getDeleteDataScriptGroupKey());
		ps.setInt(10, getDeleteDataScriptPid());
		ps.setInt(11, getEvalDataScriptGroupKey());
		ps.setInt(12, getEvalDataScriptPid());
		ps.setInt(13, getParamSetKey());
		ps.setInt(14, getDataTypeKey());
		ps.setBoolean(15, getMustBeEntered());
		ps.setString(16, getDefltValue());
		ps.setInt(17, getDisplayOrder());
		ps.setBoolean(18, getShow());

		ps.executeUpdate();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.dataModel.models.AbstractHreDataModel#put(
	 * org.historyresearchenvironment.dataModel.models.AbstractHreDataModel)
	 */
	@Override
	public void put(AbstractHreDataModel model) throws SQLException {
		ps = conn.prepareStatement(UPDATE);
		ps.setInt(1, getSubstnParamNamePid());
		ps.setShort(2, getViewDataScriptGroupKey());
		ps.setString(3, getDefltValue());

		ps.setInt(1, getRecordNum());
		ps.setShort(2, getSetKey());
		ps.setInt(3, getCommitPid());
		ps.setInt(4, getSubstnParamNamePid());
		ps.setInt(5, getViewDataScriptGroupKey());
		ps.setInt(6, getViewDataScriptPid());
		ps.setInt(7, getModifyDataScriptGroupKey());
		ps.setInt(8, getModifyDataScriptPid());
		ps.setInt(9, getDeleteDataScriptGroupKey());
		ps.setInt(10, getDeleteDataScriptPid());
		ps.setInt(11, getEvalDataScriptGroupKey());
		ps.setInt(12, getEvalDataScriptPid());
		ps.setInt(13, getParamSetKey());
		ps.setInt(14, getDataTypeKey());
		ps.setBoolean(15, getMustBeEntered());
		ps.setString(16, getDefltValue());
		ps.setInt(17, getDisplayOrder());
		ps.setBoolean(18, getShow());

		ps.executeUpdate();
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDataTypeKey(short dataTypeKey) {
		this.dataTypeKey = dataTypeKey;
	}

	public void setDefltValue(String defltValue) {
		this.defltValue = defltValue;
	}

	public void setDeleteDataScriptGroupKey(short deleteDataScriptGroupKey) {
		this.deleteDataScriptGroupKey = deleteDataScriptGroupKey;
	}

	public void setDeleteDataScriptPid(int deleteDataScriptPid) {
		this.deleteDataScriptPid = deleteDataScriptPid;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public void setEvalDataScriptGroupKey(short evalDataScriptGroupKey) {
		this.evalDataScriptGroupKey = evalDataScriptGroupKey;
	}

	public void setEvalDataScriptPid(int evalDataScriptPid) {
		this.evalDataScriptPid = evalDataScriptPid;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public void setModifyDataScriptGroupKey(short modifyDataScriptGroupKey) {
		this.modifyDataScriptGroupKey = modifyDataScriptGroupKey;
	}

	public void setModifyDataScriptPid(int modifyDataScriptPid) {
		this.modifyDataScriptPid = modifyDataScriptPid;
	}

	public void setMustBeEntered(boolean mustBeEntered) {
		this.mustBeEntered = mustBeEntered;
	}

	public void setParamSetKey(short paramSetKey) {
		this.paramSetKey = paramSetKey;
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

	public void setSubstnParamNamePid(int substnParamNamePid) {
		this.substnParamNamePid = substnParamNamePid;
	}

	public void setViewDataScriptGroupKey(short viewDataScriptGroupKey) {
		this.viewDataScriptGroupKey = viewDataScriptGroupKey;
	}

	public void setViewDataScriptPid(int viewDataScriptPid) {
		this.viewDataScriptPid = viewDataScriptPid;
	}

}
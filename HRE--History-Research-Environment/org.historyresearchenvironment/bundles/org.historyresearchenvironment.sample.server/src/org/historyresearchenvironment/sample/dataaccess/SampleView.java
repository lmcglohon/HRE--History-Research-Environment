package org.historyresearchenvironment.sample.dataaccess;

import java.sql.SQLException;
import java.util.ArrayList;

import org.historyresearchenvironment.dataaccess.models.AbstractHreDataAccess;

/**
 * The persistent class for the SAMPLE_VIEW database view.
 * 
 * @version 2018-06-29
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */

public class SampleView extends AbstractHreDataAccess {
	private static final String DELETE = "DELETE FROM PUBLIC.SAMPLE_VIEW WHERE RECORD_NUM = ?";
	private static final String DELETEALL = "DELETE FROM PUBLIC.SAMPLE_VIEW";
	private static final String INSERT = "INSERT INTO PUBLIC.SAMPLE_VIEW (SUBSTN_PARAM_NAME_PID, VIEW_DATA_SCRIPT_GROUP_KEY, DFLT_VALUE)"
			+ "  VALUES (?, ?, ?)";
	private static final String UPDATE = "UPDATE PUBLIC.SAMPLE_VIEW"
			+ "  SET SUBSTN_PARAM_NAME_PID = ?, VIEW_DATA_SCRIPT_GROUP_KEY = ?, DFLT_VALUE = ?";
	private static final String SELECT = "SELECT SUBSTN_PARAM_NAME_PID, VIEW_DATA_SCRIPT_GROUP_KEY, VIEW_DATA_SCRIPT_PID, "
			+ "  MODIFY_DATA_SCRIPT_GROUP_KEY, MODIFY_DATA_SCRIPT_PID, DELETE_DATA_SCRIPT_GROUP_KEY, "
			+ "  DELETE_DATA_SCRIPT_PID, DEFLT_VALUE, MUST_BE_ENTERED, DATA_TYPE_KEY, "
			+ "  PARAM_SET_KEY, EVAL_DATA_SCRIPT_PID, EVAL_DATA_SCRIPT_GROUP_KEY, "
			+ "  SUBSTN_PARAM_VALUE_PID, PARENT_STEP_PID, PARAM_LIST_KEY, PARAM_NAME_KEY, "
			+ "  VALUE_IS_DATA_ALIAS, VALUE_IS_OTHER_ALIAS, ALIAS_KEY, DEFLT_PARAM_STEP_PID "
			+ "  FROM PUBLIC.SAMPLE_VIEW WHERE SUBSTN_PARAM_NAME_PID = ?";
	private static final String SELECTALL = "SELECT SUBSTN_PARAM_NAME_PID, VIEW_DATA_SCRIPT_GROUP_KEY, VIEW_DATA_SCRIPT_PID, "
			+ "  MODIFY_DATA_SCRIPT_GROUP_KEY, MODIFY_DATA_SCRIPT_PID, DELETE_DATA_SCRIPT_GROUP_KEY, "
			+ "  DELETE_DATA_SCRIPT_PID, DEFLT_VALUE, MUST_BE_ENTERED, DATA_TYPE_KEY, "
			+ "  PARAM_SET_KEY, EVAL_DATA_SCRIPT_PID, EVAL_DATA_SCRIPT_GROUP_KEY, "
			+ "  SUBSTN_PARAM_VALUE_PID, PARENT_STEP_PID, PARAM_LIST_KEY, PARAM_NAME_KEY, "
			+ "  VALUE_IS_DATA_ALIAS, VALUE_IS_OTHER_ALIAS, ALIAS_KEY, DEFLT_PARAM_STEP_PID "
			+ "  FROM PUBLIC.SAMPLE_VIEW";

	private static final long serialVersionUID = 1L;
	private short aliasKey;
	private short dataTypeKey;
	private int defltParamStepPid;
	private String defltValue;
	private short deleteDataScriptGroupKey;
	private int deleteDataScriptPid;
	private short evalDataScriptGroupKey;
	private int evalDataScriptPid;
	private short modifyDataScriptGroupKey;
	private int modifyDataScriptPid;
	private boolean mustBeEntered;
	private short paramListKey;
	private short paramNameKey;
	private short paramSetKey;
	private int parentStepPid;
	private int substnParamNamePid;
	private int substnParamValuePid;
	private boolean valueIsDataAlias;
	private boolean valueIsOtherAlias;
	private short viewDataScriptGroupKey;
	private int viewDataScriptPid;
	private ArrayList<SampleView> modelList;
	private SampleView model;

	public SampleView() throws SQLException {
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
	public ArrayList<SampleView> get() throws SQLException {
		ps = conn.prepareStatement(SELECTALL);
		rs = ps.executeQuery();
		modelList = new ArrayList<SampleView>();

		while (rs.next()) {
			model = new SampleView();
			model.setSubstnParamNamePid(rs.getInt(1));
			model.setViewDataScriptGroupKey(rs.getShort(2));
			model.setDefltValue(rs.getString(8));

			// "SELECT SUBSTN_PARAM_NAME_PID, VIEW_DATA_SCRIPT_GROUP_KEY,
			// VIEW_DATA_SCRIPT_PID, "
			// + " MODIFY_DATA_SCRIPT_GROUP_KEY, MODIFY_DATA_SCRIPT_PID,
			// DELETE_DATA_SCRIPT_GROUP_KEY, "
			// + " DELETE_DATA_SCRIPT_PID, DEFLT_VALUE, MUST_BE_ENTERED, DATA_TYPE_KEY, "
			// + " PARAM_SET_KEY, EVAL_DATA_SCRIPT_PID, EVAL_DATA_SCRIPT_GROUP_KEY, "
			// + " SUBSTN_PARAM_VALUE_PID, PARENT_STEP_PID, PARAM_LIST_KEY, PARAM_NAME_KEY,
			// "
			// + " VALUE_IS_DATA_ALIAS, VALUE_IS_OTHER_ALIAS, ALIAS_KEY,
			// DEFLT_PARAM_STEP_PID "
			// + " FROM PUBLIC.SAMPLE_VIEW";

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
	public SampleView get(int key) throws SQLException {
		ps = conn.prepareStatement(SELECT);
		rs = ps.executeQuery();
		model = null;

		if (rs.next()) {
			model = new SampleView();
			model.setSubstnParamNamePid(rs.getInt(1));
			model.setViewDataScriptGroupKey(rs.getShort(2));
			model.setDefltValue(rs.getString(8));

			// "SELECT SUBSTN_PARAM_NAME_PID, VIEW_DATA_SCRIPT_GROUP_KEY,
			// VIEW_DATA_SCRIPT_PID, "
			// + " MODIFY_DATA_SCRIPT_GROUP_KEY, MODIFY_DATA_SCRIPT_PID,
			// DELETE_DATA_SCRIPT_GROUP_KEY, "
			// + " DELETE_DATA_SCRIPT_PID, DEFLT_VALUE, MUST_BE_ENTERED, DATA_TYPE_KEY, "
			// + " PARAM_SET_KEY, EVAL_DATA_SCRIPT_PID, EVAL_DATA_SCRIPT_GROUP_KEY, "
			// + " SUBSTN_PARAM_VALUE_PID, PARENT_STEP_PID, PARAM_LIST_KEY, PARAM_NAME_KEY,
			// "
			// + " VALUE_IS_DATA_ALIAS, VALUE_IS_OTHER_ALIAS, ALIAS_KEY,
			// DEFLT_PARAM_STEP_PID "
			// + " FROM PUBLIC.SAMPLE_VIEW";

		}

		return model;
	}

	// @Column(name="ALIAS_KEY")
	public short getAliasKey() {
		return this.aliasKey;
	}

	// @Column(name="DATA_TYPE_KEY")
	public short getDataTypeKey() {
		return this.dataTypeKey;
	}

	// @Column(name="DEFLT_PARAM_STEP_PID")
	public int getDefltParamStepPid() {
		return this.defltParamStepPid;
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

	// @Column(name="EVAL_DATA_SCRIPT_GROUP_KEY")
	public short getEvalDataScriptGroupKey() {
		return this.evalDataScriptGroupKey;
	}

	// @Column(name="EVAL_DATA_SCRIPT_PID")
	public int getEvalDataScriptPid() {
		return this.evalDataScriptPid;
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

	// @Column(name="SUBSTN_PARAM_NAME_PID")
	public int getSubstnParamNamePid() {
		return this.substnParamNamePid;
	}

	// @Column(name="SUBSTN_PARAM_VALUE_PID")
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
	 * org.historyresearchenvironment.dataaccess.models.AbstractHreDataAccess#post(
	 * org. historyresearchenvironment.dataaccess.AbstractHreDataAccess)
	 */
	@Override
	public void post(AbstractHreDataAccess model) throws SQLException {
		ps = conn.prepareStatement(INSERT);
		ps.setInt(1, getSubstnParamNamePid());
		ps.setShort(2, getViewDataScriptGroupKey());
		ps.setString(3, getDefltValue());
		ps.executeUpdate();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.dataaccess.models.AbstractHreDataAccess#put(
	 * org. historyresearchenvironment.dataaccess.AbstractHreDataAccess)
	 */
	@Override
	public void put(AbstractHreDataAccess model) throws SQLException {
		ps = conn.prepareStatement(UPDATE);
		ps.setInt(1, getSubstnParamNamePid());
		ps.setShort(2, getViewDataScriptGroupKey());
		ps.setString(3, getDefltValue());
		ps.executeUpdate();
	}

	public void setAliasKey(short aliasKey) {
		this.aliasKey = aliasKey;
	}

	public void setDataTypeKey(short dataTypeKey) {
		this.dataTypeKey = dataTypeKey;
	}

	public void setDefltParamStepPid(int defltParamStepPid) {
		this.defltParamStepPid = defltParamStepPid;
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

	public void setEvalDataScriptGroupKey(short evalDataScriptGroupKey) {
		this.evalDataScriptGroupKey = evalDataScriptGroupKey;
	}

	public void setEvalDataScriptPid(int evalDataScriptPid) {
		this.evalDataScriptPid = evalDataScriptPid;
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

	public void setSubstnParamNamePid(int substnParamNamePid) {
		this.substnParamNamePid = substnParamNamePid;
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

	public void setViewDataScriptGroupKey(short viewDataScriptGroupKey) {
		this.viewDataScriptGroupKey = viewDataScriptGroupKey;
	}

	public void setViewDataScriptPid(int viewDataScriptPid) {
		this.viewDataScriptPid = viewDataScriptPid;
	}
}
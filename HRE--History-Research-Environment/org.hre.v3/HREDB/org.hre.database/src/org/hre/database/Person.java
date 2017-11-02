package org.hre.database;

import java.io.Serializable;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the PERSONS database table.
 * 
 */
@Entity
@Table(name = "PERSONS")
@NamedQuery(name = "Person.findAll", query = "SELECT p FROM Person p")
public class Person extends AbstractHreTableRow implements Serializable {
	private static final String GET_STATEMENT = "SELECT RECORD_NUM, SET_PID, DEFN_PID, PERSONS_PID, VISIBLE_ID,"
			+ "  OWNER_PID, RIGHTS, COMMIT_PID, PRIMARY_NAME_KEY, PRIMARY_NAME_PID,"
			+ "  PRMY_BIRTH_PID, PRMY_DEATH_PID, PRMY_FATHER_PID, PRMY_MOTHER_PID,"
			+ "  HAS_EVENT_ASSOC, HAS_TASK_ASSOC, HAS_CHILDREN, HAS_CITATIONS, HAS_MANY_NAMES"
			+ "  FROM PUBLIC.PERSONS WHERE RECORD_NUM = ?";
	private static final String PUT_STATEMENT = "INSERT INTO PUBLIC.PERSONS (RECORD_NUM, SET_PID, DEFN_PID, "
			+ "PERSONS_PID, VISIBLE_ID, OWNER_PID, RIGHTS, COMMIT_PID, PRIMARY_NAME_KEY, PRIMARY_NAME_PID, "
			+ "PRMY_BIRTH_PID, PRMY_DEATH_PID, PRMY_FATHER_PID, PRMY_MOTHER_PID, HAS_EVENT_ASSOC, "
			+ "HAS_TASK_ASSOC, HAS_CHILDREN, HAS_CITATIONS, HAS_MANY_NAMES) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final String POST_STATEMENT = "UPDATE PUBLIC.PERSONS SET SET_PID = ?, DEFN_PID = ?, "
			+ "PERSONS_PID = ?, VISIBLE_ID = ?, OWNER_PID = ?, RIGHTS = ?, COMMIT_PID = ?, PRIMARY_NAME_KEY = ?, "
			+ "PRIMARY_NAME_PID = ?, PRMY_BIRTH_PID = ?, PRMY_DEATH_PID = ?, PRMY_FATHER_PID = ?, "
			+ "PRMY_MOTHER_PID = ?, HAS_EVENT_ASSOC = ?, HAS_TASK_ASSOC = ?, HAS_CHILDREN = ?, "
			+ "HAS_CITATIONS = ?, HAS_MANY_NAMES = ?  WHERE RECORD_NUM = ?";
	protected static final String DELETE_STATEMENT = "DELETE FROM PUBLIC.PERSONS WHERE RECORD_NUM = ?";
	private static final long serialVersionUID = 1L;

	@Column(name = "COMMIT_PID")
	private int commitPid;

	@Column(name = "DEFN_PID")
	private short defnPid;

	@Column(name = "HAS_CHILDREN")
	private boolean hasChildren;

	@Column(name = "HAS_CITATIONS")
	private boolean hasCitations;

	@Column(name = "HAS_EVENT_ASSOC")
	private boolean hasEventAssoc;

	@Column(name = "HAS_MANY_NAMES")
	private boolean hasManyNames;

	@Column(name = "HAS_TASK_ASSOC")
	private boolean hasTaskAssoc;

	@Column(name = "OWNER_PID")
	private int ownerPid;

	@Column(name = "PERSON_PID")
	private int personPid;

	@Column(name = "PRIMARY_NAME_KEY")
	private short primaryNameKey;

	@Column(name = "PRIMARY_NAME_PID")
	private int primaryNamePid;

	@Column(name = "PRMY_BIRTH_PID")
	private int prmyBirthPid;

	@Column(name = "PRMY_DEATH_PID")
	private int prmyDeathPid;

	@Column(name = "PRMY_FATHER_PID")
	private int prmyFatherPid;

	@Column(name = "PRMY_MOTHER_PID")
	private int prmyMotherPid;

	@Column(name = "RECORD_NUM")
	private int recordNum;

	private short rights;

	@Column(name = "SET_PID")
	private short setPid;

	@Column(name = "VISIBLE_ID")
	private int visibleId;

	public Person() {
		try {
			Class.forName(dbDriver);
			System.out.println("Class");
			conn = DriverManager.getConnection("jdbc:h2:" + dbName, userId, passWord);
			System.out.println(conn);
		} catch (final Exception e) {
			e.printStackTrace();
			LOGGER.severe(e.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hre.database.AbstractHreTableRow#delete(int)
	 */
	@Override
	public int delete(int recordNum) throws Exception {
		pst = conn.prepareStatement(DELETE_STATEMENT);
		pst.setInt(1, recordNum);
		pst.execute();
		LOGGER.info("Deleted");
		return 0;
	}

	@Override
	public AbstractHreTableRow get(int recordNum) throws Exception {
		pst = conn.prepareStatement(GET_STATEMENT);

		pst.setInt(1, recordNum);

		final ResultSet rs = pst.executeQuery();

		if (rs.next()) {
			recordNum = rs.getInt("RECORD_NUM");
			setPid = rs.getShort("SET_PID");
			defnPid = rs.getShort("DEFN_PID");
			personPid = rs.getInt("PERSONS_PID");
			visibleId = rs.getInt("VISIBLE_ID");
			ownerPid = rs.getInt("OWNER_PID");
			rights = rs.getShort("RIGHTS");
			commitPid = rs.getInt("COMMIT_PID");
			primaryNameKey = rs.getShort("PRIMARY_NAME_KEY");
			primaryNamePid = rs.getInt("PRIMARY_NAME_PID");
			prmyBirthPid = rs.getInt("PRMY_BIRTH_PID");
			prmyDeathPid = rs.getInt("PRMY_DEATH_PID");
			prmyFatherPid = rs.getInt("PRMY_FATHER_PID");
			prmyMotherPid = rs.getInt("PRMY_MOTHER_PID");
			hasEventAssoc = rs.getBoolean("HAS_EVENT_ASSOC");
			hasTaskAssoc = rs.getBoolean("HAS_TASK_ASSOC");
			hasChildren = rs.getBoolean("HAS_CHILDREN");
			hasCitations = rs.getBoolean("HAS_CITATIONS");
			hasManyNames = rs.getBoolean("HAS_MANY_NAMES");
		}
		return this;
	}

	public int getCommitPid() {
		return this.commitPid;
	}

	public short getDefnPid() {
		return this.defnPid;
	}

	public boolean getHasChildren() {
		return this.hasChildren;
	}

	public boolean getHasCitations() {
		return this.hasCitations;
	}

	public boolean getHasEventAssoc() {
		return this.hasEventAssoc;
	}

	public boolean getHasManyNames() {
		return this.hasManyNames;
	}

	public boolean getHasTaskAssoc() {
		return this.hasTaskAssoc;
	}

	public int getOwnerPid() {
		return this.ownerPid;
	}

	public int getPersonPid() {
		return this.personPid;
	}

	public short getPrimaryNameKey() {
		return this.primaryNameKey;
	}

	public int getPrimaryNamePid() {
		return this.primaryNamePid;
	}

	public int getPrmyBirthPid() {
		return this.prmyBirthPid;
	}

	public int getPrmyDeathPid() {
		return this.prmyDeathPid;
	}

	public int getPrmyFatherPid() {
		return this.prmyFatherPid;
	}

	public int getPrmyMotherPid() {
		return this.prmyMotherPid;
	}

	public int getRecordNum() {
		return this.recordNum;
	}

	public short getRights() {
		return this.rights;
	}

	public short getSetPid() {
		return this.setPid;
	}

	public int getVisibleId() {
		return this.visibleId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.historyresearchenvironment.database.hre.AbstractHreTableRow#put(org.
	 * historyresearchenvironment.database.hre.AbstractHreTableRow)
	 */
	@Override
	public int post() throws Exception {
		pst = conn.prepareStatement(POST_STATEMENT);

		pst.setShort(1, setPid);
		pst.setShort(2, defnPid);
		pst.setInt(3, personPid);
		pst.setInt(4, visibleId);
		pst.setInt(5, ownerPid);
		pst.setShort(6, rights);
		pst.setInt(7, commitPid);
		pst.setShort(8, primaryNameKey);
		pst.setInt(9, primaryNamePid);
		pst.setInt(10, prmyBirthPid);
		pst.setInt(11, prmyDeathPid);
		pst.setInt(12, prmyFatherPid);
		pst.setInt(13, prmyMotherPid);
		pst.setBoolean(14, hasEventAssoc);
		pst.setBoolean(15, hasTaskAssoc);
		pst.setBoolean(16, hasChildren);
		pst.setBoolean(17, hasCitations);
		pst.setBoolean(18, hasManyNames);
		pst.setInt(19, recordNum);

		pst.execute();

		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.historyresearchenvironment.database.hre.AbstractHreTableRow#put(org.
	 * historyresearchenvironment.database.hre.AbstractHreTableRow)
	 */
	@Override
	public int put() throws Exception {
		pst = conn.prepareStatement(PUT_STATEMENT);

		pst.setInt(1, recordNum);
		pst.setShort(2, setPid);
		pst.setShort(3, defnPid);
		pst.setInt(4, personPid);
		pst.setInt(5, visibleId);
		pst.setInt(6, ownerPid);
		pst.setShort(7, rights);
		pst.setInt(8, commitPid);
		pst.setShort(9, primaryNameKey);
		pst.setInt(10, primaryNamePid);
		pst.setInt(11, prmyBirthPid);
		pst.setInt(12, prmyDeathPid);
		pst.setInt(13, prmyFatherPid);
		pst.setInt(14, prmyMotherPid);
		pst.setBoolean(15, hasEventAssoc);
		pst.setBoolean(16, hasTaskAssoc);
		pst.setBoolean(17, hasChildren);
		pst.setBoolean(18, hasCitations);
		pst.setBoolean(19, hasManyNames);

		pst.execute();

		return 0;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}

	public void setDefnPid(short defnPid) {
		this.defnPid = defnPid;
	}

	public void setHasChildren(boolean hasChildren) {
		this.hasChildren = hasChildren;
	}

	public void setHasCitations(boolean hasCitations) {
		this.hasCitations = hasCitations;
	}

	public void setHasEventAssoc(boolean hasEventAssoc) {
		this.hasEventAssoc = hasEventAssoc;
	}

	public void setHasManyNames(boolean hasManyNames) {
		this.hasManyNames = hasManyNames;
	}

	public void setHasTaskAssoc(boolean hasTaskAssoc) {
		this.hasTaskAssoc = hasTaskAssoc;
	}

	public void setOwnerPid(int ownerPid) {
		this.ownerPid = ownerPid;
	}

	public void setPersonPid(int personPid) {
		this.personPid = personPid;
	}

	public void setPrimaryNameKey(short primaryNameKey) {
		this.primaryNameKey = primaryNameKey;
	}

	public void setPrimaryNamePid(int primaryNamePid) {
		this.primaryNamePid = primaryNamePid;
	}

	public void setPrmyBirthPid(int prmyBirthPid) {
		this.prmyBirthPid = prmyBirthPid;
	}

	public void setPrmyDeathPid(int prmyDeathPid) {
		this.prmyDeathPid = prmyDeathPid;
	}

	public void setPrmyFatherPid(int prmyFatherPid) {
		this.prmyFatherPid = prmyFatherPid;
	}

	public void setPrmyMotherPid(int prmyMotherPid) {
		this.prmyMotherPid = prmyMotherPid;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setRights(short rights) {
		this.rights = rights;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}
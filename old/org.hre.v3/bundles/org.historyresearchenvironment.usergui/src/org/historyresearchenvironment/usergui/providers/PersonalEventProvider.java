package org.historyresearchenvironment.usergui.providers;

import java.sql.SQLException;
import java.util.Vector;

import org.historyresearchenvironment.tmg.h2.models.Name;
import org.historyresearchenvironment.tmg.h2.models.Person;
import org.historyresearchenvironment.usergui.models.EventModel;
import org.historyresearchenvironment.usergui.models.EventVector;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class PersonalEventProvider extends AbstractHreProvider {
	protected int Id;
	protected String identity;
	protected String father;
	protected String mother;
	protected int noChildren;
	protected Vector<EventModel> events;

	/**
	 *  
	 */
	public PersonalEventProvider() {
		super();
	}

	/**
	 * @param identity
	 * @param father
	 * @param mother
	 * @param noChildren
	 * @param em
	 */
	public PersonalEventProvider(String identity, String father, String mother, int noChildren) {
		super();
		this.identity = identity;
		this.father = father;
		this.mother = mother;
		this.noChildren = noChildren;
	}

	/**
	 * @param eventTag
	 * @param role
	 * @param date
	 * @param summary
	 */
	public void addEvent(String eventTag, String role, String date, String summary) {
		final EventModel e = new EventModel(eventTag, role, date, summary);
		if (events == null) {
			events = new Vector<EventModel>(Id);
		}
		events.add(e);
	}

	/**
	 * Close H2 connection.
	 */
	public void dispose() {
		try {
			conn.close();
		} catch (SQLException e) {
		}
	}

	/**
	 * @return the events
	 */
	public Vector<EventModel> getEvents() {
		return events;
	}

	/**
	 * @return the father
	 */
	public String getFather() {
		return father;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}

	/**
	 * @return the identity
	 */
	public String getIdentity() {
		return identity;
	}

	/**
	 * @return the mother
	 */
	public String getMother() {
		return mother;
	}

	/**
	 * @return the noChildren
	 */
	public int getNoChildren() {
		return noChildren;
	}

	/**
	 * @param i
	 */
	@Override
	public void readFromH2(int i) {
		StringBuilder sb = new StringBuilder();
		Person p = null;
		Person p1 = null;
		int p1PerNo = 0;

		setId(i);

		try {
			p = new Person(conn, i);

			if (p.getPerNo() == 0) {
				eventBroker.post("MESSAGE", "No person found");
				LOGGER.info("No person found");
			}

			Name n = new Name(conn, i);

			sb = new StringBuilder(n.getSrnamedisp());
			sb.append(" (" + i + ") (");
			try {
				sb.append(p.getPbirth().substring(1, 5));
			} catch (final Exception e) {
				sb.append("    ");
			}
			sb.append("-");
			try {
				sb.append(p.getPdeath().substring(1, 5));
			} catch (final Exception e) {
				sb.append("    ");
			}
			sb.append(")");
			setIdentity(sb.toString());

			p1PerNo = (p.getFather());
			p1 = new Person(conn, p1PerNo);
			n = new Name(conn, p1PerNo);

			sb = new StringBuilder(n.getSrnamedisp());
			sb.append(" (" + p1PerNo + ") (");
			try {
				sb.append(p1.getPbirth().substring(1, 5));
			} catch (final Exception e) {
				sb.append("    ");
			}
			sb.append("-");
			try {
				sb.append(p1.getPdeath().substring(1, 5));
			} catch (final Exception e) {
				sb.append("    ");
			}
			sb.append(")");
			setFather(sb.toString());

			p1PerNo = (p.getMother());
			p1 = new Person(conn, p1PerNo);
			n = new Name(conn, p1PerNo);

			sb = new StringBuilder(n.getSrnamedisp());
			sb.append(" (" + p1PerNo + ") (");
			try {
				sb.append(p1.getPbirth().substring(1, 5));
			} catch (final Exception e) {
				sb.append("    ");
			}
			sb.append("-");
			try {
				sb.append(p1.getPdeath().substring(1, 5));
			} catch (final Exception e) {
				sb.append("    ");
			}
			sb.append(")");
			setMother(sb.toString());

			setNoChildren(p.getChildCount());

			events = new EventVector(conn, i).getVector();

		} catch (final Exception e) {
			eventBroker.post("MESSAGE", e.getClass() + " " + e.getMessage());
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
			// } finally {
			// try {
			// conn.close();
			// } catch (SQLException e) {
			// }
		}
	}

	/**
	 * @param father
	 *            the father to set
	 */
	public void setFather(String father) {
		this.father = father;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		Id = id;
		setKey(Integer.toString(Id));
	}

	/**
	 * @param identity
	 *            the identity to set
	 */
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	/**
	 * @param mother
	 *            the mother to set
	 */
	public void setMother(String mother) {
		this.mother = mother;
	}

	/**
	 * @param noChildren
	 *            the noChildren to set
	 */
	public void setNoChildren(int noChildren) {
		this.noChildren = noChildren;
	}
}

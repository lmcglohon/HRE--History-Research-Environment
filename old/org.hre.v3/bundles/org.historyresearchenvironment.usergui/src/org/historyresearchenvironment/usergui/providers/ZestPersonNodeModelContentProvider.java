package org.historyresearchenvironment.usergui.providers;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.historyresearchenvironment.tmg.h2.models.Name;
import org.historyresearchenvironment.tmg.h2.models.Person;
import org.historyresearchenvironment.usergui.models.ZestPersonConnection;
import org.historyresearchenvironment.usergui.models.ZestPersonNode;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class ZestPersonNodeModelContentProvider extends AbstractHreProvider {
	protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	private static int maxLevels;
	private final List<ZestPersonConnection> connections;
	private final List<ZestPersonNode> nodes;

	/**
	 * 
	 */
	public ZestPersonNodeModelContentProvider(int perNo) {
		ZestPersonNode node;
		nodes = new ArrayList<ZestPersonNode>();
		connections = new ArrayList<ZestPersonConnection>();
		maxLevels = 100;

		final Person person = new Person(conn, perNo);
		final Name name = new Name(conn, perNo);

		final String birth = (person.getPbirth().length() > 0 ? person.getPbirth().substring(1, 5) : "");
		final String death = (person.getPdeath().length() > 0 ? "-" + person.getPdeath().substring(1, 5) : "-");
		final String contents = (name.getSrnamedisp() + "\n" + birth + death).trim();
		LOGGER.fine("Person " + perNo + ", " + contents + ", " + person.getSex());

		node = new ZestPersonNode(perNo, contents, person.getSex());
		nodes.add(node);

		if (maxLevels > 0) {
			maxLevels--;

			final int father = person.getFather();

			if (father != 0) {
				addNode(node, father);
			}

			final int mother = person.getMother();

			if (mother != 0) {
				addNode(node, mother);
			}
		}

		for (final ZestPersonConnection connection : connections) {
			try {
				connection.getSource().getConnectedTo().add(connection.getDestination());
			} catch (final Exception e) {
				LOGGER.severe(
						e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
			}
		}
	}

	/**
	 * @param perNo
	 */
	private void addNode(ZestPersonNode childNode, int perNo) {
		ZestPersonNode node;
		final Person person = new Person(conn, perNo);
		final Name name = new Name(conn, perNo);

		final String birth = (person.getPbirth().length() > 0 ? person.getPbirth().substring(1, 5) : "");
		final String death = (person.getPdeath().length() > 0 ? "-" + person.getPdeath().substring(1, 5) : "-");
		final String contents = (name.getSrnamedisp() + "\n" + birth + death).trim();
		LOGGER.fine("Person " + perNo + ", " + contents + ", " + person.getSex());

		node = new ZestPersonNode(perNo, contents, person.getSex());
		nodes.add(node);
		final ZestPersonConnection connect = new ZestPersonConnection(perNo, Integer.toString(perNo), childNode, node);
		connections.add(connect);
		LOGGER.fine("Connection " + perNo + " from " + childNode.getPerNo() + " to " + node.getPerNo());

		if (maxLevels > 0) {
			maxLevels--;
			final int father = person.getFather();

			if (father != 0) {
				addNode(node, father);
			}

			final int mother = person.getMother();

			if (mother != 0) {
				addNode(node, mother);
			}
		}
	}

	/**
	 * @return
	 */
	public List<ZestPersonNode> getNodes() {
		return nodes;
	}

	/* (non-Javadoc)
	 * @see org.historyresearchenvironment.usergui.providers.AbstractHreProvider#readFromH2(int)
	 */
	@Override
	public void readFromH2(int i) {
	}
}

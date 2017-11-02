package org.historyresearchenvironment.usergui.providers;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.historyresearchenvironment.tmg.h2.models.Name;
import org.historyresearchenvironment.tmg.h2.models.Person;
import org.historyresearchenvironment.usergui.zesttest.ZestPersonConnection;
import org.historyresearchenvironment.usergui.zesttest.ZestPersonNode;

/**
 * @author Michael Erichsen
 *
 */
public class ZestPersonNodeModelContentProvider {
	protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	private List<ZestPersonConnection> connections;
	private List<ZestPersonNode> nodes;
	private static int maxLevels;

	/**
	 * 
	 */
	public ZestPersonNodeModelContentProvider(int perNo) {
		ZestPersonNode node;
		nodes = new ArrayList<ZestPersonNode>();
		connections = new ArrayList<ZestPersonConnection>();
		maxLevels = 12;

		Person person = new Person(perNo);
		Name name = new Name(perNo);

		String birth = (person.getPbirth().length() > 0 ? person.getPbirth().substring(1, 5) : "");
		String death = (person.getPdeath().length() > 0 ? "-" + person.getPdeath().substring(1, 5) : "-");
		String contents = (name.getSrnamedisp() + "\n" + birth + death).trim();
		LOGGER.fine("Person " + perNo + ", " + contents + ", " + person.getSex());

		node = new ZestPersonNode(perNo, contents, person.getSex());
		nodes.add(node);

		if (maxLevels > 0) {
			maxLevels--;

			int father = person.getFather();

			if (father != 0) {
				addNode(node, father);
			}

			int mother = person.getMother();

			if (mother != 0) {
				addNode(node, mother);
			}
		}

		for (final ZestPersonConnection connection : connections) {
			try {
				connection.getSource().getConnectedTo().add(connection.getDestination());
			} catch (Exception e) {
				LOGGER.severe(e.getMessage());
			}
		}
	}

	/**
	 * @param perNo
	 */
	private void addNode(ZestPersonNode childNode, int perNo) {
		ZestPersonNode node;
		Person person = new Person(perNo);
		Name name = new Name(perNo);

		String birth = (person.getPbirth().length() > 0 ? person.getPbirth().substring(1, 5) : "");
		String death = (person.getPdeath().length() > 0 ? "-" + person.getPdeath().substring(1, 5) : "-");
		String contents = (name.getSrnamedisp() + "\n" + birth + death).trim();
		LOGGER.fine("Person " + perNo + ", " + contents + ", " + person.getSex());

		node = new ZestPersonNode(perNo, contents, person.getSex());
		nodes.add(node);
		ZestPersonConnection connect = new ZestPersonConnection(perNo, Integer.toString(perNo), childNode, node);
		connections.add(connect);
		LOGGER.fine("Connection " + perNo + " from " + childNode.getPerNo() + " to " + node.getPerNo());

		if (maxLevels > 0) {
			maxLevels--;
			int father = person.getFather();

			if (father != 0) {
				addNode(node, father);
			}

			int mother = person.getMother();

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
}

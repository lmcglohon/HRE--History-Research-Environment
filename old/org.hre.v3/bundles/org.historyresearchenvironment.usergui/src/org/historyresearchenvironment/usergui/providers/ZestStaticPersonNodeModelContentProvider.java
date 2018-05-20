/**
 * 
 */
package org.historyresearchenvironment.usergui.providers;

import java.util.ArrayList;
import java.util.List;

import org.historyresearchenvironment.usergui.models.ZestPersonConnection;
import org.historyresearchenvironment.usergui.models.ZestPersonNode;

/**
 * @author Michael Erichsen, &copy; HRE Ltd. Erichsen
 *
 */
public class ZestStaticPersonNodeModelContentProvider {
	private final List<ZestPersonConnection> connections;
	private final List<ZestPersonNode> nodes;

	/**
	 * 
	 */
	public ZestStaticPersonNodeModelContentProvider() {
		nodes = new ArrayList<ZestPersonNode>();

		ZestPersonNode node = new ZestPersonNode(0, "Michael\r\nErichsen", "M");
		nodes.add(node);
		node = new ZestPersonNode(1, "Leif\r\nErichsen", "M");
		nodes.add(node);
		node = new ZestPersonNode(2, "Ingeborg Alexia\r\nJensen Thorsager", "F");
		nodes.add(node);
		node = new ZestPersonNode(3, "Villiam Henry\r\nErichsen", "M");
		nodes.add(node);
		node = new ZestPersonNode(4, "Anna Marie Boline\r\nChristiansen", "F");
		nodes.add(node);
		node = new ZestPersonNode(5, "Hugo Bernhard\r\nJensen Thorsager", "M");
		nodes.add(node);
		node = new ZestPersonNode(6, "Tassia\r\nItkis", "F");
		nodes.add(node);

		connections = new ArrayList<ZestPersonConnection>();
		ZestPersonConnection connect = new ZestPersonConnection(1, "Father", nodes.get(0), nodes.get(1));
		connections.add(connect);
		connect = new ZestPersonConnection(2, "Mother", nodes.get(0), nodes.get(2));
		connections.add(connect);
		connect = new ZestPersonConnection(3, "Father", nodes.get(1), nodes.get(3));
		connections.add(connect);
		connect = new ZestPersonConnection(4, "Mother", nodes.get(1), nodes.get(4));
		connections.add(connect);
		connect = new ZestPersonConnection(5, "Father", nodes.get(2), nodes.get(5));
		connections.add(connect);
		connect = new ZestPersonConnection(6, "Mother", nodes.get(2), nodes.get(6));
		connections.add(connect);

		for (final ZestPersonConnection connection : connections) {
			connection.getSource().getConnectedTo().add(connection.getDestination());
		}
	}

	public List<ZestPersonNode> getNodes() {
		return nodes;
	}

}

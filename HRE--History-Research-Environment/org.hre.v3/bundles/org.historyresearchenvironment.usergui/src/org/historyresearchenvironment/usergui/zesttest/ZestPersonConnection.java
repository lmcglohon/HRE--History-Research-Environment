/**
 * 
 */
package org.historyresearchenvironment.usergui.zesttest;

/**
 * @author Michael Erichsen
 *
 */
public class ZestPersonConnection {
	final int perNo;
	final String label;
	final ZestPersonNode source;
	final ZestPersonNode destination;

	/**
	 * @param connId
	 * @param label
	 * @param source
	 * @param destination
	 */
	public ZestPersonConnection(int connId, String label, ZestPersonNode source, ZestPersonNode destination) {
		super();
		this.perNo = connId;
		this.label = label;
		this.source = source;
		this.destination = destination;
	}

	/**
	 * @return the destination
	 */
	public ZestPersonNode getDestination() {
		return destination;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @return the source
	 */
	public ZestPersonNode getSource() {
		return source;
	}

}

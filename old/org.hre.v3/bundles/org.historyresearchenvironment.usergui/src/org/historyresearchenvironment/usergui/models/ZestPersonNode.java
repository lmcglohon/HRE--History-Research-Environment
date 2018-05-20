/**
 * 
 */
package org.historyresearchenvironment.usergui.models;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Michael Erichsen, &copy; HRE Ltd.
 *
 */
public class ZestPersonNode {
	private final int perNo;
	private final String name;
	private final String sex;
	private final List<ZestPersonNode> connections;

	public ZestPersonNode(int perNo, String name, String sex) {
		this.perNo = perNo;
		this.name = name;
		this.sex = sex;
		this.connections = new ArrayList<ZestPersonNode>();
	}

	public List<ZestPersonNode> getConnectedTo() {
		return connections;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the perNo
	 */
	public int getPerNo() {
		return perNo;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
}

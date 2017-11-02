/**
 * 
 */
package org.historyresearchenvironment.usergui.zesttest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Michael Erichsen
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
		this.sex= sex;
		this.connections = new ArrayList<ZestPersonNode>();
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
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
}

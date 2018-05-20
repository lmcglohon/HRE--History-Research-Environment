package org.historyresearchenvironment.usergui.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import org.historyresearchenvironment.usergui.providers.AbstractHreProvider;

/**
 * @author Michael Erichsen, &copy; HRE Ltd.
 *
 */
public class ParentchildrelationshipModel extends AbstractHreProvider {
	private int child;
	private int parent;
	private Vector<Integer> children;

	private final String SELECT = "SELECT CHILD FROM PARENTCHILDRELATIONSHIP WHERE PARENT = ?";
	private final Connection conn = null;
	private PreparedStatement pst = null;

	public ParentchildrelationshipModel() {
	}

	public int getChild() {
		return this.child;
	}

	/**
	 * @return the children
	 */
	public Vector<Integer> getChildren() {
		return children;
	}

	public int getParent() {
		return this.parent;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.usergui.models.AbstractHreProvider#readFromH2(
	 * int)
	 */
	@Override
	public void readFromH2(int perNo) {
		setParent(perNo);
		children = new Vector<Integer>();

		try {
			pst = conn.prepareStatement(SELECT);

			pst.setInt(1, parent);

			final ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				children.add(rs.getInt("CHILD"));
			}
		} catch (final Exception e) {
			e.printStackTrace();
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
		}

		try {
			pst.close();
		} catch (final Exception e) {
			// Do nothing
		}
	}

	public void setChild(int child) {
		this.child = child;
	}

	/**
	 * @param children
	 *            the children to set
	 */
	public void setChildren(Vector<Integer> children) {
		this.children = children;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}
}
/**
 * 
 */
package org.historyresearchenvironment.usergui.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.historyresearchenvironment.tmg.h2.models.Name;
import org.historyresearchenvironment.tmg.h2.models.Person;
import org.historyresearchenvironment.usergui.models.AncestorItem;
import org.historyresearchenvironment.usergui.models.AncestorTreeModel;

/**
 * @author Michael Erichsen
 *
 */
public class AncestorTreeContentProvider implements ITreeContentProvider {

	/**
	 * 
	 */
	public AncestorTreeContentProvider() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof AncestorItem) {
			final AncestorItem a = (AncestorItem) parentElement;
			final List<AncestorItem> b = new ArrayList<AncestorItem>();
			Person person = new Person(a.getFather());
			Name name = new Name(a.getFather());
			AncestorItem item = new AncestorItem(person.getPerNo(), name.getSrnamedisp(), person.getSex(),
					person.getFather(), person.getMother());
			b.add(item);
			person = new Person(a.getMother());
			name = new Name(a.getMother());
			item = new AncestorItem(person.getPerNo(), name.getSrnamedisp(), person.getSex(), person.getFather(),
					person.getMother());
			b.add(item);
			return b.toArray();
		}
		return getElements(parentElement);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getElements(java.lang.Object)
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof AncestorTreeModel) {
			return ((AncestorTreeModel) inputElement).getAncestorItems().getVector().toArray();
		}

		if (inputElement instanceof AncestorItem) {
			final List<AncestorItem> list = new ArrayList<AncestorItem>();
			list.add((AncestorItem) inputElement);
			return list.toArray();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 */
	@Override
	public Object getParent(Object element) {
		if (element == null) {
			return null;
		}

		if (element instanceof AncestorItem) {
			return element;
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 */
	@Override
	public boolean hasChildren(Object element) {
		final AncestorItem item = (AncestorItem) element;

		if (item.getFather() != 0) {
			return true;
		}
		if (item.getMother() != 0) {
			return true;
		}

		return false;
	}
}
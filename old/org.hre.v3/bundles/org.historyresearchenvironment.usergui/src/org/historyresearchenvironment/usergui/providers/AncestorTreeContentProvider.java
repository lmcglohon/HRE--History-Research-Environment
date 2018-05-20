package org.historyresearchenvironment.usergui.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.historyresearchenvironment.tmg.h2.models.Name;
import org.historyresearchenvironment.tmg.h2.models.Person;
import org.historyresearchenvironment.usergui.models.AncestorModel;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class AncestorTreeContentProvider extends AbstractHreProvider implements ITreeContentProvider {
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof AncestorModel) {
			final AncestorModel a = (AncestorModel) parentElement;
			final List<AncestorModel> b = new ArrayList<AncestorModel>();
			Person person = new Person(null, a.getFather());
			Name name = new Name(conn, a.getFather());
			AncestorModel item = new AncestorModel(person.getPerNo(), name.getSrnamedisp(), person.getSex(),
					person.getFather(), person.getMother());
			b.add(item);
			person = new Person(conn, a.getMother());
			name = new Name(conn, a.getMother());
			item = new AncestorModel(person.getPerNo(), name.getSrnamedisp(), person.getSex(), person.getFather(),
					person.getMother());
			b.add(item);
			return b.toArray();
		}
		return getElements(parentElement);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ITreeContentProvider#getElements(java.lang.Object)
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof AncestorTreeProvider) {
			return ((AncestorTreeProvider) inputElement).getAncestorItems().getVector().toArray();
		}

		if (inputElement instanceof AncestorModel) {
			final List<AncestorModel> list = new ArrayList<AncestorModel>();
			list.add((AncestorModel) inputElement);
			return list.toArray();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 */
	@Override
	public Object getParent(Object element) {
		if (element == null) {
			return null;
		}

		if (element instanceof AncestorModel) {
			return element;
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 */
	@Override
	public boolean hasChildren(Object element) {
		final AncestorModel item = (AncestorModel) element;

		if (item.getFather() != 0) {
			return true;
		}
		if (item.getMother() != 0) {
			return true;
		}

		return false;
	}

	/* (non-Javadoc)
	 * @see org.historyresearchenvironment.usergui.providers.AbstractHreProvider#readFromH2(int)
	 */
	@Override
	public void readFromH2(int i) {
		
	}
}
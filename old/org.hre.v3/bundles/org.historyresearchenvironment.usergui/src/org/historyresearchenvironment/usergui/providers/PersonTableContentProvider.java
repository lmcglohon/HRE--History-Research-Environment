/**
 * 
 */
package org.historyresearchenvironment.usergui.providers;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.historyresearchenvironment.usergui.models.PersonTableModel;

/**
 * @author Michael Erichsen, &copy; HRE Ltd. Erichsen
 *
 */
public class PersonTableContentProvider implements IStructuredContentProvider {

	@Override
	public Object[] getElements(Object inputElement) {
		return (PersonTableModel[]) inputElement;
	}

}

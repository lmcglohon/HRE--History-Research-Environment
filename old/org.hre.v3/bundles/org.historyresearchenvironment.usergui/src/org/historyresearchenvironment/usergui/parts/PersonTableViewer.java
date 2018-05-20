/**
 * 
 */
package org.historyresearchenvironment.usergui.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Composite;
import org.historyresearchenvironment.usergui.models.PersonTableModel;
import org.historyresearchenvironment.usergui.providers.PersonTableContentProvider;

/**
 * @author Michael Erichsen, &copy; HRE Ltd. Erichsen
 *
 */
public class PersonTableViewer extends AbstractHREGuiPart {
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.historyresearchenvironment.usergui.parts.AbstractHREGuiPart#
	 * callBusinessLayer(int)
	 */
	@Override
	protected void callBusinessLayer(int i) {

	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		final TableViewer v = new TableViewer(parent);
		v.setLabelProvider(new LabelProvider());
		// for demonstration purposes use custom content provider
		// alternatively you could use ArrayContentProvider.getInstance()
		v.setContentProvider(new PersonTableContentProvider());
		final PersonTableModel[] model = createModel();
		v.setInput(model);
		v.getTable().setLinesVisible(true);
	}

	/**
	 * @return
	 */
	private PersonTableModel[] createModel() {
		final PersonTableModel[] elements = new PersonTableModel[10];

		for (int i = 0; i < 10; i++) {
			elements[i] = new PersonTableModel(i);
		}

		return elements;
	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.usergui.parts.AbstractHREGuiPart#updateGui()
	 */
	@Override
	protected void updateGui() {

	}
}

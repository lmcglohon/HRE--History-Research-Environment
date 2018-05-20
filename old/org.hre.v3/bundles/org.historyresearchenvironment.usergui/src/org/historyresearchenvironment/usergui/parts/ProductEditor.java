package org.historyresearchenvironment.usergui.parts;

import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class ProductEditor {
	public static final String ID = "rcp_demo.Editor.product";
	private static final String[] FILTER_NAMES = { "Images(*.jpg)", "Images(*.jpeg)", "Images(*.png)",
			"All Files (*.*)" };
	// These filter extensions are used to filter which files are displayed.
	private static final String[] FILTER_EXTS = { "*.jpg", "*.jpeg", "*.png", "*.*" };

	private Text text;

	private CLabel lbl_image_text;

	/**
	 * @wbp.parser.entryPoint
	 */
	@PostConstruct
	public void createPartControl(Composite parent) {

		parent.setLayout(null);
		// Layout with absolute positioning components.

		text = new Text(parent, SWT.BORDER);
		text.setBounds(25, 57, 169, 19);

		final Button btnOpen = new Button(parent, SWT.NONE);
		btnOpen.setText("open");
		btnOpen.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				// FileDialog dialog = new
				// FileDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
				// SWT.OPEN);

				final Display display = Display.getDefault();
				final Shell shell = new Shell(display);
				final FileDialog dialog = new FileDialog(shell, SWT.OPEN);
				dialog.setFilterNames(FILTER_NAMES);
				dialog.setFilterExtensions(FILTER_EXTS);
				final String result = dialog.open();
				if (result != null) {
					text.setText(result);
					final Image image = SWTResourceManager.getImage(result);
					ImageData imgData = image.getImageData();
					imgData = imgData.scaledTo(200, 200);

					final ImageLoader imageLoader = new ImageLoader();
					imageLoader.data = new ImageData[] { imgData };
					imageLoader.save(result, SWT.IMAGE_COPY);

					System.out.println(imgData.width + "....." + imgData.height);
					lbl_image_text.setBounds(25, 88, imgData.width + 10, imgData.height + 10);
					// Image size set to Label
					// lbl_image_text.setBounds(25,88,image.getBounds().width+10,image.getBounds().height+10);
					lbl_image_text.setImage(SWTResourceManager.getImage(result));
				}
			}
		});
		btnOpen.setText("open");
		lbl_image_text = new CLabel(parent, SWT.Resize);
	}
}

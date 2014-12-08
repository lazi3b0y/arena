package GUI.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import GUI.DefineAdvSchemeDialog;
import application.AdvertisementsController;

public class UsersMenu extends JMenuBar implements ActionListener {

	private static final long serialVersionUID = 1L;
	/* File menu */
	private JMenu file = new JMenu("File");
	private JMenuItem exit = new JMenuItem("Exit");
	private JMenuItem settings = new JMenuItem("Settings");
	
	private JMenu advertisements = new JMenu("Advertisements");
	private JMenuItem defineAdvScheme = new JMenuItem("Define Advertisement Scheme");
	private JMenuItem uploadAdv = new JMenuItem("Upload Advertisement");
	private JMenuItem pendingAdv = new JMenuItem("Pending Advertisements");
	
	// Controllers
	private final AdvertisementsController advController = new AdvertisementsController();
	
	public UsersMenu() {
		file.add(settings);
		file.add(exit);
		
		/* Note: Some menu options should only be available to advertisers and some to operators, for now I'll just add all here under "Advertisements".
		 * 
		 * For instance, pending advertisements option should only be visible to operators, etc.
		 * 
		 *  */
		advertisements.add(defineAdvScheme);
		advertisements.add(uploadAdv);
		advertisements.add(pendingAdv);
		
		// Listeners
		defineAdvScheme.addActionListener(this);
		
		// Add menus to menu bar
		add(file);
		add(advertisements);
		
		setSettingsListener();
	}
	
	private final void setSettingsListener() {
		settings.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//Inte viktigt.
				//Kan läggas till i iteration 3 om tid finns.
				//Ny ruta med inställningar ska visa sig  när man trycker på denna knapp
			}
		});
	}
	
	/* 
	 * Returns exit item
	 * Typically the main frame has enough information to do something worthy with any event on this item
	 */
	public JMenuItem getExitItem() {
		return exit;
	}
	
	public JMenuItem getSettingsItem() {
		return settings;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == defineAdvScheme) {
			new DefineAdvSchemeDialog(advController);
		}
	}
}

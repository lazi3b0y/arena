package GUI.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class UsersMenu extends JMenuBar {
	
	/* File menu */
	private JMenu file = new JMenu("File");
	private JMenuItem exit = new JMenuItem("Exit");
	private JMenuItem settings = new JMenuItem("Settings");
	
	public UsersMenu() {
		file.add(settings);
		file.add(exit);
		
		add(file);
		
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
	 * Ttypically the main frame has enough information to do something worthy with any event on this item
	 */
	public JMenuItem getExitItem() {
		return exit;
	}
	
	public JMenuItem getSettingsItem() {
		return settings;
	}
}

package GUI.menu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class UsersMenu extends JMenuBar {
	
	/* File menu */
	private JMenu file 			= new JMenu("File");
	private JMenuItem exit 		= new JMenuItem("Exit");
	private JMenuItem settings  = new JMenuItem("Settings");
	
	public UsersMenu() {
		file.add(settings);
		file.add(exit);
		
		add(file);
	}
}

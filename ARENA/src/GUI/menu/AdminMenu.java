package GUI.menu;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class AdminMenu extends UsersMenu {
	
	private JMenu administration = new JMenu("Administration");
	private JMenuItem installGame = new JMenuItem("Install game");
	private JMenuItem handleGames = new JMenuItem("Handle games");
	
	public AdminMenu() {
		administration.add(installGame);
		administration.add(handleGames);
		
		super.add(administration);
	}
	
}

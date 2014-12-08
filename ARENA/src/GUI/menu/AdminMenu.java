package GUI.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import application.GameAdminController;
import GUI.InstallGameDialog;

public class AdminMenu extends UsersMenu {
	
	private JMenu administration = new JMenu("Administration");
	private JMenuItem installGame = new JMenuItem("Install game");
	private JMenuItem handleGames = new JMenuItem("Handle games");
	
	// Controllers
	private GameAdminController gameController = new GameAdminController();
	
	public AdminMenu() {
		administration.add(installGame);
		administration.add(handleGames);
		
		super.add(administration);
		
		addInstallGameListener();
	}
	
	private void addInstallGameListener() {
		installGame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new InstallGameDialog(gameController);
			}	
		});
	}
	
}

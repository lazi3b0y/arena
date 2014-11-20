package application;

import domain.GameInstallationManager;

/* The purpose of this class is to delegate responsibility to domain layer for game actions that require privilegies. */
public class GameAdminController {
	
	public GameAdminController() {
		
	}
	
	public void installNewGame() {
		GameInstallationManager installationManager = new GameInstallationManager(null);
	}
}
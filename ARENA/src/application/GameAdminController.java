package application;

import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;

import technical.FileUploader;
import domain.GameInstallationManager;

/* The purpose of this class is to delegate responsibility to domain layer for game actions that require privilegies. */
public class GameAdminController {
	
	public void installNewGame(String name, String description, File file) {
		GameInstallationManager installationManager = new GameInstallationManager(null, null, null);
		try {
			installationManager.install(new FileUploader(null, 3232, file));
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
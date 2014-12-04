package application;

import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;

import domain.InstallGameManager;

/* 
 * Controller that handles each use case associated with Game administration (installing, handling, etc.) and responds to system events. 
 * It can be viewed as a facade into the domain layer, which allows to easily adapt to any possible 
 * requirement change (such as calls to remote services, etc.). 
 * 
 * */

public class GameAdminController {

	public void installNewGame(String name, String description, File file) {
		
		InstallGameManager installationManager = new InstallGameManager(name, description, file);
		try {
			installationManager.install();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
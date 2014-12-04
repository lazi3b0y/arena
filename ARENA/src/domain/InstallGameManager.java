package domain;

import java.io.File;
import java.io.IOException;

import datalayer.DAOFactory;
import datalayer.IGameDAO;
import technical.FileUploader;
import technical.IFileUploader;

/* GameInstallationManager handles business logic for installing a game. */

public class InstallGameManager {
	private Game game;
	private File file;
	
	public InstallGameManager(String name, String description, File file) {
		this.game = new Game(name, description);
		this.setFile(file);
	}
	
	/**
	 * Installs a game by uploading the game files and storing it in a database. 
	 * <p>
	 *
	 * @throws         IOException
	 */
	public void install() throws IOException {
		
		/* Business steps */
		
		/* TODO: Since we don't want high coupling between our domain objects and this file uploader, 
		 * implementing a simple strategy pattern and a factory class might be a better idea.  */
		IFileUploader fileUploader = new FileUploader(null, 3232, file);
		
		/* Data access object for CRUD operations */
		IGameDAO gameDAO = DAOFactory.getGameDAO();
		gameDAO.addGame(game);
		
		// Make this asynchronous(?)
		fileUploader.upload();
		
		// TODO make sure to save the correct path for the uploaded files
	}


	/**
	 * Returns the file 
	 * <p>
	 *
	 * @return         File
	 */
	public File getFile() {
		return file;
	}

	/**
	 * Sets a file object
	 * <p>
	 *
	 */
	public void setFile(File file) {
		this.file = file;
	}
}
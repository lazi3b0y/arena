package domain;

import java.io.File;
import java.io.IOException;

import datalayer.DAOFactory;
import datalayer.IGameDAO;
import technical.IFileUploader;

/* GameInstallationManager handles business logic for installing a game. */

public class GameInstallationManager {
	
	private String name, description;
	private File file;
	
	public GameInstallationManager(String name, String description, File file) {
		this.setName(name);
		this.setDescription(description);
		this.setFile(file);
	}
	
	public void install(IFileUploader fileUploader) throws IOException {
		IGameDAO gameDAO = DAOFactory.getGameDAO();
		fileUploader.upload();
		gameDAO.addGame(new Game(name, description));
		
		// TODO make sure to save the correct path for the uploaded files
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
}
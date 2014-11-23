package datalayer;

public class DAOFactory {

	/* Stateless */
	private DAOFactory() { }
	
	private static IGameDAO gameDAO = new GameDAO();
	
	public static IGameDAO getGameDAO() {
		return gameDAO;
	}
}

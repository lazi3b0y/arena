package datalayer;

public class DAOFactory {

	/* Stateless */
	private DAOFactory() { }
	
	private static IGameDAO gameDAO = null;
	private static IAdvertisementDAO advertisementDAO = null;
	
	public static IGameDAO getGameDAO() {
		if (gameDAO == null) gameDAO = new GameDAO();
		return gameDAO;
	}
	
	public static IAdvertisementDAO getAdvertisementDAO() {
		if (advertisementDAO == null) advertisementDAO = new AdvertisementDAO();
		return advertisementDAO;
	}
	
	
}

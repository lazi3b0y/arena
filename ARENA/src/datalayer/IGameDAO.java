package datalayer;

import java.util.List;

import domain.Game;

public interface IGameDAO {
	
	public void addGame(Game game);
	public List<Game> getGames();
	public Game getGame(Game game);
	public void deleteGame(Game game);
	public void updateGame(int gameID, Game game);

}

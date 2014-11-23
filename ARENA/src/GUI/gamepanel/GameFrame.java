package GUI.gamepanel;

import java.awt.*;
import javax.swing.*;

public class GameFrame extends JPanel{	
	private GameRow[] games;
	private int xCord, yCord;
	
	public GameFrame() {
		setLayout(null);
		
		games = new GameRow[9];
		xCord = 0;
		yCord = 0;
		
		for (int i = 0; i < games.length; i++) {
			games[i] = new GameRow("Game " + i);
			games[i].setBounds(xCord, yCord, 600, 50);
			yCord += 50;
			add(games[i]);
		}
	}
	
	public void AddGameRow() {
		
	}
}	



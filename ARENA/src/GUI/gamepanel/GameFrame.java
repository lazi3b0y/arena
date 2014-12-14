package GUI.gamepanel;

import java.awt.*;
import javax.swing.*;

public class GameFrame extends JPanel{	
	private GameRow[] games;
	private int xCord, yCord;
	private JButton JoinGame;
	private JButton CreateGame;
	private JLabel FourInRow;
	
	public GameFrame() {
		
		setLayout(null);
		
		FourInRow = new JLabel("Four In Row:");
		FourInRow.setBounds(65, 0, 80, 50);
		add(FourInRow);
		
		JoinGame = new JButton("Join game!");
		JoinGame.setBounds(200, 0, 200, 50);
		add(JoinGame);
		
		CreateGame = new JButton("Create game!");
		CreateGame.setBounds(400, 0, 200, 50);
		add(CreateGame);
		/*
		games = new GameRow[9];
		xCord = 0;
		yCord = 0;
		for (int i = 0; i < games.length; i++) {
			games[i] = new GameRow("Game " + i);
			games[i].setBounds(xCord, yCord, 600, 50);
			yCord += 50;
			add(games[i]);
		}*/
	}
	
	public void AddGameRow() {
		
	}
}	



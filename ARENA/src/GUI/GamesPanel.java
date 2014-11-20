package GUI;

import java.awt.*;
import javax.swing.*;

public class GamesPanel extends JPanel{	
	private JButton game1, game2, game3, game4;
	private JLabel g1, g2, g3, g4, g5;
	
	public GamesPanel() {
		setLayout(null);
		
		game1 = new JButton("Play Game");
		game1.setBounds(500, 0, 100, 50);
		g1  = new JLabel("Game 1", SwingConstants.CENTER);
		g1.setBounds(0, 0, 80, 50);
		add(game1);
		add(g1);
		
		game2 = new JButton("Play Game");
		game2.setBounds(500, 50, 100, 50);
		g2  = new JLabel("Game 2", SwingConstants.CENTER);
		g2.setBounds(0, 50, 80, 50);
		add(game2);
		add(g2);
		
		game3 = new JButton("Play Game");
		game3.setBounds(500, 100, 100, 50);
		g3  = new JLabel("Game 3", SwingConstants.CENTER);
		g3.setBounds(0, 100, 80, 50);
		add(game3);
		add(g3);
		
		game4 = new JButton("Play Game");
		game4.setBounds(500, 150, 100, 50);
		g4  = new JLabel("Game 4", SwingConstants.CENTER);
		g4.setBounds(0, 150, 80, 50);
		add(game4);
		add(g4);
	}
}	



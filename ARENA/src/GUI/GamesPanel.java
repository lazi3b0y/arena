package GUI;

import java.awt.*;
import javax.swing.*;

public class GamesPanel extends JPanel{
	private JButton game1, game2, game3, game4;
	private JLabel g1, g2, g3, g4, g5;
	
	public GamesPanel() {
		//1eakjfhkjghygfs
		setLayout(null);
		game1 = new JButton("1");
		game1.setBounds(550, 0, 50, 50);
		game2 = new JButton("2");
		game2.setBounds(550, 50, 50, 50);
		game3 = new JButton("3");
		game3.setBounds(550, 100, 50, 50);
		game4 = new JButton("4");
		game4.setBounds(550, 150, 50, 50);
		g1  = new JLabel("Game 1 ", SwingConstants.CENTER);
		g1.setBounds(0, 0, 80, 50);
		g2  = new JLabel("Game 2 ", SwingConstants.CENTER);
		g2.setBounds(0, 50, 80, 50);
		g3  = new JLabel("Game 3 ", SwingConstants.CENTER);
		g3.setBounds(0, 100, 80, 50);
		g4  = new JLabel("Game 4 ", SwingConstants.CENTER);
		g4.setBounds(0, 150, 80, 50);
	 	add(game1);
	 	add(game2);
	 	add(game3);
	 	add(game4);
	 	add(g1);
	 	add(g2);
	 	add(g3);
	 	add(g4);
	 	
	}
}	



package GUI.gamepanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameFrame extends JPanel{	
	private JButton JoinGame;
	private JButton CreateGame;
	private JLabel FourInRow;
	
	public GameFrame() {
		
		setLayout(null);
		GameListeners();
		
		FourInRow = new JLabel("Four In Row:");
		FourInRow.setBounds(65, 0, 80, 50);
		add(FourInRow);
		
		JoinGame = new JButton("Join game!");
		JoinGame.setBounds(200, 0, 200, 50);
		add(JoinGame);
		
		CreateGame = new JButton("Create game!");
		CreateGame.setBounds(400, 0, 200, 50);
		add(CreateGame);
		
	}
	
	private void GameListeners() {
		
		JoinGame.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			}
		});
		
		CreateGame.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			}
		});
		
	}
}	



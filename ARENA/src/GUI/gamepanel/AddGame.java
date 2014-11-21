package GUI.gamepanel;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class AddGame extends JPanel{
	private JButton playBtn;
	private JLabel gameName;
	
	public AddGame(String gameName) {
		setLayout(null);

		playBtn = new JButton("Play Game");
		playBtn.setBounds(500, 0, 100, 50);
		add(playBtn);
		this.gameName = new JLabel(gameName, SwingConstants.CENTER);
		this.gameName.setBounds(0, 0, 80, 50);
		add(this.gameName);
	}
}

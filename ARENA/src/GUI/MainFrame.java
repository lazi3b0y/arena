package GUI;

import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;


public class MainFrame extends JFrame{ 
	private static final long serialVersionUID = 1L;
	GridBagConstraints cons;
	JPanel contentPane;
	JPanel topBar;
	JTabbedPane tabPanel;
	JButton logOut;
	GamesPanel gamesPanel;
	NewsPanel newsPanel;
	ProfilePanel profilePanel;
	
	
	public MainFrame() {
		super("ARENA");
		cons = new GridBagConstraints();
		contentPane = new JPanel(new GridBagLayout());
		topBar = new JPanel();
		tabPanel = new JTabbedPane();
		logOut = new JButton("Log out");
		gamesPanel = new GamesPanel();
		newsPanel = new NewsPanel();
		profilePanel = new ProfilePanel();
		
		tabPanel.addTab("<html><body><table width='172'>Games</table></body></html>", null, gamesPanel, "Games Library");
		tabPanel.addTab("<html><body><table width='172'>News</table></body></html>", null, newsPanel, "News and updates");
		tabPanel.addTab("<html><body><table width='172'>Profile</table></body></html>", null, profilePanel, "Profile and profile settings");
		cons.gridx = 0;
		cons.gridy = 0;
		cons.gridheight = 2;
		cons.fill = GridBagConstraints.HORIZONTAL;
		cons.weightx = 0.75;
		cons.ipady = 350;
		contentPane.add(tabPanel, cons);
		
		cons.gridx = 1;
		cons.gridheight = 1;
		cons.weightx = 0.25;
		cons.ipady = 5;
		contentPane.add(logOut, cons);
		
		add(contentPane);
		setSize(800, 500);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
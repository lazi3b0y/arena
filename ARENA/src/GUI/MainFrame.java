package GUI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	GridBagConstraints cons;
	JPanel contentPane;
	JPanel topBar;
	JTabbedPane tabPanel;
	JButton logOut, testKnapp;
	JLabel ads;
	ImageIcon adsImage;
	GamesPanel gamesPanel;
	NewsPanel newsPanel;
	ProfilePanel profilePanel;

	public MainFrame() {
		super("ARENA");
		adsImage = new ImageIcon("ads.jpg");
		cons = new GridBagConstraints();
		contentPane = new JPanel(new GridBagLayout());
		topBar = new JPanel();
		tabPanel = new JTabbedPane();
		logOut = new JButton("Log out");
		testKnapp = new JButton("TESTING");
		ads = new JLabel(/* "Advertisementt", SwingConstants.CENTER */);
		gamesPanel = new GamesPanel();
		newsPanel = new NewsPanel();
		profilePanel = new ProfilePanel();

		ads.setIcon(adsImage);
		tabPanel.addTab("<html><body><table width='fit'>Games</table></body></html>", null, gamesPanel, "Games Library");
		tabPanel.addTab("<html><body><table width='fit'>News</table></body></html>", null, newsPanel, "News and updates");
		tabPanel.addTab("<html><body><table width='fit'>Profile</table></body></html>", null, profilePanel, "Profile and profile settings");
		cons.gridx = 0;
		cons.gridy = 0;
		cons.gridheight = 2;
		cons.fill = GridBagConstraints.BOTH;
		cons.anchor = GridBagConstraints.NORTH;
		cons.weightx = 0.75;
		cons.weighty = 1.0;
		contentPane.add(tabPanel, cons);

		cons.gridx = 1;
		cons.gridheight = 1;
		cons.weightx = 0.25;
		cons.weighty = 0.01;
		contentPane.add(logOut, cons);

		cons.gridy = 1;
		cons.gridheight = 1;
		cons.weightx = 0.25;
		cons.weighty = 0.99;
		contentPane.add(ads, cons);

		add(contentPane);
		setSize(800, 500);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

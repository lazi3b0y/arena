package GUI;

import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	GridBagConstraints cons;
	JPanel contentPane;
	JPanel topBar;
	JTabbedPane tabPanel;
	JButton Games, News, Profile, logOut, testKnapp;
	JLabel ads;
	ImageIcon adsImage;
	GamesPanel gamesPanel;
	NewsPanel newsPanel;
	ProfilePanel profilePanel;

	public MainFrame() {
		super("ARENA");
		adsImage = new ImageIcon("src/GUI/ads.jpg");
		Games = new JButton("Games");
		News = new JButton("News");
		Profile = new JButton("Profile");
		logOut = new JButton("Log out");
		ads = new JLabel(adsImage/*"Advertisementt", SwingConstants.CENTER*/);
		contentPane = new JPanel();
		gamesPanel = new GamesPanel();
		newsPanel = new NewsPanel();
		profilePanel = new ProfilePanel();
		
		Games.setBounds(0, 0, 200, 50);
		add(Games);
		News.setBounds(200,0,200,50);
		add(News);
		Profile.setBounds(400, 0, 200, 50);
		add(Profile);
		logOut.setBounds(600, 0, 200, 50);
		add(logOut);
		ads.setBounds(600, 50, 200, 350);
		add(ads);
		contentPane.setBounds(0, 50, 600, 450);
		contentPane.add(gamesPanel);
		add(contentPane);
		
		ActionListeners();
		
		setLayout(null);
		setSize(800, 500);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void ActionListeners(){
		
		Games.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.revalidate();
				contentPane.repaint();
				contentPane.add(gamesPanel);
			}
		});
		News.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.revalidate();
				contentPane.repaint();
				contentPane.add(newsPanel);
			}
		});
		Profile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.revalidate();
				contentPane.repaint();
				contentPane.add(profilePanel);
			}
		});
		logOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//LoggaUtDelen
			}
		});
		
	}
}

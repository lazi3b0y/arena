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
	JPanel contentPane;
	JButton Games, News, Profile, logOut;
	JLabel ads;
	ImageIcon adsImage;
	GamesPanel gamesPanel;
	NewsPanel newsPanel;
	ProfilePanel profilePanel;

	public MainFrame() {
		super("ARENA");
		adsImage = new ImageIcon("src/GUI/ads.png");
		Games = new JButton("Games");
		News = new JButton("News");
		Profile = new JButton("Profile");
		logOut = new JButton("Log out");
		ads = new JLabel(adsImage);
		contentPane = new JPanel();
		gamesPanel = new GamesPanel();
		newsPanel = new NewsPanel();
		profilePanel = new ProfilePanel();
		
		setLayout(null);
		setSize(800, 500);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Games.setBounds(0, 0, 200, 50);
		add(Games);
		News.setBounds(200, 0, 200, 50);
		add(News);
		Profile.setBounds(400, 0, 200, 50);
		add(Profile);
		logOut.setBounds(600, 0, 200, 50);
		add(logOut);
		ads.setBounds(600, 50, 200, 450);
		add(ads);
		gamesPanel.setBounds(0, 50, 600, 450);
		newsPanel.setBounds(0, 50, 600, 450);
		profilePanel.setBounds(0, 50, 600, 450);
		add(gamesPanel);
		add(contentPane);
		
		ActionListeners();
	}
	public void ActionListeners(){
		
		Games.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(newsPanel);
				remove(profilePanel);
				add(gamesPanel);
				revalidate();
				repaint();
			}
		});
		News.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(profilePanel);
				remove(gamesPanel);
				add(newsPanel);
				revalidate();
				repaint();
			}
		});
		Profile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(gamesPanel);
				remove(newsPanel);
				add(profilePanel);
				revalidate();
				repaint();
			}
		});
		logOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//FIX ME
				//Dialog som frågar om man är säker på att man vill logga ut. 
				//Om användaren väljer Ja så ska huvudfönstret stängas ner och login rutan visas på nytt.
				dispose();
			}
		});
	}
}

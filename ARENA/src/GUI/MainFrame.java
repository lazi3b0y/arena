package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private static final int windowWidth = 800, windowHeight = 500;
	
	private ImageIcon ad;
	private JButton gamesBtn, newsBtn, profileBtn, logOutBtn;
	private JLabel adContainer;
	private JMenuBar menuBar;
	private JMenu file;
	private JMenuItem settings, exit;
	private GamesPanel gamesPanel;
	private NewsPanel newsPanel;
	private ProfilePanel profilePanel;

	public MainFrame() {
		super("ARENA");
		ad = new ImageIcon("src/GUI/ads.png");
		gamesBtn = new JButton("Games");
		newsBtn = new JButton("News");
		profileBtn = new JButton("Profile");
		logOutBtn = new JButton("Log out");
		adContainer = new JLabel(ad);
		menuBar = new JMenuBar();
		file = new JMenu("File");
		settings = new JMenuItem("Settings");
		exit = new JMenuItem("Exit");
		gamesPanel = new GamesPanel();
		newsPanel = new NewsPanel();
		profilePanel = new ProfilePanel();
		
		setLayout(null);
		setSize(windowWidth, windowHeight);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		gamesBtn.setBounds(0, 20, 200, 30);
		add(gamesBtn);
		
		newsBtn.setBounds(200, 20, 200, 30);
		add(newsBtn);
		
		profileBtn.setBounds(400, 20, 200, 30);
		add(profileBtn);
		
		logOutBtn.setBounds(600, 20, 200, 30);
		add(logOutBtn);
		
		adContainer.setBounds(600, 50, 200, 450);
		add(adContainer);
		
		newsPanel.setBounds(0, 50, 600, 450);
		profilePanel.setBounds(0, 50, 600, 450);
		gamesPanel.setBounds(0, 50, 600, 450);
		add(gamesPanel);
		
		file.add(settings);
		file.add(new JSeparator());
		file.add(exit);
		menuBar.add(file);
		menuBar.setBounds(0, 0, windowWidth, 20);
		add(menuBar);
		
		InitActionListeners();
	}
	
	public void InitActionListeners(){
		
		/**
		 * JButton ActionListeners
		 */
		
		gamesBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(newsPanel);
				remove(profilePanel);
				add(gamesPanel);
				revalidate();
				repaint();
			}
		});
		newsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(profilePanel);
				remove(gamesPanel);
				add(newsPanel);
				revalidate();
				repaint();
			}
		});
		profileBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(gamesPanel);
				remove(newsPanel);
				add(profilePanel);
				revalidate();
				repaint();
			}
		});
		logOutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//FIX ME
				//Dialog som frågar om man är säker på att man vill logga ut. 
				//Om användaren väljer Ja så ska huvudfönstret stängas ner och login rutan visas på nytt.
				dispose();
			}
		});
		
		/**
		 * JMenuItem ActionListeners
		 */
		
		settings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Inte viktigt.
				//Kan läggas till i iteration 3 om tid finns.
				//Ny ruta med inställningar ska visa sig när man tycker på denna knappen.
			}
		});
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}

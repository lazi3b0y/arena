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
import GUI.gamepanel.*;
import GUI.menu.AdminMenu;
import GUI.menu.UsersMenu;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private static final int windowWidth = 800, windowHeight = 528;
	
	private ImageIcon ad;
	private JButton gamesBtn, newsBtn, profileBtn, logOutBtn;
	private JLabel adContainer;
	private JMenuBar menuBar;
	private GameFrame gamesPanel;
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
		gamesPanel = new GameFrame();
		newsPanel = new NewsPanel();
		profilePanel = new ProfilePanel();
		menuBar = new AdminMenu();
		
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
		menuBar.add(new AdminMenu());
		menuBar.setBounds(0, 0, windowWidth, 20);
		add(menuBar);
		
		//Menyn verkade inte vilja visa sig direkt, så la till dessa för att få menyn att visa sig ordentligt.
		revalidate();
		repaint();
		
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
				//Dialog som frï¿½gar om man ï¿½r sï¿½ker pï¿½ att man vill logga ut. 
				//Om anvï¿½ndaren vï¿½ljer Ja sï¿½ ska huvudfï¿½nstret stï¿½ngas ner och login rutan visas pï¿½ nytt.
				dispose();
			}
		});
		
		/**
		 * Exit menu item Action listener
		 */
		
		((UsersMenu)menuBar).getExitItem().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}

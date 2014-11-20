package GUI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainFrame extends JFrame{ 
	private static final long serialVersionUID = 1L;
	GridBagConstraints cons = new GridBagConstraints();
	JPanel contentPane = new JPanel(new GridBagLayout());
	JPanel topBar = new JPanel();
	JPanel newsBar = new JPanel();
	JButton Games = new JButton("Games");
	JButton News = new JButton("News");
	JButton Profile = new JButton("Profile");
	JButton LogOut = new JButton("Log Out");
	JButton asd = new JButton("ASD");

	public MainFrame() {
		super("ARENA");
		
		/*topBar.setLayout(new GridLayout(0,4));
		topBar.add(Games);
		topBar.add(News);
		topBar.add(Profile);
		topBar.add(LogOut);
		contentPane.add(topBar, BorderLayout.NORTH);
		newsBar.setLayout(new GridBagLayout());
		cons.fill = GridBagConstraints.VERTICAL;
		cons.gridx = -1;
		cons.gridy = 0;
		newsBar.add(newsLabel, cons);
		contentPane.add(newsBar, BorderLayout.WEST);*/
		cons.weightx = 0.5;
		cons.gridx = 0;
		cons.gridy = 0;
		cons.ipady = 50;
		cons.gridwidth = 2;
		cons.fill = GridBagConstraints.HORIZONTAL;
		contentPane.add(Games, cons);
		cons.gridx = 2;
		contentPane.add(News, cons);
		cons.gridx = 4;
		contentPane.add(Profile, cons);
		cons.gridx = 6;
		contentPane.add(LogOut, cons);
		cons.gridx = 0;
		cons.gridy = 1;
		cons.gridwidth = 4;
		cons.ipady = 0;
		//contentPane.add(newsLabel, cons);
		add(contentPane);
		setSize(800, 500);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
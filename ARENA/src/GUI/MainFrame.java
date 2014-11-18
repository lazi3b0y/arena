package GUI;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;


public class MainFrame extends JFrame{ 
	private static final long serialVersionUID = 1L;
	private ImageIcon image = new ImageIcon(getClass().getResource("ThumbsUp.jpg"));
	GridBagConstraints cons = new GridBagConstraints();
	JLabel newsLabel = new JLabel(image);
	JPanel contentPane = new JPanel(new BorderLayout());
	JPanel topBar = new JPanel();
	JPanel newsBar = new JPanel();
	JButton Games = new JButton("Games");
	JButton News = new JButton("News");
	JButton Profile = new JButton("Profile");
	JButton LogOut = new JButton("Log Out");

	public MainFrame() {
		super("ARENA");
		topBar.setLayout(new GridLayout(0,4));
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
		contentPane.add(newsBar, BorderLayout.WEST);
		add(contentPane);
		setSize(800, 500);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
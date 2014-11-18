package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{ 
	JPanel contentPane = new JPanel(new BorderLayout());
	JPanel topBar = new JPanel();
	JButton Games = new JButton("Games");
	JButton News = new JButton("News");
	JButton Profile = new JButton("Profile");
	JButton LogOut = new JButton("Log Out");
	
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		super("ARENA");
		topBar.setLayout(new GridLayout(0,4));
		topBar.add(Games);
		topBar.add(News);
		topBar.add(Profile);
		topBar.add(LogOut);
		contentPane.add(topBar, BorderLayout.NORTH);
		add(contentPane);
		setSize(800, 600);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame{ 
	JButton testKnapp = new JButton("TESTING TESTING");
	
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		
		super("ARENA");
		add(testKnapp);
		setSize(800, 600);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
}
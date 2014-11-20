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
	JButton placeHolder;
	JButton placeHolder2;
	JButton placeHolder3;
	JButton placeHolder4;
	
	public MainFrame() {
		super("ARENA");
		cons = new GridBagConstraints();
		contentPane = new JPanel(new GridBagLayout());
		topBar = new JPanel();
		tabPanel = new JTabbedPane();
		logOut = new JButton("Log out");
		placeHolder = new JButton("Placeholder");
		placeHolder2 = new JButton("Placeholder2");
		placeHolder3 = new JButton("Placeholder3");
		placeHolder4 = new JButton("Placeholder4");
		
		tabPanel.addTab("<html><body><table width='172'>Games</table></body></html>", null, placeHolder, "Does nothing");
		tabPanel.addTab("<html><body><table width='172'>News</table></body></html>", null, placeHolder2, "Does twice as much nothing");
		tabPanel.addTab("<html><body><table width='172'>Profile</table></body></html>", null, placeHolder3, "Still does nothing");
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
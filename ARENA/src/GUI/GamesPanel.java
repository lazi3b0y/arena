package GUI;

import java.awt.*;
import javax.swing.*;

public class GamesPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	private JPanel mainPanel = new JPanel();
	private final Dimension SIZE_PANEL = new Dimension(667, 500);
	private JButton test2 = new JButton("1");
	private JButton test3 = new JButton("2");
	private JButton test4 = new JButton("3");
	private JButton test5 = new JButton("4");
	private JLabel testa  = new JLabel("ett spel man kan spela");
	JPanel contentPane    = new JPanel(new BorderLayout());
	JPanel textFields 	  = new JPanel(new BorderLayout());
	
	public GamesPanel() {
		mainPanel.setLayout(new GridLayout(5,0));
	 	mainPanel.add(test2);
	 	mainPanel.add(test3);
	 	mainPanel.add(test4);
	 	mainPanel.add(test5);
	 	textFields.add(testa);
	 	mainPanel.setSize(50, 50);
	 	
	 	contentPane.add(textFields,BorderLayout.WEST);
	 	contentPane.add(mainPanel,BorderLayout.EAST);
	 	
	 	add(contentPane);
	}
}	



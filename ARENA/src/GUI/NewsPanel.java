package GUI;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class NewsPanel extends JPanel{
	JLabel text;
	
	public NewsPanel() {
		setLayout(null);
		text = new JLabel("Nyheter");
		text.setBounds(0,0,200,15);
		add(text);
	}
}

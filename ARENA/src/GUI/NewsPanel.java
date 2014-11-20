package GUI;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class NewsPanel extends JPanel{
	JLabel text;
	
	public NewsPanel() {
		text = new JLabel("Nyheter");
		add(text);
	}
}

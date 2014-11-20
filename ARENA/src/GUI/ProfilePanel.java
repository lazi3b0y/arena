package GUI;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProfilePanel extends JPanel{
	JLabel text;
	
	public ProfilePanel(){
		setLayout(null);
		text = new JLabel("Profil");
		text.setBounds(0,0,200,15);
		add(text);
	}
	
	
}

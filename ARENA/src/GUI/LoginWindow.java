package GUI;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LoginWindow extends JFrame{
	private JPanel container;
	
	public void LoginWindow() {
		setVisible(true);
		setSize(300, 300);
		container = new JPanel(new BorderLayout());
	}
}

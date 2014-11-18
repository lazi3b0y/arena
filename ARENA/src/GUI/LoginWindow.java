package GUI;

import java.awt.*;
import javax.swing.*;

public class LoginWindow extends JFrame{
	private JPanel container;
	private JTextField username;
	
	public void LoginWindow() {
		container = new JPanel(new BorderLayout());
		username = new JTextField();
		container.add(username);
		add(container);
		setVisible(true);
		setSize(300, 300);
	}
}
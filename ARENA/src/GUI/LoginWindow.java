package GUI;

import java.awt.*;
import javax.swing.*;

public class LoginWindow extends JFrame{
	private JPanel container;
	private JTextField username;
	private JTextField password;
	
	public LoginWindow() {
		container = new JPanel(new BorderLayout());
		username = new JTextField();
		password = new JTextField();
		container.add(username, BorderLayout.NORTH);
		container.add(password, BorderLayout.SOUTH);
		add(container);
		setVisible(true);
		setSize(300, 300);
	}
}
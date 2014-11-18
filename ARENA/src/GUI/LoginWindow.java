package GUI;

import java.awt.*;
import javax.swing.*;

public class LoginWindow extends JFrame{
	private JPanel contentPane;
	private JPanel username;
	private JPanel password;
	private JLabel usernameLabel;
	private JLabel passwordLabel;
	private JTextField usernameField;
	private JTextField passwordField;
	
	public LoginWindow() {
		contentPane = new JPanel(new BorderLayout());
		usernameField = new JTextField(15);
		passwordField = new JTextField(15);
		
		username = new JPanel();
		usernameLabel = new JLabel("Username");
		username.add(usernameLabel);
		username.add(usernameField);
		
		password = new JPanel();
		passwordLabel = new JLabel("Password");
		password.add(passwordLabel);
		password.add(passwordField);
		
		contentPane.add(username, BorderLayout.NORTH);
		contentPane.add(password, BorderLayout.SOUTH);
		contentPane.setBorder(BorderFactory.createEmptyBorder(15, 10, 10, 10));
		add(contentPane);
		setVisible(true);
		setSize(300, 115);
		setResizable(false);
	}
}
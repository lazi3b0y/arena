package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Arrays;

public class LoginWindow extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel username;
	private JPanel password;
	private JLabel usernameLabel;
	private JLabel passwordLabel;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JButton loginBtn;
	
	public LoginWindow() {
		super("Authentication");
		contentPane = new JPanel(new BorderLayout());
		usernameField = new JTextField(15);
		passwordField = new JPasswordField(15);
		
		username = new JPanel();
		usernameLabel = new JLabel("Username");
		username.add(usernameLabel);
		username.add(usernameField);
		contentPane.add(username, BorderLayout.NORTH);
		
		password = new JPanel();
		passwordLabel = new JLabel("Password");
		password.add(passwordLabel);
		password.add(passwordField);
		contentPane.add(password, BorderLayout.CENTER);
		
		loginBtn = new JButton("Login");
		loginBtn.addActionListener(this);
		getRootPane().setDefaultButton(loginBtn);
		contentPane.add(loginBtn, BorderLayout.SOUTH);
		contentPane.setBorder(BorderFactory.createEmptyBorder(15, 10, 10, 10));
		add(contentPane);
		setVisible(true);
		setSize(300, 150);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		String username;
		char[] password;
		
		username = usernameField.getText().toLowerCase();
		password = passwordField.getPassword();
		
		//Printing out the username and password for testing purposes
		System.out.println(username);
		System.out.println(String.copyValueOf(password) + "\n");
		
		if (username.equals("admin") && String.copyValueOf(password).equals("admin")) {
			Arrays.fill(password, '\0');
			System.out.println("Username and password accepted. Logging in...");
			dispose();
			new MainFrame();
		} else {
			System.out.println("Wrong username and/or password. Try Again!\n");
		}
	}
}
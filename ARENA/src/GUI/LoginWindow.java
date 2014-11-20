package GUI;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginWindow extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel username;
	private JPanel password;
	private JLabel usernameLabel;
	private JLabel passwordLabel;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JButton login;
	
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
		
		login = new JButton("Login");
		login.addActionListener(this);
		contentPane.add(login, BorderLayout.SOUTH);
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
		username = usernameField.getText();
		password = passwordField.getPassword();
		System.out.println(username);
		for(int i = 0; i < password.length; i++) {
			System.out.print(password[i]);
		}
	}
}
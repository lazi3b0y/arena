package GUI;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SettingsFrame extends JFrame{
	JLabel text;
	
	public SettingsFrame() {
		text = new JLabel("Settings goes here.");
		setSize(600, 350);
		setLayout(new BorderLayout());
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		add(text, BorderLayout.CENTER);
	}
}
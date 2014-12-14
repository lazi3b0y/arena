package GUI;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SettingsFrame extends JFrame{
	JLabel text;
	
	public SettingsFrame() {
		text = new JLabel("Settings goes here.");
		text.setBounds(240, 125, 200, 50);
		setSize(600, 350);
		setLayout(null);
		setTitle("Settings Window");
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		add(text);
	}
}
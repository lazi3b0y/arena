package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LogoutWindow extends JFrame {
	private static final long serialVersionUID = 1L;
	private JButton Yes, No;
	private JLabel LogoutMessage;
	private boolean Choice;
	
	public LogoutWindow(boolean Choice){
	
	this.Choice = Choice;
	LogoutMessage = new JLabel("Do you really want to log out?", SwingConstants.CENTER);
	LogoutMessage.setBounds(0, 20, 200, 25);
	add(LogoutMessage);
	
	Yes = new JButton("Yes");
	Yes.setBounds(40,70,55,25);
	add(Yes);
	
	No = new JButton("No");
	No.setBounds(95,70,55,25);
	add(No);
	
	YesNoListener();
	setLayout(null);
	setTitle("Logout?");
	setSize(200,150);
	setVisible(true);
	setResizable(false);
	setLocationRelativeTo(null);
	
	}
	
	public boolean YesNoListener(){
		
		Yes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Choice = true;
				dispose();
			}
		});	
		
		No.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				Choice = false;
				dispose();
			}
		});
		return Choice;
	}
	
	public boolean GetChoice(){
		return Choice;
	}
}




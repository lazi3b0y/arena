package networkgame.client.dialogs;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ConnectionDialog extends JFrame{
	private static final long serialVersionUID = 2210323378883010622L;
	
	private String ip;
	private String port;
	private JButton Connect;
	private JLabel ipLabel;
	private TextField ipTextField;
	
	public ConnectionDialog(){
		setLayout(null);
		ipLabel = new JLabel("Enter ip adress: ");
		ipLabel.setBounds(50, 25, 110, 25);
		add(ipLabel);
		
		ipTextField = new TextField(25);
		ipTextField.setBounds(50, 50, 100, 25);
		add(ipTextField);
		
		Connect = new JButton("Connect! ");
		Connect.setBounds(50, 100, 100, 25);
		add(Connect);
		
		setTitle("Hellow World!");
		setSize(300, 180);
		setVisible(false);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ConnectionListener();
	}

	public void ConnectionListener() {
		
		Connect.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent e){
				if(!ipTextField.getText().equals("")){
					ip = ipTextField.getText();
					dispose();
				}
			}
		});
	}
	
	public String getIp(){
		return ip;
	}
	public String getPort(){
		return port;
	}
}


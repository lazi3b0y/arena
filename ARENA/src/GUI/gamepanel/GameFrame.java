package GUI.gamepanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import networkgame.client.GameClient;
import networkgame.client.dialogs.ConnectionDialog;
import networkgame.server.GameServer;

public class GameFrame extends JPanel{	
	private static final long serialVersionUID = -4570688582586300185L;
	
	private JButton JoinGame;
	private JButton CreateGame;
	private JLabel FourInRow;
	private GameClient GC;
	private GameServer GS;
	private String ip = null;
	private ConnectionDialog CD;
	
	public GameFrame() {
		setLayout(null);
		
		FourInRow = new JLabel("Four In Row:");
		FourInRow.setBounds(65, 0, 80, 50);
		add(FourInRow);
		
		JoinGame = new JButton("Join game!");
		JoinGame.setBounds(200, 0, 200, 50);
		add(JoinGame);
		
		CreateGame = new JButton("Create game!");
		CreateGame.setBounds(400, 0, 200, 50);
		add(CreateGame);
		GameListeners();
	}
	
	private void GameListeners() {
		
		JoinGame.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				CD = new ConnectionDialog();
				while(ip == null){
					ip = CD.getIp();
				}
					
				try {
					GC = new GameClient(ip);
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		CreateGame.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
					GS = new GameServer();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					GC = new GameClient("localhost");
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
	}
}	



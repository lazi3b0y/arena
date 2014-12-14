package networkgame.client;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.JOptionPane;

import networkgame.interf.Constant;

public class GameClient {
	private Registry registry;
	private ClientCom clientCom;
	
    public GameClient(String ip) throws RemoteException, Exception {
    	registry = LocateRegistry.getRegistry(ip, Constant.RMI_PORT);
    	clientCom = new ClientCom(registry);
    	
    	try {
			registry.bind(Constant.CLIENTCOM1_ID, clientCom);
		} catch (AlreadyBoundException e) {
			//e.printStackTrace();
			try {
				registry.bind(Constant.CLIENTCOM2_ID, clientCom);
			} catch (AlreadyBoundException e1) {
				e1.printStackTrace();
				JOptionPane.showMessageDialog(null, e.toString() + "\n\nOops, two players are already bound to the current server.", "AlreadyBoundException",JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
		}
    }
}
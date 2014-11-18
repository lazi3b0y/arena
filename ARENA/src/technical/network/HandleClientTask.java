package technical.network;

import java.net.Socket;

public class HandleClientTask implements Runnable {
	
	private final Socket clientSock;
	public HandleClientTask(Socket client) {
		this.clientSock = client;
	}

	@Override
	public void run() {
		
		
	}

}

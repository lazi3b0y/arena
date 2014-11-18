package technical.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server implements Runnable {
	
	private ServerSocket serverSocket;
	private final int port;
	private static final int POOL_SIZE = 50;
	
	public Server(int port) {
		this.port = port;
	}

	
	private void start() {
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void run() {
		start();
		
		ExecutorService pool = Executors.newFixedThreadPool(POOL_SIZE);
		
		while (true) {
			try {
				Socket client = serverSocket.accept();
				pool.submit(new HandleClientTask(client));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void stop() {
		
	}
}

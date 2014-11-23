package technical.network.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class Server implements Runnable {

	private ServerSocket serverSocket;
	private final int port;
	
	protected ExecutorService pool;

	public Server(int port, int poolSize) throws IOException {
		this.port = port;

		serverSocket = new ServerSocket(port);
		pool = Executors.newFixedThreadPool(poolSize);
	}
	
	public abstract void run();
/*
	public void run() {
		while (true) {
			try {
				Socket client = serverSocket.accept();
				pool.submit(new HandleClientTask(client));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
*/
	public void stop() {

	}

	public int getPort() {
		return port;
	}
}

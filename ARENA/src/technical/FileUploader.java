package technical;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.file.Files;

public class FileUploader implements IFileUploader {

	private File file;

	public FileUploader(String ip, int port, File file) throws UnknownHostException, IOException {
		this.file = file;
	}

	public void upload() throws IOException {
		throw new UnsupportedOperationException();
	}
}

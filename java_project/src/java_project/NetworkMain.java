package java_project;

import java.io.IOException;

public class NetworkMain {
	public static void main(String[] args) {
		try {
			NetworkServer server = new NetworkServer(7777);
			
			server.runServer();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}

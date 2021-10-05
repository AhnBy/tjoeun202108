package java_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketRead extends Thread {
	
	private Socket socket;
	
	public SocketRead(Socket socket) {
		this.socket = socket;
	}
		
	@Override
	public void run() {
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));){
			
			while(true) {				
				System.out.println(">>> "+br.readLine());
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

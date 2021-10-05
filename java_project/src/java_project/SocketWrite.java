package java_project;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketWrite extends Thread {
	
	private Socket socket;
	
	public SocketWrite(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));) {
			
			Scanner scan = new Scanner(System.in);
			while(true) {
				String msg = scan.next();
				bw.write(msg);
				bw.newLine();
				bw.flush();
				
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
}

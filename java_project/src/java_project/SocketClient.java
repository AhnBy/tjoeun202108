package java_project;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {
	public static void main(String[] args) {
		try (Socket socket = new Socket("192.168.35.188", 7777);){
			
			
			SocketRead socketRead = new SocketRead(socket);
			SocketWrite socketWrite = new SocketWrite(socket);
			
			System.out.println("상담사와 연결 되었습니다.");
			socketRead.start();
			socketWrite.start();
			socketWrite.join();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

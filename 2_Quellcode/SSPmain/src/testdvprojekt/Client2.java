package testdvprojekt;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client2 {
	
	public static void main(String[] args) {
		
		Client2 client = new Client2("localhost", 8100);
		client.sendMessage("Halli Hallo");
		
	}
	
	private InetSocketAddress adress;
	
	public Client2(String hostname, int port) {
		
		adress = new InetSocketAddress(hostname, port);
		
	}
	
	public void sendMessage(String msg) {
		
		
		try {
		
			Socket socket = new Socket();
		    socket.connect(adress, 5000);
		    
		    PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		    pw.println(msg);
		    pw.flush();
		    
		    pw.close();
		    socket.close();
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
package serverClient;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) {
		
		Client client = new Client("localhost", 8100);
		client.sendMessage("Moin");
		
	}
	
	private InetSocketAddress adress;
	
	public Client(String hostname, int port) {
		
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

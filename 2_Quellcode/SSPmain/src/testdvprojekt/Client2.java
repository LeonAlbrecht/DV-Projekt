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
	
	private static InetSocketAddress adress;
	
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
	
public static void sendPick() {
		
		
		try {
			Socket socket1 = new Socket();
			socket1.connect(adress, 5000);
			
			PrintWriter pw1 = new PrintWriter(new OutputStreamWriter(socket1.getOutputStream()));
			pw1.print(Normalduo.client1Pick);
			pw1.flush();
			
			pw1.close();
			socket1.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
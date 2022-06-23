package testdvprojekt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	
	
	private int port;
	
	public Server(int port) {
		
		this.port = port;
		
	}
	

	
	public void startServer() {
		
		new Thread(new Runnable() {
			

			@Override
			public void run() {
				
				System.out.println("Server starten...");
				
				while(true) {
					
					try {
						
						ServerSocket serverSocket = new ServerSocket(port);
						System.out.println("Warten auf Verbindung...");
						Socket remoteClientSocket = serverSocket.accept();
						System.out.println("Server mit Client: " + remoteClientSocket.getRemoteSocketAddress() + " verbunden.");
						
						Scanner s = new Scanner(new BufferedReader(new InputStreamReader(remoteClientSocket.getInputStream())));
						if(s.hasNextLine()) {
							
							if(s.hasNextLine()) {
								
								
							}
							
						}
						
						s.close();
						remoteClientSocket.close();
						serverSocket.close();
						
						
					} catch (Exception e){
						
						e.printStackTrace();
						
						
					}
				}
				
			}
			
			
		}).start();
	}

}

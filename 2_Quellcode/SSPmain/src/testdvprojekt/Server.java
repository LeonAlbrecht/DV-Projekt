package testdvprojekt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	static int pick1;
	static int pick2;
	static int winner;
	
	
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
							
							int pick1 = s.nextInt();
							
							if(s.hasNextLine()) {
								
								int pick2 = s.nextInt();
								
								if(pick1 != 0 && pick2 != 0) {
									
									comparePick1Pick2();
										
									PrintWriter pws = new PrintWriter(new OutputStreamWriter(remoteClientSocket.getOutputStream()));
									
									pws.println(winner);
									pws.flush();
									
								} 
								
								
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

	public static void comparePick1Pick2() {
		
		if(pick1 == 1) {
			
			if(pick2 == 1) {
				
				winner = 0;
				
			}
			if(pick2 == 2) {
				
				winner = 2;
				
			}
			if(pick2 == 3) {
				
				winner = 1;
				
			}
			if(pick2 == 4) {
				
				winner = 1;
				
			}
			if(pick2 == 5) {
				
				winner = 2;
				
			}
			
		}
		
		if(pick1 == 2) {
			
			if(pick2 == 1) {
				
				winner = 1;
				
			}
			if(pick2 == 2) {
				
				winner = 0;
				
			}
			if(pick2 == 3) {
				
				winner = 2;
				
			}
			if(pick2 == 4) {
				
				winner = 1;
				
			}
			if(pick2 == 5) {
				
				winner = 2;
				
			}
			
		}
		
		if(pick1 == 3) {
			
			if(pick2 == 1) {
				
				winner = 2;
				
			}
			if(pick2 == 2) {
				
				winner = 1;
				
			}
			if(pick2 == 3) {
				
				winner = 0;
				
			}
			if(pick2 == 4) {
				
				winner = 2;
				
			}
			if(pick2 == 5) {
				
				winner = 1;
				
			}
			
		}
		
		if(pick1 == 4) {
			
			if(pick2 == 1) {
				
				winner = 2;
				
			}
			if(pick2 == 2) {
				
				winner = 2;
				
			}
			if(pick2 == 3) {
				
				winner = 1;
				
			}
			if(pick2 == 4) {
				
				winner = 0;
				
			}
			if(pick2 == 5) {
				
				winner = 1;
				
			}
			
		}
		
		if(pick1 == 5) {
			
			if(pick2 == 1) {
				
				winner = 1;
				
			}
			if(pick2 == 2) {
				
				winner = 1;
				
			}
			if(pick2 == 3) {
				
				winner = 2;
				
			}
			if(pick2 == 4) {
				
				winner = 2;
				
			}
			if(pick2 == 5) {
				
				winner = 0;
				
			}
			
		}
	}
	

}

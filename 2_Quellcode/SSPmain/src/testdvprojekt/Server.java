package testdvprojekt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	/**
	 * Erklärung zum gedachten Funktionsprinzip (da es leider praktisch nicht funktioniert):
	 * 
	 * Man kann in der Klasse NormalDuo entweder Joinen oder Createn. Beim Createn öffnet sich eine Client socket und ein Server. 
	 * Beim Joinen nur eine Client Socket. Diese beiden Sockets verbinden sich mit dem Server. Nun wird wenn man einen Button betätigt mit der Methode 
	 * sendPick() die Auswahl der Spieler 1 bzw. 2 an den Server geschickt. Der Server rechnet nun mit der Methode comparePick1Pick2() aus wer der 
	 * Gewinner ist und sendet 1 (wenn Spieler 1 gewonnen hat) bzw. 2 (wenn 2 gewonnen hat) an die beiden remoteClients. Dort werden dann die scores
	 * erhöht, Sieger bestimmt etc.. Problem ist, dass uns noch keine Möglichkeit bekannt ist, um die beiden Client Sockets voneinander zu unterscheiden.
	 * Deshalb wollten wir, dass der Spieler 2 wartet, wenn Spieler 1 wählt. So könnte man durch die Chronologie die beiden Sockets unterscheiden.
	 * Mit nem neuen Thread in einer Schleife (in der Klasse Client2.controlTurn) 
	 * sollte die boolean Variable turn regulieren wann welcher Spieler wählen kann. Über den server sollte die Variable turn dann verändert werden.
	 * 
	 * Es ist abzusehen, dass dieser Ansatz wie schon viele vorherige nicht funktionieren wird und leider fehlt uns die Zeit, um uns nochmal was Neues 
	 * zu überlegen. Da wir aber sonst nur ein mehrspieler auf einem pc mit weggucken hätten (was im wesentlichen, dass gleiche wäre wie 
	 * Normal/Specialsingle) dachten wir uns, dass wir lieber diesen work in Progress Ansatz drin lassen, auch wenn er nicht funktioniert.
	 * 
	 * 
	 */
	
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

package testdvprojekt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
	
	static boolean turn = false;
	static boolean trash;
	
	
	private static InetSocketAddress adress;
	
	public Client1(String hostname, int port) {
		
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
	
	public void runListener() {
		
		new Thread(new Runnable() {
			
			
			

			@Override
			public void run() {
				
				
				
				while(true) {
					
					try {
						
						Socket socket1 = new Socket();
						socket1.connect(adress, 5000);
						Scanner s1 = new Scanner(new BufferedReader(new InputStreamReader(socket1.getInputStream())));
						
						if(s1.hasNextInt()) {
							
							Normalduo.winCondition = s1.nextInt();
							s1.close();
							socket1.close();
							Normalduo.announceWinner();
						}
						

						
						
						
					} catch (Exception e){
						
						e.printStackTrace();
						
						
					}
				}
				
			}
			
			
		}).start();
		
	}
	}


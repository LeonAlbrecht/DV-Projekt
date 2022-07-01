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

public class Client2 {
	
	static boolean turn = false;
	static boolean trash;
	
	
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
			Socket socket2 = new Socket();
			socket2.connect(adress, 5000);
			
			PrintWriter pw1 = new PrintWriter(new OutputStreamWriter(socket2.getOutputStream()));
			pw1.print(Normalduo.client1Pick);
			pw1.flush();
			
			pw1.close();
			socket2.close();
			
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
						
						Socket socket2 = new Socket();
						socket2.connect(adress, 5000);
						Scanner s2 = new Scanner(new BufferedReader(new InputStreamReader(socket2.getInputStream())));
						
						if(s2.hasNextInt()) {
							
							Normalduo.winCondition = s2.nextInt();
							s2.close();
							socket2.close();
							Normalduo.announceWinner();
						}
						

						
						
						
					} catch (Exception e){
						
						e.printStackTrace();
						
						
					}
				}
				
			}
			
			
		}).start();
		
	}
	
public void controlTurn() {
		
		new Thread(new Runnable() {
			
			
			

			@Override
			public void run() {
				
				
				
				while(true) {
					
					try {
						
						if(turn == true) {
							
							Normalduo.client2Schere.hide();
							Normalduo.client2Stein.hide();
							Normalduo.client2Papier.hide();
							
						}else {
							
							Normalduo.client2Schere.show();
							Normalduo.client2Stein.show();
							Normalduo.client2Papier.show();
						}
						

						
						
						
					} catch (Exception e){
						
						e.printStackTrace();
						
						
					}
				}
				
			}
			
			
		}).start();
		
	}
	}
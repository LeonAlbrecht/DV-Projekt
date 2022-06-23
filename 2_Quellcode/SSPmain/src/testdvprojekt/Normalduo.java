package testdvprojekt;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Normalduo implements ActionListener {
	
	public static String name;
	public static int client1Pick;
	public static int client2Pick;
	
	JFrame frame = new JFrame();
	JButton create = new JButton("Create Room");
	JButton join = new JButton("Join Room");
	JButton client1Schere = new JButton("Schere");
	JButton client1Stein = new JButton("Stein");
	JButton client1Papier = new JButton("Papier");
	JButton client2Schere = new JButton("Schere");
	JButton client2Stein = new JButton("Stein");
	JButton client2Papier = new JButton("Papier");
	
	public Normalduo() {
		
		frame.setLocation(0,0);
		frame.setLayout(null);
		
		frame.add(create);
		create.setBounds(100,100,100,50);
		create.addActionListener(this);
		
		frame.add(join);
		join.setBounds(400,100,100,50);
		join.addActionListener(this);
		
		frame.add(client1Schere);
		client1Schere.setBounds(100,100,100,50);
		client1Schere.addActionListener(this);
		
		frame.add(client1Stein);
		client1Stein.setBounds(400,100,100,50);
		client1Stein.addActionListener(this);
		
		frame.add(client1Papier);
		client1Papier.setBounds(700,100,100,50);
		client1Papier.addActionListener(this);
		
		frame.add(client2Schere);
		client2Schere.setBounds(100,100,100,50);
		client2Schere.addActionListener(this);
		
		frame.add(client2Stein);
		client2Stein.setBounds(400,100,100,50);
		client2Stein.addActionListener(this);
		
		frame.add(client2Papier);
		client2Papier.setBounds(700,100,100,50);
		client2Papier.addActionListener(this);
		
										
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);						
		frame.setSize(1500, 700);								
		frame.setTitle("Schere Stein Papier");					
		frame.setVisible(true);
		
		client1Schere.hide();
		client1Stein.hide();
		client1Papier.hide();
		
		client2Schere.hide();
		client2Stein.hide();
		client2Papier.hide();
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource()==create) {
			
			Server server = new Server(8100);
			server.startServer();
			Client1 client1 = new Client1("localhost", 8100);
			
			create.hide();
			join.hide();
			
			client1Schere.show();
			client1Stein.show();
			client1Papier.show();
			
		}
		
		if(e.getSource()==join) {
			
			Client2 client2 = new Client2("localhost", 8100);
			
			create.hide();
			join.hide();
			
			client2Schere.show();
			client2Stein.show();
			client2Papier.show();
			
		}
		
		
		
		
		if(e.getSource()==client1Schere) {
			
			client1Pick = 1;
			Client1.sendPick();
		}
		
		if(e.getSource()==client1Stein) {
			
			client1Pick = 2;
			Client1.sendPick();
		}
		
		if(e.getSource()==client1Papier) {
			
			client1Pick = 3;
			Client1.sendPick();
		}
		
		
		}
		
		
	}
	


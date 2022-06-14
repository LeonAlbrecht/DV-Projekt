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
	
	JFrame frame = new JFrame();
	JButton create = new JButton("Create Room");
	JButton join = new JButton("Join Room");
	
	public Normalduo() {
		
		frame.setLocation(0,0);
		frame.setLayout(null);
		
		frame.add(create);
		create.setBounds(100,100,100,50);
		create.addActionListener(this);
		
		frame.add(join);
		join.setBounds(400,400,100,50);
		join.addActionListener(this);
		
										
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);						
		frame.setSize(1500, 700);								
		frame.setTitle("Schere Stein Papier");					
		frame.setVisible(true);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==create) {
			
			Server server = new Server(Server.serverSocket);
			Client client1 = new Client(Client.socket, name);
			
			create.hide();
			join.hide();
			
		}
		
		if(e.getSource()==join) {
			
			Client client2 = new Client(Client.socket, name);
			
			create.hide();
			join.hide();
			
		}
		
		
	}
	
}

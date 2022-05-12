package testdvprojekt;

import java.awt.BorderLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Bildversuch {
	JFrame frame = new JFrame();
	JPanel panel1= new JPanel();
	
	Icon icon1= new ImageIcon("bild1.png");
	Icon icon2;
	JLabel Bild1= new JLabel(icon1);
	Bildversuch() {
		
		icon1= new ImageIcon(getClass().getResource("bild1.png"));
		frame.add(Bild1);
		
		frame.setLocation(0, 0);								
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.add(panel1, BorderLayout.CENTER);					
		frame.setSize(1500, 700);								
		frame.setTitle("Schere Stein Papier");					
		frame.setVisible(true);
		Bild1.setBounds(100, 100, 200, 300);
		
		
	}
}

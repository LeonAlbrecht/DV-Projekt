package testdvprojekt;

import java.awt.BorderLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Normalduo {
	JFrame frame = new JFrame();
	JPanel panel1= new JPanel();
	
	Icon icon1;
	Icon icon2;
	JLabel Bild1= new JLabel(icon1);
	Normalduo() {
		
		icon1= new ImageIcon(getClass().getResource("bild1.png"));
		frame.add(Bild1);
		
		frame.setLocation(0, 0);								//Pos wo der Rahmen angezeigt wird (in der Mitte)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//bei schließen wird Programm geschlossen
		frame.add(panel1, BorderLayout.CENTER);					
		frame.setSize(1500, 700);								//größe des Rahmens
		frame.setTitle("Schere Stein Papier");					//Titel im Rahmen
		frame.setVisible(true);
		Bild1.setBounds(100, 100, 200, 300);
		
		
	}
}

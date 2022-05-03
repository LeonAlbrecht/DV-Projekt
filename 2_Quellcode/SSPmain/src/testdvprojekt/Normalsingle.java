package testdvprojekt;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Normalsingle {
	
	JFrame frame = new JFrame();
	JPanel panel1= new JPanel();
	JButton buton= new JButton();
	JLabel label =new JLabel("Normalsingle Modus");
	
	
	Normalsingle() {
		
		frame.add(label);
		label.setBounds(100, 100, 100, 100);
		frame.setLocation(0, 0);								//Pos wo der Rahmen angezeigt wird (in der Mitte)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//bei schließen wird Programm geschlossen
		frame.add(panel1, BorderLayout.CENTER);					
		frame.setSize(1500, 700);								//größe des Rahmens
		frame.setTitle("Schere Stein Papier");					//Titel im Rahmen
		frame.setVisible(true);	
		
	}
}

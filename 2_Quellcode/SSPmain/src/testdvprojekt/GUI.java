package testdvprojekt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI implements ActionListener{
	
	JFrame frame;
	JLabel title;												//Titel des Rahmens
	JPanel panel;				
	JButton sbutton;											//Startbutton
	JButton Sbutton;											//neuer Startbutton nach Einstellungen...
	
	JLabel rTextfeld;
	JLabel P1Textfeld;
	JLabel P2Textfeld;
	JLabel mTextfeld;
	JLabel playerTextfeld;
	JButton m1;
	JButton m2;
	JButton single;
	JButton duo;
	JButton r3;
	JButton r5;
	JButton r7;
	JTextField P1Eingabefeld;
	JTextField P2Eingabefeld;
	JButton test;
	
	Graphics2D g2D; 
	
	
	
	public GUI() {
		
		panel= new JPanel();
		frame= new JFrame();
		title= new JLabel("Willkommen zu Schere, Stein, Papier");
		sbutton=new JButton("Start");
		Sbutton= new JButton("Start");
		
		rTextfeld= new JLabel("Anzahl der Runden: ");
		r3= new JButton("Best of 3");
		r5= new JButton("Best of 5");
		r7= new JButton("Best of 7");
		
		mTextfeld= new JLabel("Modus: ");
		m1= new JButton("1.: Normaler Modus");
		m2= new JButton("2.: Mit Spock und Echse");
		
		playerTextfeld= new JLabel("Anzahl der Spieler: ");
		single= new JButton("Spiel gegen Computer");
		duo= new JButton("2 Spieler");
		
		P1Textfeld= new JLabel("Name Spieler 1: ");
		P2Textfeld= new JLabel("Name Spieler 2: ");
		P1Eingabefeld= new JTextField(20);
		P2Eingabefeld= new JTextField(20);
		test= new JButton("test");
		
		
		
		//Rahmen
		frame.setLocation(0, 0);								//Pos wo der Rahmen angezeigt wird (in der Mitte)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//bei schließen wird Programm geschlossen
		frame.add(panel);					
		frame.setSize(1500, 700);								//größe des Rahmens
		frame.setTitle("Schere Stein Papier");					//Titel im Rahmen
		frame.setVisible(true);									//Rahmen wird angezeig
		
		//Menü-Panel
		panel.setLayout(null);									//kein Layout
		panel.add(title);										//Titel hinzufügen
		title.setBounds(500, 10, 500, 30);						//Titel Positionieren
		panel.add(sbutton);										//button hinzufügen
		sbutton.setBounds(560, 150, 80, 25);					//button positionieren
		sbutton.addActionListener(this);
		Sbutton.addActionListener(this); 						//Interaktionsfunktion button
		r3.addActionListener(this);
		r5.addActionListener(this);
		r7.addActionListener(this);
		m1.addActionListener(this);
		m2.addActionListener(this);
		single.addActionListener(this);
		duo.addActionListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		title.setText("Wählen Sie Ihre Einstellungen aus");		//Reaktion nach ausführen des Buttons
		sbutton.hide();
		panel.add(Sbutton);
		Sbutton.setBounds(560, 300, 80, 25);					//Neuer Startbutton Positionieren
		
		panel.add(rTextfeld);									//Anzahl der Runden (Textfeld/Eingabefeld) 
		panel.add(r3);
		panel.add(r5);
		panel.add(r7);
	
		panel.add(mTextfeld);									//Textfeld Modus
		panel.add(m1);											//Button Modus 1
		panel.add(m2);											//Button Modus 2
	
		panel.add(playerTextfeld);								//Textfeld Spieleranzahl
		panel.add(single);										//Button Singelmudos
		panel.add(duo);											//Button 2 Spieler
	
		panel.add(P1Textfeld);									//Textfeld Player 1
		panel.add(P2Textfeld);									//Textfeld Player 2
		panel.add(P1Eingabefeld);
		panel.add(P2Eingabefeld);
	
	
	
		rTextfeld.setBounds(340, 90, 150, 20);					//Positionierungen
		r3.setBounds(460, 90, 120, 30);
		r5.setBounds(595, 90, 120, 30);
		r7.setBounds(730, 90, 120, 30);
	
		mTextfeld.setBounds(340, 130, 150, 20);
		m1.setBounds(460, 125, 200, 30);
		m2.setBounds(650, 125, 200, 30);
	
		playerTextfeld.setBounds(340, 170, 150, 20);
		single.setBounds(460, 165, 200, 30);
		duo.setBounds(650, 165, 200, 30);
		
		
		
		
		 
			
		if(e.getSource()==r3) {
			r3.setBackground(Color.green);
			r5.setBackground(null);
			r7.setBackground(null);
		}
		
		if(e.getSource()==r5){
			r5.setBackground(Color.green);
			r3.setBackground(null);
			r7.setBackground(null);
		}
		
		if(e.getSource()==r7){
			r7.setBackground(Color.green);
			r5.setBackground(null);
			r3.setBackground(null); 	
		}
		
		if(e.getSource()==m1) {
		m1.setBackground(Color.green);
			m2.setBackground(null);
		}
		
		if(e.getSource()==m2) {
			m2.setBackground(Color.green);
			m1.setBackground(null);
		}
		
		if(e.getSource()==single) {
			single.setBackground(Color.green);
				duo.setBackground(null);
				P1Textfeld.setBounds(340, 200, 0, 0);
				P2Textfeld.setBounds(340, 220, 0, 0);
				P1Eingabefeld.setBounds(460, 205, 0, 0);
				P2Eingabefeld.setBounds(460, 225, 0, 0);
		}
		
		if(e.getSource()==duo) {
			duo.setBackground(Color.green);
				single.setBackground(null);
				P1Textfeld.setBounds(340, 200, 150, 20);
				P2Textfeld.setBounds(340, 220, 150, 20);
				P1Eingabefeld.setBounds(460, 205, 150, 20);
				P2Eingabefeld.setBounds(460, 225, 150, 20);
		}
		if(m1.getBackground().equals(Color.green) && single.getBackground().equals(Color.green) && e.getSource()==Sbutton) {
			frame.dispose();
			Normalsingle npvc= new Normalsingle();
		}
		if(m2.getBackground().equals(Color.green) && single.getBackground().equals(Color.green) && e.getSource()==Sbutton) {
			frame.dispose();
			Specialsingle npvc= new Specialsingle();
		}
		if(m1.getBackground().equals(Color.green) && duo.getBackground().equals(Color.green) && e.getSource()==Sbutton) {
			frame.dispose();
			Normalduo npvc= new Normalduo();
		}
		if(m2.getBackground().equals(Color.green) && duo.getBackground().equals(Color.green) && e.getSource()==Sbutton) {
			frame.dispose();
			Specialduo npvc= new Specialduo();
		}
		
		
	
		
		
	}
	
		
		 

	public static void main(String[] args) {
		new GUI(); {
		}
		
	}
	
	
}



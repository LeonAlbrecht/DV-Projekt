package testdvprojekt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;

public class GUI implements ActionListener{
	
	public static int winscore;
	
	JFrame frame=new JFrame();
	JLabel title= new JLabel("Willkommen zu Schere, Stein, Papier");											
	JButton sbutton=new JButton("Start");											
	JButton Sbutton= new JButton("Start");											
	
	JLabel rTextfeld= new JLabel("Anzahl der Runden: ");
	JLabel P1Textfeld= new JLabel("Name Spieler 1: ");
	JLabel P2Textfeld= new JLabel("Name Spieler 2: ");
	JLabel mTextfeld= new JLabel("Modus: ");
	JLabel playerTextfeld= new JLabel("Anzahl der Spieler: ");
	JButton m1= new JButton("1.: Normaler Modus");
	JButton m2= new JButton("2.: Mit Spock und Echse");
	JButton single= new JButton("Spiel gegen Computer");
	JButton duo= new JButton("2 Spieler");
	JButton r3= new JButton("Best of 3");
	JButton r5= new JButton("Best of 5");
	JButton r7= new JButton("Best of 7");
	JTextField P1Eingabefeld= new JTextField(20);
	JTextField P2Eingabefeld= new JTextField(20);
	JButton test= new JButton("test");
	
	
	public GUI() {
		
		try {																											//background
            frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("pictures/background2.png")))));
        } catch (IOException e) {
            e.printStackTrace();																				
        }
		
        frame.pack();											//frame settings
        frame.setLayout(null);
		frame.setLocation(0, 0);														
															
		frame.add(title);										//frame title
		title.setBounds(500, 60, 500, 20);						
		frame.add(sbutton);										//button first start 	
		sbutton.setBounds(560, 150, 80, 25);
		sbutton.addActionListener(this);
		
		
				
		frame.add(Sbutton);										//button second start 
		Sbutton.setBounds(590, 500, 80, 25);			
		Sbutton.addActionListener(this);
		Sbutton.hide();
		
		frame.add(rTextfeld);									//number of rounds
		rTextfeld.setBounds(340, 90, 150, 20);	
		rTextfeld.hide();
		
		frame.add(r3);											//button 3 rounds
		r3.setBounds(460, 90, 120, 30);
		r3.addActionListener(this);
		r3.hide();
		
		frame.add(r5);											//button 5 rounds
		r5.setBounds(595, 90, 120, 30);
		r5.addActionListener(this);
		r5.hide();
		
		frame.add(r7);											//button 7 rounds
		r7.setBounds(730, 90, 120, 30);
		r7.addActionListener(this);
		r7.hide();
		
		frame.add(mTextfeld);									//mode text-field				
		mTextfeld.setBounds(340, 130, 150, 20);
		mTextfeld.hide();
		
		frame.add(m1);											//button first mode				
		m1.setBounds(460, 125, 200, 30);
		m1.addActionListener(this);
		m1.hide();
		
		frame.add(m2);											//button second mode				
		m2.setBounds(650, 125, 200, 30);
		m2.addActionListener(this);
		m2.hide();
		
		frame.add(playerTextfeld);								//number of players				
		playerTextfeld.setBounds(340, 170, 150, 20);
		playerTextfeld.hide();
	
		frame.add(single);										//button single-player
		single.setBounds(460, 165, 200, 30);
		single.addActionListener(this);
		single.hide();
		
		frame.add(duo);											//button two player
		duo.setBounds(650, 165, 200, 30);
		duo.addActionListener(this);
		duo.hide();
		
		//frame.add(P1Textfeld);								//text-fields for names		
		//frame.add(P2Textfeld);									
		//frame.add(P1Eingabefeld);
		//frame.add(P2Eingabefeld);
		
		
		frame.setLocation(0, 0);								//location in the Center
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//closing frame					
		frame.setSize(1500, 700);								//size of frame
		frame.setTitle("Schere Stein Papier");					//title of frame
		frame.setVisible(true);									//frame gets displayed
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==sbutton) {							//settings get displayed
			
			sbutton.hide();										
			title.setText("Wählen Sie Ihre Einstellungen aus");
			Sbutton.show();
			rTextfeld.show();
			r3.show();
			r5.show();
			r7.show();
			mTextfeld.show();
			m1.show();
			m2.show();
			playerTextfeld.show();
			single.show();
			duo.show();
		}
			
		if(e.getSource()==r3) {									
			
			PlayMusic.playButton();								//sound effect after pushing button
			
			r3.setBackground(Color.green);						//green color after pushing buttons
			r5.setBackground(null);								
			r7.setBackground(null);
		}
		
		if(e.getSource()==r5){
			
			PlayMusic.playButton();
			
			r5.setBackground(Color.green);
			r3.setBackground(null);
			r7.setBackground(null);
		}
		
		if(e.getSource()==r7){
			
			PlayMusic.playButton();
			
			r7.setBackground(Color.green);
			r5.setBackground(null);
			r3.setBackground(null); 	
		}
		
		if(e.getSource()==m1) {
		
			PlayMusic.playButton();
			
			m1.setBackground(Color.green);
			m2.setBackground(null);
		}
		
		if(e.getSource()==m2) {
			
			PlayMusic.playButton();
			
			m2.setBackground(Color.green);
			m1.setBackground(null);
		}
		
		if(e.getSource()==single) {
			
			PlayMusic.playButton();
			
			single.setBackground(Color.green);
			duo.setBackground(null);
			//P1Textfeld.setBounds(340, 200, 0, 0);
			//P2Textfeld.setBounds(340, 220, 0, 0);
			//P1Eingabefeld.setBounds(460, 205, 0, 0);
			//P2Eingabefeld.setBounds(460, 225, 0, 0);
		}
		
		if(e.getSource()==duo) {
			
			PlayMusic.playButton();
			
			duo.setBackground(Color.green);
			single.setBackground(null);
			//P1Textfeld.setBounds(340, 200, 150, 20);
			//P2Textfeld.setBounds(340, 220, 150, 20);
			//P1Eingabefeld.setBounds(460, 205, 150, 20);
			//P2Eingabefeld.setBounds(460, 225, 150, 20);
		}
		
		if(m1.getBackground().equals(Color.green) && single.getBackground().equals(Color.green) && e.getSource()==Sbutton) {
			
			PlayMusic.playButton();
			
			frame.dispose();
			FillerClassName name= new FillerClassName();
		}
		
		if(m2.getBackground().equals(Color.green) && single.getBackground().equals(Color.green) && e.getSource()==Sbutton) {
			
			PlayMusic.playButton();
			
			frame.dispose();
			NameSPVC namespvc = new NameSPVC();
		}
		
		if(m1.getBackground().equals(Color.green) && duo.getBackground().equals(Color.green) && e.getSource()==Sbutton) {
			
			PlayMusic.playButton();
			
			frame.dispose();
			Normalduo normalduo= new Normalduo();
		}
		
		if(m2.getBackground().equals(Color.green) && duo.getBackground().equals(Color.green) && e.getSource()==Sbutton) {
			
			PlayMusic.playButton();
			
			frame.dispose();
			Specialduo npvc= new Specialduo();
		}

		if(e.getSource() == r3) {
			
			PlayMusic.playButton();
			
			winscore = 3;
		}
		
		if(e.getSource() == r5) {
			
			PlayMusic.playButton();
			
			winscore = 5;
		}
		
		if(e.getSource() == r7) {
			
			PlayMusic.playButton();
			
			winscore = 7;
		}
		
		
	}
	
		
	
	public static void main(String[] args) {
		new GUI(); {
		}
		//PlayMusic.play();
	}
	
	
}



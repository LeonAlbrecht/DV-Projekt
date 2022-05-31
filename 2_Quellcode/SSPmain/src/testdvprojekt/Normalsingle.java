package testdvprojekt;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Normalsingle implements ActionListener{			//Klasse: Normaler Modus gegen Computer
	
	public static int a;
	public static int roundcount;
	
	
	Icon bild1= new ImageIcon(getClass().getResource("src/bild1.jpg"));
	
	JFrame frame = new JFrame();
	JPanel panel1 = new JPanel();
	JButton button1 = new JButton(bild1);
	JButton button2 = new JButton("Stein");
	JButton button3 = new JButton("Papier");
	JLabel pscore = new JLabel("Player Score: 0");
	JLabel cscore = new JLabel("Computer Score: 0");
	JLabel printline = new JLabel("Wählen Sie Schere, Stein oder Papier aus");
	JLabel ppick = new JLabel();
	JLabel cpick = new JLabel();
	
	JButton playagain = new JButton("Play Again");
	JButton back = new JButton("Back to Title");
	
	
	
	Normalsingle() {
		frame.setLayout(null);
		frame.setLocation(0, 0);
		frame.add(printline);
		printline.setBounds(400, 100, 800, 20);
		printline.setFont(new Font(null,Font.PLAIN,12));
		
		frame.add(button1);
		button1.setBounds(100,200,100,50);
		button1.addActionListener(this);
		frame.add(button2);
		button2.setBounds(400,200,100,50);
		button2.addActionListener(this);
		frame.add(button3);
		button3.setBounds(700,200,100,50);
		button3.addActionListener(this);
		
		frame.add(ppick);
		ppick.setBounds(100, 300, 300, 100);
		ppick.setFont(new Font(null,Font.PLAIN,12));
		frame.add(cpick);
		cpick.setBounds(700, 300, 300, 100);
		cpick.setFont(new Font(null,Font.PLAIN,12));
		
		frame.add(pscore);
		pscore.setBounds(100, 400, 200, 50);
		pscore.setFont(new Font(null,Font.PLAIN,12));
		frame.add(cscore);
		cscore.setBounds(700, 400, 200, 50);
		cscore.setFont(new Font(null,Font.PLAIN,12));
		
		frame.add(playagain);
		playagain.setBounds(250, 500, 100, 50);
		playagain.addActionListener(this);
		playagain.hide();
		frame.add(back);
		back.setBounds(550, 500, 150, 50);
		back.addActionListener(this);
		back.hide();
		
		
		
		
		
		
		frame.setLocation(0, 0);								//Pos wo der Rahmen angezeigt wird (in der Mitte)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//bei schließen wird Programm geschlossen
		frame.add(panel1, BorderLayout.CENTER);					
		frame.setSize(1500, 700);								//größe des Rahmens
		frame.setTitle("Schere Stein Papier");					//Titel im Rahmen
		frame.setVisible(true);	
		

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button1) {
			
			 a = 1;
			 ppick.setText("Sie haben Schere ausgewählt");
			 testmain2.compare();
			 showPicks();
			 pscore.setText("Player Score: " + testmain2.pscore);
			 cscore.setText("Computer Score: " + testmain2.cscore);
			 printing();
			 roundcount++;
			 announceWinner();
		}
		
		if(e.getSource()==button2) {
			
			a = 2;
			ppick.setText("Sie haben Stein ausgewählt");
			testmain2.compare();
			showPicks();
			pscore.setText("Player Score: " + testmain2.pscore);
			 cscore.setText("Computer Score: " + testmain2.cscore);
			 printing();
			 roundcount++;
			 announceWinner();
			
		}
		
		if(e.getSource()==button3) {
			
			a = 3;
			ppick.setText("Sie haben Papier ausgewählt");
			testmain2.compare();
			showPicks();
			pscore.setText("Player Score: " + testmain2.pscore);
			 cscore.setText("Computer Score: " + testmain2.cscore);
			 printing();
			 roundcount++;
			 announceWinner();
			
		}
		
		if(e.getSource()==playagain) {
			
			roundcount = 0;
			testmain2.cscore = 0;
			testmain2.pscore = 0;
			
			playagain.hide();
			back.hide();
			
			button1.show();
			button2.show();
			button3.show();
			
			pscore.setText("Player Score: " + testmain2.pscore);
			 cscore.setText("Computer Score: " + testmain2.cscore);
			 
			 printline.setText("");
			 ppick.setText("");
			 cpick.setText("");
			
		}
		
		if(e.getSource()==back) {
			
			roundcount = 0;
			testmain2.cscore = 0;
			testmain2.pscore = 0;
			
			playagain.hide();
			back.hide();
			
			button1.show();
			button2.show();
			button3.show();
			
			pscore.setText("Player Score: " + testmain2.pscore);
			 cscore.setText("Computer Score: " + testmain2.cscore);
			 
			 printline.setText("");
			 ppick.setText("");
			 cpick.setText("");
			 
			 frame.dispose();
			 GUI gui = new GUI();
			
		}
		
	}
	
	public void printing() {
		
		if(testmain2.printer == 0) {
			
			printline.setText("Unentschieden");
			
		}
		
		if(testmain2.printer == 1) {
			
			printline.setText("Du hast gewonnen :)");
			
		}
		
		if(testmain2.printer == 2) {
			
			printline.setText("Du hast verloren :c");
			
		}
	}
	
	public void announceWinner() {
		
		if(GUI.winscore == roundcount || testmain2.pscore*2 > GUI.winscore || testmain2.cscore*2 > GUI.winscore) {
			
			if(testmain2.pscore > testmain2.cscore) {
				
				printline.setText("Du hast das Spiel gewonnen");
				
				button1.hide();
				button2.hide();
				button3.hide();
				
				playagain.show();
				back.show();
				
			}
			if(testmain2.cscore > testmain2.pscore) {
				
				printline.setText("Du hast das Spiel verloren");
				
				button1.hide();
				button2.hide();
				button3.hide();
				
				playagain.show();
				back.show();
				
				
				
			}
			if(testmain2.cscore == testmain2.pscore) {
				
				printline.setText("Dieses Spiel endet mit einem Unentschieden");
				
				button1.hide();
				button2.hide();
				button3.hide();
				
				playagain.show();
				back.show();
				
				
			}
			
			
			
			
			
		}
	}
	
	public void showPicks() {
		
		if(testmain2.cpick == 1) {
			
			cpick.setText("Der Computer hat Schere ausgewählt");
		}
		
if(testmain2.cpick == 2) {
			
			cpick.setText("Der Computer hat Stein ausgewählt");
		}

if(testmain2.cpick == 3) {
	
	cpick.setText("Der Computer hat Papier ausgewählt");
}
		
	}
}
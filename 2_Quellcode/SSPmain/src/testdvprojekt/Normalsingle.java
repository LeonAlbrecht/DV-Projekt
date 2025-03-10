package testdvprojekt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Normaler Modus, Spiel gegen Computer
 * 
 * @author: Burak, Melih
 * @param:  int a(Pick vom Spieler), int roundcount(Anzahl der Runden), int winSeries(Anzahl in Reihe gewonnener Spiele), String name(Name des Spielers)
 */

public class Normalsingle implements ActionListener{	

//class: mode for normal-single 
	
	public static int a;
	public static int roundcount;
	public static int winSeries;
	public static String name;
	
	JFrame frame = new JFrame();
	JButton button1 = new JButton("Schere");
	JButton button2 = new JButton("Stein");
	JButton button3 = new JButton("Papier");
	JButton highscore = new JButton("Highscores");
	JLabel playername=new JLabel("Spieler:");
	JLabel schere = new JLabel("Schere:");
	JLabel stein = new JLabel("Stein:");
	JLabel papier = new JLabel("Papier:");
	JLabel pscore = new JLabel("Spieler Score: 0");
	JLabel cscore = new JLabel("Computer Score: 0");
	JLabel printline = new JLabel("W�hlen Sie Schere, Stein oder Papier aus");
	JLabel ppick = new JLabel();
	JLabel cpick = new JLabel(); 
	JLabel nameTag = new JLabel(name);
	JButton playagain = new JButton("Erneut spielen");
	JButton back = new JButton("zur�ck zum Titel");
	ImageIcon icon1 =new ImageIcon("pictures/bild1.jpg");
	ImageIcon icon2 =new ImageIcon("pictures/bild2.jpg");
	ImageIcon icon3 =new ImageIcon("pictures/bild3.jpg");
	
	
	Normalsingle() {
		
		try {																											//background
            frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("pictures/background2.png")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
		 
		
        frame.pack();
		frame.setLayout(null);
		frame.setLocation(0, 0);
		frame.add(printline);
		printline.setBounds(450, 60, 800, 20);
		printline.setFont(new Font(null,Font.ITALIC,16));
		
		frame.add(button1);																		//button scissor
		button1.setBounds(100,200,150,100);
		button1.addActionListener(this);
		button1.setIcon(icon1);
		icon1.setImage(icon1.getImage().getScaledInstance(160,120,Image.SCALE_DEFAULT));
		frame.add(schere);
		schere.setBounds(150, 180, 50, 10);
		
		frame.add(button2);																		//button stone
		button2.setBounds(400,200,150,100);
		button2.addActionListener(this);
		button2.setIcon(icon2);
		icon2.setImage(icon2.getImage().getScaledInstance(160,120,Image.SCALE_DEFAULT));
		frame.add(stein);
		stein.setBounds(450, 180, 50, 10);
		
		frame.add(button3);																		//button paper
		button3.setBounds(700,200,150,100);
		button3.addActionListener(this);
		button3.setIcon(icon3);
		icon3.setImage(icon3.getImage().getScaledInstance(160,120,Image.SCALE_DEFAULT));
		frame.add(papier);
		papier.setBounds(750, 180, 50, 10);
		
		frame.add(highscore);																	//button high score
		highscore.setBounds(700, 500, 100, 50);
		highscore.addActionListener(this);
		
		frame.add(ppick);																		//label of your decision
		ppick.setBounds(100, 100, 300, 30);
		ppick.setFont(new Font(null,Font.ITALIC,14));
		frame.add(cpick);																		//label of computer decision
		cpick.setBounds(700, 100, 300, 30);
		cpick.setFont(new Font(null,Font.ITALIC,14));
		
		frame.add(pscore);																		//player score
		pscore.setBounds(100, 450, 200, 50);
		pscore.setFont(new Font(null,Font.ITALIC,14));
		frame.add(cscore);																		//computer score
		cscore.setBounds(700, 450, 200, 50);
		cscore.setFont(new Font(null,Font.ITALIC,14));
		frame.add(nameTag);																		//entered name
		nameTag.setBounds(90,40,200,20);
		nameTag.setFont(new Font(null,Font.ITALIC,13));
		frame.add(playername);																	
		playername.setBounds(40,40,50,20);
		playername.setFont(new Font(null,Font.ITALIC,13));
		
		frame.add(playagain);																	//button play again
		playagain.setBounds(250, 500, 150, 50);
		playagain.addActionListener(this);
		playagain.hide();
		frame.add(back);																		//button back to settings
		back.setBounds(450, 500, 150, 50);
		back.addActionListener(this);
		back.hide();
		
		
		
		frame.setLocation(0, 0);								
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);						
		frame.setSize(1500, 700);								
		frame.setTitle("Schere Stein Papier");					
		frame.setVisible(true);	
		

	}

	/**
	 * Zum Bet�tigen der Buttons
	 * 
	 * @author: Burak, Melih
	 * @param:  int a(Pick vom Spieler), int roundcount(Anzahl der Runden), int winSeries(Anzahl in Reihe gewonnener Spiele), String name(Name des Spielers)
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button1) {
			
			PlayMusic.playButton();
			
			a = 1;
			ppick.setText("Sie haben Schere ausgew�hlt");
			testmain2.compare();
			showPicks();
			pscore.setText("Player Score: " + testmain2.pscore);
			cscore.setText("Computer Score: " + testmain2.cscore);
			printing();
			roundcount++;
			announceWinner();
		}
		
		if(e.getSource()==button2) {
			
			PlayMusic.playButton();
			
			a = 2;
			ppick.setText("Sie haben Stein ausgew�hlt");
			testmain2.compare();
			showPicks();
			pscore.setText("Player Score: " + testmain2.pscore);
			cscore.setText("Computer Score: " + testmain2.cscore);
			printing();
			roundcount++;
			announceWinner();
		}
		
		if(e.getSource()==button3) {
			
			PlayMusic.playButton();
			
			a = 3;
			ppick.setText("Sie haben Papier ausgew�hlt");
			testmain2.compare();
			showPicks();
			pscore.setText("Player Score: " + testmain2.pscore);
			cscore.setText("Computer Score: " + testmain2.cscore);
			printing();
			roundcount++;
			announceWinner();
		}
		
		if(e.getSource()==playagain) {
			
			PlayMusic.playButton();
			
			roundcount = 0;
			testmain2.cscore = 0;
			testmain2.pscore = 0;
			
			playagain.hide();
			back.hide();
			
			button1.show();
			button2.show();
			button3.show();
			schere.show();
			stein.show();
			papier.show();
			
			pscore.setText("Player Score: " + testmain2.pscore);
			cscore.setText("Computer Score: " + testmain2.cscore);
			 
			printline.setText("");
			ppick.setText("");
			cpick.setText("");
		}
		
		if(e.getSource()==back) {
			
			PlayMusic.playButton();
			
			Highscore.compareNormal();
			Highscore.saveScores();
			
			roundcount = 0;
			testmain2.cscore = 0;
			testmain2.pscore = 0;
			
			playagain.hide();
			back.hide();
			
			button1.show();
			button2.show();
			button3.show();
			schere.show();
			stein.show();
			papier.show();
			
			pscore.setText("Player Score: " + testmain2.pscore);
			cscore.setText("Computer Score: " + testmain2.cscore);
			 
			printline.setText("");
			ppick.setText("");
			cpick.setText("");
			 
			winSeries = 0;
			 
			frame.dispose();
			GUI gui = new GUI();
		}
		
		if(e.getSource()==highscore) {
			
			PlayMusic.playButton();
			
			Highscore.compareNormal();
			Highscore.saveScores();
			Highscore highscore = new Highscore();
		}

	}
	
	/**
	 * Zeigt, wer die Runde gewonnen hat 
	 * 
	 * @author: Burak, Melih
	 * @param: testmain2.printer(In der Klasse testmain2 wird der Gewinner ausgerechnet)
	 * @return: String
	 */
	
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
	
	/**
	 * Zeigt, wer das Spiel gewonnen hat
	 * 
	 * @author: Burak, Melih
	 * @param: GUI.winscore(vorher bestimmte Anzahl der Runden), testmain2.pscore(Punktzahl des Spielers), testmain2.cscore(Punktzahl des Computers)
	 * @return: winSeries(Siegesserie wird erh�ht oder bei Niederlage auf Null gesetzt)
	 */
	
	public void announceWinner() {
		
		if(GUI.winscore == roundcount || testmain2.pscore*2 > GUI.winscore || testmain2.cscore*2 > GUI.winscore) {
			
			if(testmain2.pscore > testmain2.cscore) {
				
				printline.setText("Du hast das Spiel gewonnen !!!");
				
				PlayMusic.playWin();
				
				winSeries++;
				
				button1.hide();
				button2.hide();
				button3.hide();
				schere.hide();
				stein.hide();
				papier.hide();
				
				playagain.show();
				back.show();	
			}
			
			if(testmain2.cscore > testmain2.pscore) {
				
				printline.setText("Du hast das Spiel verloren");
				
				PlayMusic.playLoose();
				
				Highscore.compareNormal();
				winSeries = 0;
				
				button1.hide();
				button2.hide();
				button3.hide();
				schere.hide();
				stein.hide();
				papier.hide();
				
				playagain.show();
				back.show();	
			}
			
			if(testmain2.cscore == testmain2.pscore) {
				
				PlayMusic.playDraw();
				
				printline.setText("Dieses Spiel endet mit einem Unentschieden");
				
				button1.hide();
				button2.hide();
				button3.hide();
				schere.hide();
				stein.hide();
				papier.hide();
				
				playagain.show();
				back.show();
			}
				
		}
	}
	
	/**
	 * Zeigt, welches Element gew�hlt wurde.
	 * 
	 * @author: Burak, Melih
	 * @param: testmain2.cpick(Element vom Computer)
	 * @return: String
	 * 
	 */
	
	public void showPicks() {
		
		if(testmain2.cpick == 1) {
			
			cpick.setText("Der Computer hat Schere ausgew�hlt");
		}
		
		if(testmain2.cpick == 2) {
			
			cpick.setText("Der Computer hat Stein ausgew�hlt");
		}

		if(testmain2.cpick == 3) {
	
			cpick.setText("Der Computer hat Papier ausgew�hlt");
		}
		
	}
	
}

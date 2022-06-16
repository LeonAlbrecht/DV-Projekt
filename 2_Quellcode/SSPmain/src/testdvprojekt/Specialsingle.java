package testdvprojekt;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Specialsingle implements ActionListener {
	
	public static int pick;
	
	public static int roundcount;
	public static int winSeries;
	
	public static String name;
	
	JFrame frame = new JFrame();
	JPanel panel1= new JPanel();
	JButton button1 = new JButton("Schere");
	JButton button2 = new JButton("Stein");
	JButton button3 = new JButton("Papier");
	JButton button4 = new JButton("Lizard");
	JButton button5 = new JButton("Shpock");
	JButton highscore = new JButton("Highscores");
	JLabel pscore = new JLabel("Player Score: ");
	JLabel cscore = new JLabel("Computer Score: ");
	JLabel printline = new JLabel("Wählen Sie eine Möglichkeit aus");
	JLabel ppick = new JLabel();
	JLabel cpick = new JLabel();
	JButton playagain = new JButton("Play Again");
	JButton back = new JButton("Back to title");
	JLabel nameTag = new JLabel(name);
	ImageIcon icon1 =new ImageIcon("pictures/bild1.jpg");
	ImageIcon icon2 =new ImageIcon("pictures/bild2.jpg");
	ImageIcon icon3 =new ImageIcon("pictures/bild3.jpg");
	ImageIcon icon4 =new ImageIcon("pictures/bild4.jpg");
	ImageIcon icon5 =new ImageIcon("pictures/bild5.jpg");
	
	
	Specialsingle(){
		
	frame.add(printline);
	printline.setBounds(400, 100, 800, 20);
	printline.setFont(new Font(null,Font.PLAIN,12));	
	
	frame.add(button1);
	button1.setBounds(50,200,100,50);
	button1.addActionListener(this);
	button1.setIcon(icon1);
	icon1.setImage(icon1.getImage().getScaledInstance(110,80,Image.SCALE_DEFAULT));
	frame.add(button2);
	button2.setBounds(200,200,100,50);
	button2.addActionListener(this);
	button2.setIcon(icon2);
	icon2.setImage(icon2.getImage().getScaledInstance(110,100,Image.SCALE_DEFAULT));
	frame.add(button3);
	button3.setBounds(350,200,100,50);
	button3.addActionListener(this);
	button3.setIcon(icon3);
	icon3.setImage(icon3.getImage().getScaledInstance(110,100,Image.SCALE_DEFAULT));
	frame.add(button4);
	button4.setBounds(500,200,100,50);
	button4.addActionListener(this);
	button4.setIcon(icon4);
	icon4.setImage(icon4.getImage().getScaledInstance(120,60,Image.SCALE_DEFAULT));
	frame.add(button5);
	button5.setBounds(650,200,100,50);
	button5.addActionListener(this);
	button5.setIcon(icon5);
	icon5.setImage(icon5.getImage().getScaledInstance(110, 60, Image.SCALE_DEFAULT));
	
	frame.add(highscore);
	highscore.setBounds(700, 500, 100, 50);
	highscore.addActionListener(this);
	
	frame.add(ppick);
	ppick.setBounds(100, 300, 300, 100);
	ppick.setFont(new Font(null,Font.PLAIN,12));
	frame.add(cpick);
	cpick.setBounds(700, 300, 300, 100);
	cpick.setFont(new Font(null,Font.PLAIN,12));
	
	frame.add(nameTag);
	nameTag.setBounds(50,50,200,50);
	nameTag.setFont(new Font(null,Font.PLAIN,12));
	
	frame.add(pscore);
	pscore.setBounds(100, 400, 200, 100);
	pscore.setFont(new Font(null,Font.PLAIN,12));
	frame.add(cscore);
	cscore.setBounds(700, 400, 200, 100);
	cscore.setFont(new Font(null,Font.PLAIN,12));
	
	frame.add(playagain);
	playagain.setBounds(250, 500, 100, 50);
	playagain.addActionListener(this);
	playagain.hide();
	frame.add(back);
	back.setBounds(450, 500, 150, 50);
	back.addActionListener(this);
	back.hide();
	
	
	
		
		
	frame.setLocation(0, 0);								
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	frame.add(panel1, BorderLayout.CENTER);					
	frame.setSize(1500, 700);								
	frame.setTitle("Schere Stein Papier");					
	frame.setVisible(true);				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button1) {
			
			PlayMusic.playButton();
			
			pick = 1;
			SpecialSingleRules.compare();
			ppick.setText("Sie haben Schere ausgewählt");
			showPicks();
			pscore.setText("Player Score: " + SpecialSingleRules.pscore);
			cscore.setText("Computer Score: " + SpecialSingleRules.cscore);
			printing();
			roundcount++;
			announceWinner();
			
			
		}
		
		if(e.getSource()==button2) {
			
			PlayMusic.playButton();
			
			pick = 2;
			SpecialSingleRules.compare();
			ppick.setText("Sie haben Stein ausgewählt");
			showPicks();
			pscore.setText("Player Score: " + SpecialSingleRules.pscore);
			cscore.setText("Computer Score: " + SpecialSingleRules.cscore);
			printing();
			roundcount++;
			announceWinner();
			
			
		}
		
		if(e.getSource()==button3) {
			
			PlayMusic.playButton();
			
			pick = 3;
			SpecialSingleRules.compare();
			ppick.setText("Sie haben Papier ausgewählt");
			showPicks();
			pscore.setText("Player Score: " + SpecialSingleRules.pscore);
			cscore.setText("Computer Score: " + SpecialSingleRules.cscore);
			printing();
			roundcount++;
			announceWinner();
			
			
		}
		
		if(e.getSource()==button4) {
			
			PlayMusic.playButton();
			
			pick = 4;
			SpecialSingleRules.compare();
			ppick.setText("Sie haben Lizard ausgewählt");
			showPicks();
			pscore.setText("Player Score: " + SpecialSingleRules.pscore);
			cscore.setText("Computer Score: " + SpecialSingleRules.cscore);
			printing();
			roundcount++;
			announceWinner();
			
			
		}
		
		if(e.getSource()==button5) {
			
			PlayMusic.playButton();
			
			pick = 5;
			SpecialSingleRules.compare();
			ppick.setText("Sie haben Shpock ausgewählt");
			showPicks();
			pscore.setText("Player Score: " + SpecialSingleRules.pscore);
			cscore.setText("Computer Score: " + SpecialSingleRules.cscore);
			printing();
			roundcount++;
			announceWinner();
			
			
		}
		
if(e.getSource()==playagain) {
			
	PlayMusic.playButton();
	
	roundcount = 0;
			SpecialSingleRules.cscore = 0;
			SpecialSingleRules.pscore = 0;
			
			playagain.hide();
			back.hide();
			
			button1.show();
			button2.show();
			button3.show();
			button4.show();
			button5.show();
			
			pscore.setText("Player Score: " + SpecialSingleRules.pscore);
			cscore.setText("Computer Score: " + SpecialSingleRules.cscore);
			 
			printline.setText("Wählen Sie eine Möglichkeit aus");
			ppick.setText("");
			cpick.setText("");
			
		}

if(e.getSource()==back) {
	
	PlayMusic.playButton();
	
	roundcount = 0;
	
	HighscoreSpecial.compareNormal();
	HighscoreSpecial.saveScores();
			SpecialSingleRules.cscore = 0;
			SpecialSingleRules.pscore = 0;
			
			winSeries = 0;
	
			playagain.hide();
			back.hide();
	
			button1.show();
			button2.show();
			button3.show();
			button4.show();
			button5.show();
	
			pscore.setText("Player Score: " + SpecialSingleRules.pscore);
			cscore.setText("Computer Score: " + SpecialSingleRules.cscore);
	 
			printline.setText("");
			ppick.setText("");
			cpick.setText("");
	 
			frame.dispose();
			GUI gui = new GUI();
	
			}

if(e.getSource()==highscore) {
	
	PlayMusic.playButton();
	
	HighscoreSpecial.compareNormal();
	HighscoreSpecial.saveScores();
	HighscoreSpecial highscore = new HighscoreSpecial();
}
		
		
		
	}
	
public void printing() {
		
		if(SpecialSingleRules.printer == 0) {
			
			printline.setText("Unentschieden");
			
		}
		
		if(SpecialSingleRules.printer == 1) {
			
			printline.setText("Du hast gewonnen :)");
			
		}
		
		if(SpecialSingleRules.printer == 2) {
			
			printline.setText("Du hast verloren :c");
			
		}
	}

public void showPicks() {
	
		if(SpecialSingleRules.cpick == 1) {
		
			cpick.setText("Der Computer hat Schere ausgewählt");
		}
	
		if(SpecialSingleRules.cpick == 2) {
		
			cpick.setText("Der Computer hat Stein ausgewählt");
		}

		if(SpecialSingleRules.cpick == 3) {

			cpick.setText("Der Computer hat Papier ausgewählt");
		}
		if(SpecialSingleRules.cpick == 4) {

			cpick.setText("Der Computer hat Lizard ausgewählt");
		}
		if(SpecialSingleRules.cpick == 5) {

			cpick.setText("Der Computer hat Shpock ausgewählt");
		}
	
}
public void announceWinner() {
	
		if(GUI.winscore == roundcount || SpecialSingleRules.pscore*2 > GUI.winscore || SpecialSingleRules.cscore*2 > GUI.winscore) {
		
		if(SpecialSingleRules.pscore > SpecialSingleRules.cscore) {
			
			printline.setText("Du hast das Spiel gewonnen");
			
			winSeries++;
			
			PlayMusic.playWin();
			
			button1.hide();
			button2.hide();
			button3.hide();
			button4.hide();
			button5.hide();
			
			playagain.show();
			back.show();
			
		}
		if(SpecialSingleRules.cscore > SpecialSingleRules.pscore) {
			
			printline.setText("Du hast das Spiel verloren");
			
			PlayMusic.playLoose();
			
			winSeries = 0;
			
			button1.hide();
			button2.hide();
			button3.hide();
			button4.hide();
			button5.hide();
			
			playagain.show();
			back.show();
			
			
			
		}
		if(SpecialSingleRules.cscore == SpecialSingleRules.pscore) {
			
			printline.setText("Dieses Spiel endet mit einem Unentschieden");
			
			PlayMusic.playDraw();
			
			button1.hide();
			button2.hide();
			button3.hide();
			button4.hide();
			button5.hide();
			
			playagain.show();
			back.show();
			
			
		}
		
		
		
		
		
	}
}
}

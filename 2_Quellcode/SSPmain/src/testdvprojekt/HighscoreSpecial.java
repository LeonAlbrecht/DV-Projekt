package testdvprojekt;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Setzt den Highscore des Spiels
 * 
 * @author Jonas, Adham
 * @param: String firstName(Name des ersten Platzes), int firstScore(Erreichte Punktzahl des ersten Platzes), String SecondName(Name des zweiten Platzes), int secondScore(Erreichte Punktzahl des zweiten Platzes), 
 * String thirdName(Name des dritten Platzes), int thirdScore(Erreichte Punktzahl des dritten Platzes),String fourthName(Name des vierten Platzes), int fourthScore(Erreichte Punktzahl des vierten Platzes), 
 *  String fifthName(Name des f�nften Platzes), int fifthScore(Erreichte Punktzahl des f�nften Platzes)
 * @return: String firstName(Name des ersten Platzes), int firstScore(Erreichte Punktzahl des ersten Platzes), String SecondName(Name des zweiten Platzes), int secondScore(Erreichte Punktzahl des zweiten Platzes), 
 * String thirdName(Name des dritten Platzes), int thirdScore(Erreichte Punktzahl des dritten Platzes),String fourthName(Name des vierten Platzes), int fourthScore(Erreichte Punktzahl des vierten Platzes), 
 *  String fifthName(Name des f�nften Platzes), int fifthScore(Erreichte Punktzahl des f�nften Platzes)
 *
 */

public class HighscoreSpecial implements ActionListener {

	public static String firstName;
	public static int firstScore;
	public static String secondName;
	public static int secondScore;
	public static String thirdName;
	public static int thirdScore;
	public static String fourthName;
	public static int fourthScore;
	public static String fifthName;
	public static int fifthScore;
	
	
	JFrame frame = new JFrame();
	JButton back = new JButton("zur�ck");
	JLabel highscoreTitel =new JLabel("Highscoreliste:");
	JLabel highscore1 = new JLabel();
	JLabel highscore2 = new JLabel();
	JLabel highscore3 = new JLabel();
	JLabel highscore4 = new JLabel();
	JLabel highscore5 = new JLabel();
	
	/**
	 * Frame Anpassungen
	 * 
	 * @author Jonas, Adham
	 *
	 */

	public HighscoreSpecial() {
		
		frame.setLayout(null);
		
		highscoreTitel.setBounds(400,0,700,50);
		highscore1.setBounds(400,50,700,50);
		highscore1.setText("1. Platz:  "+firstName + ": " + firstScore);
		highscore2.setBounds(400,150,700,50);
		highscore2.setText("2. Platz:  "+secondName + ": " + secondScore);
		highscore3.setBounds(400,250,700,50);
		highscore3.setText("3. Platz:  "+thirdName + ": " + thirdScore);
		highscore4.setBounds(400,350,700,50);
		highscore4.setText("4. Platz:  "+fourthName + ": " + fourthScore);
		highscore5.setBounds(400,450,700,50);
		highscore5.setText("5. Platz:  "+fifthName + ": " + fifthScore);
		
		frame.add(highscoreTitel);
		frame.add(highscore1);
		frame.add(highscore2);
		frame.add(highscore3);
		frame.add(highscore4);
		frame.add(highscore5);
		
		frame.add(back);
		back.setBounds(700, 550, 100, 50);
		back.addActionListener(this);
		
		
		frame.setVisible(true);
		frame.setSize(1500, 700);
		frame.setLocation(0,0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Highscore List");
		frame.getContentPane().setBackground(Color.cyan);
		
	}

	
	/**
	 * �berschreibt den neuen Highscore, wenn der alte Score �bertroffen wurde.
	 * 
	 * @author: Jonas, Adham
	 * @param: String firstName(Name des ersten Platzes), int firstScore(Erreichte Punktzahl des ersten Platzes), String SecondName(Name des zweiten Platzes), int secondScore(Erreichte Punktzahl des zweiten Platzes), 
	 * 	String thirdName(Name des dritten Platzes), int thirdScore(Erreichte Punktzahl des dritten Platzes),String fourthName(Name des vierten Platzes), int fourthScore(Erreichte Punktzahl des vierten Platzes), 
	 *  String fifthName(Name des f�nften Platzes), int fifthScore(Erreichte Punktzahl des f�nften Platzes), winSeries(Siegesserie)
	 *  
	 */
	
	public static void compareNormal() {
		
		if(Specialsingle.winSeries > firstScore) {
			
			fifthName = fourthName;
			fifthScore = fourthScore;
			fourthName = thirdName;
			fourthScore = thirdScore;
			thirdName = secondName;
			thirdScore = secondScore;
			secondName = firstName;
			secondScore = firstScore;
			
			firstScore = Specialsingle.winSeries;
			firstName = Specialsingle.name;
		} else {
			
			if(Specialsingle.winSeries > secondScore) {
				
				fifthName = fourthName;
				fifthScore = fourthScore;
				fourthName = thirdName;
				fourthScore = thirdScore;
				thirdName = secondName;
				thirdScore = secondScore;
				
				secondScore = Specialsingle.winSeries;
				secondName = Specialsingle.name;
			} else {
				
				if(Specialsingle.winSeries > thirdScore) {
					
					fifthName = fourthName;
					fifthScore = fourthScore;
					fourthName = thirdName;
					fourthScore = thirdScore;
					
					
					thirdScore = Specialsingle.winSeries;
					thirdName = Specialsingle.name;
				} else {
					
					if(Specialsingle.winSeries > fourthScore) {
						
						fifthName = fourthName;
						fifthScore = fourthScore;
						
						fourthScore = Specialsingle.winSeries;
						fourthName = Specialsingle.name;
					} else {
						
						if(Specialsingle.winSeries > fifthScore) {
							
							fifthScore = Specialsingle.winSeries;
							fifthName = Specialsingle.name;
						}
					}
				}
			}
		}
	}
	
	
	/**
	 * schreibt den Namen in die Highscore Liste
	 * 
	 * @author: Jonas, Adham
	 * @param: String firstName(Name des ersten Platzes), int firstScore(Erreichte Punktzahl des ersten Platzes), String SecondName(Name des zweiten Platzes), int secondScore(Erreichte Punktzahl des zweiten Platzes), 
	 * 	String thirdName(Name des dritten Platzes), int thirdScore(Erreichte Punktzahl des dritten Platzes),String fourthName(Name des vierten Platzes), int fourthScore(Erreichte Punktzahl des vierten Platzes), 
	 *  String fifthName(Name des f�nften Platzes), int fifthScore(Erreichte Punktzahl des f�nften Platzes)
	 *  
	 */
	
	public static void saveScores() {

		try {
			
			File highscoreList = new File("highscoreListSpecial.txt");
			PrintStream writer = new PrintStream(highscoreList);
			
			writer.println(firstName);
			writer.println(secondName);
			writer.println(thirdName);
			writer.println(fourthName);
			writer.println(fifthName);
            writer.println(firstScore);
			writer.println(secondScore);
			writer.println(thirdScore);
			writer.println(fourthScore);
			writer.println(fifthScore);
			
			writer.close();
			
		} catch(FileNotFoundException fnf) {
			
			System.out.println("File not found!");
			
		}
	}

	
	/**
	 * Es wird erkannt, in welche Zeile der Name eingetragen wird.
	 * 
	 * @author: Jonas, Adham
	 * @param: String firstName(Name des ersten Platzes), int firstScore(Erreichte Punktzahl des ersten Platzes), String SecondName(Name des zweiten Platzes), int secondScore(Erreichte Punktzahl des zweiten Platzes), 
	 * 	String thirdName(Name des dritten Platzes), int thirdScore(Erreichte Punktzahl des dritten Platzes),String fourthName(Name des vierten Platzes), int fourthScore(Erreichte Punktzahl des vierten Platzes), 
	 *  String fifthName(Name des f�nften Platzes), int fifthScore(Erreichte Punktzahl des f�nften Platzes)
	 */
	
	public static void loadScores() {
		
		try {
			
			File highscoreList = new File("highscoreListSpecial.txt");
			Scanner fileReader = new Scanner(highscoreList);
			
			firstName = fileReader.nextLine();
			secondName = fileReader.nextLine();
			thirdName = fileReader.nextLine();
			fourthName = fileReader.nextLine();
			fifthName = fileReader.nextLine();
            firstScore = fileReader.nextInt();
			secondScore = fileReader.nextInt();
			thirdScore = fileReader.nextInt();
			fourthScore = fileReader.nextInt();
			fifthScore = fileReader.nextInt();
			
			fileReader.close();
			
		} catch(FileNotFoundException fnf) {
			
			System.out.println("File not Found!");
		}
	}

	
	/**
	 * Zur�ck-Button
	 * 
	 * @author: Jonas, Adham
	 * 
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==back) {
			
			PlayMusic.playButton();
			
			frame.dispose();
		}
		
	}
	

}
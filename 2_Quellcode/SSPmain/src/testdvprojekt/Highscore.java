package testdvprojekt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Highscore implements ActionListener {
	

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
	JButton back = new JButton("back");
	JLabel highscore1 = new JLabel();
	JLabel highscore2 = new JLabel();
	JLabel highscore3 = new JLabel();
	JLabel highscore4 = new JLabel();
	JLabel highscore5 = new JLabel();
	
	public Highscore() {
		
		frame.setLayout(null);
		
		highscore1.setBounds(400,50,700,50);
		highscore1.setText(firstName + ": " + firstScore);
		highscore2.setBounds(400,150,700,50);
		highscore2.setText(secondName + ": " + secondScore);
		highscore3.setBounds(400,250,700,50);
		highscore3.setText(thirdName + ": " + thirdScore);
		highscore4.setBounds(400,350,700,50);
		highscore4.setText(fourthName + ": " + fourthScore);
		highscore5.setBounds(400,450,700,50);
		highscore5.setText(fifthName + ": " + fifthScore);
		
		frame.add(highscore1);
		frame.add(highscore2);
		frame.add(highscore3);
		frame.add(highscore4);
		frame.add(highscore5);
		
		frame.add(back);
		back.setBounds(1300, 550, 100, 50);
		back.addActionListener(this);
		
		
		frame.setVisible(true);
		frame.setSize(1500, 700);
		frame.setLocation(0,0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Highscore List");
		
	}
	
	public static void compareNormal() {
		
		if(Normalsingle.winSeries > firstScore) {
			
			firstScore = Normalsingle.winSeries;
			firstName = Normalsingle.name;
		} else {
			
			if(Normalsingle.winSeries > secondScore) {
				
				secondScore = Normalsingle.winSeries;
				secondName = Normalsingle.name;
			} else {
				
				if(Normalsingle.winSeries > thirdScore) {
					
					thirdScore = Normalsingle.winSeries;
					thirdName = Normalsingle.name;
				} else {
					
					if(Normalsingle.winSeries > fourthScore) {
						
						fourthScore = Normalsingle.winSeries;
						fourthName = Normalsingle.name;
					} else {
						
						if(Normalsingle.winSeries > fifthScore) {
							
							fifthScore = Normalsingle.winSeries;
							fifthName = Normalsingle.name;
						}
					}
				}
			}
		}
	}
	
	public static void saveScores() {
		
		try {
			
			File highscoreList = new File("highscoreList.txt");
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
	
	public static void loadScores() {
		
		try {
			
			File highscoreList = new File("highscoreList.txt");
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

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==back) {
			
			frame.dispose();
		}
		
	}
	

}

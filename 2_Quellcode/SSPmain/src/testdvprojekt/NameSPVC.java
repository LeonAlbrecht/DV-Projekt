package testdvprojekt;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 * kurze Beschreibung: Zum Namen auswählen für Special Single (Highscore)
 * 
 * @author: Adham
 * @return: String name
 */

public class NameSPVC implements ActionListener{
	
	JFrame frame = new JFrame();
	JTextField name = new JTextField();
	JLabel label = new JLabel("What's your name?");
	JButton button = new JButton("OK");
	
	
	
	public NameSPVC() {

		frame.setLayout(null);
		frame.setLocation(0,0);
		
		try {
            frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("pictures/background2.png")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		
		frame.add(name);
		name.setBounds(420, 500, 300, 50);
		name.setFont(new Font(null,Font.PLAIN,12));
		
		frame.add(label);
		label.setBounds(550, 200, 300, 20);
		label.setFont(new Font(null,Font.PLAIN,16));
		
		frame.add(button);
		button.setBounds(720, 500, 100, 50);
		button.addActionListener(this);
		
		
		frame.setVisible(true);
		frame.setSize(1500,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Choose Name!");
		
	}
	
	/**
	 * kurze Beschreibung: Button zum Weiterleiten zum Special Single Screen
	 * 
	 * @author: Adham
	 * 
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
			
		if(e.getSource()==button) {
			
			PlayMusic.playButton();
			
			Specialsingle.name = name.getText();
			Specialsingle spvc = new Specialsingle();
			HighscoreSpecial.loadScores();
			frame.dispose();
			
		}
		
	}

}
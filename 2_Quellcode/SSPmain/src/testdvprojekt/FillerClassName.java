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
 * Zum Namen auswählen für Normal Single (Highscore)
 * 
 * @author: Adham
 * @return: String name
 */

public class FillerClassName implements ActionListener{
	
	JFrame frame = new JFrame();
	JTextField name = new JTextField();
	JLabel label = new JLabel("Geben Sie Ihren Namen ein");
	JButton button = new JButton("OK");
	
	
	
	public FillerClassName() {
		
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
		label.setBounds(550, 200, 200, 20);
		label.setFont(new Font(null,Font.ITALIC,16));
		
		frame.add(button);
		button.setBounds(720, 500, 100, 50);
		button.addActionListener(this);
		
		
		frame.setVisible(true);
		frame.setSize(1500,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Choose Name!");
		
	}

	
	/**
	 * Button zum Weiterleiten zum Special Single Screen
	 * 
	 * @author: Adham
	 * 
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		
		if(e.getSource()==button) {
			
			PlayMusic.playButton();
			
			Normalsingle.name = name.getText();
			Normalsingle npvc = new Normalsingle();
			Highscore.loadScores();
			frame.dispose();
			
		}
		
	}

}

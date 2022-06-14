package testdvprojekt;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FillerClassName2 implements ActionListener{
	
	JFrame frame = new JFrame();
	JTextField name = new JTextField();
	JLabel label = new JLabel("What's your name?");
	JButton button = new JButton("OK");
	
	public FillerClassName2() {
		
		frame.setLayout(null);
		frame.setLocation(0,0);
		
		frame.add(name);
		name.setBounds(500, 300, 300, 50);
		name.setFont(new Font(null,Font.PLAIN,12));
		
		frame.add(label);
		label.setBounds(600, 200, 300, 100);
		label.setFont(new Font(null,Font.PLAIN,12));
		
		frame.add(button);
		button.setBounds(800, 300, 100, 50);
		button.addActionListener(this);
		
		
		frame.setVisible(true);
		frame.setSize(1500,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Choose Name!");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button) {
		
		Normalduo.name = name.getText();
		Normalduo npvp = new Normalduo();
		frame.dispose();
		
		}
		
	}

}

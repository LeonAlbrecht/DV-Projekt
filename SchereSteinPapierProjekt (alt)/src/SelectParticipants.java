import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SelectParticipants implements ActionListener{

	JFrame frame = new JFrame();
	JLabel label = new JLabel("SelectPlayers");
	JButton pbutton = new JButton("PvP");
	JButton cbutton = new JButton("PvC");
	
	SelectParticipants(){
		
		label.setBounds(0,0,200,100);
		label.setFont(new Font(null,Font.PLAIN,25));
		
		pbutton.setBounds(50,200,100,50);
		pbutton.setFocusable(false);
		pbutton.addActionListener(this);
		
		cbutton.setBounds(650,200,100,50);
		cbutton.setFocusable(false);
		cbutton.addActionListener(this);
		
		frame.add(cbutton);
		frame.add(pbutton);
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==pbutton) {
			
			frame.dispose();
			PvPModeSelector PvPMode = new PvPModeSelector();
			
		}
		
		if(e.getSource()==cbutton) {
			
			frame.dispose();
			PvCModeSelector PvCMode = new PvCModeSelector();
		}
		
	}
	
}

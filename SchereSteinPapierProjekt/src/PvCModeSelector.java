import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PvCModeSelector implements ActionListener{
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Select Mode For PvC");
	JButton nbutton = new JButton("Normal");
	JButton sbutton = new JButton("LizardShpock");
	
	PvCModeSelector() {
		
		label.setBounds(0,0,300,100);
		label.setFont(new Font(null,Font.PLAIN,25));
		
		nbutton.setBounds(50,200,100,50);
		nbutton.setFocusable(false);
		nbutton.addActionListener(this);
		
		sbutton.setBounds(650,200,100,50);
		sbutton.setFocusable(false);
		sbutton.addActionListener(this);
		
		frame.add(nbutton);
		frame.add(sbutton);
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,400);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==nbutton) {
			
			frame.dispose();
			NormalPvC npvc = new NormalPvC();
			
		}
		
		if(e.getSource()==sbutton) {
			
			frame.dispose();
			SpecialPvC spvc = new SpecialPvC();
			
		}
		
	}

}

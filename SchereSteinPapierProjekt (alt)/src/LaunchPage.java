import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener{
	
	JFrame launchpageFrame = new JFrame();
	JButton launchPageButton = new JButton("Start Game");
	
	
	LaunchPage(){
		
		launchPageButton.setBounds(350,150,100,50);
		launchPageButton.setFocusable(false);
		launchPageButton.addActionListener(this);
		
		launchpageFrame.add(launchPageButton);
		launchpageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		launchpageFrame.setSize(800,400);
		//launchpageFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		launchpageFrame.setLayout(null);
		launchpageFrame.setVisible(true);
		launchpageFrame.setResizable(false);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==launchPageButton) {
			
			launchpageFrame.dispose();
			SelectParticipants selectP = new SelectParticipants();
			
		}
		
	}

}

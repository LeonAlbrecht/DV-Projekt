package testdvprojekt;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Normalduo implements ActionListener {
	
	public int pick1;
	public int pick2;
	
	public int p1score = 0;
	public int p2score = 0;
	
	
	
	
	JFrame frame = new JFrame();
	JPanel panel1= new JPanel();
	JButton button11 = new JButton("Schere");
	JButton button12 = new JButton("Stein");
	JButton button13 = new JButton("Papier");
	JButton button21 = new JButton("Schere2");
	JButton button22 = new JButton("Stein2");
	JButton button23 = new JButton("Papier2");
	JLabel text = new JLabel("Text");
	
	
	Normalduo() {
		
		frame.add(button11);
		button11.setBounds(100,500,100,50);
		button11.addActionListener(this);
		frame.add(button12);
		button12.setBounds(400,500,100,50);
		button12.addActionListener(this);
		frame.add(button13);
		button13.setBounds(700,500,100,50);
		button13.addActionListener(this);
		frame.add(button21);
		button21.setBounds(100,500,100,50);
		button21.addActionListener(this);
		button21.hide();
		frame.add(button22);
		button22.setBounds(400,500,100,50);
		button22.addActionListener(this);
		button22.hide();
		frame.add(button23);
		button23.setBounds(700,500,100,50);
		button23.addActionListener(this);
		button23.hide();
		
		frame.add(text);
		text.setBounds(650,100,200,100);
		text.setFont(new Font(null,Font.PLAIN,12));
	
		
		frame.setLocation(0, 0);								
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.add(panel1, BorderLayout.CENTER);					
		frame.setSize(1500, 700);								
		frame.setTitle("Schere Stein Papier");					
		frame.setVisible(true);
		
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button11) {
			
			pick1 = 1;
			hideButtons();
			text.setText("Please look away while Player 2 picks!");
			
			
		}
		
		if(e.getSource()==button12) {
			
			pick1 = 2;
			hideButtons();
			text.setText("Please look away while Player 2 picks!");
			
		}
		
		if(e.getSource()==button13) {
			
			pick1 = 3;
			hideButtons();
			text.setText("Please look away while Player 2 picks!");
			
		}
		
		if(e.getSource()==button21) {
			
			pick2 = 1;
			compare();
			revButtons();
			//TimeUnit.SECONDS.sleep(5);
			text.setText("Please look away while Player 1 picks!");
			
		}
		
		if(e.getSource()==button22) {
			
			pick2 = 2;
			compare();
			revButtons();
			text.setText("Please look away while Player 1 picks!");
			
		}
		
		if(e.getSource()==button23) {
			
			pick2 = 3;
			compare();
			revButtons();
			text.setText("Please look away while Player 1 picks!");
			
		}
		
	}
	
	public void compare() {
		
		if(pick1==1) {
			
			if(pick2==1) {
				
				text.setText("Unentschieden");
				
			}
			
			if(pick2==2) {
				
				p2score++;
				text.setText("Player 2 wins");
				
			}
			
			if(pick2==3) {
				
				p1score++;
				text.setText("Player 1 wins");
				
			}
		}
		
		if(pick1==2) {
			
			if(pick2==1) {
				
				p1score++;
				text.setText("Player 1 wins");
				
			}
			
			if(pick2==2) {
				
				text.setText("Unentschieden");
				
			}
			
			if(pick2==3) {
				
				p2score++;
				text.setText("Player 2 wins");
				
			}
		}
		
		if(pick1==3) {
			
			if(pick2==1) {
				
				p2score++;
				text.setText("Player 2 wins");
				
			}
			
			if(pick2==2) {
				
				p1score++;
				text.setText("Player 1 wins");
				
			}
			
			if(pick2==3) {
				
				text.setText("Unentschieden");
				
			}
		}
	}
	
	public void hideButtons() {
		
		button11.hide();
		button12.hide();
		button13.hide();
		button21.show();
		button22.show();
		button23.show();
		
	}
	
	public void revButtons() {
		
		button11.show();
		button12.show();
		button13.show();
		button21.hide();
		button22.hide();
		button23.hide();
		
	}
	
	
}

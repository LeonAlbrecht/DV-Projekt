package test1;

import javax.swing.JFrame;

public class abc {
	
	JFrame frame;
	
	public abc() {
		frame= new JFrame();
		frame.setLocation(0, 0);								
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);						
		frame.setSize(1500, 700);								
		frame.setTitle("Schere Stein Papier");					
		frame.setVisible(true);					
	}
	public static void main(String[] args) {
		new abc();{
			
		}

	}

}

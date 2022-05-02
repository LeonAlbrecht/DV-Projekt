package testdvprojekt;


import javax.swing.JFrame;


public class startbildschirm {
	JFrame rahmen;
	
	
	public startbildschirm() {
		rahmen.setVisible(true);								//Rahmen wird angezeig
		rahmen.setSize(500, 300);								// größe des Rahmens
		rahmen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //bei schließen wird Programm geschlossen
		rahmen.setLocationRelativeTo(null);						//Pos wo der Rahmen angezeigt wird (in der Mitte)
		rahmen.setTitle("Titel des Rahmens");					//Titel im Rahmen
	}

}

package testdvprojekt;

import java.util.Scanner;

public class testmain {

	public static void main(String[] args) {
	
	
	System.out.println("Gib Schere Stein oder Papier ein!");
	Scanner sc = new Scanner(System.in); 
	String i = sc.next(); 
	System.out.println("Das Objekt "+i+" wurde von dir ausgewählt.");
	
	double r=Math.random();
	int computer=1+(int)(r*3);

	if(computer<2) {
		
		System.out.println("der Computer hat Schere ausgewählt");
		if(i.equals("Schere")) {
			System.out.println("somit Unentschieden");
		}
		if(i.equals("Stein")) {
			System.out.println("Du hast gewonnen");
		}
		if(i.equals("Papier")) {
			System.out.println("Du hast verloren");
		}
	}	
	if(computer==2) {
		System.out.println("der Computer hat Stein ausgewählt");
		if(i.equals("Schere")) {
			System.out.println("Du hast verloren");
		}
		if(i.equals("Stein")) {
			System.out.println("somit Unentschieden");
		}
		if(i.equals("Papier")) {
			System.out.println("Du hast gewonnen");
		}
	}
	if(computer>2) {
		System.out.println("der Computer hat Papier ausgewählt");
		if(i.equals("Schere")) {
			System.out.println("Du hast gewonnen");
		}
		if(i.equals("Stein")) {
			System.out.println("Du hast verloren");
		}
		if(i.equals("Papier")) {
			System.out.println("somit Unentschieden");
		}
	}
	
	
	
	
		
	}

}

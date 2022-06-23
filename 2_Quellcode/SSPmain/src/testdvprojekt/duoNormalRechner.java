package testdvprojekt;

public class duoNormalRechner {
	
	public static void compareClientPicks() {
		
		if(Normalduo.client1Pick == 1) {
			
			if(Normalduo.client2Pick == 1) {
				
				System.out.println("Unentschieden");
			}
			
			if(Normalduo.client2Pick == 2) {
				
				System.out.println("Spieler 2 gewinnt");
			}
			
			if(Normalduo.client2Pick == 3) {
				
				System.out.println("Spieler 1 gewinnt");
			}
		}
		
if(Normalduo.client1Pick == 2) {
			
			if(Normalduo.client2Pick == 1) {
				
				System.out.println("Spieler 1 gewinnt");
			}
			
			if(Normalduo.client2Pick == 2) {
				
				System.out.println("Unentschieden");
			}
			
			if(Normalduo.client2Pick == 3) {
				
				System.out.println("Spieler 2 gewinnt");
			}
		}

if(Normalduo.client1Pick == 3) {
	
	if(Normalduo.client2Pick == 1) {
		
		System.out.println("Spieler 2 gewinnt");
	}
	
	if(Normalduo.client2Pick == 2) {
		
		System.out.println("Spieler 1 gewinnt");
	}
	
	if(Normalduo.client2Pick == 3) {
		
		System.out.println("Unentschieden");
	}
}
	}

}

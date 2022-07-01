package testdvprojekt;

public class testmain2 {
	/**
	 * kurze Beschreibung: Rechnet den Gewinner aus, Zeigt mögliche Auswahlkombinationen an
	 * 
	 * @author: Burak, Melih
	 * @param:  int cpick(Pick vom Computer), int pscore(Anzahl der Spielerpunkte), int cscore(Anzahl der Computerpunkte), int printer(zeigt wer die Runde gewonnen hat)
	 * 
	 */
	
	public static int pscore = 0;
	public static int cscore = 0;
	
	public static int printer;
	
	public static int cpick;

	


	public static void compare() {
		/**
		 * kurze Beschreibung: Vergleicht die beiden Picks
		 * 
		 * @author: Burak, Melih
		 * @param: int pick(Pick vom Spieler), int computer (Randomzahl zwischen 1-5)
		 * @return: cpick(Pick vom Computer), printer(Zeigt wer gewonnen hat)
		 * 
		 */
		
		double r=Math.random();
		int computer=1+(int)(r*3);
		
		if(computer<2) {
			
			cpick = 1; // Schere
			
			if( Normalsingle.a == 1) {
				
				printer = 0;
			}
			if(Normalsingle.a == 2) {
				
				printer = 1;
				pscore++;
			}
			if(Normalsingle.a == 3) {
				
				printer = 2;
				cscore++;
			}
			
}
		
		if(computer==2) {
			
              cpick = 2; // Stein

			if(Normalsingle.a == 1) {
				
				printer = 2;
				cscore++;
			}
			if(Normalsingle.a == 2) {
				
				printer = 0;
			}
			if(Normalsingle.a == 3) {
				
				printer = 1;
				pscore++;
			}
		}
		
		if(computer>2) {
			
			cpick = 3; // Papier
			
			if(Normalsingle.a == 1) {
				
				printer = 1;
				pscore++;
			}
			if(Normalsingle.a == 2) {
				
				printer = 2;
				cscore++;
			}
			if(Normalsingle.a == 3) {
				
				printer = 0;
			}
		}

}
	
	
}
package testdvprojekt;

public class testmain2 {
	
	
	public static int pscore = 0;
	public static int cscore = 0;
	
	public static int printer;
	
	public static int cpick;
	
	


	public static void compare() {
		
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
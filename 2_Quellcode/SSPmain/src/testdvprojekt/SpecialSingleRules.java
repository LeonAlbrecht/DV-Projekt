package testdvprojekt;

public class SpecialSingleRules {
	
	public static int cpick;
	
	public static int pscore = 0;
	public static int cscore = 0;
	
	public static int printer;
	
	public static void compare() {
		
		double r= Math.random();
		int computer = 1 + (int) (r*5);
		
		if(computer==1) {
			
			cpick = 1; // Schere
			
if(Specialsingle.pick==1) {  // vs Schere
				
	printer = 0;
	
}
if(Specialsingle.pick==2) { // vs Stein
	
	printer = 1;
	pscore++;
	
}
if(Specialsingle.pick==3) { // vs Papier
	
	printer = 2;
	cscore++;
	
}
if(Specialsingle.pick==4) { // Lizard
	
	printer = 2;
	cscore++;
	
}
if(Specialsingle.pick==5) { // vs Shpock
	
	printer = 1;
	pscore++;
	
}
			
		}
		
		if(computer==2) {
			
			cpick = 2; // Stein
			
if(Specialsingle.pick==1) { // vs Schere
	
	printer = 2;
	cscore++;
				
}
if(Specialsingle.pick==2) { // vs Stein
	
	printer = 0;
	
}
if(Specialsingle.pick==3) { // vs Papier
	
	printer = 1;
	pscore++;
	
}
if(Specialsingle.pick==4) { // vs Lizard
	
	printer = 2;
	cscore++;
	
}
if(Specialsingle.pick==5) { // vs Shpock
	
	printer = 1;
	pscore++;
	
}
		}
		
		if(computer==3) {
			
			cpick = 3; // Papier
			
if(Specialsingle.pick==1) { // vs Schere
	
	printer = 1;
	pscore++;
				
			}
if(Specialsingle.pick==2) { // vs Stein
	
	printer = 2;
	cscore++;
	
}
if(Specialsingle.pick==3) { // vs Papier
	
	printer = 0;
	
}
if(Specialsingle.pick==4) { // vs Lizard
	
	printer = 1;
	pscore++;
	
}
if(Specialsingle.pick==5) { // vs Shpock
	
	printer = 2;
	cscore++;
	
}
			
		}
		
		if(computer==4) {
			
			cpick = 4; // Lizard
			
if(Specialsingle.pick==1) { // vs Schere
	
	printer = 1;
	pscore++;
				
			}
if(Specialsingle.pick==2) { // vs Stein
	
	printer = 1;
	pscore++;
	
}
if(Specialsingle.pick==3) { // vs Papier
	
	printer = 2;
	cscore++;
	
}
if(Specialsingle.pick==4) { // vs Lizard
	
	printer = 0;
	
}
if(Specialsingle.pick==5) { // vs Shpock
	
	printer = 2;
	cscore++;
	
}
			
		}
		
		if(computer==5) {
			
			cpick = 5; // Shpock
			
if(Specialsingle.pick==1) { // vs Schere
	
	printer = 2;
	cscore++;
				
			}
if(Specialsingle.pick==2) { // vs Stein
	
	printer = 2;
	cscore++;
	
}
if(Specialsingle.pick==3) { // vs Papier
	
	printer = 1;
	pscore++;
	
}
if(Specialsingle.pick==4) { // vs Lizard
	
	printer = 1;
	pscore++;
	
}
if(Specialsingle.pick==5) { // vs Shpock
	
	printer = 0;
	
}
			
		}
	}
}

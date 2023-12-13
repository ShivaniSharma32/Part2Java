package Downcasting;

public class Cab {
	
	
	String location;
	int arriving_time;
}
	class MiniCab extends Cab{
		double price=200;
		
	}
 class LuxCab extends Cab{
	 double price=500;
	 
 }
 class SedanCab extends Cab{
	 double price= 780;
 }


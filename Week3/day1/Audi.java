package week3.day1;

public class Audi extends Car{
	
	public void airBags() {
		System.out.println("AirBags -> From Audi class");

	}
	
	public static void main(String[] args) {
		Audi ac = new Audi();
		ac.applyBrake();
		ac.soundHorn();
		ac.seatBelt();
		ac.airBags();
		
	}
	
	

}

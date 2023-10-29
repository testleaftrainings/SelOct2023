package week3.day1;

public class Car extends Vehicle{
	
	public void applyBrake() {
		System.out.println("ABS Brake-> From car class");

	}
	
	public void seatBelt() {
		
       System.out.println("Seat belt -> From Car class");
	}
	
	
	
	public static void main(String[] args) {
		
		Car car = new Car();
		//Vehicle vec = new Vehicle();
		//vec.applyBrake();
		car.seatBelt();
		car.applyBrake();
		car.soundHorn();
		
	}

}

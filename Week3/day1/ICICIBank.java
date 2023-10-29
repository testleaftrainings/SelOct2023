package week3.day1;

public class ICICIBank implements RBI,SingaporeRBS{

	@Override
	public String knowYourCustomer() {
		
		return "PANCARD";
	}

	@Override
	public void cibilScore() {
	System.out.println("800");
		
	}
	@Override
	public void interestRate() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		ICICIBank ic = new ICICIBank();
		System.out.println(ic.knowYourCustomer());
		ic.cibilScore();
	}

	

}

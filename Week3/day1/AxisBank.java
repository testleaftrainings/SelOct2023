package week3.day1;

public class AxisBank implements RBI{

	
	public String knowYourCustomer() {

		return "AADHAR";

	}
	
	
	public void minimumBalance() {
        System.out.println("1000");

	}

	public void goldLoan() {
       System.out.println("10L");

	}

	
	public void cibilScore() {
		System.out.println("700");
	}
	
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		System.out.println(ab.knowYourCustomer());
		ab.minimumBalance();
		ab.goldLoan();
		ab.cibilScore();
		System.out.println(ab.withDrawaLimit);
	}

	
}

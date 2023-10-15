package week1.day2;

public class LearnMethods {
	//global variable
	public int balance;

	//depositAmount
	//type method name -> ctrl+spae -> click enter
	// accessmodifier returntype methodname(input arguments)
	public void depositAmount(int amount) {  	
		balance	= amount;
		System.out.println(amount);
	}
	
	private int getBalance() {
		return balance;
	}

	 String getBicycleColour() {
	      return "black";

	}
	
	public float addTwoNumbers(int num1, float num2) {
		float result=num1+num2;
		return result;

	}
   
	
	public boolean isPrimeNumber() {
		
		return true;

	}

	public static void main(String[] args) {
		//Classname objectname = new ClassName();
		LearnMethods bank = new LearnMethods(); 
		bank.depositAmount(50000);
		float output = bank.addTwoNumbers(34, 45.2f);
		System.out.println(output);

	}



}

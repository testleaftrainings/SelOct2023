package week3.day1;

public class Calculator {
	
	public void add() {
		int a =10;
		int b = 20;
		System.out.println(a+b);

	}
	
	public void add(int num1,double num2) {
		System.out.println(num1+num2);

	}

	public void add(double num1,int num2) {
		System.out.println(num1+num2);

	}
	
	public void add(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);

	}
	
	public void add(int num1,float num2,int num3) {
		System.out.println(num1+num2+num3);

	}
	public void add(int num1,float num2,int num3,int num4, int num5) {
		System.out.println(num1+num2+num3);

	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(23, 23.4f, 900);
		
	}

}

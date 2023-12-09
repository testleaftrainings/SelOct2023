package week9.day1;

public class LearnTryWithMultipleCatch {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		int[] values = {10,20,30}; //0,1,2
		
		try {
			System.out.println(x / y);
			System.out.println(values[3]);
			
		} 
		catch (ArithmeticException e) {
			System.out.println(x/1);
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			int length = values.length;
			System.out.println(values[length-1]);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("End of program");

	}

}

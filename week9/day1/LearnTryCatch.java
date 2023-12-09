package week9.day1;

public class LearnTryCatch {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		
		try {
			System.out.println(x / y);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println( x / 1);
			
		}
		
		System.out.println("End of program");

	}

}

package week9.day1;

public class LearnThrow {

	public static int divide(int num1, int num2) {
		int res = 0;
		if(num1 > num2) {
			res = num1 / num2;
		}else {
			throw new ArithmeticException("First argument value is smaller than the second one");
		}
		return res;
	}

	public static void main(String[] args) {
		int result = 0;
		try {
			result = divide(10, 20);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(result);
	}
}

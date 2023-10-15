package week1.day2;

public class FindEvenNumbers {
	public static void main(String[] args) {
		//print odd numbers from 1 to 10
		//1 3 5 7
		int maxRange = 20;
		//i%2==1
		for (int i = 1; i <= maxRange; i++) {//i=1; 1<=20
			if(i%2==0) {//3%2 == 1 
			System.out.println(i);//1 3
			}
		}
	}

}

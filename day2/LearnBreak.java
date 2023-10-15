package week1.day2;

public class LearnBreak {
	public static void main(String[] args) {
		// print numbers from 1 to 10
		// when i == 3 ; print that number in words
		//stop the iteration
		for (int i = 1; i <=10; i++) {//i=3; 3<=10;
			if(i==3) {//3==3 -> t
				System.out.println("Three");//three
				break;
			}
			System.out.println(i);//1 2 three 3 4 5 6 7 8 9 10
		}
	}

}

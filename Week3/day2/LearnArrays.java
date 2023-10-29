package week3.day2;

import java.util.Arrays;

public class LearnArrays {
	public static void main(String[] args) {

		//scores
		//datatype[]  variablename = {values};
		//               0  1  2 3  4
		int[] scores = {98,78,75,90,92};

		//find the length of the array
		int length = scores.length;
		System.out.println("The length of this array is : "+length);
		
		//to retrieve a single element from the array
		System.out.println("The thirdscore of this Array is : "+scores[2]);
		
		//to sort an array                    0  1  2  3  4
		Arrays.sort(scores); //after sorting 75 78 90 92 98
		System.out.println("After Sorting : "+scores[2]);
		
		//find the maximum value of this array
		System.out.println("The max value of this array: "+scores[length-1]);//scores[5-1]//scores[4]=98
		
		//find the min value
		System.out.println("The min value: "+scores[0]);
		
		//find the second largest element of this array
		System.out.println("The second largest value : "+scores[length-2]);//scores[5-2]//scores[3]=92
		
		//ArrayIndexOutOfBoundsException
		//to print all values of this array
		for (int i = 0; i <=length-1; i++) {// i=0;i<=5;i++
			System.out.println(scores[i]);// scores[0]= 75 scores[1]=78 scores[2] = 90 scores[3] = 92 scores[4]=98 scores[5]=
			
		}
		System.out.println("==================");
		//to print all values in reverse order
		for (int i = scores.length-1; i >=0; i--) {
			System.out.println(scores[i]);//i=0; i>=0;i-- scores[0]=75
		}
		

	}

}

package week3.day2;

public class FindDuplicates {
	public static void main(String[] args) {
		int[] nums = {2, 5, 7, 7, 5, 9, 2, 3};
		//output = 2 5 7

		//Declare an outer loop
		for (int i = 0; i < nums.length; i++) {//i=0 

			//declare an inner loop
			for (int j = i+1; j < nums.length; j++) {// j

				//compare both the arrays using if condition
				if (nums[i]==nums[j]) {
					//print the array value
					System.out.println(nums[i]);
				}



			}


		}

	}

}

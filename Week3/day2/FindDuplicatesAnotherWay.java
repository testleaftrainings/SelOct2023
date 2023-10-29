package week3.day2;

import java.util.Arrays;

public class FindDuplicatesAnotherWay {
	public static void main(String[] args) {
		int[] nums = {2, 5, 7, 7, 5, 9, 2, 3};
		int[] nums1 = new int[5];
		//output = 2 5 7

		Arrays.sort(nums);// 2,3,3,5,5,7,7,9
		
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i]==nums[i+1]) { 
				System.out.println(nums[i]);
			}
		}

	}

}

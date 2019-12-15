package lab5_1;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {

		int[] nums = { 16, 35, 7, 1, -4, 36, 49 };
//		int[] nums = {-2,45,0,11,-9};
//		int[] nums = {16,35,7,1,4};
		System.out.println(Arrays.toString(nums));

		//implement
	
		for (int i = 0; i < nums.length; i++) {		
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i] > nums[j]) {
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}				
			}
			//System.out.println(Arrays.toString(nums));
		}
		
		System.out.println(Arrays.toString(nums));
		
//		[-4, 35, 7, 1, 16, 36, 49] is the expected output.
	}
}

package lab5_1;

import java.util.Arrays;

/**
 *
 * swap the smallest element to 0th position in the array
 *
 */
public class SmallestElement {

	public static void main(String[] args) {

		int[] nums = { 16, 35, 7, 1, -4, 36, 49 };
		System.out.println(Arrays.toString(nums));

		//implement
		int i, min, index;
		index = 0;
		min = nums[index];
		for (i = 1; i < nums.length; i++) {			
			if(nums[i]<min) {
				index = i;
				min = nums[i];
			}
		}
		int tmp = nums[index];
		nums[index] = nums[0];
		nums[0] = tmp;
		
		System.out.println(Arrays.toString(nums));
		
//		[-4, 35, 7, 1, 16, 36, 49] is the expected output.
	}

}

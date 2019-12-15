package lab5_1;

import java.util.Arrays;


public class Search {
	
	public static boolean binarySearch(int[] arr, int key) {
		int left = 0, right = arr.length - 1;
		while(left <= right) {
			int mid = (left+right)/2;
			if(arr[mid] == key) return true;
			else if(key < arr[mid]) right = mid-1;
			else left = mid + 1;
			//System.out.println("left:" + left + " right:" + right + " mid:"+mid);
		}		
		return false;
		
	}
	
	public static boolean linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {	
			if(arr[i] == key) return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		int[] nums = { -4, 1, 7, 16, 35, 36, 49 };
		
		System.out.println("Is 16 in the Array?: " + linearSearch(nums, 16));
		System.out.println("Is 7 in the Array?: " + linearSearch(nums, 7));
		System.out.println("Is 40 in the Array?: " + linearSearch(nums, 40));
		System.out.println();
		System.out.println("Is 16 in the Array?: " + binarySearch(nums, 16));
		System.out.println("Is 7 in the Array?: " + binarySearch(nums, 7));
		System.out.println("Is 40 in the Array?: " + binarySearch(nums, 40));

	}

}

package lab5_1;
import java.util.Arrays;

public class AddElement {

	public static void main(String[] args) {

		int[] nums = new int[8];		
		nums[0] = 4;
		nums[1] = 5;
		nums[2] = 7;
		nums[3] = 1;
		nums[4] = 3;
		
		System.out.println(Arrays.toString(nums));
		
		//implement
		//added element 9 at pos 1: [4, 9, 5, 7, 1, 3, 0, 0]
		
		int pos = 1, lastIndex = 4, value = 9, i;		
		
		for (i = lastIndex; i >= pos; i--) {	
			
			nums[i+1] = nums[i];			
		}
		
		nums[pos] = value;		
		lastIndex++;
		System.out.println(Arrays.toString(nums));	

	}

}

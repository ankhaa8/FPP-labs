package lab11_4_code;

import java.util.HashMap;
import java.util.Map;

class CountWord {
	// This function prints frequencies of all elements
	static void printFreq(String arr[]) {
		// Creates an empty HashMap
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		
		//implement
		int count;
		for(String str:arr) {
			count = 0;
			for(String s:arr) {
				if(str.equals(s) && !hmap.containsKey(s)) count++; 
			}
			if(!hmap.containsKey(str)) hmap.put(str, count);
			
		}
		
		// Print result
		for (Map.Entry<String, Integer> m : hmap.entrySet())
			System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
	}

	// Driver method to test above method
	public static void main(String[] args) {
		String arr[] = { "andy", "mike", "andy", "andy", "andy", "mike", "emma" };
		printFreq(arr);
	}
}
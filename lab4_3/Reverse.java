package lab4_3;
import java.util.*;

public class Reverse {
	StringBuilder sb = new StringBuilder();
	
	public String reverse(String s) { 		
		return reverseUtil(s, s.length()-1);
	}

	private String reverseUtil(String s, int len) { 
		if(len <0) return sb.toString();
		sb.append(s.charAt(len));		
		return reverseUtil(s, len - 1);
	}	

}

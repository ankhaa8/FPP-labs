package lab4_4;

import java.util.Arrays;

public class BinarySearchStrTest {

	public static void main(String[] args) {
		BinarySearchStr r = new BinarySearchStr();	
		String s = "abcdefghijk";//
		r.sort(s);	
		char c = 'e';
		System.out.println(r.search(s, c));
		//System.out.println(s.substring(s.length()/2+1));	
		//System.out.println(s.substring(0,s.length()/2));

	}

}

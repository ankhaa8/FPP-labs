package lab2_8.nested;

import lab2_8.MyClass;

public class CallingClass {
	public static String readVal(){
		MyClass cl = new MyClass();
		return cl.getVal(); //produces a compiler error -- how to fix?
		//return null;
	}
	public static void main(String[] args) {
		System.out.println(readVal());
	}
}

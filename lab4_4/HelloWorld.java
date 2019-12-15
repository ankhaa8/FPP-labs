package lab4_4;

public class HelloWorld {
	public static String Hello() {
		return "Hello";
	}
	public static String join(String str1, String str2) {
		if(str1.length() == 0 && str2.length() == 0)
			return "Empty";
		else return str1+str2;
	}
	public static int multiply(int x, int y) {
		return x*y;
	}
	public static void main(String[] args) {
		

	}

}

package lab4_2;


public class Factorial {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println(f.factorialWithoutRecursion(5) );

	}
	private int factorialWithoutRecursion(int n) {
		int s = 1;
		for(int i=1;i<=n;i++) {
			s*=i;
		}
		return s;
	}

}

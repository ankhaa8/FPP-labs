package lab4_2;

import java.util.Arrays;


public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		System.out.println(f.fibWithoutRecursion(5));
	}

	private int fibWithoutRecursion(int n) {
		int [] fb = new int[n];
		fb[0] = 0;
		fb[1] = 1;
		for(int i = 2; i<n; i++) {
			fb[i] = fb[i-1] + fb[i-2];
		}
		int nn = fb[n-1];
		return nn;
	}
}

package recursion;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=factorial(n);
		System.out.print(factorial(n));
	}
	public static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		int f=n*factorial(n-1);
		return f;
	}
}

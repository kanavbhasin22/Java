package functions;

import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		int pow=power(x,n);
		System.out.print(pow);
	}
	public static int power(int x,int n) {
		if(n==0) {
			return 1;
		}
		int pow=power(x,n/2);
		if(n%2==1) {
			return pow*pow*x;
		}
		else {
			return pow*pow;
		}
	}

}

package functions;

import java.util.Scanner;

public class decimal_to_anybase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int tb=sc.nextInt();
		int a=convert(n,tb);
		System.out.print(a);
	}
	public static int convert(int n, int tb) {
		int mul=1;
		int sum=0;
		while(n>0) {
			int rem=n%tb;
			sum=sum+rem*mul;
			mul=mul*10;
			n=n/tb;
		}
		return sum;
	}

}

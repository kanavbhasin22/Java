package functions;

import java.util.Scanner;

public class Anybase_to_decimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sb=sc.nextInt();
		int a=convert(1423,5);
		System.out.print(a);

	}
	public static int convert(int n,int sb) {
		int mul=1;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+ rem*mul;
			mul=mul*sb;
			n=n/10;
		}
		return sum;
	}

}

package oops;

public class overloading {
	public static int sum(int a ,int b) {
		return a+b;
	}
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
	
	public static int sum(int... args) {
		int sum=0;
		for(int val:args) {
			sum+=val;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sum(2,3));
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
	}

}

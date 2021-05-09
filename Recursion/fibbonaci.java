package recursion;
import java.util.*;
public class fibbonaci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=fib(n);
		System.out.print(ans);

	}
public static int fib(int n) {
	if(n==1||n==0) {
		return n;
	}
	int x=fib(n-1)+fib(n-2);
	return x;
}
}

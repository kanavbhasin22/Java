package recursion;
import java.util.*;
public class sum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=sum_n(n);
		System.out.print(ans);
	}
	public static int sum_n(int n) {
		if(n==0) {
			return 0;
		}
		int sum=n+sum_n(n-1);
		return sum;
	}
}

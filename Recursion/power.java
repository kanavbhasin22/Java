package recursion;
import java.util.*;
public class power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ans=power(a,b);
		System.out.print(ans);
	}
	public static int power(int a,int b) {
		if(b==0) {
			return 1;
		}
		int pow=a*power(a,b-1);
		return pow;
	}

}

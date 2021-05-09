package recursion;
import java.util.*;
public class PDI {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		PDI(n);
	}
	public static void PDI(int n) {
		if(n==0||n>5) {
			return;
		}
		System.out.println(n); //stack building
		PDI(n-1);
		System.out.println(n);//stack falling
	}

}

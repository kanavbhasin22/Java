package patterns;
import java.util.*;
public class pattern_21 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int x=2*n-2;
		for (int i=1; i<=n;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=x;j++) {
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			x=x-2;
		}
	}

}

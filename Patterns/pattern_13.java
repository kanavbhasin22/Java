package patterns;
import java.util.*;
public class pattern_13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=0;i<2*n;i++) {
			if(i<=n) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else if(i>n) {
				for(int k=2*n-i;k>0;k--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

	}

}

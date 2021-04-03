package patterns;
import java.util.*;
public class pattern_24 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		int x=1;
		for (int i=1;i<=n;i++) {
			for(int j=n-i;j>0;j--) {
				System.out.print("\t");
			}
			for(int j=1;j<=x;j++) {
				System.out.print(i+"\t");
			}
			System.out.println();
			x=x+2;
		}
		

	}

}

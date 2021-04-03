import java.util.*;
public class hcf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int r=1;
		while(r>0) {
			r=n%m;
			n=m;
			m=r;	
		}
		System.out.print(n);
	}
}

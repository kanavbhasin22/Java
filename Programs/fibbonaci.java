import java.util.*;
public class fibbonaci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int j=1;
		int k=0;
		int sum=0;
		while(k<n+1) {
			System.out.println(i);
			sum=i+j;
			i=j;
			j=sum;
			k++;	
		}

	}

}

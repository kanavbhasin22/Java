package practice;
import java.util.*;
public class tiles {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int ans=tiles(a,b);
			System.out.println(ans);
			n--;
		}
		}
		public static int tiles(int n,int m){
			if(n<m){
				return 1;
			}
			if(n==m){
				return 2;
			}
			int ans= tiles(n-1,m)+tiles(n-m,m);
			return ans;
		}

}

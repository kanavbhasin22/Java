package recursion;
import java.util.*;
public class first_index {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int data=sc.nextInt();
		int si=sc.nextInt();
		int ans=first(arr,data,si);
		System.out.print(ans);
	}
	public static int first(int[] arr,int n,int si) {
		if(si==arr.length) {
			return -1;
		}
		if(arr[si]==n) {
			return si;
		}
		else {
			int ans=first(arr,n,si+1);
			return ans;
		}
	}

}

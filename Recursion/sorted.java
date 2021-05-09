package recursion;
import java.util.*;
public class sorted {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		boolean ans=sorted(arr,0);
		System.out.print(ans);
	}
	public static boolean sorted(int[] arr,int n) {
		if(arr.length-1==n) {
			return true;
		}
		if(arr[n]>arr[n+1]) {
			return false;
		}
		else {
			boolean ans=sorted(arr,n+1);
			return ans;
		}

	}

}

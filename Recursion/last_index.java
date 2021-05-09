package recursion;

import java.util.Scanner;

public class last_index {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int si=sc.nextInt();
		int d=sc.nextInt();
		System.out.print(last(arr,si,d));
	}
	public static int last(int[]arr,int si,int data) {
		if(si==arr.length) {
			return -1;
		}
		int ans=last(arr,si+1,data);
		if(ans==-1) {
			if(arr[si]==data) {
				return si;
			}
			else {
				return -1;
			}
		}
		else {
			return ans;
		}
	}
}

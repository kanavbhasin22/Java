package recursion;

import java.util.Scanner;

public class all_indices {
public static void main(String args[]) {

	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[]arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int data=sc.nextInt();
	int s=0;
	int count=0;
	int[] ans=all_indices(arr,s,data,count);
	for(int i=0;i<ans.length;i++) {
		System.out.print(ans[i]+" ");
	}
	
}
public static int[] all_indices(int[]arr,int s, int data, int count) {

	if(s==arr.length) {
		int[] ans=new int[count];
		return ans;
	}
	int[] indices=null;
	if(arr[s]==data) {
		indices=all_indices(arr,s+1,data,count+1);
	}
	else {
		indices=all_indices(arr,s+1,data,count);
		}
	if(arr[s]==data) {
		indices[count]=s;
	}
	return indices;
}
}
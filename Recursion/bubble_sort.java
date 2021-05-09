package recursion;

import java.util.Scanner;

public class bubble_sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		bubble(arr,0,arr.length-1);
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}

	}
	public static void bubble(int[]arr,int s,int e) {
		if(s==e) {
			return;
		}
		if(arr[s]>arr[s+1]) {
			int temp=arr[s];
			arr[s]=arr[s+1];
			arr[s+1]=temp;
		}
		bubble(arr,s+1,e);
		bubble(arr,s,e-1);
	}

}

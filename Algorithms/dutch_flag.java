package array;

import java.util.Scanner;

public class dutch_flag {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int[] ans=sort(arr);
		display(ans);
	}
	public static int[] sort(int[]arr) {
		int low=0;
		int mid=0;
		int high=arr.length-1;
		while(mid<=high) {
			if(arr[mid]==0) {
				int temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
			}
			else if(arr[mid]==1) {
				mid++;
			}
			else {
				int temp= arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
			}
		}
		return arr;
	}
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

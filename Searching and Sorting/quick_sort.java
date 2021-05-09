package array;

import java.util.Scanner;

public class quick_sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		quick_sort(arr,0,arr.length-1);
		display(arr);

	}
	public static void quick_sort(int[]arr,int lo,int hi) {
		if(lo>=hi) {
			return;
		}
		int mid=(lo+hi)/2;
		int pivot=arr[mid];
		int left=lo;
		int right=hi;
		while(left<=right) {
			while(arr[left]<pivot) {
				left++;
			}
			while(arr[right]>pivot) {
				right--;
			}
			if(left<=right) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
		}
		quick_sort(arr,lo,right);
		quick_sort(arr,left,hi);
	}
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

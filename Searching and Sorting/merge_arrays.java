package array;

import java.util.Scanner;

public class merge_arrays {

	public static void main(String[] args) {
		//int[] arr1= {10,20,30,40,50};
		//int[] arr2= {5,15,30,45,60,70,80};
		//int[]merged=merge_sort(arr1,0,arr1.length-1);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int[] ans=merge_sort(arr,0,arr.length-1);
		display(ans);

	}
	public static int[] merge(int[]arr1,int[]arr2) {
		int i=0;
		int j=0;
		int k=0;
		int[] merge=new int[arr1.length+arr2.length];
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<=arr2[j]) {
				merge[k]=arr1[i];
				i++;
				k++;
			}
			else {
				merge[k]=arr2[j];
				j++;
				k++;
			}
		}
		if(i==arr1.length) {
			while(j<arr2.length) {
				merge[k]=arr2[j];
				j++;
				k++;
			}
		}
		if(j==arr2.length) {
			while(i<arr1.length) {
				merge[k]=arr1[i];
				i++;
				k++;
			}
		}
		return merge;
	}
	public static int[] merge_sort(int[]arr, int lo,int hi) {
		if(lo==hi) {
			int[] arr3= new int[1];
			arr3[0]=arr[hi];
			return arr3;
		}
		int mid=(lo+hi)/2;
		
		int[] arr1=merge_sort(arr,lo,mid);
		int[] arr2=merge_sort(arr,mid+1,hi);
		
		int[] merge=merge(arr1,arr2);
		return merge;
	}
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

package array;

import java.util.Scanner;

public class array_max {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int arr[]=input();
		max(arr);
	}
	public static int[] input() {
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void max(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			else {
				continue;
			}
		}
		System.out.println(max);
	}

}

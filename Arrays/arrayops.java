package array;

import java.util.Scanner;

public class arrayops {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr=input();
		display(arr);
	}
	public static int[] input() {
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}

package array;

import java.util.Scanner;

public class linear_search {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int [] arr=input();
		int a=sc.nextInt();
		find(arr,a);
	}
	public static int[] input() {
		int n =sc.nextInt();
		int[] arr= new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static int find(int[] arr,int d) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==d) {
				System.out.println(i);
				break;
			}
		}
		return -1;
	}

}

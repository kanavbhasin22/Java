package array;

import java.util.Scanner;

public class two_d_array {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int [][] arr=input();
		display(arr);
	}
	public static int[][] input() {
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] arr= new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	public static void display(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}

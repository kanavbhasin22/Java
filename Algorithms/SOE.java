package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SOE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		soe(n);
	}
	public static void soe(int n) {
		boolean[]arr= new boolean[n+1];
		Arrays.fill(arr, true);
		arr[0]=arr[1]=false;
		
		for(int i=2;i*i<=n;i++) {
			if(arr[i]==false) {
				continue;
			}
			for(int mul=2;mul*i<=n;mul++) {
				arr[mul*i]=false;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==true) {
				System.out.print(i+" ");
			}
		}
	}

}

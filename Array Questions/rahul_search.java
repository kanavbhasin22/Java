package array;
import java.util.*;
public class rahul_search {
	    public static void main(String args[]) {
	        Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			int d=sc.nextInt();
			System.out.print(search(arr,d));
		    }
			public static int search(int[]arr, int d){
				int x=-1;
				for(int i=0;i<arr.length;i++){
					if(arr[i]==d){
						x=i;
						break;
					}
				}
				return x;
			}
	}

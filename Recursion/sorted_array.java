package practice;
import java.util.*;
public class sorted_array {
	    public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
	        int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			System.out.print(increasing(arr,0));
	    }
		public static boolean increasing(int[] arr,int start){
			if(start==arr.length-1){
				return true ;
			}
			int a=arr[start];
			int b=arr[start+1];
			boolean ans=increasing(arr,start+1);
			if(a>b){
				ans=false;
			}
			return ans;
		}
	}

package array;
import java.util.*;
public class target_sum_pairs {
	    public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			int sum=sc.nextInt();
			for(int i=0;i<n-1;i++){
				for(int j=i+1;j<n;j++){
					if(arr[i]+arr[j]==sum){
						if(arr[i]<arr[j])
						System.out.println(arr[i]+ " and "+ arr[j]);
						if(arr[j]<arr[i])
						System.out.println(arr[j]+" and "+arr[i]);
					}
				}
			}
	    }
	}

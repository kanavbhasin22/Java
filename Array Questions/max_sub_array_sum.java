package array;
import java.util.*;
public class max_sub_array_sum {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int c=0;c<t;c++){
			int sum=0;
			int init=Integer.MIN_VALUE;
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			for(int j=0;j<n;j++){
				sum=sum+arr[j];
				if(init<sum){
					init=sum;
				}
				if(sum<0){
					sum=0;
				}
				}
			System.out.println(init);
		}
    }
}

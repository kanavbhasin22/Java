package array;
import java.util.*;
public class biggest_number {
	    public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			for(int c=0;c<t;c++){
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			for(int count=0;count<n-1;count++){
				for(int j=0;j<n-count-1;j++){
					if(high(arr[j])<high(arr[j+1])){
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
					else if(high(arr[j])==high(arr[j+1])){
						if(arr[j]<arr[j+1]){
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;						
						}
					}
				}
			}
			for(int i=0;i<n;i++){
				System.out.print(arr[i]);
			}
			System.out.println();
	    }
		}
		public static int high(int n){
			int t=0;
			while(n>0){
				t=n%10;
				n=n/10;
			}
			return t;
		}
	}


package array;
import java.util.*;
public class linear_sort {
		    public static void main(String args[]) {
		        Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				int[]arr =new int[n];
				for(int i=0;i<n;i++){
					arr[i]=sc.nextInt();
				}
				int[] arr2=new int[n];
				arr2=linear(arr,n);
				for(int i=0;i<n;i++){
					System.out.println(arr2[i]);
				}
		    }
			public static int[] linear(int[] arr,int n){
				int lo=0;
				int mid=0;
				int hi=n-1;
				while(mid<=hi){
					if(arr[mid]==0){
						int temp=arr[lo];
						arr[lo]=arr[mid];
						arr[mid]=temp;
						lo++;
						mid++;
					}
					else if(arr[mid]==1){
						mid++;
					}
					else if(arr[mid]==2) {
						int t=arr[mid];
						arr[mid]=arr[hi];
						arr[hi]=t;
						hi--;
					}
				}
				return arr;
			}
		}


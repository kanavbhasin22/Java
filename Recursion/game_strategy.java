package practice;
import java.util.*;
public class game_strategy {
	    public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
	        game(arr,0,0,0);
	    }
		public static void game(int[] arr,int start,int count_odd,int count_even){
			if(start>arr.length-1){
				if(count_even>count_odd){
					System.out.print(count_even);
					return;
				}
				else{
					System.out.print(count_odd);
					return;
				}
			}
			if(arr[start]%2==0){
				game(arr,start+1,count_odd,count_even+arr[start]);
			}
			else{
				game(arr,start+1,count_odd+arr[start],count_even);
			}
		}
	}

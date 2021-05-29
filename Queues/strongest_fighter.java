package queues;

import java.util.*;
public class strongest_fighter {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		strongest(arr,k);
    }
	public static void strongest(int[] arr,int k){
		Deque<Integer> dq=new LinkedList<>();
		int i=0;
		for(i=0;i<k;i++){
			while(!dq.isEmpty() && arr[i]>arr[dq.getLast()]){
				dq.removeLast();
			}
			dq.addLast(i);
		}
		for(;i<arr.length;i++){
			System.out.print(arr[dq.getFirst()]+" ");
			while(!dq.isEmpty() && dq.getFirst()<=i-k){
				dq.removeFirst();
			}
			while(!dq.isEmpty() && arr[i]>arr[dq.getLast()]){
				dq.removeLast();
			}
			dq.addLast(i);
		}
		System.out.print(arr[dq.getFirst()]);
	}
}
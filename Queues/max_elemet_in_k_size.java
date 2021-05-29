package queues;

import java.util.*;

public class max_elemet_in_k_size {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		max(arr,k);
	}
	public static void max(int[] arr , int k) {
		Deque <Integer> q = new LinkedList<Integer>();
		int i;
		for(i=0;i<k;i++) {
			while(!q.isEmpty() && arr[i]>arr[q.getLast()]){
				q.removeLast();
			}
			q.addLast(i);
		}
		for(;i<arr.length;i++) {
			System.out.print(arr[q.getFirst()]+" ");
			while(!q.isEmpty() && q.getFirst()<=i-k) {
				q.removeFirst();
			}
			while(!q.isEmpty() && arr[i]>arr[q.getLast()]){
				q.removeLast();
			}
			q.addLast(i);
		}
		System.out.println(arr[q.getFirst()]);
	}

}

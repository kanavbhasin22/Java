package queues;
import java.util.*;

public class first_negativ_in_k_size {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		neg(arr,k);
	}
	public static void neg(int[] arr, int k) {
		LinkedList<Integer> q=new LinkedList<>();
		int i=0;
		for(i=0;i<k;i++) {
			if(arr[i]<0) {
				q.addLast(i);
			}
		}
		for(;i<arr.length;i++) {
			if(!q.isEmpty()) {
				System.out.println(arr[q.peek()]);
			}
			else {
				System.out.println(0);
			}
			while(!q.isEmpty() && q.peek()<=i-k) {
				q.removeFirst();
			}
			if(arr[i]<0) {
				q.addLast(i);
			}
		}
		if(!q.isEmpty()) {
			System.out.println(arr[q.peek()]);
		}
		else {
			System.out.println(0);
		}
	}

}

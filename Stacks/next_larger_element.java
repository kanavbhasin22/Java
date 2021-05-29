package stacks;
import java.util.*;

public class next_larger_element {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Stack <Integer> stack=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!stack.isEmpty() && arr[i]>stack.peek()) {
				int val=stack.pop();
				System.out.println(val+" "+arr[i]);
			}
			stack.push(arr[i]);
		}
		while(!stack.isEmpty()) {
			int val=stack.pop();
			System.out.println(val+" -1");
		}

	}

}

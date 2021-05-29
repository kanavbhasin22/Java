package stacks;

import java.util.*;
public class greater_element {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		next_greater(arr);
    }
	public static void next_greater(int[] arr){
		Stack<Integer> stack=new Stack <>();
		for(int i=0;i<arr.length;i++){
			while(!stack.isEmpty() && arr[i]>stack.peek()){
				int val=stack.pop();
				System.out.print(arr[i]+" ");
			}
			stack.push(arr[i]);
		}
		while(!stack.isEmpty()){
			stack.pop();
			System.out.print(-1+" ");
		}
	}
}
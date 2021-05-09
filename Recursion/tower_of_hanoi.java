package recursion;
import java.util.*;
import java.util.Scanner;

public class tower_of_hanoi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String src=sc.next();
		String dest=sc.next();
		String aux=sc.next();
		
		steps(n);
		tower_of_hanoi(n,src,dest,aux);
		
	}
	public static void tower_of_hanoi(int n,String src,String dest,String aux) {
		
		if(n==0) {
			return;
		}
		tower_of_hanoi(n-1,src,aux,dest);
		System.out.println("Disc "+n+ " moved from "+src+" to "+dest);
		tower_of_hanoi(n-1,aux,dest,src);
	}
	public static void steps(int n) {
		System.out.println("Number of steps: "+ (int)(Math.pow(2, n)-1));
	}

}

package backtracking;

import java.util.Scanner;

public class coin_change_perm {
	static int count=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] denom=new int[n];
		for(int i=0;i<n;i++) {
			denom[i]=sc.nextInt();
		}
		int amount=sc.nextInt();
		coinchange_perm(denom,amount,"");
	}
	public static void coinchange_perm(int[] denom, int amt,String ans) {
		if(amt==0) {
			count++;
			System.out.println(count+" "+ans);
			return;
		}
		
	if (amt<0) {
		return;
	}
		for(int i=0;i<denom.length;i++) {
			if(amt>=denom[i]) {
				coinchange_perm(denom,amt-denom[i],ans+denom[i]);
			}
		}
	}
}

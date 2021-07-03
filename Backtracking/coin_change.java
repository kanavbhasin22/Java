package backtracking;

import java.util.Scanner;

public class coin_change {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] denom=new int[n];
		for(int i=0;i<n;i++) {
			denom[i]=sc.nextInt();
		}
		int amount=sc.nextInt();
		coinchange(denom,amount,"",0);
	}
public static void coinchange(int[] denom, int amt,String ans,int last_idx) {
	if(amt==0) {
		System.out.println(ans);
		return;
	}
	for(int i=last_idx;i<denom.length;i++) {
		if(amt>=denom[i]) {
			coinchange(denom,amt-denom[i],ans+denom[i],i);
		}
	}
}
}

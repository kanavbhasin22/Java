package backtracking;

import java.util.Scanner;

public class one_D_queens {

	static int count=0;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int queens=sc.nextInt();
		queen(new boolean[n],0,queens,"");
		
	}
	public static void queen(boolean[] board, int q_placed,int q_total,String ans) {
	
	if(q_placed==q_total) {
		count++;
		System.out.println(count+" "+ans);
		return;
	}
	for(int i=0;i<board.length;i++) {
		if(board[i]==false) {
		board[i]=true;
		queen(board,q_placed+1,q_total,ans+" Q"+q_placed+"B"+ i+ " ");
		board[i]=false;
	}
	}
}
}

package backtracking;

import java.util.Scanner;

public class queen_combination {
static int count=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int queens=sc.nextInt();
		queen_combination(new boolean[n],0,queens,"",-1);
	}
	public static void queen_combination(boolean[] board, int q_placed,int q_total,String ans,int last_box) {
		
	if(q_placed==q_total) {
		count++;
		System.out.println(count+" "+ans);
		return;
	}
	for(int i=last_box+1;i<board.length;i++) {
		board[i]=true;
		queen_combination(board,q_placed+1,q_total,ans+" Q"+q_placed+"B"+ i+ " ",i);
		board[i]=false;
	}
}
}

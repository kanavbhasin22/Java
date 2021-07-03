package backtracking;

public class Queen_comb_box_respect {

	public static void main(String[] args) {
		queen_wrt_box( new boolean[4],0,"",2,0);

	}
	public static void queen_wrt_box(boolean[] board, int col, String ans, int total, int placed) {
		
		if(placed==total) {
			System.out.println(ans);
			return;
		}
		
		if(col==board.length) {
			return;
		}
		//place
		board[col]=true;
		queen_wrt_box(board,col+1,ans+"b"+col,total,placed+1);
		board[col]=false;
		
		//not place
		queen_wrt_box(board,col+1,ans,total,placed);
	}
}

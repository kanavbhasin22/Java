package backtracking;

public class queen_comb_box_2D {

	public static void main(String[] args) {
		QueenComb2D(new boolean[3][4],0,0,0,3,"");

	}
	public static void QueenComb2D(boolean[][] board, int row, int col, int placed,int total, String ans) {
		if(placed==total) {
			System.out.println(ans);
			return;
		}
		
		if(col==board.length) {
			row++;
			col=0;
		}
		if (row==board.length) {
			return;
		}
		//place
		board[row][col]=true;
		QueenComb2D(board,row,col+1,placed+1,total,ans+"{"+row+","+col+"}");
		board[row][col]=false;
		
		//not place
		QueenComb2D(board,row,col+1,placed,total,ans);
	}

}

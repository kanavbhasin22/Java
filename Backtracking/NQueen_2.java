package backtracking;

public class NQueen_2 {
static int count=0;
	public static void main(String[] args) {
		boolean[][] board=new boolean[4][4];
		nqueen2(board,0,0,board.length,"");

	}
	public static void nqueen2(boolean[][] board, int row,int placed,int total,String ans) {
		if(placed==total) {
			count++;
			System.out.println(count+" " +ans);
			return;
		}
		if(row==board.length) {
			return;
		}
		for(int col=0;col<board[0].length;col++) {
			board[row][col]=true;
			nqueen2(board,row+1,placed+1,total,ans+"{"+row+","+col+"}");
			board[row][col]=false;
		}
	}
}

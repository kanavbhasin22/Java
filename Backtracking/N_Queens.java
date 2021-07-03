package backtracking;

public class N_Queens {

	public static void main(String[] args) {
		boolean[][] board= new boolean[4][4];
		Nqueens(board,0,0,0,board.length,"");
	}
	public static void Nqueens(boolean[][] board, int row,int col,int placed, int total,String ans) {
		if(placed==total) {
			System.out.println(ans);
			return;
		}
		
		if(col==board[0].length) {
			row++;
			col=0;
		}
		if (row==board.length) {
			return;
		}
		//place
		if(issafe(board,row,col)) {
			board[row][col]=true;
			Nqueens(board,row+1,0,placed+1,total,ans+"{"+row+","+col+"}");
			board[row][col]=false;
		}
		//not place
		Nqueens(board,row,col+1,placed,total,ans);
	}
	public static boolean issafe(boolean[][] board,int row,int col) {
		int r=row-1;
		int c=col;
		
		//vertical up
		while(r>=0) {
			if(board[r][c]) {
				return false;
			}
			r--;
		}
		//horizontal left
		r=row;
		c=col-1;
		while(c>=0) {
			if(board[r][c]) {
				return false;
			}
			c--;
		}
		//diagonal left
		r=row-1;
		c=col-1;
		while(r>=0 && c>=0) {
			if(board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		//diagonal right
		r=row-1;
		c=col+1;
		while(r>=0 && c<board[0].length) {
			if(board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}
	}

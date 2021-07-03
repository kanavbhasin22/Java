package backtracking;

public class KQueen {
static int count=0;
	public static void main(String[] args) {
		boolean[][] board=new boolean[4][4];
		kqueen(board,0,0,3,"");

	}
	public static void kqueen(boolean[][] board, int row,int placed,int total,String ans) {
		if(placed==total) {
			count++;
			System.out.println(count+" " +ans);
			return;
		}
		if(row==board.length) {
			return;
		}
		for(int col=0;col<board[0].length;col++) {
			if(issafe(board,row,col)) {
			board[row][col]=true;
			kqueen(board,row+1,placed+1,total,ans+"{"+row+","+col+"}");
			board[row][col]=false;
			}
		}
		kqueen(board,row+1,placed,total,ans);
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
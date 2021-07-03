package backtracking;

public class N_Knights {
static int count=1;
	public static void main(String[] args) {
		
		boolean[][] board=new boolean[3][3];
		NKnights(board,0,0,0,board.length,"");

	}
	public static void NKnights(boolean[][] board,int row,int col,int placed,int total,String ans) {
		if(placed==total) {
			System.out.println(count+" "+ans);
			count++;
			return;
		}
		if(col==board.length) {
			row++;
			col=0;
		}
		if(row==board.length) {
			return;
		}
		//place
		if(isItsafe(board,row,col)) {
		board[row][col]=true;
		NKnights(board,row,col+1,placed+1,total,ans+"{"+row+","+col+"}");
		board[row][col]=false;
		}
		
		//not place
		NKnights(board,row,col+1,placed,total,ans);
	}
	public static boolean isItsafe(boolean[][] board,int row,int col) {
		int[] rows= {-1,-2,-2,-1};
		int[] cols= {2,1,-1,-2};
		
		for(int i=0;i<4;i++) {
			int r=row+rows[i];
			int c=col+cols[i];
			
			if(r>=0 && r<board.length && c>=0 && c<board[0].length) {
				if(board[r][c]) {
					return false;
				}
			}
		}
		return true;
	}

}

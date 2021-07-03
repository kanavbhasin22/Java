package backtracking;

public class blocked_maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze= {{0,1,0,0},{0,0,0,0},{0,1,0,0},{0,0,1,0}};
		block_maze(maze,0,0,"",new boolean[maze.length][maze[0].length]);
		}
	public static void block_maze(int[][] maze, int row,int col, String ans,boolean[][] visited) {
		if(row==maze.length-1 && col==maze[0].length-1) {
			System.out.println(ans);
			return;
		}
		if(row==maze.length || row==-1 || col==-1 || col==maze[0].length || maze[row][col]==1 || visited[row][col]) {
			return;
		}
		//put mark
		visited[row][col]=true;
		//T
		block_maze(maze,row-1,col,ans+"T",visited);
		//D
		block_maze(maze,row+1,col,ans+"D",visited);
		//L
		block_maze(maze,row,col-1,ans+"L",visited);
		//R
		block_maze(maze,row,col+1,ans+"R",visited);
		visited[row][col]=false;
	}
	}

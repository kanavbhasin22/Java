package recursion_print;

import java.util.Scanner;

public class count_maze_path {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cr=sc.nextInt();
		int cc=sc.nextInt();
		int er=sc.nextInt();
		int ec=sc.nextInt();
		int ans=count_maze(cr,cc,er,ec);
		System.out.print(ans);

	}
	public static int count_maze(int cr,int cc,int er,int ec) {
		if(cr==er &&cc==ec) {
			return 1;
		}
		if(cr>er || cc>ec) {
			return 0;
		}
		int count=0;
		count+=count_maze(cr+1,cc,er,ec);
		count+=count_maze(cr,cc+1,er,ec);
		count+=count_maze(cr+1,cc+1,er,ec); //for diagonal
		return count;
	}

}

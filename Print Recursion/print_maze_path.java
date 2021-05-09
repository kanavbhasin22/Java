package recursion_print;

import java.util.Scanner;

public class print_maze_path {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cr=sc.nextInt();
		int cc=sc.nextInt();
		int er=sc.nextInt();
		int ec=sc.nextInt();
		print_maze(cr,cc,er,ec,"");

	}
	public static void print_maze(int cr,int cc,int er,int ec,String ans) {
		if(cr==er && cc==ec) {
			System.out.println(ans);
			return;
		}
		if(cr>er || cc>ec) {
			return;
		}
		print_maze(cr,cc+1,er,ec,ans+"H");
		print_maze(cr+1,cc,er,ec,ans+"V");
		print_maze(cr+1,cc+1,er,ec,ans+"D"); //for diagonal
		}
	}

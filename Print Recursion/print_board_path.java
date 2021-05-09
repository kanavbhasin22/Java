package recursion_print;

import java.util.Scanner;

public class print_board_path {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int stop=sc.nextInt();
		String ans="";
		board_path(start,stop,ans);

	}
	public static void board_path(int curr, int end,String str) {
		if(curr==end) {
			System.out.println(str);
			return;
		}
		if(curr>end) {
			return;
		}
		for(int dice=1;dice<=6;dice++) {
			board_path(curr+dice,end,str+dice);
		}
	}

}

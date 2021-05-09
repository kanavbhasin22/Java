package recursion_print;

import java.util.Scanner;

public class count_board_path {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int stop=sc.nextInt();
		int ans=count_board(start,stop);
		System.out.print(ans);

	}
	public static int count_board(int curr,int end) {
		if(curr==end) {
			return 1;
		}
		if(curr>end) {
			return 0;
		}
		int count=0;
		for(int dice=1;dice<=6;dice++){
			count+=count_board(curr+dice,end);
		}
		return count;
	}

}

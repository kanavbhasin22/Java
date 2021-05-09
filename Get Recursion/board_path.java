package get_recursion;
import java.util.*;
public class board_path {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int stop=sc.nextInt();
		ArrayList<String> ans=board(start,stop);
		System.out.print(ans);

	}
	public static ArrayList<String> board (int curr,int end){
		if(curr==end) {
			ArrayList<String> bs=new ArrayList<>();
			bs.add("");
			return bs;
		}
		if(curr>end) {
			ArrayList<String> bs=new ArrayList<>();
			return bs;			
		}
		ArrayList<String> mr=new ArrayList<>();
		for(int dice=1;dice<=6;dice++) {
			ArrayList<String> rr=board(curr+dice,end);
			for(String str:rr) {
				mr.add(dice+str);
			}
		}
		return mr;
	}
}

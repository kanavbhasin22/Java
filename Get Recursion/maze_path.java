package get_recursion;
import java.util.*;
public class maze_path {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int curr_row=sc.nextInt();
		int curr_col=sc.nextInt();
		int end_row=sc.nextInt();
		int end_col=sc.nextInt();
		ArrayList<String> ans=maze(curr_row,curr_col,end_row,end_col);
		System.out.print(ans);

	}
	public static ArrayList<String> maze(int cr,int cc,int er,int ec){
		if(cr==er&&cc==ec) {
			ArrayList<String> bs= new ArrayList();
			bs.add("");
			return bs;
		}
		if(cr>er || cc>ec) {
			ArrayList<String> bs= new ArrayList();
			return bs;
		}
		ArrayList<String> mr=new ArrayList<>();
		ArrayList<String> rrh =maze(cr,cc+1,er,ec);//small problem
		for(String rrhs:rrh) {//big problem
			mr.add("H"+rrhs);
		}
		ArrayList<String> rrv=maze(cr+1,cc,er,ec);
		for(String rrvs:rrv) {
			mr.add("V"+rrvs);
		}
		//if diagonal is not asked, then remove this
		ArrayList<String> rrd =maze(cr+1,cc+1,er,ec);
		for(String rrds:rrd) {
			mr.add("D"+rrds);
		}
		return mr;
	}

}

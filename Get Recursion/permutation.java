package get_recursion;
import java.util.*;
public class permutation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.print(perm(str));

	}
	public static ArrayList<String> perm(String str){
		if(str.length()==0) {
			ArrayList<String> bs=new ArrayList<>();
			bs.add("");
			return bs;
		}
		char ch=str.charAt(0);
		String rest=str.substring(1);
		
		ArrayList <String> rr=perm(rest);
		ArrayList <String> mr= new ArrayList<>();
		
		for(String rrs : rr) {
			for(int i=0;i<=rrs.length();i++) {
				String val=rrs.substring(0,i)+ch+rrs.substring(i);
				mr.add(val);
			}
		}
		return mr;
	}
}

package get_recursion;
import java.util.*;
public class get_subsequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(subsequence(str));
	}
	public static ArrayList<String> subsequence(String str){
		if(str.length()==0) {
			ArrayList<String> base=new ArrayList();
			base.add("");
			return base;
		}
		char c=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> result=new ArrayList();
		ArrayList<String> recursion=subsequence(ros);
		for(String st:recursion) {
			result.add(st);
			result.add(c+st);
		}
		return result;
	}

}

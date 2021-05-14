package practice;
import java.util.*;
public class remove_duplicates_formatting {
	    public static void main(String args[]) {
	        Scanner sc=new Scanner(System.in);
			String str=sc.next();
			format(str,0,1,"");
	    }
		public static void format(String str,int start,int end,String ans){
			if(end>=str.length()){
				if(end==str.length()){
				System.out.print(ans+str.charAt(end-1));
				return;
				}
				else{
					System.out.print(ans);
					return;
				}
			}
			char a=str.charAt(start);
			char b=str.charAt(start+1);
			if(a==b){
				format(str,start+2,end+2,ans+a+'*'+b);
			}
			else{
				format(str,start+1,end+1,ans+a);
			}
		}
}

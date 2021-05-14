package practice;
import java.util.*;
public class string_to_int {
	    public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			String str=sc.next();
			int len=str.length()-1;
			string_to_int(str,0,len,0,len);
	    }
		public static void string_to_int(String str, int start,int stop, int ans,int power){
			if(start>stop){
				System.out.print(ans);
				return;
			}
			char a=str.charAt(start);
			int n=a-48;
			int add=n*(int)Math.pow(10,power);
			string_to_int(str,start+1,stop,ans+add,power-1);
		}
	}
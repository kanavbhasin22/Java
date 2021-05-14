package practice;
import java.util.*;
public class replace_pi {
	    public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			while(n>0){
				String str=sc.next();
				replace_pi(str,0,"");
				n--;
			}
	    }
		public static void replace_pi(String str,int start,String ans){
			if(start>str.length()-1){
				System.out.println(ans);
				return;
			}
			if(str.charAt(start)=='p'){
				if(str.charAt(start+1)=='i'){
					replace_pi(str,start+2,ans+"3.14");
				}
				else{
					replace_pi(str,start+1,ans+str.charAt(start));
				}
			}
			else{
				replace_pi(str,start+1,ans+str.charAt(start));
			}
		}
	}

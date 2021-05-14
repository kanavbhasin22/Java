package practice;
import java.util.*;
public class remove_duplicates {
	    public static void main(String args[]) {
	        Scanner sc=new Scanner(System.in);
			String str=sc.next();
			remove(str,0,1);
	    }
		public static void remove(String str,int start,int end){
			if(end>=str.length()){
				if(end==str.length()){
					System.out.print(str.charAt(end-1));
					return;
				}
				else{
					return;
				}
			}
			char a=str.charAt(start);
			char b=str.charAt(end);
			if(a!=b){
				System.out.print(a);
				remove(str,start+1,end+1);
			}
			if(a==b){
				System.out.print(a);
				remove(str,start+2,end+2);
			}
		}
	}

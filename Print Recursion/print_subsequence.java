package recursion_print;

import java.util.Scanner;

public class print_subsequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		subs(str,"");

	}
	public static void subs(String str,String blank) {
		if(str.length()==0) {
			System.out.println(blank);
			return;
		}
		char ch=str.charAt(0);
		String ros=str.substring(1);
		subs(ros,blank);
		subs(ros,blank+ch);
	}
}

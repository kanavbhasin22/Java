package recursion_print;

import java.util.Scanner;

public class print_permutation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		print_perm(str,"");

	}
	public static void print_perm(String str,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			String res=str.substring(0,i)+str.substring(i+1);
			print_perm(res,ans+ch);
		}
	}

}

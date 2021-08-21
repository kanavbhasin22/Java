package dynamic_programming;

import java.util.Arrays;

public class palindrome_partition {

	public static void main(String[] args) {
		String s="abacd";
		System.out.println(recursion(s,0,s.length()-1));
		int[][] store=new int[s.length()][s.length()];
		for(int i=0;i<store.length;i++) {
			Arrays.fill(store[i], -1);
		}
		System.out.println(td(s,0,s.length()-1,store));
		System.out.println(bu(s));

	}
	public static int recursion(String s, int si,int ei) {
		if(isPalindrome(s,si,ei)) {
			return 0;
		}
		int min=Integer.MAX_VALUE;
		for(int k=si;k<ei;k++) {
			int fp=recursion(s,si,k);
			int sp=recursion(s,k+1,ei);
			
			int total=fp+sp+1;
			if(total<min) min=total;
		}
		return min;
	}
	public static boolean isPalindrome(String str, int si,int ei) {
		int l=si;
		int r=ei;
		
		while(l<r) {
			if(str.charAt(si)!=str.charAt(ei)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
	public static int td(String s, int si,int ei,int[][] store) {
		if(isPalindrome(s,si,ei)) {
			return 0;
		}
		if(store[si][ei]!=-1) {
			return store[si][ei];
		}
		int min=Integer.MAX_VALUE;
		for(int k=si;k<ei;k++) {
			int fp=td(s,si,k,store);
			int sp=td(s,k+1,ei,store);
			
			int total=fp+sp+1;
			if(total<min) min=total;
		}
		store[si][ei]=min;
		return min;
	}
	public static int bu(String s) {
		boolean[][] p=pal(s);
		int n=s.length();
		int[][] store=new int[n][n];
		for(int slide=0;slide<n;slide++) {
			for(int si=0;si<n-slide;si++) {
				int ei=si+slide;
				if(p[si][ei]) {
					store[si][ei]=0;
				}else {
				int min=Integer.MAX_VALUE;
				for(int k=si;k<ei;k++) {
					int fp=store[si][k];
					int sp=store[k+1][ei];
					
					int total=fp+sp+1;
					if(total<min) min=total;
				}
				store[si][ei]=min;
			}
			}
		}
		return store[0][n-1];
	}
	public static boolean[][] pal(String s){
		boolean[][] p=new boolean[s.length()][s.length()];
		
		for(int i=0;i<p.length;i++) {
			Arrays.fill(p[i], true);
		}
		for(int row=s.length()-2;row>=0;row--){
			for(int col=row+1;col<s.length();col++) {
				if(s.charAt(row)==s.charAt(col)) {
					p[row][col]=p[row+1][col-1];
				}
				else {
					p[row][col]=false;
				}
			}
		}
		return p;
	}
}

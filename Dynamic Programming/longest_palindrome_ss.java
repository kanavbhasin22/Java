package dynamic_programming;

public class longest_palindrome_ss {

	public static void main(String[] args) {
		String str="abccga";
		System.out.println(recursion(str,0,str.length()-1));
		System.out.println(td(str,0,str.length()-1,new int[str.length()][str.length()]));
		System.out.println(bu(str));
	}
	public static int recursion(String s,int si,int ei) {
		if(si>ei) {
			return 0;
		}
		if(si==ei) {
			return 1;
		}
		int ans=0;
		if(s.charAt(si)==s.charAt(ei)) {
			ans=recursion(s,si+1,ei-1)+2;
		}
		else {
			int a1= recursion(s,si+1,ei);
			int a2=recursion(s,si,ei-1);
			
			ans=Math.max(a1, a2);
		}
		return ans;
	}
	public static int td(String s,int si,int ei,int[][]store) {
		if(si>ei) {
			return 0;
		}
		if(si==ei) {
			return 1;
		}
		if(store[si][ei]!=0) {
			return store[si][ei];
		}
		int ans=0;
		if(s.charAt(si)==s.charAt(ei)) {
			ans=td(s,si+1,ei-1,store)+2;
		}
		else {
			int a1=td(s,si+1,ei,store);
			int a2=td(s,si,ei-1,store);
			
			ans=Math.max(a1, a2);
		}
		store[si][ei]=ans;
		return ans;
	}
	public static int bu(String str) {
		int n=str.length();
		int[][] store=new int[n][n];
		
		for(int slide=0;slide<n;slide++) {
			for(int si=0;si<n-slide;si++){
				int ei=si+slide;
				if(si==ei) {
					store[si][ei]= 1;
				}
				else {
				int ans=0;
				if(str.charAt(si)==str.charAt(ei)) {
					ans=store[si+1][ei-1]+2;
				}
				else {
					int a1=store[si+1][ei];
					int a2=store[si][ei-1];
					
					ans=Math.max(a1, a2);
				}
				store[si][ei]=ans;
			}
		}
		}
		return store[0][n-1];
	}
}

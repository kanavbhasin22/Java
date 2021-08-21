package dynamic_programming;

public class wildcard {

	public static void main(String[] args) {
		String src="abacde";
		String pat="a?***e";
		System.out.println(matchingRec("abacde","a?***e"));
		System.out.println(matchingRecOpti("abacde","a?***e",0,0));
		System.out.println(matchingTD("abacde","a?***e",0,0,new int[src.length()][pat.length()]));
		System.out.println(matchingBU("abacde","a?***e"));
	}
	public static boolean matchingRec(String src,String pat) {
		if(src.length() ==0 && pat.length()==0) {
			return true;
		}
		if(src.length()!=0 && pat.length()==0) {
			return false;
		}
		if(src.length()==0 && pat.length()!=0) {
			for(int i=0;i<pat.length();i++){
				if(pat.charAt(i)!='*') {
					return false;
				}
			}
			return true;
		}
		char chs= src.charAt(0);
		char chp=pat.charAt(0);
		String ros=src.substring(1);
		String rop=pat.substring(1);
		boolean ans= false;
		if(chs==chp || chp=='?') {
			ans =matchingRec(ros,rop);
		}
		else if (chp=='*') {
			boolean ans1=matchingRec(src,rop);
			boolean ans2=matchingRec(ros,pat);
			
			if(ans1 ||ans2) {
				ans=true;
			}
		}
		else {
			ans=false;
		}
		return ans;
	}
	public static boolean matchingRecOpti(String src,String pat,int sidx,int pidx) {
		if(src.length() ==sidx && pat.length()==pidx) {
			return true;
		}
		if(src.length()!=sidx && pat.length()==pidx) {
			return false;
		}
		if(src.length()==sidx && pat.length()!=pidx) {
			for(int i=0;i<pat.length();i++){
				if(pat.charAt(i)!='*') {
					return false;
				}
			}
			return true;
		}
		char chs= src.charAt(sidx);
		char chp=pat.charAt(pidx);

		boolean ans= false;
		if(chs==chp || chp=='?') {
			ans =matchingRecOpti(src,pat,sidx+1,pidx+1 );
		}
		else if (chp=='*') {
			boolean ans1=matchingRecOpti(src,pat,sidx,pidx+1);
			boolean ans2=matchingRecOpti(src,pat,sidx+1,pidx+1);
			
			if(ans1 ||ans2) {
				ans=true;
			}
		}
		else {
			ans=false;
		}
		return ans;
	}
	public static boolean matchingTD(String src,String pat,int sidx,int pidx,int[][] store) {
		if(src.length() ==sidx && pat.length()==pidx) {
			return true;
		}
		if(src.length()!=sidx && pat.length()==pidx) {
			return false;
		}
		if(src.length()==sidx && pat.length()!=pidx) {
			for(int i=0;i<pat.length();i++){
				if(pat.charAt(i)!='*') {
					return false;
				}
			}
			return true;
		}
		if(store[sidx][pidx]!=0) {
			return store[sidx][pidx] == 2 ? true:false;
		}
		char chs= src.charAt(sidx);
		char chp=pat.charAt(pidx);

		boolean ans= false;
		if(chs==chp || chp=='?') {
			ans =matchingTD(src,pat,sidx+1,pidx+1,store);
		}
		else if (chp=='*') {
			boolean ans1=matchingTD(src,pat,sidx,pidx+1,store);
			boolean ans2=matchingTD(src,pat,sidx+1,pidx,store);
			
			if(ans1 ||ans2) {
				ans=true;
			}
		}
		else {
			ans=false;
		}
		store[sidx][pidx]= (ans==true ? 2: 1);
		return ans;
	}
	public static boolean matchingBU(String src,String pat) {
		boolean[][] store=new boolean[src.length()+1][pat.length()+1];
		store[src.length()][pat.length()]=true;
		
		for(int row=src.length();row>=0;row--) {
			for(int col = pat.length()-1;col>=0;col--) {
				if(row==src.length()) {
					if(pat.charAt(col)=='*') {
						store[row][col]=store[row][col+1];
					}
					else {
						store[row][col]=false;
					}
					continue;
				}
				char chs= src.charAt(row);
				char chp=pat.charAt(col);

				boolean ans= false;
				if(chs==chp || chp=='?') {
					ans =store[row+1][col+1];
				}
				else if (chp=='*') {
					boolean ans1=store[row][col+1];
					boolean ans2=store[row+1][col];
					
				ans=ans1||ans2;
			}
				else {
					ans=false;
				}
				store[row][col]=ans;
		}
	}
	return store[0][0];
	}
}

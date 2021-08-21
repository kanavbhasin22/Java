package dynamic_programming;
import java.util.*;
public class k_order_lcs {

	public static void main(String[] args) {
		String s1="abcrd";
		String s2="agcfd";
		int k=1;
		System.out.println(recursion(s1,s2,k,0,0));
		int[][][] arr=new int[k+1][s1.length()+1][s2.length()+1];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				Arrays.fill(arr[i][j],-1);
			}
		}
		System.out.println(td(s1,s2,k,0,0,arr));
		System.out.println(bu(s1,s2,k));
	}
	public static int recursion(String s1,String s2,int k, int vidx1,int vidx2) {
		if(s1.length()==vidx1 || s2.length()==vidx2) {
			return 0;
		}
		int ans=0;
		if(s1.charAt(vidx1)==s2.charAt(vidx2)) {
			ans=recursion(s1,s2,k,vidx1+1,vidx2+1) +1;
		}
		else {
			int o1=recursion(s1,s2,k,vidx1+1,vidx2);
			int o2=recursion(s1,s2,k,vidx1,vidx2+1);
			int o3=0;
			if(k>=1) {
			o3=recursion(s1,s2,k-1,vidx1+1,vidx2+1) +1;
			}
			ans=Math.max(o1, Math.max(o2, o3));
		}
		return ans;
	}
	public static int td(String s1,String s2,int k, int vidx1,int vidx2,int[][][]store) {
		if(s1.length()==vidx1 || s2.length()==vidx2) {
			return 0;
		}
		if(store[k][vidx1][vidx2]!=-1) {
			return store[k][vidx1][vidx2];
		}
		int ans=0;
		if(s1.charAt(vidx1)==s2.charAt(vidx2)) {
			ans=td(s1,s2,k,vidx1+1,vidx2+1,store) +1;
		}
		else {
			int o1=td(s1,s2,k,vidx1+1,vidx2,store);
			int o2=td(s1,s2,k,vidx1,vidx2+1,store);
			int o3=0;
			if(k>=1) {
			o3=td(s1,s2,k-1,vidx1+1,vidx2+1,store) +1;
			}
			ans=Math.max(o1, Math.max(o2, o3));
		}
		store[k][vidx1][vidx2]=ans;
		return ans;
	}
	public static int bu(String s1, String s2,int tk) {
		int[][][] store=new int[tk+1][s1.length()+1][s2.length()+1];
		for(int k=0;k<=tk;k++) {
			 for(int row=s1.length()-1;row>=0;row--) {
				 for(int col=s2.length()-1;col>=0;col--) {
					 int ans=0;
						if(s1.charAt(row)==s2.charAt(col)) {
							ans=store[k][row+1][col+1] +1;
						}
						else {
							int o1=store[k][row][col+1];
							int o2=store[k][row+1][col];
							int o3=0;
							if(k>=1) {
							o3=store[k-1][row+1][col+1] +1;
							}
							ans=Math.max(o1, Math.max(o2, o3));
						}
					store[k][row][col]=ans;
				 }
			 }
		}
		return store[tk][0][0];
		}
	}
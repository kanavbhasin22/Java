package dynamic_programming;

import java.util.Arrays;

public class LCS_3_Strings {

	public static void main(String[] args) {
		String s1="abcd";
		String s2="agcfd";
		String s3="cd";
		System.out.println(recursion(s1,s2,s3,0,0,0));
		int[][][] arr=new int[s1.length()][s2.length()][s3.length()];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				Arrays.fill(arr[i][j], -1);
			}
		}
		System.out.println(td(s1,s2,s3,0,0,0,arr));
		System.out.println(bu(s1,s2,s3));
	}
	public static int recursion(String s1, String s2, String s3,int vidx1,int vidx2,int vidx3) {
		if(s1.length()==vidx1 ||s2.length()==vidx2 || s3.length()==vidx3) {
			return 0;
		}
		int ans=0;
		if(s1.charAt(vidx1)==s2.charAt(vidx2) && s2.charAt(vidx2) ==s3.charAt(vidx3)) {
			ans=recursion(s1,s2,s3,vidx1+1,vidx2+1,vidx3+1) +1;
		}
		else {
			int o1=recursion(s1,s2,s3,vidx1+1,vidx2,vidx3);
			int o2=recursion(s1,s2,s3,vidx1,vidx2+1,vidx3);
			int o3=recursion(s1,s2,s3,vidx1,vidx2,vidx3+1);
			
			ans=Math.max(o1, Math.max(o2, o3));
		}
		return ans;
	}
	public static int td(String s1, String s2, String s3,int vidx1,int vidx2,int vidx3,int[][][]store) {
		if(s1.length()==vidx1 ||s2.length()==vidx2 || s3.length()==vidx3) {
			return 0;
		}
		if(store[vidx1][vidx2][vidx3]!=-1) {
			return store[vidx1][vidx2][vidx3];
		}
		int ans=0;
		if(s1.charAt(vidx1)==s2.charAt(vidx2) && s2.charAt(vidx2) ==s3.charAt(vidx3)) {
			ans=recursion(s1,s2,s3,vidx1+1,vidx2+1,vidx3+1) +1;
		}
		else {
			int o1=td(s1,s2,s3,vidx1+1,vidx2,vidx3,store);
			int o2=td(s1,s2,s3,vidx1,vidx2+1,vidx3,store);
			int o3=td(s1,s2,s3,vidx1,vidx2,vidx3+1,store);
			
			ans=Math.max(o1, Math.max(o2, o3));
		}
		store[vidx1][vidx2][vidx3]=ans;
		return ans;
	}
	public static int bu(String s1,String s2,String s3) {
		int[][][] store=new int[s1.length()+1][s2.length()+1][s3.length()+1];
		for(int s1l=s1.length()-1;s1l>=0;s1l--) {
			for(int s2l=s2.length()-1;s2l>=0;s2l--) {
				for(int s3l=s3.length()-1;s3l>=0;s3l--) {
					int ans=0;
					if(s1.charAt(s1l)==s2.charAt(s2l) && s2.charAt(s2l) ==s3.charAt(s3l)) {
						ans=store[s1l+1][s2l+1][s3l+1] +1;
					}
					else {
						int o1=store[s1l+1][s2l][s3l];
						int o2=store[s1l][s2l+1][s3l];
						int o3=store[s1l][s2l][s3l+1];
						
						ans=Math.max(o1, Math.max(o2, o3));
					}
					store[s1l][s2l][s3l]=ans;
				}
			}
		}
		return store[0][0][0];
	}
}

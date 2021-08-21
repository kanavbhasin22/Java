package dynamic_programming;

public class knapsack {

	public static void main(String[] args) {
		int[] w = {1,3,4,5};
		int[] p= {1,4,5,7};
		System.out.println(knapsackr(w,p,0,7));
		System.out.println(knapsacktd(w,p,0,7,new int[4][8]));
		System.out.println(knapsackbu(w,p,7));
	}
	public static int knapsackr(int[] w,int[] p ,int vidx, int cap) {
		if(vidx==w.length || cap==0) {
			return 0;
		}
		//exclude
		int e=knapsackr(w,p,vidx+1,cap);
		//include
		int i=0;
		if(cap>=w[vidx]) {
		i=knapsackr(w,p,vidx+1,cap-w[vidx]) + p[vidx];
		}
		int ans=Math.max(e,i);
		return ans;
	}
	public static int knapsacktd(int[] w,int[]p,int vidx, int cap,int[][] store) {
		if(vidx==w.length || cap==0) {
			return 0;
		}
		if(store[vidx][cap]!=0) {
			return store[vidx][cap];
		}
		//exclude
		int e=knapsacktd(w,p,vidx+1,cap,store);
		//include
		int i=0;
		if(cap>=w[vidx]) {
		i=knapsacktd(w,p,vidx+1,cap-w[vidx],store) + p[vidx];
		}
		int ans=Math.max(e,i);
		store[vidx][cap]=ans;
		return ans;
	}
	public static int knapsackbu(int[] w,int[] p,int cap) {
		int n=w.length;
		int[][] store=new int[n+1][cap+1];
		
		for(int row=n-1;row>=0;row--) {
			for(int col=1;col<=cap;col++) {
				int e=store[row+1][col];
				int i=0;
				if(col>=w[row]) {
				i=store[row+1][col-w[row]] + p[row];
				}
				int ans=Math.max(e, i);
				store[row][col]=ans;
			}
		}
		return store[0][cap];
	}
}

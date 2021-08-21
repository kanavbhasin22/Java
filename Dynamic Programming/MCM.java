package dynamic_programming;

public class MCM {

	public static void main(String[] args) {
		//int[] arr= {4,2,3,5,1};
		int[] arr=new int[1000];
		for(int i=0;i<1000;i++) {
			arr[i]=i+1;
		}
		//System.out.println(mcmr(arr,0,arr.length-1));
		System.out.println(mcmtd(arr,0,arr.length-1,new int[arr.length][arr.length]));
		System.out.println(mcmbu(arr));

	}
	public static int mcmr(int[] arr, int si, int ei) {
		if(si+1==ei) {
			return 0;
		}
		int min=Integer.MAX_VALUE;
		//k : splits
		for(int k=si+1;k<=ei-1;k++) {
			int fp=mcmr(arr,si,k);
			int sp=mcmr(arr,k,ei);
			
			int sw=arr[si]*arr[ei]*arr[k];
			
			int total=fp+sp+sw;
			if(total<min) min=total;
		}
		return min;
	}
	public static int mcmtd(int[] arr, int si, int ei,int[][] store) {
		if(si+1==ei) {
			return 0;
		}
		if(store[si][ei]!=0) {
			return store[si][ei];
		}
		int min=Integer.MAX_VALUE;
		//k : splits
		for(int k=si+1;k<=ei-1;k++) {
			int fp=mcmtd(arr,si,k,store);
			int sp=mcmtd(arr,k,ei,store);
			
			int sw=arr[si]*arr[ei]*arr[k];
			
			int total=fp+sp+sw;
			if(total<min) min=total;
		}
		store[si][ei]=min;
		return min;
	}
	public static int mcmbu(int[] arr) {
		int n=arr.length;
		int[][] store=new int[n][n];
		
		for(int slide=1;slide<n;slide++) {
			for(int si=0;si<n-slide;si++) {
				int ei=si+slide;
				if(si+1==ei) {
					store[si][ei]= 0;
				}
				else {
				int min=Integer.MAX_VALUE;
				//k : splits
				for(int k=si+1;k<=ei-1;k++) {
					int fp=store[si][k];
					int sp=store[k][ei];
					
					int sw=arr[si]*arr[ei]*arr[k];
					
					int total=fp+sp+sw;
					if(total<min) min=total;
				}
				store[si][ei]=min;		
			}
			}
		}
		return store[0][n-1];
	}
}

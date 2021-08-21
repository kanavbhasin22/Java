package dynamic_programming;

public class wine_problem {

	public static void main(String[] args) {
		int[] arr= {2,3,5,1,4,6,8,6,4,5,3,9,6,4,3,5,7,83,6,8,6,5,8,5};
		System.out.println(WPRecursion(arr, 0,arr.length-1,1));
		System.out.println(WPRtd(arr, 0,arr.length-1,new int[arr.length][arr.length]));
		System.out.println(WPRbu(arr));
	}
	public static int WPRecursion(int[] arr,int si,int ei,int yr) {
		if(si==ei) {
			return arr[si]*yr;
		}
		int start =WPRecursion(arr,si+1,ei,yr+1)+ arr[si]*yr;
		int end =WPRecursion(arr,si,ei-1,yr+1) + arr[ei]*yr;
		
		int ans=Math.max(start, end);
		return ans;
	}
	public static int WPRtd(int[] arr,int si,int ei,int[][] store) {
		int yr=arr.length - (ei-si);
		if(si==ei) {
			return arr[si]*yr;
		}
		if(store[si][ei]!=0) {
			return store[si][ei];
		}
		int start =WPRtd(arr,si+1,ei,store)+ arr[si]*yr;
		int end =WPRtd(arr,si,ei-1,store) + arr[ei]*yr;
		
		int ans=Math.max(start, end);
		store[si][ei]=ans;
		return ans;
	}
	public static int WPRbu(int[] arr) {
		int n=arr.length;
		int[][] store=new int[n][n];
		for(int slide=0;slide<n;slide++) {
			for(int si=0;si<n-slide;si++) {
				int ei=slide+si;
				int yr=arr.length - (ei-si);
				if(si==ei) {
					store[si][ei]=arr[si]*yr;
				}
				else {
				int start =store[si+1][ei]+ arr[si]*yr;
				int end =store[si][ei-1] + arr[ei]*yr;
				
				int ans=Math.max(start, end);
				store[si][ei]=ans;
				}
			}
		}
		return store[0][n-1];
	}
}

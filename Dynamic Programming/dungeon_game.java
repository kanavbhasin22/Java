package dynamic_programming;

public class dungeon_game {

	public static void main(String[] args) {
		int[][] arr= {{-2,-3,3},{-5,-10,1},{10,30,-5}};
		System.out.println(recursion(arr,0,0,arr.length-1,arr[0].length-1));
		System.out.println(td(arr,0,0,arr.length-1,arr[0].length-1,new int[arr.length][arr[0].length]));
		System.out.println(bu(arr));
	}
	public static int recursion(int[][] arr,int cr,int cc,int er,int ec) {
		if(cr==er && cc==ec) {
			return arr[cr][cc] <=0 ? -arr[cr][cc] +1 : 1;
		}
		if(cr>er || cc>ec) {
			return Integer.MAX_VALUE;
		}
		int r=recursion(arr,cr,cc+1,er,ec);
		int d=recursion(arr,cr+1,cc,er,ec);
		int path=Math.min(r, d);
		
		int amt=path-arr[cr][cc];
		int ans;
		if(amt>=1) {
			ans=amt;
		}
		else {
			ans=1;
		}
		return ans;
	}
	public static int td(int[][] arr,int cr,int cc,int er,int ec,int[][] store) {
		if(cr==er && cc==ec) {
			return arr[cr][cc] <=0 ? -arr[cr][cc] +1 : 1;
		}
		if(cr>er || cc>ec) {
			return Integer.MAX_VALUE;
		}
		if(store[cr][cc]!=0)
			return store[cr][cc];
		int r=td(arr,cr,cc+1,er,ec,store);
		int d=td(arr,cr+1,cc,er,ec,store);
		int path=Math.min(r, d);
		
		int amt=path-arr[cr][cc];
		int ans;
		if(amt>=1) {
			ans=amt;
		}
		else {
			ans=1;
		}
		store[cr][cc]=ans;
		return ans;
	}
	public static int bu(int[][] arr) {
		int[][] store=new int[arr.length+1][arr[0].length+1];
		for(int row=store.length-1;row>=0;row--) {
			for(int col=store[0].length-1;col>=0;col--) {
				if(row==store.length-2 && col==store[0].length-2) {
					store[row][col] =arr[row][col]<=0 ? -arr[row][col] +1 : 1;
				}
				else if(row==store.length-1 || col==store[0].length-1) {
					store[row][col]=Integer.MAX_VALUE;
				}
				else {
					int r=store[row][col+1];
					int d=store[row+1][col];
					int path=Math.min(r, d);
					
					int amt=path-arr[row][col];
					int ans;
					if(amt>=1) {
						ans=amt;
					}
					else {
						ans=1;
					}
					store[row][col]=ans;
				}
				
			}
		}
		return store[0][0];
	}
}

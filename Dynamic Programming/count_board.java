package dynamic_programming;

public class count_board {
	public static long start;
	public static long end;
	public static void startAlgo() {
		start=System.currentTimeMillis();
	}
	public static long endAlgo() {
		end=System.currentTimeMillis();
		return end-start;
	}
	public static void main(String[] args) {
		startAlgo();
		System.out.println(cbp(20,0));
		System.out.println("cbp normal took "+endAlgo() + " ms");
		int[] arr=new int[21];
		startAlgo();
		System.out.println(cbpRS(20,0,arr));
		System.out.println("cbp recursive took "+endAlgo() + " ms");
		startAlgo();
		System.out.println(cbpIS(20,0));
		System.out.println("cbp iterative took "+endAlgo() + " ms");
	}
	public static int cbp(int end, int curr) {
		if(end==curr) {
			return 1;
		}
		if(curr>end) {
			return 0;
		}
		int count=0;
		for(int dice=1;dice<=6;dice++) {
			count+=cbp(end,curr+dice);
		}
		return count;
	}
	public static int cbpRS(int end, int curr,int[] store) {
		if(end==curr) {
			return 1;
		}
		if(curr>end) {
			return 0;
		}
		if(store[curr]!=0) {
			return store[curr];
		}
		
		int count=0;
		for(int dice=1;dice<=6;dice++) {
			count+=cbpRS(end,curr+dice,store);
		}
		store[curr]=count;
		return count;
	}
	public static int cbpIS(int end,int curr) {
		int[] arr=new int[end+2];
		//seed
		arr[end]=1;
		for(int i=end-1; i>=0;i--){
			int count=0;
			for(int dice=1;dice<=6 && dice+i<arr.length;dice++) {
				count=count+arr[dice+i];
			}
			arr[i]=count;
		}
		return arr[curr];
	}
}

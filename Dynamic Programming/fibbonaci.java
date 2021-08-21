package dynamic_programming;

public class fibbonaci {
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
		int n=45;
		int[] arr=new int[n+1];
		startAlgo();
		System.out.println(fib(n));
		System.out.println("Fib normal took "+endAlgo() + " ms");
		startAlgo();
		System.out.println(fibRS(n,arr));
		System.out.println("Fib recursive storage took "+endAlgo() + " ms");
		startAlgo();
		System.out.println(fibIS(n));
		System.out.println("Fib iterative storage took "+endAlgo() + " ms");

	}
	public static int fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return fib(n-1) + fib(n-2);
	}
	public static int fibRS(int n, int[] arr) {
		if(n==0 || n==1) {
			return n;
		}
		if(arr[n]!=0) {
			return arr[n];
		}
		int fn=fibRS(n-1,arr) + fibRS(n-2,arr);
		arr[n]=fn;
		return fn;
	}
	public static int fibIS(int n) {
		int[] arr=new int[n+1];
		
		//seed
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<n+1;i++) {
			arr[i]=arr[i-1] + arr[i-2];
		}
		return arr[n];
	}
}

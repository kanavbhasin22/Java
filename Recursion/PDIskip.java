package recursion;

public class PDIskip {

	public static void main(String[] args) {
		PDIskip(5);

	}
	public static void PDIskip(int n) {
		if(n==0) {
			return;
		}
		if(n%2==1) {
			System.out.println(n);
		}
		PDIskip(n-1);
		if(n%2==0) {
			System.out.println(n);
		}
	}

}

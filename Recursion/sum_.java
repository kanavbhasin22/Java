package recursion;

public class sum_ {

	public static void main(String[] args) {
		System.out.print(sum(5,10));

	}
	public static int sum(int a,int b) {
		if(b==a) {
			return a;
		}
		int ans=a+sum(a+1,b);
		return ans;
	}

}

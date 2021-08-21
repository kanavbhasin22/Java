package dynamic_programming;

public class binary_strings {

	public static void main(String[] args) {
		System.out.print(binary(6));

	}
	public static int binary(int n) {
		int[] ones=new int[n];
		int[] zeros=new int[n];
		
		//seed
		ones[0]=1;
		zeros[0]=1;
		
		for(int i=1;i<n;i++) {
			zeros[i]=zeros[i-1]+ones[i-1];
			ones[i]=zeros[i-1];
		}
		return ones[n-1] + zeros[n-1];
		
	}

}

import java.util.*;
public class sts2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int temp;
		 for (int i = 1; i < arr.length; i++) {
		    for (int j = i; j > 0; j--) {
		     if (arr[j] < arr [j - 1]) {
		      temp = arr[j];
		      arr[j] = arr[j - 1];
		      arr[j - 1] = temp;
		     }
		    }
		   }
		   for (int i = 0; i < arr.length; i++) {
		     System.out.print(arr[i]+ " ");
		   }
		   System.out.println();
		   System.out.println(arr[0]+" "+arr[n-1]);
		   
	}
}

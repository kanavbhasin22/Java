import java.util.Scanner;

public class sts {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n= sc.nextInt();
		int arr[]=new int[n];
		int count0=0;
		int count1=0;
		for(int i=0; i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]==0) {
				count0++;
			}
			else if(arr[i]==1) {
				count1++;
			}
		}
		System.out.println(count0);
		System.out.println(count1);
	}
}


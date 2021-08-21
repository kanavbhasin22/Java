package dynamic_programming;

import java.util.Arrays;

public class lis {

	public static void main(String[] args) {
		int[] arr= {10,9,2,5,3,7,101,10};
		System.out.println(lis(arr));
		System.out.println(nlogn(arr));
	}
	public static int lis(int[] arr) {
		if(arr.length==0) {
			return 0;
		}
		int[] lis=new int[arr.length];
		lis[0]=1;
		
		for(int i=1;i<arr.length;i++) {
			lis[i]=1;
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]) {
					if(lis[j]+1>lis[i]) {
						lis[i]=lis[j]+1;
					}
				}
			}
		}
		Arrays.sort(lis);
		return lis[lis.length-1];
	}
	public static int nlogn(int[] arr) {
		int[] le=new int[arr.length];
		le[0]=arr[0];
		int len=1;
		
		for(int i =1;i<arr.length;i++) {
			if(arr[i]>le[len-1]) {
				le[len]=arr[i];
				len++;
			}
			else {
				int idx=binary(le,0,len-1,arr[i]);
				le[idx]=arr[i];
			}
		}
		return len;
	}
	public static int binary(int[] arr,int si,int ei,int item) {
		int low=si;
		int high=ei;
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(item>arr[mid]) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return low;
	}
}

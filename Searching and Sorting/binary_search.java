package array;

public class binary_search {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int d=12;
		int a=binary(arr,d);
		System.out.print(a);

	}
	public static int binary(int [] arr, int d) {
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			
			if(arr[mid]<d) {
				lo=mid+1;
			}
			else if(arr[mid]>d) {
				hi=mid-1;
			}
			else{
				return mid;
			}
		}
		return -1;
	}

}

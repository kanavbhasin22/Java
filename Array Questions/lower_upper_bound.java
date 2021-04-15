package array;

public class lower_upper_bound {

	public static void main(String[] args) {
		int[] arr= {1,2,2,2,3,3,4,4,5};
		
		System.out.println(upper_bound(arr,2));
		System.out.println(lower_bound(arr,3));

	}
	public static int lower_bound(int[] arr,int d) {
		int lo=0;
		int hi=arr.length-1;
		int ans=-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]==d) {
				ans=mid;
				hi=mid-1;
			}
			else if(arr[mid]>d) {
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
	}  return ans;
	}
	public static int upper_bound(int[] arr,int d) {
		int lo=0;
		int hi=arr.length-1;
		int ans=-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]==d) {
				ans=mid;
				lo=mid+1;
			}
			else if(arr[mid]>d) {
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
	}  return ans;
		}
	}


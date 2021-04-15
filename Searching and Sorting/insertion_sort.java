package array;

public class insertion_sort {

	public static void main(String[] args) {
		int[] arr= {20,30,58,12,56};
		insertion_sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}
	public static void insertion_sort(int[] arr) {
		for(int counter=1;counter<=arr.length-1;counter++) {
			int val=arr[counter];
			int j=counter-1;
			while(j>=0 && arr[j]>val) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=val;
		}
	}

}

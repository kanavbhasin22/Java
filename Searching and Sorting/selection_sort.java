package array;

public class selection_sort {

	public static void main(String[] args) {
		int[] arr= {99,88,77,66,55};
		selection_sort(arr);
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}
	public static void selection_sort(int [] arr) {
		for (int counter=0;counter<arr.length-1;counter++) {
			int min=counter;
			for(int j=counter+1;j<=arr.length-1;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[counter];
			arr[counter]=temp;
		}
	}
}

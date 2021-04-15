package array;

public class bubble_sort {

	public static void main(String[] args) {
		int[] arr= {99,88,77,66,55};
		bubble(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void bubble(int[] arr) {
		for(int counter=0;counter<arr.length-1;counter++) {
			for(int j=0;j<arr.length-1-counter;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}

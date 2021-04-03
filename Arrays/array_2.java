package array;

public class array_2 {

	public static void main(String[] args) {
		int [] arr=null;
		arr=new int[5];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;		
		
		for(int val:arr) {
			System.out.println(val);
		}
		
		int i=0, j=2;
		System.out.println(arr[i]+"  "+ arr[j]);
		swap(arr,i,j);
		System.out.println(arr[i]+"  "+ arr[j]);
	}
	public static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}

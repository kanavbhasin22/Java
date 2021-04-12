package array;

public class wave_print {

	public static void main(String[] args) {
		int [][] arr= {{11,12,13,14},{21,22,23,24},{31,32,32,34},{41,42,43,44}};
		wave(arr);

	}
	public static void wave(int [][] arr) {
		int row=0;
		int stop=arr.length-1;
		int col=arr[0].length-1;
		while(row<=stop) {
		if(row%2==0 && row<=stop) {
			for(int i=0;i<=col;i++) {
				System.out.print(arr[row][i]+" ,");
			}
		}
		if(row%2!=0 && row<=stop) {
			for(int i=col;i>=0;i--) {
				System.out.print(arr[row][i]+" ,");
			}
		}
		row++;
	}
	System.out.print("END");
}
}

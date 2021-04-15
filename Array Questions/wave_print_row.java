package array;
import java.util.*;
public class wave_print_row {
	    public static void main(String args[]) {
	        Scanner sc=new Scanner(System.in);
			int row=sc.nextInt();
			int col=sc.nextInt();
			int[][] arr=new int[row][col];
			for(int i=0;i<row;i++){
				for(int j=0;j<col;j++){
					arr[i][j]=sc.nextInt();
				}
			}
			wave(arr,row,col);
	    }
		public static void wave(int[][] arr,int row,int col){
			int x=0;
			while(x<=row-1){
				if(x%2==0){
					for(int i=0;i<col;i++){
						System.out.print(arr[x][i]+", ");
					}
				}
				else{
					for(int i=col-1;i>=0;i--){
						System.out.print(arr[x][i]+", ");
					}
				}x++;
			}System.out.print("END");
		}
	}

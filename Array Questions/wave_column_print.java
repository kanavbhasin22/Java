package array;
import java.util.*;
public class wave_column_print {
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
			int x=0;
			while(x<=row-1){
				if(x%2==0){
					for(int i=0;i<row;i++){
						System.out.print(arr[i][x]+", ");
					}
				}
				else{
					for(int i=row-1;i>=0;i--){
						System.out.print(arr[i][x]+", ");
					}
				}x++;
			}
			System.out.print("END");		
	    }
	}
package array;
import java.util.*;
public class two_d_array_search {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int row=sc.nextInt();
				int col=sc.nextInt();
				int[][] arr=new int[row][col];
				for(int i=0;i<row;i++){
					for(int j=0;j<col;j++){
						arr[i][j]=sc.nextInt();
					}
				}
				int x=sc.nextInt();
				int flag=0;
				for(int i=0;i<row;i++){
					for(int j=0;j<col;j++){
						if(arr[i][j]==x){
							flag=1;
							break;
						}
						else{
							flag=0;
						}
					}
				}
				System.out.print(flag);
		    }
		}
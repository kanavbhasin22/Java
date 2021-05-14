package practice;
import java.util.*;
public class move_x_at_end {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		swap_x(str,0,str.length()-1);
	}
	public static void swap_x(String str, int start,int end){
		if(start>end) {
			return;
		}
		char ch=str.charAt(start);
		if(ch!='x') {
			System.out.print(ch);
		}
		swap_x(str,start+1,end);
		if(ch=='x') {
			System.out.print(ch);
		}
		return;
	}
}

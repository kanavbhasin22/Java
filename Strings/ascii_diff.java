package strings;
import java.util.*;
public class ascii_diff {
	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i<str.length()-1;i++){
			int a=str.charAt(i);
			int b=str.charAt(i+1);
			int c=b-a;
			System.out.print(str.charAt(i));
			System.out.print(c);
		}
		System.out.print(str.charAt(str.length()-1));
    }
}

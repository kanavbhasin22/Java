package strings;
import java.util.*;
public class can_you_read_this {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(Character.isUpperCase(c)){
				if(i>0){
				System.out.println();
				System.out.print(c);
			}
			else{
				System.out.print(c);
			}
			}
			else{
				System.out.print(c);
			}
		}
    }
}

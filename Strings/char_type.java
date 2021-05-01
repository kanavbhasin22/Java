package strings;
import java.util.*;
public class char_type {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(Character.isUpperCase(c)){
			System.out.print("Uppercase");
		}
		else if(Character.isLowerCase(c)){
			System.out.print("Lowercase");
		}
		else{
			System.out.print("Invalid");
		}
    }
}

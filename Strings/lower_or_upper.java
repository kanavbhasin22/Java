package strings;
import java.util.*;
public class lower_or_upper {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(Character.isUpperCase(c)){
			System.out.print("UPPERCASE");
		}
		else if(Character.isLowerCase(c)){
			System.out.print("lowercase");
		}
		else{
			System.out.print("Invalid");
		}
    }
}

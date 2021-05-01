package strings;
import java.util.*;
public class pallindrome {
	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int flag=0;
		int lo=0;
		int hi=str.length()-1;
		while(lo<=hi){
			if(str.charAt(lo)==str.charAt(hi)){
				flag=1;
				lo++;
				hi--;
			}
			else{
				flag=0;
				lo++;
				hi--;
				break;
			}
		}
		if(flag==1) System.out.print("true");
		else System.out.print("false");
    }
}

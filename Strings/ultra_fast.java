package strings;
import java.util.*;
public class ultra_fast {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			String str1=sc.next();
			String str2=sc.next();
			for(int j=0;j<str1.length();j++){
				if(str1.charAt(j)==str2.charAt(j)){
					System.out.print("0");
				}
				else{
					System.out.print("1");
				}
			}
			System.out.println();
		}

	}

}

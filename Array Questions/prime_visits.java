package array;
import java.util.*;
public class prime_visits {
	    public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			int n= sc.nextInt();
			for(int i=0;i<n;i++){
				int a=sc.nextInt();
				int b=sc.nextInt();
				int flag=0;
				if(a<1) flag=-2;
				if(a<2) flag=-1;
				int num=0;
				for(int c=a;c<=b;c++){
					for(int j=2;j<=c/2;j++){
						if(c%j==0){
							num=1;
							break;
						}
						else{
							num=0;
						}
					}
					if(num==0){
						flag++;
					}
				}
				System.out.println(flag);
			}
	    }
	}
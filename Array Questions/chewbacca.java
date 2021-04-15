package array;
import java.util.*;
public class chewbacca {
	    public static void main(String args[]) {
	        Scanner sc=new Scanner (System.in);
			int n=sc.nextInt();
			int x=n;
			int b=10;
			int num=0;
			int p=1;
			while(x>0){
				int t=x%10;
				if(t>=5) t=9-t;
				num+=t*p;
				p=p*b;
				x=x/10;
			}
			System.out.print(num);
	    }
	}
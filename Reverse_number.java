package MyPackage;
import java.util.Scanner;
public class Reverse_number {
    public static void main(String args[]){
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a =0;
        int b=0;
        while(x>0){
            a=x%10;
            x=x/10;
            b=(b*10)+a;
        }System.out.println(b);
    }
}

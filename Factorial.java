package MyPackage;
import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        long y=1;
        for (int i=x;i>0;i--){
            y=y*i;
        }
        System.out.println("The factorial is: ");
        System.out.println(y);
    }
}

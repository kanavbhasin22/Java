package MyPackage;
import java.util.Scanner;
public class Sum_of_digits {
    public static void main(String args[]){
        System.out.println("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int a=0;
        int b=0;
        while (x>0){
            a=x%10;
            b=b+a;
            x=x/10;
        }
        System.out.println("The sum of digits is: ");
        System.out.print(b);
    }
}

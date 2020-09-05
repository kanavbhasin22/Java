package MyPackage;
import java.util.Scanner;
public class Else_if {
    public static void main(String args[]){
        System.out.println("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        if (x<0){
            System.out.println("Negative number");
        }
        else if (x==0){
            System.out.println("Number is 0");
        }
        else {
            System.out.println("Positive Number");
        }
    }
}

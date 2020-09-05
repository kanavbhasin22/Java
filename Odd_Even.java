package MyPackage;
import java.util.Scanner;
public class Odd_Even {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        long x= sc.nextInt();
        if (x%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}

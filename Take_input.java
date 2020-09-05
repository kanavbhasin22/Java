package MyPackage;
import java.util.Scanner;
public class Take_input {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String x= sc.nextLine();
        System.out.print("The entered line is: ");
        System.out.print(x);
    }
}

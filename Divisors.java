package MyPackage;
import java.util.Scanner;
public class Divisors {
    public static void main(String args[]) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                System.out.println(i);
            }
        }
    }
}
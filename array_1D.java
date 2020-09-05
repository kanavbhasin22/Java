package MyPackage;
import java.util.Scanner;
public class array_1D {
    public static void main(String args[]){
        System.out.println("Enter the size: ");
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int a[]=new int [n];
        System.out.println("Enter the numbers: ");
        for (int i=0;i<n;i++){
            int m=sc.nextInt();
            a[i]=m;
        }
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}

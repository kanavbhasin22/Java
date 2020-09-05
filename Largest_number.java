package MyPackage;
import java.util.Scanner;
public class Largest_number {
    public static void main(String args[]){
        System.out.println("Enter the number of numbers");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[]= new int [n];
        System.out.println("Enter the numbers: ");
        for (int i=0;i<n;i++){
            int z= sc.nextInt();;
            a[i]=z;
        }
        int m=0;
        for (int i=0; i<n ;i++){
            if (a[i]>m){
                m=a[i];
            }
        }
        System.out.print("The largest number is: ");
        System.out.println(m);
    }
}


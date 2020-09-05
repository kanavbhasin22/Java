package MyPackage;

import java.util.Scanner;
public class Armstrong_number {
    public static void main(String args[]){
        System.out.println("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int a=0;
        int b=0;
        int y=x;
        while (y>0){
            a=y%10;
            b=b+(a*a*a);
            y=y/10;
        }
        if (b==x){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }
}

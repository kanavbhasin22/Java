package MyPackage;

import java.util.Scanner;

public class Perfect_number {
    public static void main(String args[]) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum=0;
        for (int i = 1; i <x-1; i++) {
            if (x % i == 0) {
                sum=sum+i;
            }
        }
        if(sum==x){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
}

package Loops;
import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER : ");
        int n;
        n = sc.nextInt();
        int sum = 0;
        while ( n!= 0) {
           int ld = n%10;
            sum = sum + ld;
            n  = n/10;
        }
        System.out.println(sum);
    }
}

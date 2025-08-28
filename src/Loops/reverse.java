package Loops;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER : ");
        int n = sc.nextInt();
        int rev = 0;
        while ( n!= 0) {
            int last_digit = n%10;
            rev = 10*rev + last_digit;
            n = n/10;
        }
        System.out.println(rev);
    }
}

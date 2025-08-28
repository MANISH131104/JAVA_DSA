package Loops;
import java.util.Scanner;

public class sumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER : ");
        int n;
        n = sc.nextInt();
        int sum = 0;
        while ( n!= 0) {
            int last_digit = n%10;
            if(last_digit % 2 == 0) {
                sum = sum + last_digit;
            }
            n = n/10;
        }
        System.out.println(sum);

    }
}

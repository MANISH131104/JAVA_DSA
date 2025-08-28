package Conditionals;
import java.util.Scanner;

public class divisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n;
        n = sc.nextInt();
        if ( n%5 == 0) {
            System.out.println("The number is divisible by 5 ");
            System.out.println("GOOD");
        }
        else {
            System.out.println("The number is not divisible by 5 ");
            System.out.println("BAD");
        }


    }
}

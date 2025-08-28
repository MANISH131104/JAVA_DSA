package Conditionals;
import java.util.Scanner;

public class DivisibleBy5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n;
        n = sc.nextInt();
        if ( n%5 == 0 && n%3 == 0) {
            System.out.println("it is divisible by 5 and 3 ");
        }
        else {
            System.out.println("it is not divisible by 5 and 3");
        }

    }
}

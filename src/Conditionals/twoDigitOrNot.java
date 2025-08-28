package Conditionals;
import java.util.Scanner;

public class twoDigitOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n;
        n = sc.nextInt();
        if ( n>9 && n<100) {
            System.out.println("IT IS A TWO DIGIT NUMBER ");
        }
        else {
            System.out.println("NOT A TWO DIGIT NUMBER ");
        }

    }
}

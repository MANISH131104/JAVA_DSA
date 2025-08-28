package Conditionals;
import java.util.Scanner;

public class threedigitOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n;
        n = sc.nextInt();
        if ( n>99 && n<1000) {
            System.out.println("IT IS A THREE DIGIT NUMBER ");
        }
        else {
            System.out.println("NOT A THREE DIGIT NUMBER ");
        }

    }
}

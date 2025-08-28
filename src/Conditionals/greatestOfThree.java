package Conditionals;
import java.util.Scanner;

public class greatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a;
        a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter c : ");
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println(a + " is greatest ");
            }
            else {
                System.out.println(c + "is gratest ");
            }
        }
        else {
            if (b > c) {
                System.out.println(b + "is greatest ");
            }
            else {
                System.out.println(c + "is greatest");
            }
        }
    }
}

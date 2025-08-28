package javaInput;
import java.util.Scanner;

public class remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dividend : ");
        int dividend;
        dividend = sc.nextInt();
        System.out.print("Enter Divisor : ");
        int divisor;
        divisor = sc.nextInt();
        int quotient = dividend/divisor;
        int remainder = dividend - ( divisor * quotient );
        System.out.println("The Remainder when "+dividend+" is divided by  "+divisor+" is " +remainder);


    }
}

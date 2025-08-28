package javaInput;
import java.util.Scanner;

public class squareOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x;
        x = sc.nextInt();
        int square = x * x;
        System.out.print("square of the number is " +square);

    }
}

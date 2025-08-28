package javaInput;
import java.util.Scanner;

public class sumOfTwoNumbersInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        int x;
        x = sc.nextInt();
        // int x = sc.nextInt();
        System.out.print("Enter 2nd number :");
        int y;
        y = sc.nextInt();
        // int y = sc.nextInt();
        int sum = x + y;
        System.out.println("The Sum Of x and y is : " +sum);
    }
}
